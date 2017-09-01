$( document ).ready(function(){
	$(".button-collapse").sideNav({
		onOpen: () => {
			console.log('sidenav open');
			$("#sidenav-overlay").show();
		}
	});
})