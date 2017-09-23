// JavaScript Document
// Các hàm kiểm tra và hỏi xóa
function Kiemtradulieu()
{
	var kt=document.getElementsByClassName("kiemtra");
	for(i=0;i<kt.length;i++)
	{
		if(kt.item(i).value=="")
		{
			alert(kt.item(i).getAttribute("data_error"));
			kt.item(i).focus();
			return false; 	
		}	
	}
	return true;
}


function Xoaloaisanpham(ma_loai)
{
	if(confirm("Dữ liệu sẽ bị xóa, Không thể phục hồi lại\nBạn có chắc không?"))
	{
		window.location='xoa_loai_san_pham?ma_loai=' + ma_loai;
	}
}

function Xoaloaisanphamcha(ma_loai_cha)
{
	if(confirm("Dữ liệu sẽ bị xóa, Không thể phục hồi lại\nBạn có chắc không?"))
	{
		window.location='xoa_loai_san_pham_cha?ma_loai_cha=' + ma_loai_cha;
	}
}

function Xoasanpham(ma_san_pham)
{
	if(confirm("Dữ liệu sẽ bị xóa, Không thể phục hồi lại\nBạn có chắc không?"))
	{
		window.location='xoa_san_pham?ma_san_pham=' + ma_san_pham;
	}
}

function Xoahoadon(ma_hoa_don)
{
	if(confirm("Dữ liệu sẽ bị xóa, Không thể phục hồi lại\nBạn có chắc không?"))
	{
		window.location='xoa_hoa_don?ma_hoa_don=' + ma_hoa_don;
	}
}


function Xoanguoidung(ma_nguoi_dung)
{
	if(confirm("Dữ liệu sẽ bị xóa, Không thể phục hồi lại\nBạn có chắc không?"))
	{
		window.location='xoa_nguoi_dung?ma_nguoi_dung=' + ma_nguoi_dung;
	}
}

/* Nâng cao  */
function Xoadulieu(id_xoa,tbl_xoa,field_xoa)
{
	if(confirm("Dữ liệu sẽ bị xóa, Không thể phục hồi lại\nBạn có chắc không?"))
	{
		//window.location="xoadulieu.php?id_xoa=" + id_xoa + "&tbl_xoa="+ tbl_xoa + "&field_xoa=" + field_xoa;
		// url
		var url="xoadulieu.php";
		// data
		var data={"id_xoa":id_xoa,"tbl_xoa":tbl_xoa,"field_xoa":field_xoa};
		
		$.post(url,data,function(data){
				// Hiển thị kết quả trả về 
				$("#kqXoa").text(data);
				$("#kqXoa").css({"color":"#F00","font-weight":"bold"});
			})
		.done(function () { // Thành công
			window.setTimeout('location.reload()', 2000)
		})
			
	}
	
}
 