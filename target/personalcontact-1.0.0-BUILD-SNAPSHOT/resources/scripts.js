function deleteUser(id,name){
		if(confirm(name+" adlı kişi silinecektir,Onaylıyor musunuz ?")){
			$(".btn-danger").attr("href","deletePerson?id="+id);
		}
}