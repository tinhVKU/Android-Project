package com.tinh.music;

import java.util.ArrayList;

public class data {
        lvbaihat[] mp3 ={
         new lvbaihat("Nếu Có Kiếp Sau","Hương Ly","https://nhacvietnam.mobi/listen/neu-co-kiep-sau~huong-ly~tsv7t03cqtfnwv",R.drawable.neucokiepsau),
        new lvbaihat( "Sầu Tương Tư","Nhật Phong","https://nhacvietnam.mobi/listen/sau-tuong-tu~nhat-phong~tsv7qbmcqteq8v",R.drawable.sautuongtu),
        new lvbaihat("Yêu Một Người Gian Dối","Như Việt & Thương Võ & ACV" ,"https://nhacvietnam.mobi/listen/yeu-mot-nguoi-gian-doi~nhu-viet-thuong-vo-acv~tsv7tvwtqtf29f",R.drawable.yeumotnguoigiandoi),
        new lvbaihat( "Sài Gòn Đau Lòng Quá","Hứa Kim Tuyền & Hoàng Duyên" ,"https://aredir.nixcdn.com/NhacCuaTui1013/SaiGonDauLongQua-HuaKimTuyenHoangDuyen-6992977.mp3?st=c4rjwh2gAg1c1EXUI9XtCw&e=1627285897",R.drawable.saigondaulongqua),
        new lvbaihat("Xe Anh Đến Đâu Em Theo Đến Đó","Dương Hoàng Yến & Đạt G","https://nhacvietnam.mobi/listen/xe-anh-den-dau-em-theo-den-do~duong-hoang-yen-dat-g~tsv7tzrcqtf1av",R.drawable.xeanhdidendauemtheodendo),
        new lvbaihat("Khi Thế Giới Đó Mất Đi","Hương Ly & Tăng Phúc","https://nhacvietnam.mobi/listen/khi-the-gioi-do-mat-di-gala-nhac-viet~huong-ly-tang-phuc~tsv7tscvqtf4v2",R.drawable.khithegioidomatem),
        new lvbaihat("Sắp 30","Trịnh Đình Quang","https://nhacvietnam.mobi/listen/sap-30~trinh-dinh-quang~tsvm0c05q8nvnh",R.drawable.sapbamuoi),
        new lvbaihat("Anh Thề Đấy","Thanh Hưng","https://nhacvietnam.mobi/listen/anh-the-day~thanh-hung~tsvm03qvq8nwe2",R.drawable.anhtheday),
        new lvbaihat("Vách Ngọc Ngà","Anh Rồng","https://nhacvietnam.mobi/listen/vach-ngoc-nga-new-version~anh-rong-phan-ann~tsvmzwm6q8198k",R.drawable.vachngocnga),
        new lvbaihat("Bỏ Em vào Balo","Tân Trần & Freak D","https://nhacvietnam.mobi/listen/bo-em-vao-balo~tan-tran-freak-d~tsv7tsvqqtf42e",R.drawable.boemvaobalo),
        new lvbaihat("Răng Khôn", "Phí Phương Anh","https://nhacvietnam.mobi/listen/rang-khon~phi-phuong-anh-rin9~tsvmzmtbq818fq",R.drawable.rangkhon),
        new lvbaihat("Hạ Còn Vương Nắng","DatKaa","https://nhacvietnam.mobi/listen/ha-con-vuong-nang~datkaa~tsvmv5zzq82h11",R.drawable.haconvuongnang),
        new lvbaihat("Lệ Duyên Tình","ICM & Long Nón Lá","https://nhacvietnam.mobi/listen/le-duyen-tinh~k-icm-long-non-la~tsvmzb0dq81qnm",R.drawable.leduyentinh),
        new lvbaihat("Hẹn Yêu","Minh Vương M4U & Thương Võ","https://nhacvietnam.mobi/listen/hen-yeu~minh-vuong-m4u-thuong-vo~tsvm6wq3q8k9ew",R.drawable.henyeu),
        new lvbaihat(" Chiều Thu Họa Bóng Nàng","DatKaa","https://nhacvietnam.mobi/listen/chieu-thu-hoa-bong-nang~datkaa~tsvmmzbrq881qa",R.drawable.chieuthuhoabongnang),
        new lvbaihat("Đom Đóm","Jack","https://nhacvietnam.mobi/listen/dom-dom~jack~tsvm76wrq8tk9a",R.drawable.domdom),
        new lvbaihat("Hồng Nhan","Jack","https://nhacvietnam.mobi/listen/hong-nhan~jack~tsv7qw0vqte9n2",R.drawable.hongnhan),
        new lvbaihat("Tình Sầu Thiên Thu Muôn Lối","Doãn Hiếu","https://nhacvietnam.mobi/listen/tinh-sau-thien-thu-muon-loi~doan-hieu~tsvw6qqrq9keea",R.drawable.tinhsauthienthu),
        new lvbaihat("Cố Giang Tình","X2X","https://nhacvietnam.mobi/listen/co-giang-tinh~x2x~tsvw76wwq9tk99",R.drawable.cogiangtinh),
        new lvbaihat("Thích Thì Đến","Lê Bảo Bình","https://nhacvietnam.mobi/listen/thich-thi-den~le-bao-binh~tsvw6bc0q9kqvn",R.drawable.thichthiden),
        new lvbaihat("Sợ Phải Kết Thúc","Nhật Phong","https://nhacvietnam.mobi/listen/so-phai-ket-thuc~nhat-phong~tsvw7w53q9t9hw",R.drawable.sophaiketthuc),
        new lvbaihat("Thê Lương","Phúc Chinh","https://nhacvietnam.mobi/listen/the-luong~phuc-chinh~tsvm36ssq8wk44",R.drawable.theluong),
        new lvbaihat("Hát Hãy Trao Cho Anh" , "Son Tung MTP","https://nhacvietnam.mobi/listen/hay-trao-cho-anh-remix~son-tung-m-tp-snoop-dogg~tsvr036cqanwkv",R.drawable.haytraochoanh),
        new lvbaihat("Ai Mang Cô Đơn Đi","ICM & APJ","https://nhacvietnam.mobi/listen/ai-mang-co-don-di~k-icm-apj~tsvmtz73q8f1tw",R.drawable.aimangcodondi),
        new lvbaihat("Bước Qua Đời Nhau","Khắc Việt","https://nhacvietnam.mobi/listen/buoc-qua-doi-nhau~khac-viet~tsvwr06zq9ank1",R.drawable.buocquadoinhau),
        new lvbaihat("Tình Anh","Đình Dũng" ,"https://nhacvietnam.mobi/listen/tinh-anh~dinh-dung-acv~tsvwsm76q948tk",R.drawable.tinhanh),
        new lvbaihat("Là 1 Thằng Con Trai","Jack ","https://nhacvietnam.mobi/listen/la-1-thang-con-trai-funky-rap-version-song-vieon-2020-live~jack~tsvwvq6dq92ekm",R.drawable.lamotthangcontrai),
        new lvbaihat("Hành Lang Cũ (Hạ Nhớ)","Long Nón Lá x Masew","https://nhacvietnam.mobi/listen/hanh-lang-cu-ha-nho~long-non-la-x-masew~tsvwbrs5q9qa4h",R.drawable.hanglangcu),
        new lvbaihat("Lời Xin Lỗi Vụng Về","Quân A.P","https://nhacvietnam.mobi/listen/loi-xin-loi-vung-ve~quan-ap~tsvmsbzrq84q1a",R.drawable.loixinloivungve)
};




}
