var reader = require("fs");
reader.readFile("a2_input.txt","utf-8", function(err, contents){
    var contArray = contents.split('\r\n');
    var regex = new RegExp('\\$(\\*)*(([1-9](\\d{0,2},?)*)|0)\\.\\d{0,2}');
    for(var i = 0; i<contArray.length; i++){
        // var tString = "$**1,413.512";
        if(regex.test(contArray[i])==true){
            console.log("Match!");
        }else{
            console.log("Fail!");
        }
    }
});
