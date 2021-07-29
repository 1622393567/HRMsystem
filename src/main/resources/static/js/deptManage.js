$(function () {
    //搜索
    $("#search").click(function() {
        var keyword=$("#keyword").val();
        alert(keyword);
        $('#deptInfo').load("/dept/viewDepartmentByKeyword",{keyword:keyword});
    })

});