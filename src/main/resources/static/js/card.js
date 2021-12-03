function cardList() {
    $.ajax({
        type: "GET",
        url : "http://localhost:8080/index/all",
        success : function(data, textStatus, xhr) {
            if(xhr.status == 200){

                var $balise = $("#card-list");

                for(let i=0 ; i<data.length ; i++) {
                    $balise.append(
                        `
                        <div class="card bg-light mb-3 col-sm-4 contour-card" style="max-width: 18rem;"> <div class="card-header">Header</div>
                            <div class="card-body">
                                <h5 class="card-title">Light card title</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                    card's content.</p>
                            </div>
                        </div>`
                    )
                }

            }
        },
        error : function(request, error) {
            console.error(error);
            console.debug(request);
        }
    });



}
