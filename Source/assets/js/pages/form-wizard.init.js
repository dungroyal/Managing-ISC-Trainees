$(document).ready(function () {
    $("#basic-pills-wizard").bootstrapWizard({
        tabClass: "nav nav-pills nav-justified"
    }), $("#progrss-wizard").bootstrapWizard({
        onTabShow: function (a, i, r) {
            var s = (r + 1) / i.find("li").length * 100;
            $("#progrss-wizard").find(".progress-bar").css({
                width: s + "%"
            })
        }
    })
}); 