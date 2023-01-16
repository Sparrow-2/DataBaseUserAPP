function successfullyLogout(){
alert("Zostałeś wylogowany");
}

function successfullyAdded(){
    alert("Pomyślnie dodano nowy rekord.")
}

function successfullyEdited(){
    alert("Pomyślnie edytowano rekord.")
}
function validateLetters(evt) {
    var theEvent = evt || window.event;


    if (theEvent.type === 'paste') {
        key = event.clipboardData.getData('text/plain');
    } else {

        var key = theEvent.keyCode || theEvent.which;
        key = String.fromCharCode(key);
    }
    var regex = /[a-z]|\./;
    if( !regex.test(key) ) {
        theEvent.returnValue = false;
        if(theEvent.preventDefault) theEvent.preventDefault();
    }
}
function validateNumbers(evt) {
    var theEvent = evt || window.event;


    if (theEvent.type === 'paste') {
        key = event.clipboardData.getData('text/plain');
    } else {

        var key = theEvent.keyCode || theEvent.which;
        key = String.fromCharCode(key);
    }
    var regex = /[0-9]|\./;
    if( !regex.test(key) ) {
        theEvent.returnValue = false;
        if(theEvent.preventDefault) theEvent.preventDefault();
    }
}