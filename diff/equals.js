window.addEventListener('load', ready, false);

function ready(){
    var nodes = document.querySelectorAll('.failure');

    for(i=0; i<nodes.length; i++){
        var node = nodes[i];
        changeToDiff(node);
        removeFailureClass(node);
    }   
}

function changeToDiff(node) {
    var expected = node.querySelector('.expected');
    var actual = node.querySelector('.actual');
    var expectedValue = unescape(expected.innerHTML);
    var actualValue = unescape(actual.innerHTML);

    ds = getDiffHtml(expectedValue, actualValue)

    actual.parentNode.removeChild(actual);
    expected.parentNode.removeChild(expected);
    node.innerHTML = ds;
}

function unescape(input){
      var e = document.createElement('div');
      e.innerHTML = input;
      return e.childNodes.length === 0 ? "" : e.childNodes[0].nodeValue;
}

function removeFailureClass(node) {
        node.className = node.className.replace('failure', '');
}

function getDiffHtml(expectedValue, actualValue) {
    var dmp = new diff_match_patch();
    var d = dmp.diff_main(actualValue, expectedValue);
    dmp.diff_cleanupSemantic(d);
    return dmp.diff_prettyHtml(d);
}