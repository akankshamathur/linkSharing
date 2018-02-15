$(document).ready(function(){
           $("form[name='register_form']").validate({
               rules:{
                   firstName:{
                       required:true,
                       lettersonly:true
                   },
                   lastName:{
                       required:true,
                       lettersonly:true
                   },
                   email:{
                       required:true,
                       email:"true"
                   },
                   username:{
                       required:true
                   },
                   password:{
                       required:true,
                       minlength:5
                   },
               },
               message:{
                   firstName:{
                       required:"Please enter your firstname",
                       lettersonly:"Please enter alphabets only "
                   },
                   lastName:{
                       required:"Please enter your lastname",
                       lettersonly:"Please enter alphabets only "
                   },
                   email:{
                       required:"Please enter your email ID",
                       email:"Please enter a valid email ID"
                   },
                   username:{
                       required:"Please create a username"
                   },
                   password:{
                       required:"Please make a password",
                       minlength:"Password should have atleast 5 characters"
                   },


               }
           })
       });
