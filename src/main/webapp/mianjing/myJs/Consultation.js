/**
 * Created by victor on 12/11/2016.
 */
function sendConsultationForm(){
    $.ajax({
        url: url,
        dataType: 'json',
        data: data,
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
