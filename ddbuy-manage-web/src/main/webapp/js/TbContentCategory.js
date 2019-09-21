$(function () {     //加载事件，一旦打开页面就会加载该事件
    $('#dg').datagrid({
        url: 'getTbContentCategoryByPage',
        title: "广告类型信息",
        toolbar:"#ToolBar",
        pagination: true,    //开启分页
        pageSize: 3,     //设置每页多少条
        pageList: [3, 6, 9],   //设置选择分页大小的条数
        striped: true,
        columns: [[
            {field: 'cb', checkbox:"true"},
            {field: 'id', title: '广告类型编号', width: 100, align: 'center'},
            {field: 'name', title: '广告类型名称', width: 100, align: 'center'},
            {field: 's', title: '操作', width: 150, align: 'center',
                formatter: function(value,row,index){
                    //异步请求删除
                    return "<a href=\"javascript:deleteOneDistrict("+row.id+")\" >删除</a>";
                }}
        ]]
    });
})

/*------------------------关闭对话框--------------------------*/
function CloseDialog(id) {
    $('#'+id).window('close');   //关闭添加区域窗口
}

/*------------------------添加区域信息--------------------------*/
//添加区域弹窗
function Add() {
    $('#AddDialog').window('setTitle',"添加区域");
    $('#AddDialog').window('open');     //弹出添加区域窗口
}

//保存 区域添加
function SaveAddDialog(){
    //form表单方式异步提交
    $("#form1").form("submit",{
        url:"/manager/addDistrict",
        success:function (data) {   //此处data为返回的字符串
            data = $.parseJSON(data);   //将返回的 json字符串 转换为 json对象
            if(data.result>0){
                $.messager.alert('系统提示','添加成功!','info');
                $("#dg").datagrid("load");
                $('#AddDialog').window('close');
            }else{
                $.messager.alert('系统提示','添加失败!','error');
                $('#AddDialog').window('close');
            }
        }
    })
}

/*------------------------修改区域信息--------------------------*/
//添加区域弹窗
function update() {
    var SelectRows = $("#dg").datagrid('getSelections');    //得到的是数组
    if(SelectRows.length == 1){
        $('#UpdateDialog').window('setTitle',"修改区域");
        $('#UpdateDialog').window('open');     //弹出修改区域窗口
    }else {
        $.messager.alert('系统提示','未选择或选择多条！','warning');
    }
    $.post("/manager/getOneDistrict",{"id":SelectRows[0].id},function (data) {
        $("#form2").form("load",data);
    },"json")
}

//保存 区域修改
function SaveUpdateDialog(){
    $("#form2").form("submit",{
        url:"/manager/updateDistrict",
        success:function (data) {   //此处data为返回的字符串
            data = $.parseJSON(data);   //将返回的 json字符串 转换为 json对象
            if(data.result>0){
                $.messager.alert('系统提示','修改成功!','info');
                $("#dg").datagrid("load");
                $('#UpdateDialog').window('close');
            }else{
                $.messager.alert('系统提示','修改失败!','error');
                $('#UpdateDialog').window('close');
            }
        }
    })
}

/*------------------------删除单条区域信息--------------------------*/
function deleteOneDistrict(obj) {   //编号
    $.messager.confirm('系统提示','是否删除该条数据？',function (chos) {
        if(chos){
            $.post("/manager/deleteOneDistrict",{"id":obj},function (data) {
                data = $.parseJSON(data);   //将返回的 json字符串 转换为 json对象
                if(data.result>0){
                    $.messager.alert('系统提示','删除成功!','info');
                    $("#dg").datagrid("load");
                }else{
                    $.messager.alert('系统提示','删除失败!','error');
                }
            });
        }
    });
}


/*------------------------批量删除区域信息--------------------------*/
function MoreDelete() {
    var  SelectRows = $("#dg").datagrid('getSelections');    //得到的是数组
    if (SelectRows.length > 0) {
        $.messager.confirm('系统提示',"是否删除"+SelectRows.length+"条数据",function (chos) {
            if(chos){
                var ids="";
                for(var i=0;i<SelectRows.length;i++){
                    ids = ids+SelectRows[i].id+",";
                }
                ids= ids.substring(0,ids.length-1);
                $.post("/manager/deleteMoreDistrict",{"ids":ids},function (data) {
                    if(data.result>0){
                        $.messager.alert('系统提示','批量删除成功!','info');
                        $("#dg").datagrid("load");
                    }else{
                        $.messager.alert('系统提示','批量删除失败!','error');
                    }
                },"json");
            }
        })
    }else {
        $.messager.alert('系统提示','请选择至少一条信息！','warning');
    }
}

