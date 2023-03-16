// var tempclearfix = document.getElementById("clearfix");
// tempclearfix.click() = function (){
//
// }
//左侧导航栏切换display效果
var acc = document.getElementsByClassName("clearfix1");
var i;

//alert(acc.length)
for (i = 0; i < acc.length; i++) {
    acc[i].onclick = function() {

        var panel = this.nextElementSibling;
        while(panel != null)
        {
            //console.log(panel);
            //console.log(panel.style.cssText);
            if(panel.style.cssText == 'display: none;'){
                panel.style.cssText = 'display: block;';

            }
            else if(panel.style.cssText == 'display: block;') {
                panel.style.cssText = 'display: none;';
            }
            panel = panel.nextElementSibling;

        }
    }


//更新用户信息
    function updateMsg(){

    }


//点击图片或“修改图片”跳转
    function toggleHeadSet()
    {
        var toggle0 = document.getElementsByClassName("msg_right");
        var toggle1 = document.getElementsByClassName("uphead_right");
        //console.log(toggle0[0].style.display);
        if(toggle0[0].style.cssText == 'display: none;')
        {
            toggle0[0].style.cssText = 'display: block;';
            toggle1[0].style.cssText='display: none;';
        }
        else
        {
            toggle0[0].style.cssText = 'display: none;';
            toggle1[0].style.cssText='display: block;';
        }
    }

//修改头像中的选择图片
    function showImg(input) {
        var file = input.files[0];
        var url = window.URL.createObjectURL(file);
        //console.log(url)
        document.getElementById('image').src=url;

        var imgt = document.getElementsByClassName("img-container");
        imgt[0].style.cssText = 'display: block;';
        var imgt2 = document.getElementsByClassName("uphead_lt");
        imgt2[0].style.cssText = 'display: none;';

        imgt = document.getElementsByClassName("img-preview preview-md");
        imgt2 = imgt[0].childNodes;
        console.log(imgt2[1]);
        imgt2[1].style.cssText = "display: block; width: 187.5px; height: 125px; min-width: 0px !important; min-height:" +
            " 0px !important; max-width: none !important; max-height: none !important; margin-left: -43.75px;" +
            " margin-top: -12.5px; transform: none;";
        imgt2[1].src=url;

        imgt = document.getElementsByClassName("img-preview preview-sm");
        imgt2 = imgt[0].childNodes;
        // console.log(imgt2[1]);
        imgt2[1].style.cssText = "display: block; width: 93.75px; height: 62.5px; min-width: 0px !important;" +
            "  min-height: 0px !important; max-width: none !important; max-height: none !important;  margin-left:" +
            " -21.875px; margin-top: -6.25px; transform: none;";
        imgt2[1].src=url;

    }}

//上传或更新头像图片
function uploadimg(){

}

//取消编辑头像图片
function cancelimg(){
    var imgt = document.getElementsByClassName("img-container");
    imgt[0].style.cssText = 'display: none;';
    var imgt2 = document.getElementsByClassName("uphead_lt");
    imgt2[0].style.cssText = 'display: block;';

    imgt = document.getElementsByClassName("img-preview preview-md");
    imgt2 = imgt[0].childNodes;
    //console.log(imgt2[1]);
    imgt2[1].style.cssText = "display: none; width: 187.5px; height: 125px; min-width: 0px !important; min-height:" +
        " 0px !important; max-width: none !important; max-height: none !important; margin-left: -43.75px;" +
        " margin-top: -12.5px; transform: none;";


    imgt = document.getElementsByClassName("img-preview preview-sm");
    imgt2 = imgt[0].childNodes;
    // console.log(imgt2[1]);
    imgt2[1].style.cssText = "display: none; width: 93.75px; height: 62.5px; min-width: 0px !important;" +
        "  min-height: 0px !important; max-width: none !important; max-height: none !important;  margin-left:" +
        " -21.875px; margin-top: -6.25px; transform: none;";

}


