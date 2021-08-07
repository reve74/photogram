// (1) 회원정보 수정
function update(userId) {
	
	let data = $("#profileUpdate").serialize(); // key=value
	
	console.log(data);
	
	$.ajax({
		type: "put",
		url : `/api/user/${userId}`,
		data: data,
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		dataType: "json"
	}).done(res=>{ // HttpStatus 상태코드 200번대
		console.log("update 성공");
		location.href = `/user/${userId}`
	}).fail(error=>{
		console.log("update 실패");
	});
}