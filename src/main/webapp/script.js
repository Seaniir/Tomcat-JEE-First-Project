var val = "atoz";
$("#somebutton").click(function (){
    alert("yee");
    $.ajax({
        url:'hello-servlet',
        type:'POST',
        data:{val : val},
        success : function(data){
            alert('success'+data);
        }
    });
});

