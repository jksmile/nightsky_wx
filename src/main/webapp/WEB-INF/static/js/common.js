function logincheck() {

    var userName = $("#username").val();

    var userPass = $("#userpwd").val();

    if (userName == "" || userPass == "") {
        alert("U have to fill the value!")
    } else {
        $("#loginForm").submit();
    }

}


function ajaxFunction(url) {
    var xmlHttp;
    try {
        xmlHttp = new XMLHttpRequest();    // 实例化对象
    } catch (e) {
        // Internet Explorer
        try {
            xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
        } catch (e) {
            try {
                xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
            } catch (e) {
                alert("Current browser doesn't support ajax!");
                return false;
            }
        }
    }

    xmlHttp.onreadystatechange = function () {
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
            //var resultObj = document.getElementById("result");
            //resultObj.innerHTML = xmlHttp.response;

        }
    }
    xmlHttp.open("GET", url, true);
    xmlHttp.send(null);

}