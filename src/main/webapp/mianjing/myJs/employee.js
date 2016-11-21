/**
 * Created by sj98 on 2016/11/21.
 */

var url = "/employee"

function getAllRequirements(arrangeseq){//查看所有顾问与需求

    $.ajax({
        url: url = "?" + arrangeseq + "&pageNow=1&pageSize=10",
        dataType: 'json',
        data: json.stringify(json),
        type:"post",
        success: function (data) {
            for(var i = 0;i < data.content.length;i ++){

            }
        }
    });
}

function sendToPosition() {//投递职位
    $.ajax({
        url: url + "?userUuid=&positionUuid=",
        dataType: 'json',
        data: json.stringify(json),
        type:"post",
        success: function (data) {
            console.log("success");
        }
    });
}

function postSeekInfo(){//发布求助信息

    var json = {};
    json.accountuuid = $.cookie["accountUuid"];
    json.company = $("").value;
    json.position = $("").value;
    json.workYears = $("").value;
    json.payroll = $("").value;
    json.advisoryTime = $("").value;
    json.workLocation = $("").value;
    json.consultantType = $("").value;
    json.workExperience = $("").value;

    $.ajax({
        url: url + "/",
        dataType: 'json',
        data: json.stringify(json),
        type:"post",
        success: function (data) {
            console.log("success");
        }
    });
}

function checkJobProcess(option){//查看工作进度
    $.ajax({
        url: url + "/",
        dataType: 'json',
        type:"post",
        success: function (data) {
            console.log("success");
        }
    });
}

function checkTradeProcess(option){//检查交易进度
    $.ajax({
        url: url + "/",
        dataType: 'json',
        data: json.stringify(json),
        type:"post",
        success: function (data) {
            console.log("success");
        }
    });
}

function manageSeekInfo(option) {//管理求助信息
    $.ajax({
        url: url + "/",
        dataType: 'json',
        type:"post",
        success: function (data) {
            console.log("success");
        }
    });
}