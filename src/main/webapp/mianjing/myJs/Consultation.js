/**
 * Created by victor on 12/11/2016.
 */
function submitConsultInfo(){
    var json = {};
    var params = $("#becomeconsultant").serialize().split("&");

    for(var i = 0;i < params.length; i ++){
        var kv = params[i].split("=");
        json[kv[0]] = kv[1];
    }

    $.ajax({
        url: url,
        dataType: 'json',
        data: json.stringify(json),
        type:"post",
        success: function (data) {

        }
    });
}

function getRequirements() {
    $.ajax({
        url: url,
        dataType: 'json',
        data: data,
        type:"get",
        success: function (data) {

        }
    });
}
