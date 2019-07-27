$(document).ready(function() {
    $('button').click(function() {        
        var url = 'api/chat';
​
        $.get(url, function(data) {
        	$('#result').text("");
        	if(data.length===0){
        		$('#result').text("No chats, add some!");
        	}
        	console.log(data);
        	
        	for(i = 0; i < data.length; i++){
        		$('#result').append(data[i].name + " says " + data[i].content+"<br/>");
        	}
            
        });
    });
});