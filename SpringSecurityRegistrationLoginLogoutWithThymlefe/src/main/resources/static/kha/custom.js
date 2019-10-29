/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function isNumberKeyDot(evt) {
    var charCode = (evt.which) ? evt.which : event.keyCode
    //if (charCode > 31 && (charCode < 48 || charCode > 57)) /// without dot
    if (charCode > 31 && (charCode < 45 || charCode > 57)) {
        alert("Letter is not allowed!!!!");
        return false;
    }
    else {
        return true;
    }
}

function modalClick() { // Click to only happen on announce links
    $('#myModal').modal({backdrop: 'static', keyboard: false});
    $('#myModal').modal('show');
}
;

