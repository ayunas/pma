console.log("Welcome to the PMA App");

const canvas = document.querySelector("#pieChart");

new Chart(canvas,{
    type : 'pie',
    data :  {
        labels : ["jan","feb","march"],
        datasets : [
                {   label : "1st dataset",
                    backgroundColor : ['rgb(255,99,132)','#8e5ea2','#3cba9f'],
                    borderColor : 'rgb(255,75,120)',
                    data : [12,23,34]
                }
            ]
    }
    // options :
})


// var myPieChart = new Chart(ctx, {
//     type: 'pie',
//     data: data,
//     options: options
// });
//
// var c = document.getElementById("pieChart");
// var ctx = c.getContext("2d");
// ctx.moveTo(0, 0);
// ctx.lineTo(200, 100);
// ctx.stroke();