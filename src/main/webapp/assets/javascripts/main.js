function submitDetails() {
    // Getting values
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    let obj = {
        username: username,
        password: password,
    };

    // Send to Backend
    fetch("http://localhost:8080/testProject_war_exploded/api/login/verify", {
        // Adding method type
        method: "POST",
        // Adding body or contents to send
        body: JSON.stringify(obj),
        // Adding headers to the request
        headers: {
            "Content-type": "application/json; charset=UTF-8",
        },
    })
        .then(function(data){
            console.log(data);
            // Popup
            if(data.status != 203)
            {
                alert("Response")
            }
            else
            {
                Swal.fire({
                    title: 'Failed!',
                    text: 'Invalid Credentials',
                    icon: 'warning',
                    confirmButtonText: 'Okay'
                });
            }
        });
    //});

        // // Converting to JSON
        // .then((response) => response.json())
        //
        // // Displaying results to console
        // .then((json) => {
        //     console.log(json);
        //
        //     // Popup
        //     Swal.fire({
        //         title: 'Submitted!',
        //         text: 'Details has been submitted',
        //         icon: 'success',
        //         confirmButtonText: 'Okay'
        //     });
        // });

}

