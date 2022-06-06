document.addEventListener('DOMContentLoaded', function () {
    let adminPassword = "Content123";

    let userpassword = "user";
    let user = prompt("Enter User or Admin", "None");
    let password = prompt("Enter a password");
    if (user == "Admin" || user == "admin") {
        if (password == adminPassword) {
            
            alert("Admin Logged");
            
            let var1=document.getElementById("saveTeacherSectionButton");
            let var2= document.getElementById("deleteTeacherSectionButton");
            var2.ariaDisabled = "false";
            var2.style.cursor="pointer";
            var1.ariaDisabled = "false";
            var1.style.cursor="pointer";
           
        }
        while (password != adminPassword) {
            password = prompt('Enter a password');
            if (password == adminPassword) {
                alert("Admin Logged");
                let var1=document.getElementById("saveTeacherSectionButton");
                let var2= document.getElementById("deleteTeacherSectionButton");
                var2.ariaDisabled = "false";
                var2.style.cursor="pointer";
                var1.ariaDisabled = "false";
                var1.style.cursor="pointer";
                break;
            }
        }
    }

    else if (user == "User" || user == "user") {
        if (password == userpassword) {
            
            alert("User Logged");
            let var1= document.getElementById("saveTeacherSectionButton");
            let var2= document.getElementById("deleteTeacherSectionButton");
            var2.ariaDisabled;
            var1.ariaDisabled;
           
        }   
        while (password != userpassword) {
            password = prompt('Enter a password');
            if (password == userpassword) {
                alert("User Logged");
                let var1= document.getElementById("saveTeacherSectionButton");
                let var2= document.getElementById("deleteTeacherSectionButton");
                var2.ariaDisabled;
                var1.ariaDisabled;


                break;
            }

        }

    }


})
