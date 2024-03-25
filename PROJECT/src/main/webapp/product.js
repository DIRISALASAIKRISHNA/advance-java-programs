function validateform()
 {
	 //read the form data
	 var proId=document.getElementById("proId").value;
	 var proName=document.getElementById("proName").value;
	 var proPrice=document.getElementById("proPrice").value;
	 var proBrand=document.getElementById("proBrand").value;
	 var proMadeIN=document.getElementById("proMadeIN").value;
	 
	 if(proId.trim()===""||proName.trim()===""|| proPrice.trim()===""||proBrand.trim()===""||proMadeIN.trim()
	 ==="")
	 {
		alert("ALL fields must be filled out");
		return false; 
	 }
	 if(parseFloat(proPrice)<0)
	 {
		 alert("profit must be a non-negative value");
		 return false;
	 }
	 if(proName.length>50 || proBrand.length>50){
		 alert("product name and proBrand must be less thsn 50 characters");
		 return false;
	 }
	 
	 //get the mfg & exp dates
	 var proMfgDate=document.getElementById("proMfgDate").value;
	 var proExpDate=document.getElementById("proExpDate").value;
	 
	 //conver into date format:
	 var manufacturingDateObj=new Date(proMfgDate);
	 var expiryDateObj=new Date(proExpDate)
	 
	 //check the validation of dates:
	 if(manufacturingDateObj>expiryDateObj)
	 {
		 alert("Manufacturing date cannot be greater tehan expiry date");
		 return false;
	 }
	 return true;
 }s