
function signIn() {

    $.ajax({
        type: "POST",
        url : "/index/menu/" + ajoutCommande[0] + "/" + ajoutCommande[1] + "/" + ajoutCommande[2],
        success : function(data, textStatus, xhr) {
            if(xhr.status == 200){
                getCommande();
            }
        },
        error : function(request, error) {
            console.error(error);
            console.debug(request);
        }
    });


}