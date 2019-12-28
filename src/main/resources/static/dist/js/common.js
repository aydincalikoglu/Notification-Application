<!-- Page on load script -->
$(function () {
    //Add text editor
    $('.compose-textarea').each(function () {
        $(this).summernote();
    });

// Progress ozelligi icin form tagleri icerisinde <div class="upload-progress"><div class="progress-bar"></div></div> eklenmesi yeterlidir.
// Başarılı durumlarlar için response mesajı "true/false" olmalıdır.
    function extendedAjax(url, requestMethod, formData, doneFunction) {

        var uploadProgress = $(this).find(".upload-progress");
        var progressBar = uploadProgress.find(".progress-bar");
        var isProgressBarActive = uploadProgress.length && progressBar.length;
        if (isProgressBarActive){
            uploadProgress.addClass("upload-progress-bar");
            progressBar.removeAttr("style");
        }
        var submitBtn = $(this).find('[type="submit"]');
        if (submitBtn.length){
            submitBtn.attr("disabled", "disabled");
        }

        $.ajax({
            url: url,
            type: requestMethod,
            data: formData,
            dataType: 'json',
            contentType: false,
            processData: false,
            xhr: function () {
                //upload Progress
                var xhr = $.ajaxSettings.xhr();
                if (xhr.upload && isProgressBarActive) {
                    xhr.upload.addEventListener('progress', function (event) {
                        var percent = 0;
                        var position = event.loaded || event.position;
                        var total = event.total;
                        if (event.lengthComputable) {
                            percent = Math.ceil(position / total * 100) - 1;
                        }
                        if (isProgressBarActive) {
                            progressBar.css("width", +percent + "%");
                            progressBar.text("%" + percent);
                        }
                    }, true);
                }
                return xhr;
            },
            success: function(response) {
                doneFunction(response);
                toastr.success("İşlem Başarılı.");
                if (isProgressBarActive){
                    progressBar.text("Tamamlandı");
                    progressBar.css('background', '#5cb85c');
                    progressBar.css("width", "100%");
                }
            },
            error: function(response) {
                toastr.error(response);
                if (isProgressBarActive){
                    progressBar.css('background', '#c06e6e');
                    progressBar.css("width", "100%");
                }
            },
        });
    }

    $('[data-submit^="ajaxForm"]').submit(function (event) {
        event.preventDefault(); //prevent default action
        let submitBtn = $(this).find('[type=submit]');
        submitBtn.attr("disabled","disabled");
        var url = $(this).attr("action"); //get form action url
        var requestMethod = $(this).attr("method"); //get form GET/POST method
        var formData = new FormData(this); //Encode form elements for submission
        extendedAjax(url, requestMethod, formData, function (response) {
            submitBtn.removeAttr("disabled");
        });
    });

// Seçilen resmin gösterilmesini sağlar
    $("[data-read^=source]").on('change', function () {
        var input = this;
        if (input.files) {
            for (var i = 0; i < input.files.length; ++i) {
                var reader = new FileReader();
                reader.onload = function (e) {
                    $(input).closest('form').find('[data-content^=source]').attr('src', e.target.result);
                };
                reader.readAsDataURL(input.files[i]);
            }
        }
    });


// Seçilen resmin gösterilmesini sağlar
    $(".translate").on('click', function (event) {
        event.preventDefault()

        toastr.success("hi")
    });



});
