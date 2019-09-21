<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>区域信息</title>
    <link rel="stylesheet" type="text/css" href="easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="easyUI/css/demo.css">
    <script src="js/jquery-1.8.3.js"></script>
    <!--jquery.easyui.min.js包含了easyUI中的所有插件-->
    <script src="js/jquery.easyui.min.js"></script>
    <script language="JavaScript" src="js/TbContentCategory.js"></script>
</head>
<body>
<table id="dg"></table>
<%------------------添加工具栏-------------------%>
<div id="ToolBar">
    <div style="height: 40px;">
        <a href="javascript:Add()" class="easyui-linkbutton"
           iconCls="icon-add" plain="true">添加</a> <a
            href="javascript:update()" class="easyui-linkbutton"
            iconCls="icon-edit" plain="true">修改</a> <a
            href="javascript:MoreDelete()" class="easyui-linkbutton"
            iconCls="icon-remove" plain="true">批量删除</a>
    </div>
</div>

<!-----------------区域添加对话框-------------------->
<%-- 对话框主体 --%>
<div id="AddDialog" class="easyui-dialog" buttons="#AddDialogButtons"
     style="width: 280px; height: 250px; padding: 10px 20px;" closed="true">
    <form method="post" action="" name="form1" id="form1">
        广告类型名称:<input type="text" name="name" id="name">
    </form>
</div>

<!--对话框的按钮-->
<div id="AddDialogButtons">
    <a href="javascript:SaveAddDialog()" class="easyui-linkbutton"
       iconCls="icon-ok">保存</a>
    <a href="javascript:CloseDialog('AddDialog')" class="easyui-linkbutton"
       iconCls="icon-cancel">取消</a>
</div>

<!-----------------修改对话框-------------------->
<%-- 对话框主体 --%>
<div id="UpdateDialog" class="easyui-dialog" buttons="#updateDialogButtons"
     style="width: 280px; height: 250px; padding: 10px 20px;" closed="true">
    <form method="post" action="" name="form2" id="form2">
        <input type="hidden" name="id">
        广告类型名称:<input type="text" name="name" id="name1">
    </form>
</div>

<!--对话框的按钮-->
<div id="updateDialogButtons">
    <a href="javascript:SaveUpdateDialog()" class="easyui-linkbutton"
       iconCls="icon-ok">修改</a>
    <a href="javascript:CloseDialog('UpdateDialog')" class="easyui-linkbutton"
       iconCls="icon-cancel">取消</a>
</div>
</body>
</html>
