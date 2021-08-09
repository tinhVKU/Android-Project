package com.tinh.scrollveiw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.text.Normalizer;
import java.util.TreeSet;

public class mon_an_ba_mien extends AppCompatActivity implements View.OnClickListener {
    private TextView back;
    private EditText tim;
    private ImageButton btn_search;
    private LinearLayout btn_anvat,btn_lau,btn_hap,btn_nuong,btn_nhau,btn_thit,btn_chien,btn_luot,btn_chay,btn_kem;
    private LinearLayout btn_kho,btn_xao,btn_asang,btn_canh,btn_xoi,btn_ham,btn_hsan,btn_ncham,btn_cung,btn_uong;
    private String av = "Ăn Vặt",lau= "Lẩu",hap ="Món Hấp",nuong = "Đồ Nướng",nhau = "Món Nhậu";
    private String thit = "Món Thịt",chien = "Món Chiên",luot = "Món Luộc",chay = "Món Chay",kho = "Món Kho";
    private String xao = "Món Xào",asang = "Ăn Sáng",canh = "Canh",xoi = "Xôi",ham = "Món Hầm";
    private String hsan = "Hải Sản",ncham = "Nước Chấm",cung = "Tráng Miệng",uong = "Đồ Uống",kem = "Kem";
    ArrayList<String> stringArrayList = new ArrayList<>();
    ArrayList<Integer> anh = new ArrayList<Integer>();
    ArrayList<String> chebien = new ArrayList<>();

    ArrayList<String> stringArrayList1 = new ArrayList<>();
    ArrayList<Integer> anh1 = new ArrayList<Integer>();
    ArrayList<String> chebien1 = new ArrayList<>();

    ArrayList<String> stringArrayList2 = new ArrayList<>();
    ArrayList<Integer> anh2 = new ArrayList<Integer>();
    ArrayList<String> chebien2 = new ArrayList<>();

    ArrayList<String> stringArrayList3 = new ArrayList<>();
    ArrayList<Integer> anh3 = new ArrayList<Integer>();
    ArrayList<String> chebien3 = new ArrayList<>();

    ArrayList<String> stringArrayList4 = new ArrayList<>();
    ArrayList<String> chebien4 = new ArrayList<>();
    ArrayList<Integer> anh4 = new ArrayList<Integer>();

    ArrayList<String> stringArrayList5 = new ArrayList<>();
    ArrayList<Integer> anh5 = new ArrayList<Integer>();
    ArrayList<String> chebien5 = new ArrayList<>();

    ArrayList<String> stringArrayList6 = new ArrayList<>();
    ArrayList<Integer> anh6 = new ArrayList<Integer>();
    ArrayList<String> chebien6 = new ArrayList<>();

    ArrayList<String> stringArrayList7 = new ArrayList<>();
    ArrayList<Integer> anh7 = new ArrayList<Integer>();
    ArrayList<String> chebien7 = new ArrayList<>();

    ArrayList<String> stringArrayList8 = new ArrayList<>();
    ArrayList<Integer> anh8 = new ArrayList<Integer>();
    ArrayList<String> chebien8 = new ArrayList<>();

    ArrayList<String> stringArrayList9 = new ArrayList<>();
    ArrayList<String> chebien9 = new ArrayList<>();
    ArrayList<Integer> anh9 = new ArrayList<Integer>();

    ArrayList<String> stringArrayList10 = new ArrayList<>();
    ArrayList<String> chebien10 = new ArrayList<>();
    ArrayList<Integer> anh10 = new ArrayList<Integer>();

    ArrayList<String> stringArrayList11 = new ArrayList<>();
    ArrayList<String> chebien11 = new ArrayList<>();
    ArrayList<Integer> anh11 = new ArrayList<Integer>();

    ArrayList<String> stringArrayList12 = new ArrayList<>();
    ArrayList<String> chebien12 = new ArrayList<>();
    ArrayList<Integer> anh12 = new ArrayList<Integer>();

    ArrayList<String> stringArrayList13 = new ArrayList<>();
    ArrayList<String> chebien13 = new ArrayList<>();
    ArrayList<Integer> anh13 = new ArrayList<Integer>();

    ArrayList<String> stringArrayList14 = new ArrayList<>();
    ArrayList<String> chebien14 = new ArrayList<>();
    ArrayList<Integer> anh14 = new ArrayList<Integer>();

    ArrayList<String> stringArrayList15 = new ArrayList<>();
    ArrayList<String> chebien15 = new ArrayList<>();
    ArrayList<Integer> anh15 = new ArrayList<Integer>();

    ArrayList<String> stringArrayList16 = new ArrayList<>();
    ArrayList<String> chebien16 = new ArrayList<>();
    ArrayList<Integer> anh16 = new ArrayList<Integer>();

    ArrayList<String> stringArrayList17= new ArrayList<>();
    ArrayList<String> chebien17 = new ArrayList<>();
    ArrayList<Integer> anh17 = new ArrayList<Integer>();

    ArrayList<String> stringArrayList18= new ArrayList<>();
    ArrayList<String> chebien18 = new ArrayList<>();
    ArrayList<Integer> anh18 = new ArrayList<Integer>();

    ArrayList<String> stringArrayList19= new ArrayList<>();
    ArrayList<String> chebien19 = new ArrayList<>();
    ArrayList<Integer> anh19 = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_an_ba_mien);
        inview();
        Onclick();
        anvat();
        lau();
        hap();
        nuong();
        nhau();
        thit();
        chien();
        luot();
        chay();
        kho();
        xao();
        asang();
        canh();
        xoi();
        ham();
        hsan();
        ncham();
        trmieng();
        uong();
        kem();

    }
    public void inview(){
        btn_search = findViewById(R.id.searcharray);
        back = findViewById(R.id.tieude);
        btn_anvat = findViewById(R.id.anvat);
        btn_lau = findViewById(R.id.lau);
        btn_hap = findViewById(R.id.hap);
        btn_nuong = findViewById(R.id.nuong);
        btn_nhau = findViewById(R.id.nhau);
        btn_thit = findViewById(R.id.thit);
        btn_chien = findViewById(R.id.chien);
        btn_luot = findViewById(R.id.luot);
        btn_chay = findViewById(R.id.chay);
        btn_kho = findViewById(R.id.kho);
        btn_xao = findViewById(R.id.xao);
        btn_asang = findViewById(R.id.asang);
        btn_canh = findViewById(R.id.canh);
        btn_xoi = findViewById(R.id.xoi);
        btn_ham = findViewById(R.id.ham);
        btn_hsan = findViewById(R.id.hsan);
        btn_ncham = findViewById(R.id.ncham);
        btn_cung = findViewById(R.id.cung);
        btn_uong = findViewById(R.id.uong);
        btn_kem = findViewById(R.id.kem);
        tim = findViewById(R.id.tim);

    }
    public void Onclick(){
        back.setOnClickListener(this);
        btn_anvat.setOnClickListener(this);
        btn_lau.setOnClickListener(this);
        btn_hap.setOnClickListener(this);
        btn_nuong.setOnClickListener(this);
        btn_nhau.setOnClickListener(this);
        btn_thit.setOnClickListener(this);
        btn_chien.setOnClickListener(this);
        btn_luot.setOnClickListener(this);
        btn_chay.setOnClickListener(this);
        btn_kho.setOnClickListener(this);
        btn_xao.setOnClickListener(this);
        btn_asang.setOnClickListener(this);
        btn_canh.setOnClickListener(this);
        btn_xoi.setOnClickListener(this);
        btn_ham.setOnClickListener(this);
        btn_hsan.setOnClickListener(this);
        btn_ncham.setOnClickListener(this);
        btn_cung.setOnClickListener(this);
        btn_uong.setOnClickListener(this);
        btn_kem.setOnClickListener(this);
    }
    public void anvat(){
        chebien.add("* Nguyên liệu:\n" +
                "\n" +
                "1/2 kg khoai lang\n" +
                "20 gram bột năng\n" +
                "2 thìa đường cát\n" +
                "1 ít nước cốt dừa\n" +
                "Bột chiên giòn\n" +
                "* Cách làm:\n" +
                "\n" +
                "Bước 1: Khoai luộc chín, bỏ vỏ tán nhuyễn cho thêm bột năng, nước cốt dừa, đường vào trộn đều thành khối mịn\n" +
                "\n" +
                "Bước 2: Nặn khoai thành những miếng dài cỡ 3 - 5 cm như bán ngoài chợ. Sau đó lăn qua bột năng sao cho bột bám đều viên khoai\n" +
                " \n" +
                "Bước 3: Pha bột chiên giòn với chút nước cho sền sệt\n" +
                "\n" +
                "Bước 4: Đặt chảo dầu lên bếp cho đến khi dầu sôi thì nhúng từng viên khoai vào bột chiên giòn rồi cho vào chảo\n" +
                "\n" +
                "Bước 5: Bao giờ khoai chuyển màu vàng ruộm thì vớt ra để vào đĩa đã trải sẵn giấy thấm dầu");
        chebien.add("* Nguyên liệu:\n" +
                "\n" +
                "10 gram bột rau câu\n" +
                "200 gram đường\n" +
                "300ml nước cốt dừa\n" +
                "3 lít nước dừa tươi\n" +
                "6 quả dừa nguyên quả\n" +
                "* Cách làm:\n" +
                "\n" +
                "Bước 1: Trộn đều bột rau câu với đường, nước dừa đổ vào nồi rồi cho hỗn hợp bột rau câu, đường vào khuấy đều tay\n" +
                "\n" +
                "Bước 2: Bật bếp đun khuấy nhẹ cho bột thạch tan hết, đến khi sôi thì tắt bếp, để riêng ra 500ml còn lại thì cho đều vào 6 quả dừa\n" +
                "\n" +
                "Bước 3: 500 ml nước dừa được đun với lửa nhỏ để thạch không bị đông, rồi hòa với nước cốt dừa\n" +
                "\n" +
                "Bước 4: Khi thạch trong quả dừa se lại thì cho thạch vừa nấu xong lên mặt vừa rồi của các quả dừa\n" +
                "\n" +
                "Bước 5: Để nguội rồi cho vào tủ lạnh cho đông hẳn là xong.");
        chebien.add("* Nguyên liệu:\n" +
                "\n" +
                "100 gram bột nếp\n" +
                "20 gram bột gạo\n" +
                "70 gram khoai lang tím hấp chín\n" +
                "1 lon thạch dừa\n" +
                "50 gram đường\n" +
                "200 ml nước cốt dừa\n" +
                "1 muỗng cà phê muối\n" +
                "* Cách làm:\n" +
                "\n" +
                "Bước 1: Trộn đều bột nếp, bột gạo với 1/2 muỗng cà phê muối sau đó cho khoai vào nồi đều. Rồi cho thêm khoảng 50 - 60 ml nước vào và nặn bột thành từng viên nhỏ\n" +
                "\n" +
                "Bước 2: Cho nước cốt dừa đường, 1/2 muỗng cà phê muối với 50ml nước vào nồi nấu sôi đến khi sôi thì hạ nhỏ lửa\n" +
                "\n" +
                "Bước 3: Bắc nồi nước khác đến khi sôi thì cho bột vào luộc\n" +
                "\n" +
                "Bước 4: Khi các viên bột nổi lên thì vớt ra cho vào nồi nước cốt dừa đang nấu rồi cho thạch dừa vào nấu khoảng 5 - 7 phút là xong");
        chebien.add("* Nguyên liệu:\n" +
                "\n" +
                "16 chân gà\n" +
                "3 muỗng canh nước mắm\n" +
                "4 - 5 nhánh sả\n" +
                "5 - 6 trái ớt\n" +
                "1 củ gừng\n" +
                "3 muỗng cà phê đường\n" +
                "6 thìa dấm\n" +
                "1 muỗng cà phê hạt nêm\n" +
                "1 muỗng muối hột\n" +
                "* Cách làm:\n" +
                "\n" +
                "Bước 1: Chân gà rửa sạch bằng muối và gừng đập dập sau đó đem luộc 5 - 7 phút cùng 1 chút gia vị sau đó vớt chân gà ra chậu nước đá cho da giòn rồi vớt ra để ráo nước\n" +
                "\n" +
                "Bước 2: Tiếp đó cho chân gà vào tủ lạnh 35 - 45 phút\n" +
                "\n" +
                "Bước 3: Xả cắt khúc 3 - 4 cm tước sợi nhỏ, ớt và đầu sả thái mỏng\n" +
                "\n" +
                "Bước 4: Đun sôi hỗn hợp 500ml nước lọc, đường trắng, dấm, hạt nêm rồi để nguội. Sau đó cho ớt, sả thái mỏng, nước mắm vào khuấy\n" +
                "\n" +
                "Bước 5: Để chân gà, sả cắt khúc vào 1 âu lớn sau đó đổ hỗn hợp vừa đun để nguội ngâm sau 1 ngày là có thể dùng được");
        chebien.add("* Nguyên liệu:\n" +
                "\n" +
                "Xoài xanh: 1kg\n" +
                "Muối, đường và ớt bột (Ớt bột nên mua loại có thương hiệu, nơi sản xuất và hạn sử dụng rõ ràng để đảm bảo chất lượng).\n" +
                "* Cách làm:\n" +
                "\n" +
                "Bước 1: Sơ chế xoài\n" +
                "\n" +
                "Xoài gọt vỏ, rửa sạch rồi đem cắt miếng vừa ăn. Sau đó cho xoài vào tô ngâm với nước muối pha loãng (dùng nước đun sôi để nguội để làm). Thời gian ngâm khoảng 10 – 15 phút, vớt ra rửa lại với nước sạch, để ráo.\n" +
                "\n" +
                "Bước 2: Xóc xoài với đường\n" +
                "\n" +
                "Cho xoài vào tô, cho thêm 7 muỗng đường trắng vào và xóc đều sao cho đường bao phủ hết miếng xoài là được. Để khoảng 1 tiếng cho xoài chảy mật ra, đây cũng là lúc đường tan hết và ngấm vào xoài. Nếm thử để kiểm tra độ ngọt, nếu bạn thích ngọt nhiều thì có thể cho thêm đường tùy theo ý thích của bạn miễn sao hợp khẩu vị của bạn là được.\n" +
                "\n" +
                "Bước 3: Làm xoài dầm\n" +
                "\n" +
                "Khi xoài đã chảy mật, bạn cho thêm 1 muỗng ớt bột và 1 muỗng muối tinh vào tô, tiếp tục xóc đều. Nếu thích ăn cay hơn thì bạn cho thêm 1 muỗng cafe ớt bột nữa là được. Đừng cho nhiều hơn nữa, cay quá ăn không tốt cho dạ dày của bạn. Để gia vị ngấm khoảng 15 – 30 phút là món xoài dầm đã có thể ăn được.");
        chebien.add("* Nguyên liệu:\n" +
                "\n" +
                "- Phần vỏ bánh:\n" +
                "\n" +
                "Bột mì đa dụng: 500gr; 1,5gr bột nở (không có có thể bỏ qua)\n" +
                "Sữa tươi: 220ml loại ít đường\n" +
                "Bơ: 50gr loại bơ mặn hoặc nhạt, nếu không có thay thế bằng 50ml dầu ăn\n" +
                "Muối: ½ thìa cà phê\n" +
                "- Phần nhân bánh:\n" +
                "\n" +
                "4-5 cái mộc nhĩ; 1/2 củ đậu hoặc Su hào; 1/2 củ hành tây; Hành tím.\n" +
                "Một nắm miến dong; Bột nêm, hạt tiêu;\n" +
                "200gr thịt lợn xay; Trứng cút hoặc trứng gà\n" +
                "- Phần nước chấm:\n" +
                "\n" +
                "3 Nước mắm ăn, 2 thìa nước đun sôi để nguội\n" +
                "Đường 1 thìa, ½ thìa cà phê bột ngọt\n" +
                "Ớt băm, tỏi, nước cốt chanh.\n" +
                "* Cách làm:\n" +
                "\n" +
                "Bước làm vỏ bánh gối: Phần bơ cần đun chảy trước. Cho 220ml sữa tươi + men nở + 2 quả trứng gà + muối và bơ đã đun nóng trước vào âu rồi khuấy thật đều sau đó cho từ từ bột mì vào nhồi đến khi thành khối mịn dẻo rồi đậy kín cho bột nghỉ trong 30 phút, khi nhào bột nếu thấy bị khô quá bạn nên vẩy vài giọt nước.\n" +
                "\n" +
                "Bước chuẩn bị phần nhân bánh:\n" +
                "\n" +
                "Mộc nhĩ ngâm nước ấm khoảng 30 phút cho nở thái sợi nhỏ. Miến ngâm nước lạnh cho nở cắt nhỏ. Hành tây gọt vỏ thái nhỏ, kiểu hạt lựu. Su hào hoặc củ đậu bào sợi cắt nhỏ. Trứng cút hoặc trứng gà luộc chín, bỏ vỏ.\n" +
                "Phi thơm hành tím, cho 200gr thịt lợn xay và hành tây vào xào, các loại nhân khác vẫn giữ nguyên không xào chung để giữ độ ngọt.\n" +
                "Sau đó trộn đều thịt với các nguyên liệu khác: mộc nhĩ, miến, củ đậu hoặc su hào, thêm 1 thìa cà phê bột nêm, 1/2 thìa cà phê hạt tiêu.\n" +
                " \n" +
                "Bước tạo hình vỏ bánh: Bột sau khi ủ 30 phút mang ra cán mỏng bằng cây cán bột, có thể dùng chai thay thế. Bột mì khô rắc một lớp mỏng xuống mặt bàn để chống dính, đổ bột ra và cán thật mỏng. Sau khi cán mỏng bột lấy một bát to hơn bát ăn cơm ấn xuống làm thành một khuôn hình tròn.\n" +
                "\n" +
                "Bước làm bánh gối: Đập một quả trứng gà, chỉ lấy lòng đỏ ra bát, đánh tan và chuẩn bị sẵn chổi để quét. Sau khi làm xong vỏ bánh, thì xếp vỏ bánh ra, quét một lớp mỏng lòng đỏ trứng gà quanh mép vỏ bánh gối, cho phần nhân vào giữa, rồi đặt miếng trứng cút vào. Từ từ gấp mép bánh lại và tạo hình gập thành nếp.\n" +
                "\n" +
                "Bước chiên bánh: Đổ dầu ra chảo hoặc nồi có đế dày, nhỏ để tiết kiệm dầu, đảm bảo chiên ngập bánh trong chảo dầu với lừa vừa. Bánh gối chiên làm 2 lần, lần 1 chiên cho tới khi bánh vừa chín, chưa vàng. Lần 2 thì ăn đến đâu chiên đến đấy để bánh được giòn.\n" +
                "\n" +
                "Cách làm nước chấm bánh gối ngon: 3 thìa nước mắm + 2 thìa nước lọc đun sôi để nguội + 1 thìa đường + tỏi, ớt băm nhuyễn, trộn đều cho tan đường thêm một thìa nước cốt chanh hoặc dấm, trộn thêm su hào, cà rốt thái mỏng.");
        chebien.add("* Nguyên liệu:\n" +
                "\n" +
                "Khoai tây: 500g khoai tươi, loại củ to.\n" +
                "1 ít bơ lạt.\n" +
                "Dầu ăn: 500ml.\n" +
                "Giấy thấm dầu.\n" +
                "Gia vị: Muối, đường, tương ớt, sốt mayonnaise, bột phô mai (tùy thích).\n" +
                "Dụng cụ: Bếp, chảo chống dính, sạn lỗ inox, rổ đựng...\n" +
                "* Cách làm:\n" +
                "\n" +
                "Bước 1: Khoai tây gọt vỏ, gọt xong đến đâu thả ngay vào thau nước ngâm muối khoảng 15 phút để khoai không bị thâm.\n" +
                "\n" +
                "Bước 2: Khoai ngâm xong rửa sạch, vớt ra cắt miếng theo hình dạng tùy ý.\n" +
                "\n" +
                "Bước 3: Cho khoai vào nồi luộc với một nhúm muối nhỏ, một chút đường, khi vừa chín tới thì vớt ra để ráo nước, ngâm ngay vào nước lạnh khoảng 5 phút.\n" +
                "\n" +
                "Lưu ý: Bước luộc sơ khoai sẽ giúp món khoai tây chiên thêm giòn hơn, chiên nhanh hơn và không bị dai, ỉu khi nguội. Nhưng không nên luộc chín quá tránh khoai bị nát.\n" +
                "\n" +
                "Bước 4: Đổ dầu vào chảo, đun nóng già với lửa nhỏ vừa, cho thêm một chút bơ lạt vào đun chảy sau đó cho khoai tây vào chiên ngập dầu. Trong khi chiên đảo nhẹ cho các mặt chín đều.Khi thấy màu vàng ruộm là khoai đã chín, dùng vá có lỗ vớt ra rổ, lót giấy thấm dầu bên dưới.");
        chebien.add("* Nguyên liệu:\n" +
                "\n" +
                "- Nguyên liệu làm vỏ bánh:\n" +
                "\n" +
                "200g bột gạo.\n" +
                "250ml nước.\n" +
                "100ml bia.\n" +
                "½ thìa cà phê muối.\n" +
                "½ thìa cà phê bột nghệ.\n" +
                "Hành lá.\n" +
                "Dầu ăn.\n" +
                " \n" +
                "- Nguyên liệu làm nhân bánh:\n" +
                "\n" +
                "200g thịt bò hoặc thịt lợn ba rọi.\n" +
                "200g tôm.\n" +
                "1 củ hành tây.\n" +
                "100g giá đỗ.\n" +
                "Các loại gia vị.\n" +
                "- Nguyên liệu làm nước chấm: Tỏi; ớt sừng; cà chua; nước mắm; me chua hoặc chanh.\n" +
                "\n" +
                "- Các loại rau ăn kèm:\n" +
                "\n" +
                "Rau sống.\n" +
                "Húng lũi, rau răm, quế, xà lách, ngò gai…\n" +
                "Xoài, khế chua, chuối chát, dưa leo,…\n" +
                "* Cách làm:\n" +
                "\n" +
                "Bước 1: Pha bột làm bánh\n" +
                "\n" +
                "Cho bột gạo, muối và bột nghệ đã chuẩn bị trộn đều lên với nhau. Sau đó pha 250ml nước vào cùng 100ml bia và 50ml nước cốt dừa. Cho hỗn hợp bột vào nước và khuấy đều.\n" +
                "Hành lá đem xắt thật nhỏ rồi cho vào bột, thêm chút dầu ăn. Để bột nghỉ trong khoảng 30 phút – 1 tiếng.\n" +
                "Bước 2: Sơ chế nguyên liệu\n" +
                "\n" +
                "Thịt bò hoặc thịt ba rọi đem thái lát thật mỏng. Ướt sơ với chút muối, tỏi gừng băm, hạt tiêu và dầu ăn.\n" +
                "Tôm cắt râu, rửa sạch. Tôm cũng ướt với gia vị, hành khô và gừng được cắt to một chút.\n" +
                "Hành tây thái múi cau, giá đỗ rửa sạch để riêng ra ngoài.\n" +
                "Bước 3: Xào nhân\n" +
                "\n" +
                "Sau khi sơ chế nguyên liệu xong thì tiến hành xào. Chảo được làm nóng với một chút dầu, cho hành tây vào xào thơm với một ít gia vị. Sau đó cho tôm vào đảo. Đến lúc tôm gần chín thì cho thịt bò vào. Đảo sơ thêm một lúc thì múc để riêng ra.\n" +
                "\n" +
                "Bước 4: Đổ bánh xèo\n" +
                "\n" +
                "Cho dầu ăn vào, chờ cho dầu thật sôi. Đổ một lớp bột láng xung quanh cho thật mỏng và đều khắp khuôn.\n" +
                "Đậy nắp lại trong nửa phút.\n" +
                "Cho hỗn hợp nhân bánh đã xào, hành tây và giá lên trên. Tiếp tục đậy nắp trong 2 phút nữa.\n" +
                "Sau đó mở ra và gập đôi chiếc bánh lại. Chờ cho đến khi bánh đã vàng và giòn đều cả hai mặt thì vớt ra ngoài\n" +
                "Làm như vậy cho đến khi hết bột và nhân bánh.\n" +
                "Bước 5: Pha nước chấm\n" +
                "\n" +
                "Ớt sừng và cà chua đem bỏ hạt. Sau đó luộc chín lên và cho vào máy xay nhuyễn.\n" +
                "Nước mắm pha theo tỉ lệ 5 nước: 2 đường : 1.5 nước mắm vào rồi nấu chung với nhau cho tan chảy đường. Sau đó, dằm cho me ra chất chua rồi pha vào chén nước mắm, nêm nếm cho vừa ăn.\n" +
                "Cho ớt sừng, cà chua xay và tỏi băm vào.");
        chebien.add("* Nguyên liệu:\n" +
                "\n" +
                "- Làm vỏ bánh:\n" +
                "\n" +
                "1 thìa cà phê men khô (dry instant yeast)\n" +
                "½ thìa canh đường - 250g bột mì đa dụng\n" +
                "1 thìa cà phê bột nở (baking powder)\n" +
                "130 ml nước ấm\n" +
                "1 thìa canh (tablespoon) dầu ăn\n" +
                "50g đường\n" +
                "1 chút muối\n" +
                "- Làm nhân:\n" +
                "\n" +
                "200g thịt nạc vai băm nhỏ\n" +
                "10g mộc nhĩ khô\n" +
                "10g nấm hương\n" +
                "8 quả trứng chim cút\n" +
                "1 nắm nhỏ miến\n" +
                "Vài tép hành khô\n" +
                "½ thìa cà phê bột cà ri\n" +
                "Hạt nêm, nước mắm, muối, đường.\n" +
                "Lưu ý: Để nhân bánh bao quyện, không bị khô, chỉ nên chọn thịt nạc vai băm nhỏ có dắt mỡ.\n" +
                "\n" +
                "- Dụng cụ hấp bánh bao: Nồi hấp, xửng hấp\n" +
                "\n" +
                "* Cách làm:\n" +
                "\n" +
                "Bước 1. Chuẩn bị phần men nở\n" +
                "\n" +
                "Trước khi nhào và trộn bột, bạn chuẩn bị phần men nở trước. Hòa tan ½ thìa canh đường với nước ấm, rắc men vào khuấy nhẹ, để nghỉ trong 20 phút.\n" +
                "\n" +
                "Bước 2: Trộn bột và nhào bột\n" +
                "\n" +
                "Trong âu, trộn đều bột mì với bột nở, muối, đường với nhau. Sau đó, tạo một hố ở giữa âu bột, sau đó đổ nước đã hòa men ở bên trên cùng dầu ăn vào.\n" +
                "Nhào bột thành khối dẻo mịn (nhào bằng tay), cho thêm một vài giọt nước chanh, bánh sẽ trắng hơn.\n" +
                "Bước 3. Ủ bột\n" +
                "\n" +
                "Sau khi bột nhào xong, đem ủ bột trong 1 tiếng rưỡi ở nơi kín, ấm, có phủ khăn ướt lên mặt để bột đỡ khô.\n" +
                "Ủ bột trong 40-50 phút là bột sẽ nở gấp đôi.\n" +
                "Ấn thử ngón tay vào thấy bột nở lên là được\n" +
                "Bước 4: Làm nhân bánh\n" +
                "\n" +
                "Thịt băm đem ướp thịt với cà ri, hạt nêm, nước mắm, muối, đường, hành khô băm nhỏ.\n" +
                "Trứng chim cút luộc chín, sau đó bóc vỏ, để ra bát.\n" +
                "Mộc nhĩ, nấm hương ngâm nước nóng cho nở, rửa sạch lại rồi đem thái nhỏ, để nguyên ra bát.\n" +
                "Miến ngâm nước lạnh cho mềm rồi cắt thành sợi ngắn.\n" +
                "Cho mộc nhĩ, nấm hương, miến vào trộn đều.\n" +
                "Sau đó, nặn từng viên nhân cho bọc đều 1 quả trứng chim cút, chia làm 8 phần.\n" +
                "Bước 5. Trộn bột lần 2\n" +
                "\n" +
                "- Sau thời gian ủ bột, bột sẽ nở gấp đôi. Cho bột ra nhồi sơ lại rồi chia ra thành 8 phần nhỏ.\n" +
                "\n" +
                "Bước 6. Làm vỏ bánh bao\n" +
                "\n" +
                "Viên tròn các phần vỏ bánh lại rồi dùng cán bột cán dẹt xuống, cho nhân vào để nhồi.\n" +
                "Gấp mép theo vòng tròn và túm nhọn chính giữa.\n" +
                "Làm lần lượt cho đến hết.- Bánh đã nặn để nghỉ trong 30 phút.\n" +
                "\n" +
                "Bước 7. Hấp bánh\n" +
                "\n" +
                "Chuẩn bị nồi nước sôi để hấp. Cho bánh lên khuôn giấy bánh cupcake rồi xếp bánh lên khay.\n" +
                "Nấu 1 nồi nước cùng 1 muỗng canh giấm. Khi nước sôi thì cho xửng bánh lên hấp 25 phút là bánh chín.\n" +
                "Lưu ý: Muốn cho bánh bao được trắng, bạn chờ chút xíu dấm gạo vào trong nồi nước hấp.");
        chebien.add("* Nguyên liệu:\n" +
                "\n" +
                "- Phần vỏ bánh: 500gr bột gạo nếp; 100gr bột gạo tẻ; 1-2 củ khoai tây; 40gr đường; 1 nhúm muối; 400ml nước ấm; 500ml dầu ăn để chiên bánh\n" +
                "\n" +
                "- Phần nhân bánh: 300gr thịt nạc vai xay nhỏ; 2 củ cà rốt; 80gr hoặc 2 bó miến khô; 6 cái nấm mộc nhĩ; 40gr hành tây, 10ml dầu ăn; 2 thìa cà phê bột nêm\n" +
                "\n" +
                "- Phần nước chấm chua ngọt: Đường, chanh, nước mắm, tỏi, ớt băm nhỏ\n" +
                "\n" +
                "- Dưa góp:\n" +
                "\n" +
                "Đu đủ, cà rốt, su hào\n" +
                "Dấm, đường\n" +
                "* Cách làm:\n" +
                "\n" +
                "Bước 1: Làm vỏ bánh\n" +
                "\n" +
                "- Khoai tây luộc chín, lột vỏ nghiền mịn lấy khoảng 50gr. Trộn chung bột gạo nếp, bột gạo, đường, muối với nhau.\n" +
                "\n" +
                "- Đổ từ từ nước ấm vào nhồi cho bột thành một khối dẻo, mịn không dính tay không được nhão quá, sau đó trộn khoai tây đã nghiền mịn vào.\n" +
                "\n" +
                "- Để bột nghỉ khoảng 1 giờ cho bột ngậm đủ nước.\n" +
                "\n" +
                "Bước 2: Làm nhân bánh\n" +
                "\n" +
                "Tranh thủ lúc đang ủ bột, tiến hành làm nhân bánh.\n" +
                "\n" +
                "- Thịt nạc vai băm nhuyễn hoặc xay nhỏ.\n" +
                "\n" +
                "- Cà rốt gọt vỏ bào sợi nhỏ.\n" +
                "\n" +
                "- Miến ngâm nước cho nở (nhưng không nên ngâm lâu quá để khi cho vào phần nhân bánh miến tiếp tục hút nước trong bánh), cắt nhỏ.\n" +
                "\n" +
                "- Mộc nhĩ ngâm nở, rửa sạch cắt nhỏ.\n" +
                "\n" +
                "- Hành tây băm nhỏ.\n" +
                "\n" +
                "- Trộn tất cả các nguyên liệu ở phần nhân với nhau, chia thành các nắm nhỏ (khoảng 12 phần, mỗi phần khoảng 25gr).\n" +
                "\n" +
                "Bước 3: Cho nhân vào bánh\n" +
                "\n" +
                "- Chia bột thành các phần, mỗi phần khoảng 50gr.\n" +
                "\n" +
                "- Lấy từng viên bột, ấn dẹt cho phần nhân vào giữa, nặn thành hình oval hoặc hình tròn tùy ý. Tuy nhiên nặn hình ô van sẽ dễ ăn hơn.\n" +
                "\n" +
                "- Làm lần lượt cho đến hết phần bột và nhân. Sau khi đã xong tiếp tục lấy màng bọc thực phẩm bọc lại và để bánh nghỉ thêm 1 giờ nữa.\n" +
                "\n" +
                "Bước 4: Rán bánh\n" +
                "\n" +
                "- Đun sôi dầu ăn trong chảo sâu lòng.\n" +
                "\n" +
                "- Khi dầu sôi lăn tăn thì lần lượt thả từng viên bánh vào chiên cho đến khi vỏ bánh chín vàng giòn. Không nên thả bánh vào khi dầu sôi to quá sẽ bị bắn dầu.\n" +
                "\n" +
                "- Lưu ý không để lửa quá to dẫn đến vỏ bánh chín mà bên trong bánh còn sống. Ngoài ra, cũng không nên cho quá nhiều bánh vào cùng một lúc, dẫn đến nhiệt độ trong nồi dầu bị giảm, bánh chín không đều và không có màu vàng đẹp.\n" +
                "\n" +
                "- Khi thấy bánh chín vàng đều và nổi lên thì vớt ra để lên giấy thấm dầu.\n" +
                "\n" +
                "Bước 5: Pha nước chấm bánh rán mặn\n" +
                "\n" +
                "- Đường với nước cốt chanh khuấy đều trong một bát cho đường chanh tan vào nhau với tỉ lệ khoảng 15ml nước chanh và 25gr đường.\n" +
                "\n" +
                "- Từ từ đổ lượng nước mắm vừa đủ vào, thấy vừa ăn thì dừng lại, thêm ớt, tỏi băm tuỳ khẩu vị.\n" +
                "\n" +
                "Bước 6: Làm dưa góp\n" +
                "\n" +
                "- Su hào, đu đủ, cà rốt thái miếng mỏng vừa ăn, ngâm qua với nước cho bớt nhựa rồi để ráo.\n" +
                "\n" +
                "- Cho tất cả vào bát, thêm chút giấm, đường, trộn đều cho ngấm gia vị .\n" +
                "\n" +
                "- Khi ăn, cho dưa góp vào bát nước chấm cho hấp dẫn.");
        chebien.add("* Nguyên liệu:\n" +
                "\n" +
                "50 gr bột gạo.\n" +
                "150 gr bột nếp.\n" +
                "25 gr bột năng.\n" +
                "5 gr muối.\n" +
                "230 ml nước ấm.\n" +
                "Dầu ăn.\n" +
                "* Cách làm:\n" +
                "\n" +
                "Bước 1: Bạn cho bột gạo, bột nếp, bột năng, muối vào tô to sau đó trộn đều nguyên liệu.\n" +
                "\n" +
                "Bước 2: Thêm nước ấm và trộn đều rồi bắt đầu nhồi bột cho thành 1 khối, bạn có thể lấy bột ra bàn sạch để nhồi cho dễ dàng hơn nhé, nhồi tới khi thấy khối bột mềm, dẻo, mịn màng là được rồi nhé.\n" +
                "\n" +
                "Bước 3:\n" +
                "\n" +
                "- Cắt khối bột làm 4 phần sau đó lấy từng phần và xoa 1 chút dầu ăn lên tay, dùng 2 bàn tay vê đi vê lại cho thành 1 dải bột dài, to đều nhau, bạn có thể làm dải bột to hay nhỏ tùy theo ý thích nhé.\n" +
                "\n" +
                "- Lấy dao cắt bột thành từng khúc dài cỡ tầm 1 ngón tay rồi để riêng ra đĩa, tiếp tục làm cho hết chỗ bột còn lại.\n" +
                "\n" +
                "Bước 4:\n" +
                "\n" +
                "- Cho nước vào nồi đun sôi sau đó thêm 1 xíu dầu ăn, khi nước đã sôi mới thả bánh gạo vào.\n" +
                "\n" +
                "- Bánh gạo luộc tầm 5-7 phút sau đó tắt bếp vớt bánh gạo ra đĩa.\n" +
                "\n" +
                "- Bánh chín nổi lên thì vớt ra, thả ngay vào chậu nước lạnh cho bánh nguội hẳn mới vớt bánh ra để ráo nước.");
        chebien.add("* Nguyên liệu:\n" +
                "\n" +
                "Thịt xay 300gr\n" +
                "Da heo 100gr\n" +
                "Thính 10gr\n" +
                "Bột chiên xù\n" +
                "Gia vị: đường, muối, tiêu, bột năng, nước mắm, giấm, hạt nêm, dầu ăn, tương ớt\n" +
                "Tỏi, ớt băm nhuyễn\n" +
                "\n" +
                " \n" +
                "* Cách làm:\n" +
                "\n" +
                "– Ướp phần thịt xay với 1 muỗng đường, ½ muỗng tiêu, ½ muỗng muối, nước mắm, tỏi, ớt băm nhuyễn, 1 muỗng bột năng. Sau đó, bạn bọc kín bằng màng bọc thực phẩm lại rồi cho vào ngăn đá của tủ lạnh khoảng 40 phút, như vậy sẽ giúp cho nem không bị bở và dai ngon.\n" +
                "\n" +
                "– Ngâm da heo với hỗn hợp giấm, muối và nước lọc khoảng 15 phút. Kế đến rửa lại da heo bằng nước cho thật sạch để khử đi mùi hôi rồi cho vào luộc đến khi chín mềm, vớt ra rửa qua nước lạnh rồi thái bì thành từng sợi nhỏ.\n" +
                "\n" +
                "– Phần thịt sau khi bỏ tủ lạnh xong đem ra xay nhuyễn cùng với 10gr thính. Sau đó cho phần da heo vào trộn đều.\n" +
                "\n" +
                "– Dùng màng bọc thực phẩm gói phần hỗn hợp trên thành từng miếng vừa ăn, thuôn dài rồi để tủ lạnh khoảng 2 tiếng cho phần nem này thành hình.\n" +
                "\n" +
                "– Sau đó, lấy phần nem này lăn qua bột chiên xù rồi cho dầu ăn vào chảo rán ở lửa vừa cho đến khi chín vàng giòn. Khi ăn ăn kèm cùng củ đậu, dưa chuột.\n" +
                "\n" +
                "– Phần nước chấm: Phi thơm tỏi băm nhuyễn lên chảo rồi cho một ít nước vào đến khi sôi thì cho thêm bơ lạc, sốt hoisin vào cùng một ít đường. Sau đó bạn đổ ra chén trộn đều cùng tương ớt.");
        chebien.add("* Nguyên liệu:\n" +
                "\n" +
                "Pho mát Mozzarella: 300gr\n" +
                "Bột chiên xù: 100gr\n" +
                "Bột mì: 100gr\n" +
                "Trứng gà: 2 quả\n" +
                "Dầu ăn, tiêu, hạt nêm, muối, đường, mùi tây xay nhỏ\n" +
                "* Cách làm:\n" +
                "\n" +
                "– Để phần pho mát Mozzarella trong tủ lạnh cỡ 1 tiếng rồi lấy ra cắt thành từng khúc thuôn dài, vừa ăn.\n" +
                "\n" +
                "– Chuẩn bị bát thứ nhất gồm hỗn hợp 2 quả trứng đánh tan, mùi tây xay nhỏ, hạt tiêu, bát thứ hai là bột mì và bát thứ ba là bột chiên xù. Với mỗi bát bạn nêm nếm một ít gia vị vào sao cho vừa ăn.\n" +
                "\n" +
                "– Lăn phần pho mát đã cắt khúc qua lần lượt ba bát theo thứ tự là bột mì, rồi đến trứng đánh, rồi cuối cùng là bột chiên xù và để vào ngăn đá tủ lạnh tầm 2 tiếng để định hình phần phô mai này. Sau đó đem ra chiên trong dầu với lửa vừa phải đến khi chín vàng, giòn tan.");
        chebien.add("* Nguyên liệu:\n" +
                "\n" +
                "Trứng cút lộn: 20 quả\n" +
                "Me vắt: 50gr\n" +
                "Đậu phộng rang xay nhuyễn\n" +
                "Hành phi\n" +
                "Rau răm\n" +
                "Tỏi ớt băm nhỏ\n" +
                "Gia vị: Nước mắm, đường phèn, hạt nêm.\n" +
                "* Cách làm:\n" +
                "\n" +
                "– Hòa tan 150ml nước sôi vào me vắt rồi dầm ra chờ me tan thì lọc qua rây lấy nước và cho 50gr đường phèn vào.\n" +
                "\n" +
                "– Luộc chín 20 quả trứng cút lộn. Sau đó vớt ra lột sạch vỏ.\n" +
                "\n" +
                "– Cho một ít dầu ăn lên chảo rồi cho tỏi ớt vào phi thơm đến khi tỏi vàng non thì hạ lửa nhỏ rồi cho phần sốt me ở trên vào, tiếp đó cho thêm khoảng 2 muỗng canh nước mắm, 1 muỗng cafe hạt nêm vào. Nấu lửa nhỏ đến khi phần đường phèn trong sốt me tan hết sau đó tăng lửa lên đến khi phần nước sốt me sôi lên thì tiếp tục cho 20 quả trứng vào trộn đều\n" +
                "\n" +
                "– Nấu đến khi phần sốt me cạn bớt và sệt lại thì cho ra kèm theo một ít rau răm, hành phi, đậu phộng rang lên trên và thưởng thức.");
        chebien.add("*Nguyên liệu\n" +
                "\n" +
                "Nguyên liệu để tự làm món ăn vặt tại nhà như sữa chua dẻo rất đơn giản. Bao gồm:\n" +
                "\n" +
                "Sữa đặc: ½ hộp\n" +
                "Sữa tươi: 1 gói\n" +
                "Sữa chua lên men: 1 hộp\n" +
                "Thạch rau câu: 15-20g\n" +
                "*Cách làm\n" +
                "\n" +
                "- Bước 1:\n" +
                "\n" +
                "Bạn đổ sữa tươi và sữa đặc vào nồi đun nhỏ lửa đến khi nhiệt độ đạt khoảng 50-60 độ. Các bạn nhớ chú ý không để sữa sôi nhé.\n" +
                "\n" +
                "- Bước 2:\n" +
                "\n" +
                "Đổ sữa chua men cái vào nồi sữa và khuấy đều đến khi sữa chua và sữa hòa quyện lại với nhau.\n" +
                "Ngâm thạch rau câu cho tan hết rồi cũng đổ vào hỗn hợp sữa vừa pha chế.\n" +
                "- Bước 3:\n" +
                "\n" +
                "Sau đó bạn múc sữa vào các hộp hoặc các hũ đã chuẩn bị sẵn. Đóng nắp lại và cho vào ủ.\n" +
                "Các bạn ủ trong máy làm sữa chua từ 5-8 tiếng là được. Nếu bạn không có máy làm sữa chua có thể ủ trong nồi cơm điện bằng cách dùng nước ấm ở nhiệt độ 60-70 độ.\n" +
                "Ủ xong bạn bảo quản sữa chua dẻo vào tủ lạnh ăn dần.");
        chebien.add("*Nguyên liệu\n" +
                "\n" +
                "- Về phần bánh:\n" +
                "\n" +
                "4 lòng đỏ trứng + 2 trứng (trứng gà tươi).\n" +
                "Sữa tươi: 500 ml.\n" +
                "60g đường.\n" +
                "Vani: 1 đến 2 ống.\n" +
                "1/2 muỗng cà phê muối.\n" +
                "Dụng cụ : cốc hoặc bát con để làm khuôn bánh, rây lọc.\n" +
                "- Về phần caramen\n" +
                "\n" +
                "60g đường.\n" +
                "100ml nước lọc.\n" +
                "1 muỗng nước cốt chanh.\n" +
                "*Cách làm\n" +
                "\n" +
                "Bước 1: Làm caramel\n" +
                "\n" +
                "Cho đường và nước (tỉ lệ đường: nước là 3:2) vào nồi sáng màu để tiện quan sát.\n" +
                "Đun nhỏ lửa đến khi đường tan. Khi đó dùng đũa khuấy đều và đun thêm từ 5,10 phút đến khi đường chuyển màu nâu cánh dán thì tắt bếp.\n" +
                "Thêm một muỗng nước cốt chanh tươi vào để bánh flan có mùi thơm đặc trưng.\n" +
                "Vì caramen đông cứng rất nhanh nên bạn cần nhanh tay cho ngay 1 lớp mỏng caramen vào khuôn ngay khi còn nóng. Sau đó để khuôn vào chỗ mát cho caramen nguội và đông cứng lại.\n" +
                "Bước 2: Làm bánh flan\n" +
                "\n" +
                "Cho trứng và đường vào 1 cái âu rồi khuấy thật nhẹ tay, cố gắng không làm xuất hiện bọt khí, khuấy cho tới khi tan đường.\n" +
                "Đun sữa trên bếp, không đun sôi mà chỉ đến khoảng 70 độ C (sữa chỉ cần hơi nóng và bọt lăn tăn xung quanh nồi) thì tắt bếp. Nếu đun sữa quá nóng hoặc sôi sẽ làm sữa bị hỏng.\n" +
                "Cho hỗn hợp trứng đã chuẩn bị từ bước trước đổ vào nồi sữa tươi và đánh đều lên, cho thật nhẹ nhàng để tránh nổi bọt và trứng bị vón cục lại. Kiểm tra lại hỗn hợp để loại bỏ những viên bị vón cục. Đánh đều để hỗn hợp trứng sữa trộn vào nhau.\n" +
                "Cho vani vào quấy đều .Dùng một chiếc rây để lọc hỗn hợp trên một lần để chiếc bánh flan của bạn được mịn màng và mềm thơm.\n" +
                "Rót hỗn hợp đã lọc vào những chiếc cốc để làm công đoạn tiếp theo.\n" +
                "Bước 3: Nướng hoặc hấp bánh\n" +
                "\n" +
                "Nướng: Đun sôi 1 nồi nước, rót nồi nước đó vào khay nướng trong lò rồi đặt khuôn bánh vào trong khay nướng có đổ nước đó. Cho vào lò nướng trong vòng 40 phút (tùy khuôn to hay nhỏ để điều chỉnh thời gian nướng cho phù hợp).\n" +
                "Hấp: Cho các cốc bánh flan vào nồi rồi dùng một chiếc khăn để phủ lên mặt các cốc, nhằm tránh cho bánh bị rỗ khi nước ở vung hấp nhỏ xuống. Cho lửa vừa và thi thoảng bạn dùng khăn để lau nước ở vung. Hấp chừng 30- 40 phút thì bánh đã chín.\n" +
                "Khi ăn bạn có thể úp bánh ra đĩa hoặc bát vừa, thêm một chút café, nước cốt dừa hoặc hoa quả tươi và đá sẽ làm bánh của bạn thơm ngon hơn rất nhiều.");
        chebien.add("Nguyên liệu\n" +
                "\n" +
                "15 quả chuối chín\n" +
                "400ml nước cốt dừa\n" +
                "200ml nước lọc\n" +
                "50g đường\n" +
                "40g bột năng\n" +
                "1 ống vani (nếu có)\n" +
                "3g muối\n" +
                "100g lạc rang giã nhỏ\n" +
                "*Cách làm\n" +
                "\n" +
                "Kem chuối là một trong những lựa chọn hàng đầu nếu bạn muốn tự làm món ăn vặt tại nhà. Các bước làm kem chuối vô cùng đơn giản.\n" +
                "\n" +
                "Bước 1: Cho nước lọc, nước cốt dừa, đường, muối, vani, bột năng vào xoong khuấy đều rồi bắc lên bếp đun nhỏ lửa, vừa đun vừa khuấy đến khi bột sôi và sánh lại thì tắt bếp để nguội.\n" +
                "Bước 2: Chuẩn bị túi kính để bọc kem. Rọc một bên túi để hở.\n" +
                "Bước 3: Chuối bóc vỏ cho vào giữa bao nilon rồi dùng dao to bảng ép mỏng.\n" +
                "Bước 4: Cho một thìa canh nước cốt lên chuối rồi rắc lạc rang lên.\n" +
                "Bước 5: Lật mặt chuối bên kia và làm tương tự, dùng tay ép nhẹ cho nước cốt dàn đều rồi gập phần bao nilon thừa lại. Làm tương tự đến khi hết chuối.\n" +
                "Bước 6: Cho kem chuối vào tủ lạnh ngăn đá khoảng 4-5 tiếng là có thể thưởng thức được rồi");
        chebien.add("*Nguyên liệu\n" +
                "\n" +
                "Nguyên liệu để tự làm món ăn vặt tại nhà như trứng gà nướng cực kì đơn giản:\n" +
                "\n" +
                "Trứng gà 14 quả\n" +
                "Nước mắm 50 ml\n" +
                "Đường trắng 30 gr\n" +
                "Muối 3 gr\n" +
                "Tiêu 3 gr\n" +
                "Dụng cụ : nồi hấp, xi lanh y tế (nếu có)\n" +
                "*Cách làm\n" +
                "\n" +
                "Bước 1: Hút lòng đỏ và lòng trắng trứng ra ngoài.\n" +
                "\n" +
                "Để làm trứng gà nướng, đầu tiên bạn phải hút lòng đỏ và lòng trắng ra khỏi vỏ trứng gà mà vẫn đảm bảo vỏ trứng còn nguyên.\n" +
                "Có 2 cách: cách thứ nhất là dùng tăm hoặc que xiên khoét một lỗ nhỏ trên đầu nhọn của trứng gà sau đó lấy ống xi lanh hút trứng ra khỏi vỏ; cách thứ 2 là dùng dao hoặc muỗng có đầu nhọn, khoét 1 lỗ nhỏ cỡ đầu ngón út trên đầu nhọn của trứng gà, dùng tăm khoấy đều bên trong, sau đó đỏ hỗn hợp trứng ra ngoài ( Các này dành cho những bạn không mua được xi lanh).\n" +
                "Bước 2: Thêm gia vị\n" +
                "Sau khi hút được trứng, bạn khuấy đều và lọc hỗn hợp trứng qua rây hoặc túi lọc để loại bỏ lòng trắng trứng còn lợn cợn hoặc vỏ trứng còn sót. Đối với bạn nào có xi lanh, dùng xi lanh để hút trứng đã có gia vị rồi cho vào lại từng quả.\n" +
                "Nếu không có xi lanh thì dùng một chiếc phểu nhỏ, đổ từ từ trứng đã có gia vị vào lại.\n" +
                "Bước 3: Hấp và nướng trứng\n" +
                "Sau khi đã cho hết hỗn hợp trở lại vào vỏ, ta tiến hành hấp trứng khoản 12 đến 15 phút cho trứng vừa chín tới. Sau đó đem đi nướng đến khi trứng có mùi thơm và lớp vỏ hơi cháy xém.\n" +
                "Khi ăn nên chấm trứng gà với muối tiêu pha một chút ớt và tắc, thêm tí rau răm nữa để tăng hương vị nhé. Vị trứng gà beo béo và dậy mùi thơm rất đặc biệt do được nướng trên bếp than sẽ khiến bạn cứ muốn ăn mãi không thôi.");
        chebien.add("*Nguyên liệu\n" +
                "Nguyên liệu và dụng cụ làm bánh trà sữa trân châu đường đen:\n" +
                "\n" +
                "Sữa tươi không đường: 200 ml.\n" +
                "Trứng gà: 6 quả.\n" +
                "Đường: 175 gr.\n" +
                "Trà ô long túi lọc: 3 túi.\n" +
                "Bột mì: 150 gr.\n" +
                "Bột bắp: 10 gr.\n" +
                "Bột nở: 8 gr.\n" +
                "Dầu ăn: 50 ml.\n" +
                "Vani: 10 ml.\n" +
                "Whipping cream: 100 ml.\n" +
                "Trân châu đường đen: tùy thích ( Bạn có thể thay trân châu đường đen thành trân châu hoàng kim hoặc loại trân châu bạn thích)\n" +
                "Dụng cụ: Nồi cơm điện, máy đánh trứng, muỗng, tô,…\n" +
                "*Cách làm\n" +
                " \n" +
                "- Bước 1:\n" +
                "Đun sôi 200 ml sữa tươi với 3 gói trà, để 3 đến 5 phút cho trà ra, vớt trà ra.\n" +
                "\n" +
                "- Bước 2: Phần cốt bánh\n" +
                "Đánh tan 5 lòng đỏ trứng gà cùng với 75 gr đường, sau đó rây bột mì và bột bắp và bột nở vào, trộn đều.\n" +
                "Đánh bông 5 lòng trắng trứng với tốc độ vừa đến khi trứng nổi bọt khí to cho từ từ 75 gr đường vào, tăng chế độ đánh nhanh đến khi trứng bông, nhấc đồ đánh trứng lên tạo chóp dẻo là vừa.\n" +
                "Bạn trộn nhẹ tay hai hỗn hợp trên với nhau, tránh làm vỡ bọt khí, sau đó cho 50 ml dầu ăn cùng 10 ml vani trộn đều.\n" +
                "Đổ hỗn hợp vào nồi cơm điện (tốt hất nên dùng nồi cơm có dung tích 1,8 lít) có lót sẵn giấy nến.\n" +
                "Bật chế độ nấu, sau khi nồi cơm trở về chế độ hâm bạn chờ 15 phút, bật nút nấu lần thứ 2, đợi tiếp 20 phút, bật nút nấu lần thứ 3, tiếp tục đợi 25 phút, bật nút nấu lần thứ tư, đến khi nồi cơm trở về chế độ hâm là xong.\n" +
                "Bạn có thể kiểm tra bằng cách chọt tăm vào hoặc lấy tay ấn nhẹ, bánh đàn hồi là đã chín. Để bánh nguội ít nhất 2 tiếng rồi lấy ra khỏi khuôn.\n" +
                "- Bước 3: Phần kem trà sữa\n" +
                "Đánh tan 1 lòng đỏ trứng gà cùng với 25 gr đường, đổ phần trà sữa còn lại (khoảng 100ml ) vào, bắt hỗn hợp lên nồi nấu sệt lại. Để nguội là giữ lạnh hỗn hợp.\n" +
                "Đánh bông 100 ml whipping cream, sau đó cho hỗn hợp trà sữa trứng đã nấu ở trên vào trộn đều, để hỗn hợp trong tủ lạnh đến khi dùng.\n" +
                "Bước 4: Trang trí bánh\n" +
                "Tạo giữa cốt bánh bông lan trà sữa một lỗ nhỏ rồi đổ phần kem sốt trà sữa vừa làm vào, phủ đầy mặt bánh.\n" +
                "Thêm trân châu đen lên trên và thưởng thức chiếc bánh ngọt ngào này thôi. Tự làm món ăn vặt tại nhà không hề khó đúng không nào?");
        chebien.add("Nguyên liệu cần chuẩn bị\n" +
                "Trứng gà: 8 quả\n" +
                "Đường cát trắng: 100g\n" +
                "Bột ngô: 50g\n" +
                "Bột chiên xù: 200g\n" +
                "ống va ni: 2 ống\n" +
                "Sữa tươi: 2 bọc\n" +
                "Hướng dẫn thực hiện\n" +
                "Pha một hỗn hợp gồm: 2 lòng đỏ trứng gà+ đường+ bột ngô+ vani, sữa tươi. Dùng đũa khuấy thật đều cho hỗn hợp quyện vào nhau và tan hết.\n" +
                "Bắc một chiếc nồi khô lên bếp và vặn lửa, cho hỗn hợp vào nồi và dùng đũa đảo đều hỗn hợp đến khi thấy sệt lại và dần nổi bóng thì tắt bếp.\n" +
                "Khi hỗn hợp nguội thì cho vào hộp đựng thực phẩm đã có quết dầu ăn phủ hết bề mặt. Nén chặt hỗn hợp trong hộp và để vào ngăn mát tủ lạnh trong khoảng 90 phút.\n" +
                "Cho bột chiên xù vào máy xay nhuyễn, rồi dùng màng lọc, lọc riêng phần bột mịn ra tô.\n" +
                "5 quả trứng còn lại lấy 5 lòng đỏ và 1 lòng trắng. Dùng đũa khuấy đều cho hỗn hợp hòa quyện vào nhau.\n" +
                "Sau 90 phút, lấy hộp đựng thực phẩm ra ngoài. Dùng dao cắt thành từng ô chữ nhật vừa ăn. Tiếp đến, cho bánh vào tô đựng trứng vừa khuấy xong và lăn đều. Cuối cùng, là để bánh qua bên bột chiên xù để bánh thấm bột.\n" +
                "Bắc một chiếc chảo khô đã lau sạch với dầu lên bếp. Khi dầu nóng, thì thả bánh sữa tươi vào chiên. Dùng đũa trở bánh cho chín vàng đều 2 mặt. Khi bánh đã lên màu vàng đẹp mắt thì bạn có thể vớt ra và bắt đầu thưởng thức.");
        chebien.add("Nguyên liệu cần chuẩn bị:\n" +
                "Trứng cút: 20 trứng\n" +
                "Me đóng hộp: 1 hũ\n" +
                "Bơ Tường An: 1 Hộp\n" +
                "Bột năng: 30g\n" +
                "Tương ớt: 1 chai\n" +
                "Hướng dẫn thực hiện\n" +
                "\n" +
                "Trứng cút rửa sạch luộc chín, vớt ra cho vào bát nước nguội.\n" +
                "Me ngâm trong nước nóng, dầm nát (mình cho nửa bát nước con), khi me bở ra cho vào rây lọc lấy phần thịt me, phần vỏ và hột thì bỏ đi.\n" +
                "Lạc rang chín giã sơ qua, rau răm rửa sạch, gừng thái chỉ, tỏi hành tỏi bóc vỏ băm nhỏ.\n" +
                "Trứng cút đã nguội vớt ra, bóc vỏ nhẹ nhàng tránh bị nát. Cho dầu vào chảo rán sơ qua trứng rồi đổ ra đĩa.\n" +
                "Cho dầu ăn vào chảo, phi thơm hành tỏi, cho một thìa bơ vào, hành tỏi vàng đổ nước me vào, thêm hai thìa canh đường (độ ngọt điều chỉnh theo ý thích).\n" +
                "Cho một thìa canh nước mắm, một thìa cà phê bột nêm, một thìa canh tương ớt, nêm nếm cho vừa miệng, thích ăn cay nữa cho thêm ớt quả thái nhỏ.\n" +
                "Đun sôi hỗn hợp trên đến khi nước sốt hơi sền sệt thì đổ trứng cút vào, đảo đều trứng cút cho ngấm nước sốt (nhớ đảo nhẹ tay tránh trứng bị nát).\n" +
                "Đun trứng trong 4 phút rồi tắt bếp múc trứng ra đĩa, rắc thêm lạc rang, rau răm và gừng thái sợi ăn kèm.");
        chebien.add("Nguyên liệu cần chuẩn bị:\n" +
                "Bắp trái tươi: 2 trái\n" +
                "Bơ Tường An: 1 hộp nhỏ\n" +
                "Tép khô: 150g\n" +
                "Hành phi: 50g\n" +
                "Tương ớt: 1 chai\n" +
                "Hướng dẫn thực hiện\n" +
                "Bước 1: sơ chế các nguyên liệu\n" +
                "\n" +
                "Bắp trái tươi: lựa loại bắp trái còn tươi, hạt mềm, dùng dao tách hạt ra riêng một thau nhỏ.\n" +
                "\n" +
                "Bước 2: Tiến hành thực hiện\n" +
                "\n" +
                "Cho 1 chiếc chảo khô lên bếp rồi vặn lửa, tiếp đến, thêm nữa phần bơ có trong hộp vào chảo. Khi bơ đã tan hết thì cho bắp vào và dùng đũa xào liền tay.\n" +
                "\n" +
                "24. Bánh tráng nướng\n" +
                "Nguyên liệu cần chuẩn bị:\n" +
                "Bánh tráng dày: 5 cái\n" +
                "Trứng gà: 4 quả\n" +
                "Hành lá: 1 bó\n" +
                "Bắp tươi: 200g\n" +
                "Tép khô: 200g\n" +
                "Tương ớt: 1 chai\n" +
                "Bếp than nướng, vỉ nướng\n" +
                "Hướng dẫn thực hiện\n" +
                "Bước 1: sơ chế nguyên liệu\n" +
                "\n" +
                "Hành lá: rửa sạch, cắt khúc nhỏ\n" +
                "Bắp tươi: rửa sạch, tách ra từng hạt sẵn.\n" +
                "Bước 2: cách thức thực hiện\n" +
                "\n" +
                "Bắc 1 cái chảo khô đã lau sạch lên bếp, phi dầu và cho bắp vào xào chín.\n" +
                "Tiếp đến, cho hành lá với trứng gà vào khuấy đều.\n" +
                "Đặt bánh tráng lên vỉ nướng, múc 1 muỗng hành lá với trứng dàn đều lên bánh tráng, tiếp đến cho bắp và tép khô lên trên. Xoay bánh tráng liên tục theo hình tròn trên vỉ để các nguyên liệu trên bánh tráng chín đều.\n" +
                "Sau khoảng vài phút, gập bánh tráng lại và dùng gắp lật qua lại bánh tráng nhiều lần rồi cho ra dĩa thưởng thức cùng với tương ớt.\n" +
                "Nếu muốn ngon hơn, trong khi nướng bánh, bạn có thể cho sốt mayournemlisa và tương ớt lên trên mặt bánh trước khi gập lại.");
        chebien.add("Nguyên liệu cần chuẩn bị:\n" +
                "Bánh tráng dày: 5 cái\n" +
                "Trứng gà: 4 quả\n" +
                "Hành lá: 1 bó\n" +
                "Bắp tươi: 200g\n" +
                "Tép khô: 200g\n" +
                "Tương ớt: 1 chai\n" +
                "Bếp than nướng, vỉ nướng\n" +
                "Hướng dẫn thực hiện\n" +
                "Bước 1: sơ chế nguyên liệu\n" +
                "\n" +
                "Hành lá: rửa sạch, cắt khúc nhỏ\n" +
                "Bắp tươi: rửa sạch, tách ra từng hạt sẵn.\n" +
                "Bước 2: cách thức thực hiện\n" +
                "\n" +
                "Bắc 1 cái chảo khô đã lau sạch lên bếp, phi dầu và cho bắp vào xào chín.\n" +
                "Tiếp đến, cho hành lá với trứng gà vào khuấy đều.\n" +
                "Đặt bánh tráng lên vỉ nướng, múc 1 muỗng hành lá với trứng dàn đều lên bánh tráng, tiếp đến cho bắp và tép khô lên trên. Xoay bánh tráng liên tục theo hình tròn trên vỉ để các nguyên liệu trên bánh tráng chín đều.\n" +
                "Sau khoảng vài phút, gập bánh tráng lại và dùng gắp lật qua lại bánh tráng nhiều lần rồi cho ra dĩa thưởng thức cùng với tương ớt.\n" +
                "Nếu muốn ngon hơn, trong khi nướng bánh, bạn có thể cho sốt mayournemlisa và tương ớt lên trên mặt bánh trước khi gập lại.");
        chebien.add("Nguyên liệu cần chuẩn bị:\n" +
                "Bánh tráng tây ninh: 200g\n" +
                "Trứng cút: 3 quả\n" +
                "Xoài xanh: 1 quả\n" +
                "Tép khô: 50g\n" +
                "Khô bò: 50g\n" +
                "Rau răm: 1 nạm nhỏ\n" +
                "Sốt mayournemlisa: 1 chai\n" +
                "Trứng gà: 1 quả\n" +
                "Hành phi: 1 muỗng cà phê nhỏ\n" +
                "Hạt điều làm màu: 50g\n" +
                "Sả, ớt\n" +
                "Muối tây ninh xay nhuyễn: 1 muỗng\n" +
                "Hướng dẫn thực hiện\n" +
                "Bước 1: sơ chế nguyên liệu\n" +
                "\n" +
                "Trứng cút: luộc chín, bóc vỏ.\n" +
                "Rau răm: rửa sạch, cắt nhỏ.\n" +
                "Bánh tráng: cắt sợi vừa ăn, độ dài khoảng từ 4-5 cm.\n" +
                "Xoài xanh: rửa sạch, bào vỏ, thái sợi nhỏ như cọng bún.\n" +
                "Sả, ớt: rửa sạch, băm nhuyễn\n" +
                "Bước 2: Cách thức thực hiện\n" +
                "\n" +
                "Cho 2 muỗng sốt mayournemlisa vào may xay sinh tố, đập thêm quả trứng gà bỏ vào cùng. Bật máy xay, cho đến khi nào hỗn hợp bông lên thì dừng lại. Tắt máy, cho hỗn hợp ra bọc nilong và để vào ngăn mát tủ lạnh.\n" +
                "Tiếp đến, phi hạt điều cùng với dầu trên chảo để lấy nước màu. Sau khi phi xong, lọc lấy nước màu, tiếp tục cho sả ớt vào và đảo đều đến khi hỗn hợp sa tế đã quyện vào nhau thì tắt bếp.\n" +
                "Cho bánh tráng, sa tế , xoài, hành phi, tép khô vào một cái thau lớn. Mang bao tay và bắt đầu trộn đều các nguyên liệu, khi các nguyên liệu đã lên màu đẹp mắt, tiếp tục cho muối Tây Ninh và rau răm vào và trộn thêm lần nữa.\n" +
                "Sau đó, cho bánh tráng ra dĩa, bạn có thể cắt trứng thành hai và đặt lên. Lấy bọc sốt trứng vừa làm xong, cắt một đầu nhỏ ở phía cuối bọc, và bóp đều cho sốt dàn trên mặt của bánh tráng rồi thưởng thức.");

        stringArrayList.add("Khoai lang kén");
        stringArrayList.add("Thạch dừa");
        stringArrayList.add("Chè khoai lang");
        stringArrayList.add("Chân gà sả ớt");
        stringArrayList.add("Xoài dầm");
        stringArrayList.add("Bánh gối");
        stringArrayList.add("Khoai tây chiên");
        stringArrayList.add("Bánh Xèo");
        stringArrayList.add("Bánh bao nhân thịt");
        stringArrayList.add("Bánh rán mặn");
        stringArrayList.add("Tokbokki");
        stringArrayList.add("Nem chua rán");
        stringArrayList.add("Phô mai que");
        stringArrayList.add("Cút lộn xào me");
        stringArrayList.add("Sữa chua dẻo");
        stringArrayList.add("Bánh flan núng nính");
        stringArrayList.add("Kem chuối thơm ngon");
        stringArrayList.add("Trứng gà nướng");
        stringArrayList.add("Bánh trà sữa trân châu đường đen");
        stringArrayList.add("Bánh sữa tươi chiên");
        stringArrayList.add("Trứng cút xào me");
        stringArrayList.add("Bắp xào bơ");
        stringArrayList.add("Bánh tráng nướng");
        stringArrayList.add("Bánh tráng trộn");
        anh.add(R.drawable.ab_khoai_lang_ken);
        anh.add(R.drawable.ab_thach_dua);
        anh.add(R.drawable.ab_che_khoai_lang);
        anh.add(R.drawable.ab_chan_ga);
        anh.add(R.drawable.ab_xoai);
        anh.add(R.drawable.ab_banh_goi);
        anh.add(R.drawable.ab_khoai_tay);
        anh.add(R.drawable.ab_banhxeo);
        anh.add(R.drawable.ab_banhbao);
        anh.add(R.drawable.ab_banhranman);
        anh.add(R.drawable.ab_tokbokki);
        anh.add(R.drawable.ab_nemchuaran);
        anh.add(R.drawable.ab_phomaique);
        anh.add(R.drawable.ab_cutlonxaome);
        anh.add(R.drawable.ab_suachua);
        anh.add(R.drawable.ab_banhplan);
        anh.add(R.drawable.ab_banhkemchuoi);
        anh.add(R.drawable.ab_trungganuong);
        anh.add(R.drawable.ab_trasuachanchau);
        anh.add(R.drawable.ab_suachua);
        anh.add(R.drawable.ab_cutlonxaome);
        anh.add(R.drawable.cacbohydrate);
        anh.add(R.drawable.ab_banh_goi);
        anh.add(R.drawable.ab_banhranman);
    }
    public void lau(){
        stringArrayList1.add("Lẩu mắm");
        stringArrayList1.add("Lẩu thái chua cay");
        stringArrayList1.add("Lẩu gà lá giang");
        stringArrayList1.add("Lẩu đuôi bò");
        stringArrayList1.add("Lẩu gà tiềm ớt hiểm");
        stringArrayList1.add("Lẩu hải sản");
        stringArrayList1.add("Lẩu cá thác lác");
        stringArrayList1.add("Lẩu bò");
        stringArrayList1.add("Lẩu ếch măng chua");
        stringArrayList1.add("Lẩu riêu cua bắp bò");
        stringArrayList1.add("Lẩu mắm miền Tây");
        stringArrayList1.add("Lẩu thả Phan Thiết");
        stringArrayList1.add("Lẩu nấm chay");
        stringArrayList1.add("Lẩu ghẹ măng chua");
        stringArrayList1.add("Lẩu nấm thập cẩm");
        stringArrayList1.add("Lẩu dê");
        stringArrayList1.add("Lẩu cá kèo");
        stringArrayList1.add("Lẩu miso Nhật");
        stringArrayList1.add("Lẩu kim chi Hàn Quốc");

        anh1.add(R.drawable.jf_laumam);
        anh1.add(R.drawable.jf_lauthaichuacaypng);
        anh1.add(R.drawable.jf_laugalagiang);
        anh1.add(R.drawable.jf_duoibo);
        anh1.add(R.drawable.othiem);
        anh1.add(R.drawable.lauhaisan);
        anh1.add(R.drawable.thaclac);
        anh1.add(R.drawable.laubo);
        anh1.add(R.drawable.echmangchua);
        anh1.add(R.drawable.reucua);
        anh1.add(R.drawable.jf_laumam);
        anh1.add(R.drawable.phanthiet);
        anh1.add(R.drawable.namchay);
        anh1.add(R.drawable.ghemangchua);
        anh1.add(R.drawable.namthapcam);
        anh1.add(R.drawable.laude);
        anh1.add(R.drawable.laucakeo);
        anh1.add(R.drawable.misonhat);
        anh1.add(R.drawable.hanquoc);

        chebien1.add("Nguyên liệu:\n" +
                "\n" +
                "Xương heo 500gam\n" +
                "Mắm cá linh 200gam\n" +
                "Mắm cá sặc 100gam\n" +
                "Tôm tươi 200gam\n" +
                "Mực ống 200gam\n" +
                "Cá lóc 500gam\n" +
                "Thịt heo quay 200gam\n" +
                "1 cây sả và 50gam sả băm sẵn\n" +
                "Rau quả ăn lẩu: cà tím, rau nhút, rau muống, cọng súng, rau đắng\n" +
                "Gia vị: hạt nêm, đường, dầu ăn, muối\n" +
                "Thực hiện:\n" +
                "\n" +
                "Bước 1: Hầm xương heo trong 2 tiếng để lấy nước dùng.\n" +
                "\n" +
                "Bước 2: Xào cà tím: Cà tím được rửa sạch, bỏ cuống, cắt khoanh. Phi thơm sả, sau đó cho cà tím vào xào trong khoảng 5 – 7 phút.\n" +
                "\n" +
                "Bước 3: Đổ 400ml nước vào nồi, cho thêm mắm cá linh và cá sặc vào nấu cùng trong khoảng 10 phút. Sau đó lọc lấy nước và bỏ phần cá.\n" +
                "\n" +
                "Bước 4: Sau khi đã có nồi nước dùng xương, bạn đập dập sả cây rồi cho vào nồi. Sau đó cho hỗn hợp nước mắm vừa lọc được cùng với cà tím và sả băm vào, nêm thêm 1 muỗng canh hạt nêm + 1 muỗng canh đường vào nồi nước dùng và đun sôi trong 10 phút.\n" +
                "\n" +
                "Bước 5: Sơ chế tiếp các nguyên liệu còn lại\n" +
                "\n" +
                "Cá lóc được đánh vẩy, làm sạch sau đó lọc lấy thịt và thái nhỏ.\n" +
                "\n" +
                "Tôm làm sạch. Mực rửa sạch, cắt khoanh tròn.\n" +
                "\n" +
                "Bước 6: Bắc nồi nước lẩu lên bếp nhỏ, sau đó dọn những nguyên liệu ăn lẩu mắm ra xung quanh. Chờ nước sôi thì nhúng các nguyên liệu vào, chờ chín rồi thưởng thức.");
        chebien1.add("Nguyên Liệu:\n" +
                "\n" +
                "Xương ống: khoảng 1kg\n" +
                "Ngao: 1kg\n" +
                "Tôm: 1kg\n" +
                "Mực: 1kg\n" +
                "Nấm, bắp chuối, rau cần\n" +
                "Rau muống, rau cải\n" +
                "Sả: 6 cây\n" +
                "Riềng: 1 củ\n" +
                "Chanh: 2 quả\n" +
                "Lá chanh, đường, hạt nêm, gia vị lẩu thái, sa tế\n" +
                "Mì, bún\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Xương ống đem rửa sạch rồi cho vào nồi đun sôi rồi đem rửa lại với nước 1 lần nữa cho sạch để xương hết bẩn và mùi hôi. Sau đó cho xương ống và nước mới thêm chút muối vào nồi đun sôi nổi các bọt đen thì dùng muôi hớt bỏ rồi tiếp tục ninh ở lửa nhỏ, nước lẩu sẽ được trong hơn\n" +
                "\n" +
                "Bước 2: Sơ chế các loại rau nhúng lẩu\n" +
                "\n" +
                "Rau muống nhặt bỏ lá sâu, úa rồi rửa sạch.\n" +
                "\n" +
                "Rau cần cắt rễ, bỏ bớt lá rửa sạch.\n" +
                "\n" +
                "Bắp chuối thái mỏng rồi ngâm vào nước pha với chút dấm.\n" +
                "\n" +
                "Nấm rơm rửa sạch rồi bổ đôi nấm.\n" +
                "\n" +
                "Riềng thái lát mỏng.\n" +
                "\n" +
                "Sả bóc lớp vỏ ngoài, đập dập phần đầu trắng, phần thân cắt khúc ngắn để cho vào nồi lẩu cho đẹp\n" +
                "\n" +
                "Bước 3: Sơ chế hải sản\n" +
                "\n" +
                "Tôm cắt bỏ chân, đầu, bóc vỏ, rửa sạch rồi chẻ lưng rút bỏ phần chỉ đen cho bớt mùi tanh.\n" +
                "\n" +
                "Ngao rửa qua nước rồi ngâm trong nước cho muối pha loãng cho thêm vài lát ớt trong khoảng 1 tiếng để ngao nhả hết đất cát bên trong, sau đó rửa lại nhiều lần rồi vớt ra.\n" +
                "\n" +
                "Mực rửa sạch thái khoanh tròn hoặc thái miếng vừa ăn rồi xếp ra đĩa.\n" +
                "\n" +
                "Bước 4: Lẩu ngon hay không phần quan trọng nhất chính là nồi nước lẩu được nêm nếm gia vị sao cho đậm đà, đúng vị.\n" +
                "\n" +
                "Nước xương sau khi ninh xong cho vài củ sả đập rập, riềng thái mỏng và lá chanh vò nát vào để nồi nước dùng thơm hơn. Nêm nếm thêm gia vị, nước mắm, hạt nêm, nước cốt chanh và 1 gói gia vị lẩu thái vào nồi nước dùng cho vừa ăn, nếu nồi nước chưa đủ màu thì bạn cho thêm cà chua xào nhuyễn vào để tạo màu đẹp hơn.\n" +
                "\n" +
                "Bước 5: Nồi nước lẩu đã xong, giờ chỉ còn việc bày ra bàn thôi. Bày rau, hải sản, mì, bún, nước chấm xếp xung quanh, ở giữa đặt nồi nước lẩu. Khi ăn thì cho thêm ít sa tế và bắt đầu cho các loại tôm, mực, ngao vào nồi nước lẩu đang sôi và nhúng kèm các loại rau.\n" +
                "\n" +
                "Nồi lẩu sôi sùng sục thơm phức mùi sả, ớt vị chua cay, đậm đà khi ăn hải sản sẽ không thấy bị tanh vì đã được át bởi mùi thơm của nước lẩu, với thời tiết se lạnh này ngồi ăn lẩu thái hải sản thì thật là tuyệt.");
        chebien1.add("Nguyên liệu:\n" +
                "\n" +
                "1 con gà ta (khoảng từ 1,3 – 1,5kg).\n" +
                "1 bó lá giang.\n" +
                "1kg bún tươi.\n" +
                "Tỏi, hành tím, ớt, sả.\n" +
                "Rau muống chẻ, bắp chuối bào, giá đỗ, rau rút, mùi tàu ngò gai…\n" +
                "Muối, dầu ăn, đường, bột ngọt, nước mắm ngon, tiêu, sa tế.\n" +
                "Thực hiện:\n" +
                "\n" +
                "Bước 1: Cho dầu ăn vào chảo nóng, phi thơm hành tỏi băm và sả. Sau đó tiếp tục đổ gà vào xào cùng. Khi thịt gà săn lại thì đổ khoảng 2 lít nước vào đun cho đến khi sôi lên (thường xuyên vớt bọt), vặn nhỏ lửa.\n" +
                "\n" +
                "Bước 2: Sau khi thịt gà chín mềm thì cho lá giang vào đun nước lẩu sôi lên sau đó nêm nếm lại gia vị cho vừa ăn.\n" +
                "\n" +
                "Bước 3: Múc nước dùng vào nồi lẩu, cho thêm tỏi phi và sa tế vào để thêm phần đậm đà của món ăn. Cho các loại rau vào trụng và ăn kèm với bún, nước mắm.");
        chebien1.add("Nguyên liệu:\n" +
                "\n" +
                "1/2 kg đuôi bò\n" +
                "4 tép tỏi\n" +
                "2 củ cải trắng\n" +
                "2 quả ớt\n" +
                "300g xương heo\n" +
                "3 củ sả\n" +
                "1 củ gừng\n" +
                "Tương bần (tương Bắc), bột ngọt, hạt nêm, đường, muối.\n" +
                "Thực hiện:\n" +
                "\n" +
                "Bước 1: Ướp nguyên liệu\n" +
                "\n" +
                "Đuôi bò, xương heo rửa sạch chặt từng miếng vừa ăn.\n" +
                "\n" +
                "Cho xương heo vào ướp cùng ½ thìa cà phê hạt nêm, ½ thìa cà phê muối, 1 thìa cà phê bột ngọt để khoảng 15 phút cho ngấm gia vị.\n" +
                "\n" +
                "Cùng lượng gia vị đó, ướp đuôi bò thêm xả đập dập trộn đều để đuôi bò ngấm gia vị.\n" +
                "\n" +
                "Bước 2: Nấu nước dùng\n" +
                "\n" +
                "Cho xương heo vào nồi áp suất với 200ml hầm trong khoảng 10 phút, sau đó múc xương heo ra.\n" +
                "\n" +
                "Tiếp theo bạn cũng cho đuôi bò vào nồi áp suất hầm khoảng 15 phút rồi để nguội, cho đuôi bò ra.\n" +
                "\n" +
                "Cho tiếp củ cải trắng, gừng nướng đập dập vào nồi nước dùng rồi nêm gia vị cho vừa ăn. Nước sôi, nhúng rau mồng tơi vào.\n" +
                "\n" +
                "Để thưởng thức lẩu đuôi bò ngon hơn, bạn có thể pha thêm nước chấm tương bần vắt chanh tỏi.");
        chebien1.add("Nguyên liệu:\n" +
                "\n" +
                "1 con gà\n" +
                "1 củ hành tây, 1 chén nấm đông cô\n" +
                "2 củ sả, 1 củ cải trắng\n" +
                "Hành tím, tỏi băm\n" +
                "½ chén ớt hiểm xanh, 1 ít kỷ tử\n" +
                "Nước cốt dừa\n" +
                "Gia vị nấu ăn thường ngày\n" +
                "Thực hiện:\n" +
                "\n" +
                "Bước 1: Chặt gà thành nhiều phần nhỏ. Sau đó giã muối hột + 6 trái ớt hiểm + 1 muỗng hành băm + 1 muỗng ớt băm ướp cùng thịt gà.\n" +
                "\n" +
                "Bước 2: Sơ chế nguyên liệu\n" +
                "\n" +
                "Sả đập dập, cắt khúc.\n" +
                "\n" +
                "Nấm nhỏ để nguyên, nấm to cắt làm hai, củ cải trắng thái lát dày khoảng 1cm.\n" +
                "\n" +
                "Hành tây và sả đem đi chiên.\n" +
                "\n" +
                "Bước 3: Bắc một nồi to lên bếp, cho khoảng 1 lít nước trắng và 1 lít nước dừa vào nồi. Sau đó cho các nguyên liệu đã chiên ở các bước trước vào cùng. Đậy nắp đun sôi khoảng 5 – 6 phút là phần thịt gà đã chín. Tiếp theo cho nấm, củ cải, hành tây, hạt nêm, nước tương vào và đun thêm khoảng 5 phút nữa là hoàn thành.");
        chebien1.add("Tôm tươi (chuẩn bị tôm to): 300 gram\n" +
                "Mực tươi: 300 gram\n" +
                "Ngao: 1kg\n" +
                "300 gram thịt cá trắm thái lát (hoặc có thể thay bằng thịt cá vược, cá hồng cũng rất ngon)\n" +
                "Nấm ăn kèm: 300 gram nấm kim châm, nấm hương, nấm hải sản\n" +
                "Các loại rau ăn kèm tùy thích như: rau cần, rau muống, cải thảo, súp lơ…\n" +
                "1 kg xương ống (hoặc sườn)\n" +
                "Hạt nêm, nước mắm, sa tế, chanh tươi\n" +
                "2 quả cà chua nhỏ, thái múi cau, 1/2 quả dứa ương\n" +
                "Hành, tỏi, sả\n" +
                "Bún: 1kg\n" +
                "Thực hiện:\n" +
                "\n" +
                "Bước 1: Công việc cần nhiều thời gian nhất là ninh nước dùng, nên chúng mình sẽ sơ chế xương và ninh nước dùng đầu tiên nhé, trong lúc chờ đợi xương ninh thì đi sơ chế các nguyên liệu khác. Xương có thể chuẩn bị xương ống heo (hoặc xương sườn nếu thích gặm nhìu thịt), Xương heo mua về, rửa sạch, luộc qua nước sôi chừng 2 phút. Sau đó, mới cho xương vào nồi, chế lượng nước vừa ăn. Đun sôi sau đó vặn nhỏ lửa ninh liu riu. Các bạn chú ý là trong quá trình ninh xương không cho gia vị nhé, khi nào gần măm mới nêm gia vị, vì nếu cho gia vị vào sớm sẽ hãm độ nhừ của xương, đồng thời nước dùng còn bị chua, mất ngon. Hầm khoảng 1h đồng hồ cho nước dùng được ngọt.\n" +
                "\n" +
                "Bước 2: Trong lúc chờ đợi nồi xương ninh, các nàng sơ chế các nguyên liệu ăn kèm lẩu nhé: tôm chọn tôm tươi và to, rửa sạch, để ráo. Ngao rửa sạch. Mực sơ chế sạch, thái lát. Các loại nấm và rau rửa sạch, để ráo nước.\n" +
                "\n" +
                "Bước 3: Hành, tỏi, sả băm nhỏ (khoảng 1 củ hành, 1 củ tỏi, 2 củ sả nhé). Cho nồi lên bếp, cho vào trong nồi 3 thìa con dầu ăn. Đợi dầu nóng, các nàng rút hành, tỏi, sả bằm nhỏ vào, phi thơm cùng với 2 thìa sa tế (nếu thích măm cay hơn, có thể cho thêm). Cho tiếp cà chua vào đảo đều rồi thêm nước ninh xương vào. Nêm nếm gia vị cho vừa miệng.\n" +
                "\n" +
                "Bước 4: Đun sôi nồi lẩu, thêm dứa vào cho nước lẩu có vị thơm dịu và chua nhẹ. Đợi sôi 1 lúc là chúng mình đã có ngay nồi lẩu nóng hổi, nghi ngút khói để nhúng hải sản măm rùi.");
        chebien1.add("Nguyên liệu:\n" +
                "\n" +
                "Cá thác lác: 500g\n" +
                "Khổ qua: 6 trái\n" +
                "Xương nấu nước dùng: 500g\n" +
                "Hành tây: 1 củ\n" +
                "Ớt, tiêu, hành, ngò\n" +
                "Các gia vị thường dùng.\n" +
                "Thực hiện:\n" +
                "\n" +
                "Bước 1: Lấy 1 cái nồi lớn cho xương gà hầm với hành tây đã làm sạch để lấy khoảng chừng 2,5 lít nước dùng.\n" +
                "\n" +
                "Bước 2: Cá thác lác rửa sạch rồi cho vào máy xay nhuyễn rồi ướp với các loại gia vị: hành, tỏi băm nhuyễn, bột tiêu, nước mắm, hạt nêm và 1 số gia vị khác.\n" +
                "\n" +
                "Hành lá làm sạch, rồi cắt thành từng khúc dài khoảng 3cm.\n" +
                "\n" +
                "Bước 3: Khổ qua rửa sạch dùng dao bào bào mỏng rồi cho vào chậu nước muối ngâm cho bớt đắng. Vớt ra rổ cho ráo nước rồi cho vào đĩa cùng hành lá cắt khúc bỏ vào tủ lạnh cho khổ qua giòn hơn.\n" +
                "\n" +
                "Bước 4: Tiếp theo chúng ta nêm nếm lại nồi nước dùng cho vừa miệng rồi đổ vào nồi lẩu. Chuẩn bị sẵn bún tươi ra dĩa, bún, khổ qua, cá thác lác, nước mắm ớt, chanh…Ăn đến đâu lại nhúng thác lác và khổ qua vào đến đó, chờ chín là thưởng thức được ngay.");
        chebien1.add("Nguyên liệu:\n" +
                "\n" +
                "Thịt bò nạm: 300g\n" +
                "Thịt phi lê: 300g thịt bò\n" +
                "Cà chua: 2 quả\n" +
                "Ớt sừng: 4 trái\n" +
                "Sả băm nhuyễn\n" +
                "Sả cây: 4 cây\n" +
                "Tương ớt: 1 chai nhỏ\n" +
                "Bột bò kho\n" +
                "Sa tế tôm\n" +
                "Thực hiện:\n" +
                "\n" +
                "Bước 1: Ướp thịt bò\n" +
                "\n" +
                "Phần thịt phi lê đem thái thật mỏng để ra 1 cái đĩa. Phần thịt bò nạm đem cắt thành miếng vừa ăn khoảng 2cm.\n" +
                "\n" +
                "Ướp thịt cùng muỗng canh bột thịt bò kho + 1 muỗng canh hành – tỏi băm, 1 muỗng canh sa tế + 1/3 muỗng cà phê tiêu xay + 1 muỗng hạt nêm trong khoảng 15 phút.\n" +
                "\n" +
                "Bước 2: Xào sơ thịt bò\n" +
                "\n" +
                "Phi thơm hành, tỏi, sả rồi cho thịt bò vào xào. Sau đó cho tiếp cà chua vào xào chung sau đó nêm nếm gia vị cho thêm 1 muỗng cà phê đường + ½ muỗng cà phê muối xào đến khi thịt chín.\n" +
                "\n" +
                "Bước 3:Cho toàn bộ phần bò vừa xào vào nồi nước đã ninh sẵn từ xương heo, nấu cho nước dùng sôi lên. Sau đó nêm 1 muỗng cà phê đường, 1 muỗng canh lớn ớt sa tế + 3 muỗng canh giấm gạo và nấu trong khoảng 25 phút.\n" +
                "\n" +
                "Bước 4: Nước sôi lại thì tắt bếp và cho rau mùi vào. Thịt bò phi lê khi ăn thì nhúng trực tiếp vào nước lẩu.\n" +
                "\n" +
                "Bước 5: Lấy phần nước lẩu này, cho ra 1 nồi lẩu nhỏ nấu sôi lên, chan chung với bún và rau cải ăn cùng.");
        chebien1.add("Nguyên liệu:\n" +
                "\n" +
                "1 kí ếch\n" +
                "Nửa kí xương ống\n" +
                "1 kí măng củ\n" +
                "200 gram váng đậu\n" +
                "Rau muống, hành hoa, tía tô, lá lốt, mùi tàu\n" +
                "Tỏi, sả, ớt, bột nghệ, ớt, chanh\n" +
                "Dầu ăn, gia vị, hạt nêm\n" +
                "Bún hoặc mỳ tôm ăn kèm tùy sở thích.\n" +
                "Thực hiện:\n" +
                "\n" +
                "Bước 1: Sơ chế\n" +
                "\n" +
                "Xương ống rửa sạch, chần sơ nước sôi và ninh trong 1 tiếng để có nước dùng ngọt.\n" +
                "\n" +
                "\n" +
                " \n" +
                "Váng đậu cắt miếng vừa ăn, cho vào chảo dầu nóng chiên vàng giòn.\n" +
                "\n" +
                "Măng luộc sơ.\n" +
                "\n" +
                "Phần thịt ếch đã sơ chế sạch, các bạn ướp với 1 thìa canh bột nghệ, gia vị và 1/2 số tỏi đập dập.\n" +
                "\n" +
                "Bước 2: Xào thịt ếch\n" +
                "\n" +
                "Cho chảo lên bếp cho nóng với chút dầu ăn, cho thịt ếch vào xào ăn, xào to lửa cho đến khi thịt ếch hơi xém vàng.\n" +
                "Tiếp tục cho 1/2 phần măng đã luộc vào xào cùng với ếch, nêm nếm với gia vị cho vừa miệng rồi cho tiếp hành hoa, mùi tàu, lá lốt vào xào tiếp.\n" +
                "\n" +
                "Cho phần tỏi còn lại và sả đập dập vào nồi với chút dầu ăn, xào lên cho thơm.Cho nốt phần măng còn lại vào xào, nêm gia vị vào xào cùng cho măng ngấm, đậm đà.\n" +
                "\n" +
                "Bước 3: Nấu nước lẩu\n" +
                "\n" +
                "Cho phần nước dùng ninh xương vào nồi măng và sả vừa xào, đun sôi rồi nêm nếm với gia vị hạt nêm cho vừa miệng. Cho nước lẩu ra nồi lẩu, đặt lên bếp từ hoặc bếp cồn. Thả phần nấm hương đã ngâm nở và vài miếng váng đậu vào nồi nước dùng.");
        chebien1.add("Nguyên liệu:\n" +
                "\n" +
                "Cua đồng: 1kg\n" +
                "Sườn non: 500gr\n" +
                "Bắp bò: 500gr\n" +
                "Đậu hũ: 5 miếng\n" +
                "Cà chua: 3 trái\n" +
                "Mẻ, dấm bỗng, mắm tôm: mỗi thứ 1 chén nhỏ.\n" +
                "Hạt nêm, đường, muối và dầu ăn\n" +
                "Rau trụng\n" +
                "Thực hiện:\n" +
                "\n" +
                "Bước 1: Sơ chế sườn sụn, cua đồng\n" +
                "\n" +
                "Chần sườn sụn qua nước sôi, ướp với hành tím băm và ninh trong 15 phút.\n" +
                "\n" +
                "Cua đồng rửa sạch, tách mai giã nhuyễn hoặc xay bằng máy xay sinh tố. Cho thịt cua ra lọc lấy nước, gạch cua khều để riêng ra bát.\n" +
                "\n" +
                "Đặt nồi nước lọc cua lên bếp đun sôi rồi nêm 1 muỗng nhỏ mắm tôm, chút gia vị trong lúc đun để cua dậy mùi hơn. Tiếp tục cho gạch cua vào nồi, khuấy nhẹ tay đến khi canh sôi, gạch cua nổi lên thì vặn lửa nhỏ, vớt riêu cua để riêng ra bát.\n" +
                "\n" +
                "Bước 2: Chiên đậu, nấu gạch cua\n" +
                "\n" +
                "Cho dầu ăn vào chảo đun nóng, phi hành khô thơm vàng rồi cho gạch cua vào xào chín.\n" +
                "\n" +
                "Đậu đem cắt miếng, rán chín vàng.\n" +
                "\n" +
                "Bắp bò thái miếng mỏng bày ra đĩa.\n" +
                "\n" +
                "Rửa sạch các loại rau nhúng lẩu ăn kèm.\n" +
                "\n" +
                "Lọc mẻ để riêng ra bát con.\n" +
                "\n" +
                "Bước 3: Ra lẩu\n" +
                "\n" +
                "Cho nước dùng cua và nước ninh sườn vào nồi lẩu chuyên dụng, thêm cà chua đã xào chín vào, thêm mẻ, dấm bỗng cùng gia vị cho vừa ăn. Cho gạch cua vào tiếp tục đun sôi. Khi ăn, bạn thêm đậu rán chín, hành lá thái nhỏ, nhúng các loại rau ăn lẩu và thưởng thức nhé.");
        chebien1.add("Chuẩn bị\n" +
                "\n" +
                "150g mắm cá sặc\n" +
                "150g phi lê cá lóc: thái miếng\n" +
                "200g thịt heo quay: thái miếng con chì\n" +
                "250g mắm cá linh\n" +
                "250g mực ống: rửa sạch, cắt khúc\n" +
                "300g tôm tươi: rửa sạch, để nguyên con\n" +
                "500g xương heo\n" +
                "2 trái cà tím: rửa sạch, bổ dọc làm tư mỗi trái và cắt khúc\n" +
                "1kg bún\n" +
                "Rau ăn kèm: rau nhút, rau đắng, cọng rau muống, bông súng, cải cay...\n" +
                "Gia vị: 3 cây sả đập dập; 80g sả băm; muối, tiêu, đường, bột ngọt, hạt nêm\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Phi thơm ít sả băm và trút cà tím vào xào sơ qua sau đó để riêng.\n" +
                "\n" +
                "Bước 2: Hòa 500ml nước lọc với mắm các sặc và mắm cá linh sau đó đem đi đun đến sôi. Sau khoảng 20 phút, mắm ra chất hơi dẻo thì tắt bếp và nhắc xuống lọc lấy phần nước, bỏ cái.\n" +
                " \n" +
                "Bước 3: Chần sơ xương heo qua nước sôi lửa lớn sau đó rửa lại với nước thật sạch trước khi đem ninh với khoảng 4 lít nước đến lúc xương mềm.\n" +
                "\n" +
                "Bước 4: Cho vào nồi nước dùng phần sả cây đập dập, cà tím xào và nấu thêm khoảng 10 phút. Sau đó nêm nếm lại gia vị cho vừa miệng với bột ngọt, hạt nêm và đường.\n" +
                "\n" +
                "Bước 5: Dọn nồi lẩu với nước dùng cùng các loại rau và nguyên liệu đã chuẩn bị sẵn.\n" +
                "\n" +
                "Khi ăn, dùng đến đâu nhúng nguyên liệu đến đó và ăn kèm với bún tươi.");
        chebien1.add("Chuẩn bị\n" +
                "\n" +
                "1 con cá điêu hồng loại 1,2 - 1,4kg: làm sạch và lóc lấy phần phi lê cá\n" +
                "1kg bún tươi\n" +
                "2 lít nước hầm xương\n" +
                "250g thịt ba rọi\n" +
                "250g tôm sú: rửa sạch, lột vỏ và băm nhuyễn\n" +
                "3 quả cà chua: băm nhuyễn\n" +
                "3 quả trứng gà\n" +
                "Rau ăn kèm: 2 trái dưa leo, 1 trái khế chua, 1 trái xoài xanh, xà lách, húng quế, húng thơm và hành lá: mang tất rửa sạch và thái nhỏ\n" +
                "Gia vị: tỏi, ớt bột, đường, hạt nêm, bột ngọt, muối, màu hạt điều.\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Ướp cá với ít ớt bột, bột ngọt, muối.\n" +
                "\n" +
                "Bước 2: Đánh trứng đều, cho thêm ít dầu điều sau đó đem tráng mỏng và thái sợi.\n" +
                "\n" +
                "Bước 3: Luộc thịt ba rọi và thái chỉ.\n" +
                "\n" +
                "Bước 4: Phi tỏi thơm và cho cà chua vào xào. Khi có màu đỏ đẹp cho tôm vào xào chung. Sau đó cho phần nước dùng vào đun sôi và nêm lại gia vị sao cho có vị chua nhẹ và ngọt thanh.\n" +
                "\n" +
                "Bước 5: Dọn lẩu cùng các loại rau, các nguyên liệu và bún. Mỗi thứ cho vào một bẹ hoa chuối nếu muốn đẹp mắt.\n" +
                " \n" +
                "Khi ăn đến đâu thả nguyên liệu đến đó và không nấu quá lâu để tránh làm mất vị ngon tự nhiên của hải sản.");
        chebien1.add("Chuẩn bị\n" +
                "\n" +
                "200g mỗi loại nấm: đông cô, linh chi, đùi gà, rơm, kim châm (Tất cả mang rửa sạch và cắt nhỏ nếu nấm to. Lưu ý để riêng từng loại.)\n" +
                "200g mỗi loại rau: cải cúc, cải bó xôi, cải bẹ trắng, cải thảo\n" +
                "4 miếng đậu hũ non (khoảng 300g): cắt miếng vuông\n" +
                "6 vắt mì vàng (khoảng 300g)\n" +
                "1 cây chả chay: cắt mỏng\n" +
                "Rau củ cho phần nước dùng\n" +
                "2 củ cà rốt: gọt vỏ và cắt khúc lớn\n" +
                "2 củ cải mặn: xả qua nhiều lần với nước lạnh cho bớt mặn và cắt khúc\n" +
                "2 củ su hào: gọt vỏ và cắt khúc lớn\n" +
                "2 quả su su: gọt vỏ và cắt khúc lớn\n" +
                "Gia vị: muối, đường\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Đun sôi nồi nước khoảng 4 lít sau đó cho các nguyên liệu nấu nước dùng vào hầm đến nhừ khoảng nửa tiếng.\n" +
                "\n" +
                "Bước 2: Chắt nước dùng đã nấu và trút qua nồi lẩu, cho vài nấm rơm vào nếu muốn đẹp.");
        chebien1.add("Chuẩn bị\n" +
                "\n" +
                "1kg ghẹ (hoặc cua đồng): tách đôi con ghẹ sống, lấy riêng phần gạch và mình, bỏ yếm.\n" +
                "500g măng chua: rửa sạch nhiều lần với nước và để ráo\n" +
                "2 trái cà chua: thái múi cau\n" +
                "1/2 trái dứa: bỏ mắt và thái miếng nhỏ\n" +
                "3 cây dọc mùng: tướt bỏ xơ vỏ và cắt chéo\n" +
                "50g đậu bắp: thái chéo thành từng lát dày\n" +
                "3 miếng đậu phụ non\n" +
                "1 vắt me chua\n" +
                "1kg bún tươi\n" +
                "Một mớ hành lá, mùi tàu, hành khô: rửa sạch và cắt khúc\n" +
                "Rau ăn kèm: rau muống, cải bẹ xanh, cải thảo… : rửa sạch và cắt khúc\n" +
                "Gia vị: nước mắm, hạt nêm, muối, tiêu, chanh, ớt quả\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Phi thơm gạch ghẹ với hành tím và chưng đến khi thơm cho ra bát.\n" +
                "\n" +
                "Bước 2: Chia phần ghẹ làm hai, một đem xay nhuyễn và chắt nước, nấu nhỏ lửa để lấy riêu. Một giữ nguyên dùng để nhúng khi ăn.\n" +
                "\n" +
                "Bước 3: Khi nồi nấu riêu đã sôi, cho măng chua và dứa vào nấu cùng thêm 10 phút. Dùng me hòa lấy nước cốt cho vào nồi riêu để tăng vị chua và nêm lại gia vị cho vừa miệng.\n" +
                "\n" +
                "Bước 4: Dọn nấm với các nguyên liệu còn lại.\n" +
                "\n" +
                "Khi dùng chỉ việc cho ghẹ vào nấu thêm khoảng 5 phút và nhúng các nguyên liệu khác vào.");
        chebien1.add("Chuẩn bị\n" +
                "\n" +
                "300g nghêu tươi\n" +
                "200g tôm tươi: rửa sạch và cắt bớt râu\n" +
                "150g mực tươi: rửa sạch và thái miếng\n" +
                "150g chả viên\n" +
                "50g các loại nấm: đông cô, tuyết, bào ngư, hồng ngọc, rơm…: rửa sạch và cắt nhỏ nếu nấm lớn.\n" +
                "1 bó nhỏ cải thìa: nhặt mỗi cọng riêng và rửa sạch\n" +
                "1,5 lít nước dùng\n" +
                "1 muỗng cà phê ngò băm\n" +
                "Gia vị: hạt nêm, dầu mè, tiêu, muối, bột ngọt\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Lấy nước dùng đun sôi và nêm lại gia vị với dầu mè và ngò băm\n" +
                "\n" +
                "Bước 2: Dọn ra nồi lẩu với các nguyên liệu.\n" +
                "\n" +
                "Bước 3: Khi dùng, cho nghêu, mực và tôm vào nồi lẩu, nấu thêm khoảng 5 phút. Sau đó cho các loại nấm vào nấu chín và dùng với bún tươi, các loại rau cùng nước mắm.");
        chebien1.add("Chuẩn bị\n" +
                "\n" +
                "1kg thịt dê (chọn các bộ phận khác càng ngon): rửa thịt dê thật kỹ với rượu và gừng sau đó đem thái mỏng.\n" +
                "300g nấm đông cô: rửa sạch và cắt đôi\n" +
                "150ml rượu vang đỏ\n" +
                "1 của khoai môn: gọt vỏ, cắt miếng vuông\n" +
                "1 củ sen tươi: cắt khoanh tròn\n" +
                "3 bìa đậu phụ chiên: cắt miếng vuông\n" +
                "Váng đậu + đậu phộng rang xay nhỏ\n" +
                "1kg bún\n" +
                "1/2 bát nước cốt dừa\n" +
                "Các loại rau ăn kèm: cải cúc, mồng tơi, cải cay…\n" +
                "Tỏi và hành tím băm\n" +
                "Gia vị: đường, bột ngọt, ngũ vị hương, bột ớt, hạt tiêu xay\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Ướp thịt dê với các gia vị khoảng 3 tiếng.\n" +
                "\n" +
                "Bước 2: Phi thơm hành, tỏi và xào thịt dê săn lại. Sau đó đổ nước cốt dừa vào và đun sôi. Khi nước cốt dừa sôi, cho thêm nước sôi vào. Nấu tiếp tục với phần khoai môn và củ sen đến khi mềm.\n" +
                "\n" +
                "Bước 3: Dọn nước dùng dê vào nồi lẩu và dọn kèm các nguyên liệu còn lại.\n" +
                "\n" +
                "Nên pha thêm nước chấm bằng sa tế, đường và chao để ăn kèm món lẩu dê này.");
        chebien1.add("Chuẩn bị\n" +
                "\n" +
                "500g cá kèo sống: rửa sạch nhớt và để vào bọc nylong cột kín cho ngạt hoặc đập chết.\n" +
                "4 miếng tàu hủ: cắt miếng\n" +
                "2 bó lá giang: tuốt lấy lá và rửa sạch\n" +
                "3 trái cà chua: thái múi cau\n" +
                "3 trái ớt hiểm: cắt lát\n" +
                "300g rau đắng: rửa sạch và để ráo\n" +
                "50g hành tím bào\n" +
                "6 tép tỏi\n" +
                "Một mớ rau thơm\n" +
                "Gia vị: tiêu, muối, đuờng, bột ngọt, nước mắm ngon, dầu ăn.\n" +
                "Cách làm\n" +
                "\n" +
                "Phi thơm hành, tỏi và cho lá giang vào xào chung. Sau đó, cho khoảng 2 lít nước vào nấu sôi. Khi nước sôi, nêm nếm với các gia vị, đặc biệt là nước mắm ngon sao cho vừa miệng.\n" +
                "\n" +
                "Khi dùng, cho cá kèo vào nồi nước cùng cà chua và ăn kèm với các nguyên liệu đã chuẩn bị.");
        chebien1.add("Chuẩn bị\n" +
                "\n" +
                "500g thịt bò loại ngon: thái mỏng và cuộn tròn\n" +
                "1 bó rau cải chip: cắt bỏ chân, rửa sạch và để ráo\n" +
                "200g nấm đông cô: cắt bỏ chân và rửa sạch\n" +
                "200g nấm kim châm: cắt bỏ chân và để nguyên\n" +
                "4 bìa đậu phụ Nhật: cắt miếng vuông\n" +
                "1 thanh cua chay: cắt lát mỏng\n" +
                "100g tương Miso của Nhật\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Đun sôi 2 lít nước. Khi nước sôi dùng rây đánh tan tương Miso và cho vào nồi nước dùng, nêm lại gia vị cho vừa miệng.\n" +
                "\n" +
                "Bước 2: Cho nước dùng vào nồi lẩu và dọn kèm các nguyên liệu còn lại.");
        chebien1.add("Chuẩn bị\n" +
                "\n" +
                "600g kim chi cải thảo\n" +
                "600ml nước kim chi\n" +
                "2 lít nước dùng gà\n" +
                "300g tôm: rửa sạch và cắt bỏ bớt râu\n" +
                "300g thịt gà nạc: thái mỏng\n" +
                "300 thịt heo nạc: thái mỏng\n" +
                "5 bìa hậu phụ non: cắt miếng vuông\n" +
                "2 cây cải thảo: thái khúc\n" +
                "100g nấm các loại: đông cô, kim châm, bào ngư, hải sản\n" +
                "300gr thịt bò ngon: thái mỏng\n" +
                "3 trái ớt sừng: cắt miếng chéo\n" +
                "Rau ăn kèm: cải xanh, cải cúc…\n" +
                "Gia vị: mắm, đường, bột ngọt\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Nấu nước dùng gà. Khi thấy sôi, cho 1/3 phần kim chi cải thảo vào nấu cùng với nước kim chi đã chuẩn bị. Phần kim chi còn lại đem cắt khúc dọn ra dĩa.\n" +
                "\n" +
                "Bước 2: Khi nước kim chi sôi trở lại, nêm nếm gia vị cho vừa miệng.\n" +
                "\n" +
                "Bước 3: Dọn lẩu cùng các nguyên liệu còn lại. Ăn đến đâu, nhúng đến đó để giữ được độ tươi ngon của thực phẩm.");

    }
    public void hap(){
        stringArrayList2.add("Cá lóc hấp sả chanh");
        stringArrayList2.add("Cá hấp hành gừng");
        stringArrayList2.add("Cải bẹ xanh cuộn cá thác lác hấp gừng");
        stringArrayList2.add("Cá diêu hồng hấp tương hột");
        stringArrayList2.add("Gà hấp gia vị");
        stringArrayList2.add("Gà hấp muối sả");
        stringArrayList2.add("Chân gà hấp rau răm");
        stringArrayList2.add("Gà cuộn trứng muối hấp");
        stringArrayList2.add("Gà hấp nấm");
        stringArrayList2.add("Trứng đúc thịt bò băm hấp");
        stringArrayList2.add("Trứng cuộn tôm hấp");
        stringArrayList2.add("Trứng thập cẩm hấp");
        stringArrayList2.add("Đậu phụ hấp trứng");
        stringArrayList2.add("Trứng hấp lạp xưởng");
        stringArrayList2.add("Tràng lợn hấp gừng răm");
        stringArrayList2.add("Nghêu hấp sả");
        stringArrayList2.add("Mực hấp kiểu Thái");
        stringArrayList2.add("Tôm hấp nấm");
        stringArrayList2.add("Tôm hấp nước sốt cay");

        anh2.add(R.drawable.sachanh);
        anh2.add(R.drawable.hapgung);
        anh2.add(R.drawable.caibexanh);
        anh2.add(R.drawable.tuongbot);
        anh2.add(R.drawable.giavi);
        anh2.add(R.drawable.muoixa);
        anh2.add(R.drawable.luot);
        anh2.add(R.drawable.trungcuontom);
        anh2.add(R.drawable.tomhapnam);
        anh2.add(R.drawable.ducthitbobam);
        anh2.add(R.drawable.trungcuontom);
        anh2.add(R.drawable.ab_trungganuong);
        anh2.add(R.drawable.dauphunhoitom);
        anh2.add(R.drawable.trungcuontom);
        anh2.add(R.drawable.tranglonhapgungram);
        anh2.add(R.drawable.ngheuhap);
        anh2.add(R.drawable.muchapthai);
        anh2.add(R.drawable.tomhapnam);
        anh2.add(R.drawable.a2);


        chebien2.add("Nguyên liệu\n" +
                "1 con cá lóc\n" +
                "4 cây sả\n" +
                "2 muỗng canh nước cốt chanh\n" +
                "500g bún tươi\n" +
                "100g hành lá\n" +
                "3 trái ớt\n" +
                "1 muỗng canh hành tím băm\n" +
                "Gia vị: nước mắm, hạt nêm, đường, tiêu\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Cá lóc đánh vẩy, làm sạch, để nguyên con. Dùng dao nhọn khứa thành những đường chéo lên thân cá.\n" +
                "Sả cắt khúc, hành lá rửa sạch với nước, để ráo rồi cắt nhỏ khoảng 1-2 cm.\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Ướp cá lóc với 1 muỗng canh nước mắm, 1 muỗng cà phê tiêu, 1 muỗng cà phê hạt nêm, 1 muỗng canh hành tím băm, 2 muỗng canh nước cốt chanh và 1 muỗng cà phê đường.\n" +
                "Nhồi sả vào miệng cá, rắc hành lá lên bề mặt cùng với ớt cay. Tiếp theo, bạn cho cá vào nồi, hấp chín.");
        chebien2.add("Món cá hấp với gừng và hành là một trong các món hấp dễ làm, nhiều chất dinh dưỡng mà còn giúp giữ ấm cho cơ thể bạn, chống cảm mạo, sổ mũi, ho.\n" +
                "\n" +
                "Cá hấp gừng với vị cay thơm của gừng và vị ngọt từ thịt cá mà không đem lại mùi tanh của cá. Ngày lạnh, được thưởng thức miếng cá hấp mềm ngọt với gừng, hành và nước tương đậm đà cùng cơm nóng thì còn gì tuyệt hơn.");
        chebien2.add("Nguyên liệu\n" +
                "300g thịt cá thát lác xay\n" +
                "500g cải bẹ xanh\n" +
                "3-4 nhánh hành lá, gừng, ớt\n" +
                "Gia vị: tiêu, bột nêm, nước tương, muối, dầu ăn.\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Lấy phần thịt cá cho vào 1 bát tô, thêm phần đầu hành và 1/2 chỗ gừng sợi ở trên cùng chút bột nêm, tiêu vào tô, trộn đều. Dùng thìa quết đều cho thịt cá được dai. Để khoảng 15-20 phút.\n" +
                "Cải bẹ xanh chọn những lá to bản, không bị giập nát, cắt bỏ bớt phần cuống, sau đó rửa sạch.\n" +
                "Gừng cạo vỏ, rửa sạch, thái sợi. Hành lá bỏ rễ và lá giập úa, rửa sạch sau đó cắt riêng phần đầu trắng và phần lá xanh để riêng. Phần đầu hành đập nhẹ sau đó băm nhỏ. Ớt bỏ cuống, rửa sạch, băm nhỏ.\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Bắc một nồi nước, nước sôi cho thêm chút muối và 1/2 thìa dầu ăn vào nồi. Sau đó cho hành lá và cải vào chần sơ, vớt ngay ra ngâm vào nước lạnh. Muối, dầu ăn và công đoạn ngâm nước lạnh giúp cho cải được xanh, bóng đẹp để món ăn hấp dẫn hơn.\n" +
                "Lấy 1 lá cải bẹ trải ra thớt, thêm khoảng 1 thìa chả cá vào giữa lá. Dùng lá cải bao lại miếng chả, sau đó dùng lá hành vừa chần sơ ở trên buộc lại. Thực hiện lần lượt cho đến khi hết nguyên liệu.\n" +
                "Xếp các cuốn cải vào đĩa, rắc phần gừng sợi còn lại lên trên, cho vào xửng hấp khoảng 8-10 phút khi cá chín là được. Hoặc bạn có thể dùng màng thực phầm bao kín đĩa lại, cho vào lò vi sóng hấp chín.");
        chebien2.add("Cá diêu hồng hấp tương hột sẽ là sự lựa chọn hoàn hảo để đưa vô thực đơn hàng ngày của gia đình bạn. Chế biến cá theo cách này vừa không làm mất nước, vừa thấm gia vị lại giữ được vị ngọt đặc trưng của thịt cá.");
        chebien2.add("Nguyên liệu\n" +
                "1 con gà\n" +
                "1 nhánh sả thái lát\n" +
                "2 miếng gừng\n" +
                "2 miếng riềng\n" +
                "1 củ nghệ nhỏ\n" +
                "2 phần gốc ngò\n" +
                "2 phần trắng hành lá\n" +
                "1 trái ớt sừng\n" +
                "2 củ hành tím\n" +
                "3 tép tỏi\n" +
                "2 lá chanh\n" +
                "Gia vị: mắm ruốc, nước mắm, đường\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Gà rửa sạch với nước muối pha loãng để ráo. Bạn có thể chặt gà làm đôi.\n" +
                "Cho các nguyên liệu hành tím, tỏi, gừng, ngò, hành lá nghệ, ớt, sả và lá chanh vào cối giã nhuyễn. Sau đó cho hết gia vị còn lại vào trộn đều.\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Thoa gia vị trong và ngoài con gà để 20 phút cho gà thấm. Cho gà vào đĩa sâu lòng, để thêm vài khúc sả, hành lá thái khúc và gừng thái lát.\n" +
                "Nấu 1 nồi nước sôi, cho gà vào xửng hấp 20-25 phút (thời gian tùy thuộc vào gà to hay nhỏ). Gà chín, tắt bếp.");
        chebien2.add("Gà hấp muối sả là món ăn là một món khá đặc biệt bởi mang đến hương vị đặc trưng mùi sả, vừa ngọt vừa dai, ngon đúng điệu.\n" +
                "\n" +
                "Cách làm gà hấp muối sả với các thao tác đơn giản, dễ thực hiện với rượu trắng và lá chanh sẽ đem đến cho bạn một món ăn vừa ngon vừa lạ; thích hợp dùng trong những bữa cơm gia đình hoặc bữa nhậu, bàn tiệc.");
        chebien2.add("Chân gà hấp rau răm là một trong những công thức chế biến món ăn từ chân gà rất phổ biến và được ưa thích, đặc biệt cánh mày râu mà được thưởng thức món ăn này thì sẽ ghiền lắm nhé.\n" +
                "\n" +
                "Không chỉ là món chân gà hấp thông thường mà khi kết hợp cùng hương thơm của rau răm, một trong các món hấp đơn giản. Chân gà hấp rau răm vẫn giữ nguyên vị giòn ngọt và dai dai của chân gà, cộng thêm các loại gia vị và mùi thơm của tiêu và rau răm sẽ là một món ăn hấp dẫn.\n" +
                "\n");
        chebien2.add("Nguyên liệu\n" +
                "1/2 con gà (cả đùi và lườn)\n" +
                "4 quả trứng muối\n" +
                "1 củ gừng nhỏ\n" +
                "Hành hoa, cà chua, cà rốt để trang trí\n" +
                "Gia vị: Tiêu, bột nêm, xì dầu, bột gà, rượu nấu\n" +
                "Giấy bảo quản để gói gà\n" +
                "Cách làm\n" +
                "Bước 1: Gà lọc xương, nhớ giữ nguyên da để cuốn. Tẩm ướp gà bằng gừng băm nhỏ, xì dầu, rượu nấu, bột gà, tiêu, muối vừa ăn.\n" +
                "\n" +
                "Bước 2: Trải gà ra thớt, cho trứng muối bỏ lòng trắng, nặn lòng đỏ cho dài ra một chút, để 4 lòng đỏ trứng dọc theo chiều của gà. Cuộn lại, dùng giấy bảo quản bọc chặt lại, đem hấp chín.");
        chebien2.add("Món gà hấp nấm vừa có nguyên liệu dễ tìm, chứa rất nhiều chất dinh dưỡng lại thơm ngon, tốt cho cơ thể.\n" +
                "\n" +
                "Gà hấp nấm mang một hương vị thơm ngon đặc biệt và dễ dàng chinh phục vị giác nhiều người. Món ăn không chỉ giữ nguyên vị thanh ngọt của thịt gà mà còn không chứa nhiều dầu mỡ gây ngán.");
        chebien2.add("Trứng dường như là thực phẩm quen thuộc được sử dụng chế biến cho những bữa ăn hàng ngày trong gia đình. Đây là thực phẩm có nguồn gốc từ gia cầm chăn nuôi nên có hàm lượng dưỡng chất rất tốt cho sức khỏe.\n" +
                "\n" +
                "Trứng đúc thịt bò băm lạ miệng, với vị trứng thơm, thịt bò mềm, đậm đà, ăn rất đưa cơm mà còn bổ dưỡng cho sức khỏe. Hãy vào bếp làm thử món trứng đúc thịt bò băm đổi vị cho cả nhà nào.");
        chebien2.add("Nguyên liệu\n" +
                "150g tôm tươi\n" +
                "50g thịt heo băm\n" +
                "2 quả trứng gà\n" +
                "50g bắp ngọt\n" +
                "50g cà rốt\n" +
                "2 lá rong biển khô\n" +
                "20ml nước\n" +
                "Gia vị: hạt nêm, muối, đường, tiêu\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Tôm sau khi mua về rửa sạch, bóc vỏ, lấy chỉ lưng, sau đó các bạn chẻ dọc sống lưng tôm ra làm đôi. Dùng chày giã sơ thịt tôm cho hơi nát, như vậy sẽ giúp tôm thấm đều gia vị hơn.\n" +
                "Cà rốt cắt nhuyễn. Bắp ngọt luộc chín, tách hạt. Hành lá và ngò rí cắt nhuyễn. Về phần thịt heo, các bạn có thể mua thịt băm sẵn hoặc mua thịt heo nguyên miếng về cắt nhỏ, sau đó tự băm cho thật nhuyễn.\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Cho các nguyên liệu bạn vừa chuẩn bị bao gồm: tôm đã giã, thịt băm, bắp luộc, cà rốt, hành lá và ngò rí cắt nhuyễn vào chung một tô. Tiếp đến, cho lần lượt vào tô: 1/3 muỗng muối, 1/2 muỗng đường, 1/3 muỗng tiêu xay, 1/2 muỗng hạt nêm. Ướp hỗn hợp khoảng 15 phút.\n" +
                "Trong thời gian chờ cho hỗn hợp nhân vừa trộn thấm đều. Bạn đập 2 quả trứng cho vào tô cùng với 20g bột bắp và 20ml nước, thêm 1 chút xíu muối để trứng sau khi rán được đậm đà. Đánh đều tay cho tan hỗn hợp trứng, bột bắp, nước.\n" +
                "Cho trứng vào và nghiêng chảo để trứng phủ rộng đều, rán lửa nhỏ đến trứng chín vừa se mặt là được. Đặt ra thớt, để trứng nguội khoảng 10 phút.\n" +
                "Sau khi trứng đã nguội, cắt trứng thành hình vuông dài hơn lá rong biển khoảng 1cm. Đặt rong biển lên trên trứng. Trải đều nhân tôm thịt và chừa lại khoảng 1cm để khi cuộn trứng được dễ dàng, trứng và rong biển bọc đều nhân hơn.\n" +
                "Cuộn tròn trứng, rong biển, tôm, thịt giống như khi cuộn sushi, nhưng không cần quá chặt tay. Cuộn tới phần rong biển không nhân, bạn cho chút nước lên để rong biển dễ bám dính vào màng trứng.");
        chebien2.add("Món trứng hấp thập cẩm được làm từ những nguyên liệu đơn giản, dễ kiếm cùng các bước thực hiện dễ dàng. Chỉ cần chút thời gian là các bạn đã có món trứng hấp ngon tuyệt và bắt mắt để thưởng thức rồi.\n" +
                "\n" +
                "Đặc biệt, món ăn này rất thích hợp với những người mới ốm dậy. Nào cùng bắt tay vào thực hiện cách làm trứng hấp thập cẩm ngon tuyệt nhé.\n" +
                "\n");
        chebien2.add("Nguyên liệu\n" +
                "200g đậu phụ non\n" +
                "2 quả trứng\n" +
                "1 thìa canh nước luộc gà hoặc nước lọc\n" +
                "50 g tôm khô\n" +
                "2 muỗng cà phê vừng, hành lá, muối.\n" +
                "Cách làm\n" +
                "Sơ chế nguyên liệu: Đậu phụ non rửa qua nước sạch, cho ra rổ lọc. Tôm khô rửa sạch, băm nhỏ.\n" +
                "\n" +
                "Chế biến\n" +
                "\n" +
                "Dùng thìa quết nhuyễn đậu. Rây đậu phụ non ra bát thủy tinh dùng được trong lò vi sóng. Đập trứng ra bát, dùng thìa đánh trứng. Đổ trứng vào rổ lọc, bên dưới kê bát đậu phụ non. Làm như vậy thì bát đậu phụ sẽ không có bọt, mặt đậu phụ mịn.\n" +
                "Đổ nước luộc gà vào bát, trộn đều. Cho vào bát vừng, hành lá thái nhỏ. Cho tôm khô, một chút muối vào bát, trộn thật đều các nguyên liệu với nhau. Đậy kín nắp bát đậu phụ bằng đĩa chịu nhiệt, cho vào lò vi sóng, hấp khoảng 10 phút.");
        chebien2.add("Với 2 nguyên liệu vốn rất sẵn có trong nhà bếp là trứng và lạp xưởng, thật dễ dàng để bạn có được món ăn ngon cứu cánh khi nhà có khách. Hoặc đơn giản là trong một ngày bận rộn không kịp đi chợ thì với cách làm trứng hấp lạp xưởng vừa nhanh gọn lại ngon hết sảy.\n" +
                "\n" +
                "Miếng trứng mềm mịn quyện lẫn với lạp xưởng cắt nhỏ, vừa dễ ăn mà lại vừa đủ chất, quen quen mà cũng thật lạ miệng. Chỉ cần biến tấu bằng cách thêm một ít lạp xưởng là bạn đã có ngay một món trứng hấp mới cho cả nhà rồi.");
        chebien2.add("Tràng lợn thường có độ dai, ngon hơn so với những thành phần khác trong bộ nội tạng lợn, nhưng lại khá hiếm, ít thông dụng nên tràng lợn được bán với giá thường đắt hơn. Tràng lợn hấp gừng răm có vị thơm, giòn, dai rất đặc biệt, vừa có thể làm món nhậu trong bữa tối kèm với bia.\n" +
                "\n");
        chebien2.add("Nguyên liệu\n" +
                "1kg nghêu\n" +
                "10 cây sả\n" +
                "2 nhánh gừng\n" +
                "1 củ tỏi\n" +
                "100g ớt chuông\n" +
                "4 – 5 trái ớt\n" +
                "2 trái chanh tươi\n" +
                "1 ít rau răm\n" +
                "Gia vị: nước mắm, đường, hạt nêm\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Nghêu sau khi mua về, bạn đem rửa thật sạch và ngâm với nước vo gạo có thêm vài lát ớt khoảng 1 – 2 tiếng cho nghêu nhả hết bùn đất ra ngoài. Sả rửa sạch, bỏ bớt phần lá già, cắt sả thành từng khúc dài khoảng 3 – 4cm rồi đập dập.\n" +
                "Ớt ½ băm nhỏ, ½ cắt lát. Ớt chuông rửa sạch, cắt thành những sợi mỏng. Gừng cạo vỏ, rửa sạch, 2/3 cắt lát mỏng, 1/3 băm nhỏ làm nước chấm.\n" +
                "Tỏi bóc vỏ và băm nhỏ. Rau răm nhặt gốc, rửa sạch, để ráo.\n" +
                "Bước 2: Làm nước mắm\n" +
                "\n" +
                "Bạn lấy một cái chén nhỏ, pha nước chấm nghêu theo công thức: 2 muỗng canh nước mắm ngon, 2 muỗng đường, 1/2 muỗng ớt băm, 1/3 muỗng tỏi băm, bột ngọt, nước cốt chanh, gừng băm nhuyễn và khuấy đều.\n" +
                "Bước 3: Chế biến\n" +
                "\n" +
                "Xếp sả đập dập, gừng cắt mỏng vào một cái nồi có kích thước vừa phải. Sau đó xếp nghêu vào nồi, rắc thêm ớt chuông cắt sợi mỏng lên trên bề mặt. Tiếp theo, cho vào nồi một ít nước lọc, nước mắm ngon, dầu ăn, bột ngọt, đường, ớt cắt lát vừa với khẩu vị.\n" +
                "Bắc nồi nghêu lên bếp nấu. Khi thấy nước sôi, bạn dùng đũa đảo đều để nghêu thấm gia vị. Hấp tới khi nghêu chín tới, mở miệng thì tắt bếp, bắc ra ngoài.");
        chebien2.add("Nguyên liệu\n" +
                "300g mực khoảng\n" +
                "1/4 củ hành tây\n" +
                "2 trái ớt\n" +
                "1 cọng cần tây\n" +
                "1 bó rau diếp\n" +
                "2 tép tỏi lớn\n" +
                "40g tương ớt Thái\n" +
                "1 muỗng canh rượu trắng\n" +
                "1/2 muỗng cà phê muối\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Làm sạch mực, bỏ da và ruột, sau đó cắt thành từng khoanh dày khoảng 1cm. Hành tây và tỏi băm nhuyễn, ớt cắt nhỏ, cần tây bỏ lá, xắt hạt lựu.\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Cho mực vào 1 bát tô rồi thêm rượu vào bóp đều để khử mùi tanh của mực. Lấy một bát nhỏ, cho hành tây, ớt, cần tây, tỏi vào, thêm tương ớt và chút muối vào trộn đều. Sau đó lấy hỗn hợp gia vị trên đổ hết vào mực, bóp đều lần nữa.\n" +
                "Đậy nắp lại, cất trong ngăn mát tủ lạnh khoảng nửa tiếng. Sau khi ướp xong, bạn lấy mực ra cho vào hộp đựng có lót sẵn vài lá xà lách rồi đổ mực và cả nước ướp lên. Đậy nắp lại, cho vào lò vi sóng, quay ở 700W trong vòng 2 phút hoặc hấp cách thủy.");
        chebien2.add("Tôm hấp nấm một trong số các món tôm hấp ngon và dễ làm, cái tên món ăn đã phần nào nói lên sự nhẹ nhàng, thanh mát trong món ăn này. Những con tôm tươi ngọt thơm, tươi ngon được bóc vỏ, nhẹ nhàng bọc trong những chiếc nấm hương.\n" +
                "\n" +
                "Vị ngọt thơm của tôm hòa quyện với hương vị thơm ngon đặc biệt của nấm hương tươi khiến cả nhà sẽ rất iu thích cho mà xem.");
        chebien2.add("Nguyên liệu\n" +
                "300g tôm sú\n" +
                "1 ít rau mùi tươi\n" +
                "Cách làm\n" +
                "Bước 1: Làm sốt chấm cay\n" +
                "\n" +
                "Đun nóng dầu ô liu trong nồi nhỏ, cho gừng vào xào đến khi thơm, cho rượu vào. Sau đó, cho nước tương, hắc xì dầu, nêm đường, tiêu và dầu mè, đun với lửa nhỏ cho tới khi nước sốt sánh lại, thêm ớt và hành hoa.\n" +
                "Bước 2: Hấp tôm\n" +
                "\n" +
                "Tôm cắt bớt râu, làm sạch, xếp vào xửng. Đun sôi nước trong nồi hấp, đặt khay tôm vào, hấp chín khoảng 4-5 phút là được.\n" +
                "Bên trên là hơn 20 món hấp ngon dễ làm tại nhà và cực kỳ bỗ dương. Hy vọng sẽ giúp mâm cơm của gia đinh thêm phần hấp dẫn.");

    }
    public void nuong(){
        stringArrayList3.add("Thịt heo nướng");
        stringArrayList3.add("Lòng heo nướng");
        stringArrayList3.add("Thịt bò nướng");
        stringArrayList3.add("Tôm nướng");
        stringArrayList3.add("Rau củ nướng");
        stringArrayList3.add("Thịt gà nướng");
        stringArrayList3.add("Sườn nướng");
        stringArrayList3.add("Bạch tuộc nướng");
        stringArrayList3.add("Cá nướng giấy bạc");
        stringArrayList3.add("Mực nướng");
        stringArrayList3.add("Tôm hùm nướng phô mai");
        stringArrayList3.add("Mực nướng sa tế");
        stringArrayList3.add("Bò cuộn nấm kim châm");
        stringArrayList3.add("Cá nướng giấy bạc");
        stringArrayList3.add("Sườn dê nướng tảng");
        stringArrayList3.add("Cánh gà nướng sốt BBQ Hàn Quốc");
        stringArrayList3.add("Sườn nướng BBQ");
        stringArrayList3.add("Nầm nướng chao");
        stringArrayList3.add("Cà tím nướng mỡ hành");


        anh3.add(R.drawable.ab_khoai_lang_ken);
        anh3.add(R.drawable.ab_che_khoai_lang);
        anh3.add(R.drawable.ab_chan_ga);
        anh3.add(R.drawable.ab_banh_goi);
        anh3.add(R.drawable.ab_khoai_tay);
        anh3.add(R.drawable.ab_banhxeo);
        anh3.add(R.drawable.ab_banhbao);
        anh3.add(R.drawable.ab_banhranman);
        anh3.add(R.drawable.ab_tokbokki);
        anh3.add(R.drawable.ab_nemchuaran);
        anh3.add(R.drawable.ab_phomaique);
        anh3.add(R.drawable.ab_cutlonxaome);
        anh3.add(R.drawable.ab_banhplan);
        anh3.add(R.drawable.ab_banhkemchuoi);
        anh3.add(R.drawable.ab_trungganuong);
        anh3.add(R.drawable.ab_cutlonxaome);
        anh3.add(R.drawable.cacbohydrate);
        anh3.add(R.drawable.ab_banh_goi);
        anh3.add(R.drawable.ab_banhranman);


        chebien3.add("Nguyên liệu:\n" +
                "\n" +
                "– Thịt heo\n" +
                "\n" +
                "– Nước ép táo (2 trái)\n" +
                "\n" +
                "– 4 lòng đỏ trứng gà\n" +
                "\n" +
                "– Tỏi, ớt, sả, hành tím băm\n" +
                "\n" +
                "– Mè (vừng) chưa rang\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "– Thịt heo cắt lát mỏng. Cho nước ép táo vào ngâm 15 phút (mua 1-2 trái táo ép lấy nước). Sau 15 phút ướp, vẫn giữ lại nước táo trong thau. Nước táo ngấm nó trực tiếp ngấm từ từ vào lõi xương, sườn, giúp khi bạn nướng, sẽ chín đều từ trong ra ngoài, không bị gặp trường hợp ngoài cháy mà bên trong mới chín tới.\n" +
                "\n" +
                "– Sau đó, cho lòng đỏ trứng gà vào (1 kg tương ứng với 4 lòng đỏ). Tiếp tục cho hành tỏi ớt băm nhuyễn, sả xay nhuyễn vào, bóp thịt đều tay.\n" +
                "\n" +
                "– Cho tiếp: ỏi hành ớt băm, sả, nước mắm, đường.\n" +
                "\n" +
                "– Cho mè (vừng) chưa rang vào thêm. Trộn đều. Cuối cùng là cho một lớp dầu ăn vào hỗn hợp thịt đã ướp sao cho ngập qua bề mặt sườn.\n" +
                "\n" +
                "– Ướp tầm 2 tiếng ở bên ngoài, không đậy nắp; còn muốn để qua đêm hoặc trên 5 tiếng thì đậy nắp, cất tủ lạnh.");
        chebien3.add("Nguyên liệu:\n" +
                "\n" +
                "– 500 gram lòng lợn\n" +
                "\n" +
                "– Gia vị, hành khô, ớt, tỏi, ớt.\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "– Sơ chế lòng là khâu rất quan trọng. Bạn luộc qua lòng lợn, rửa sạch sẽ, bạn bỏ đi phần ruột bên trong, dùng muối xát vào lòng, bóp cho thật sạch rồi rửa lại với nước nhiều lần cho lòng sạch. Tiếp theo, cắt lòng thành những miếng vừa ăn.\n" +
                "\n" +
                "– Bạn cho vào chảo chút dầu ăn, khi dầu nóng bạn phi thơm hành, ớt, tỏi, sả băm. Tiếp theo, bạn cho vào chảo chút bột ngọt, đường, nghệ, nước mắm, trộn đều lên, nêm nếm lại gia vị cho vừa miệng.\n" +
                " \n" +
                "– Bạn chờ cho hỗn hợp gia vị nguội rồi trút vào tô ướp cùng lòng trong khoảng 1- 2 tiếng đồng hồ, thời gian ướp càng lâu thì lòng sẽ càng ngấm gia vị. Sau đó, bạn nướng trên lò hoặc trên than hoa.\n" +
                "\n" +
                "Chúc các bạn thành công và ngon miệng với các cách ướp món nướng trên nhé!");
        chebien3.add("Nguyên liệu:\n" +
                "\n" +
                "– 400 gram thịt thăn bò (bạn có thể thay bằng thịt vai bò hoặc thịt đùi bò)\n" +
                "\n" +
                "– 1 củ hành khô, 1 củ tỏi, 2 củ sả (tất cả đều băm nhỏ)\n" +
                "\n" +
                "– 1 thìa canh sữa tươi\n" +
                "\n" +
                "– Gia vị: 1 thìa bột cari (có thể bỏ qua), 2 muỗng canh nước tương, 2 muỗng canh dầu hào, 1 thìa cà phê hạt tiêu, 1 thìa canh rượu trắng, 1 thìa cafe đường cát.\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "Bạn lấy một chiếc tô, cho toàn bộ gia vị vào, trộn đều tay để gia vị quyện hết vào nhau. Tiếp theo bạn trút toàn bộ phần thịt bò vừa thái vào tô, trộn đều tay để thịt bò thấm gia vị. Bạn ướp thịt bò ít nhất một giờ để thịt mềm, đậm đà hơn sau khi nướng.");
        chebien3.add("Nguyên liệu:\n" +
                "\n" +
                "– Tôm sú tươi\n" +
                "\n" +
                "– Muối tôm loại ngon\n" +
                "\n" +
                "– Mật ong\n" +
                "\n" +
                "– Rượu trắng\n" +
                "\n" +
                "Cách ướp:\n" +
                "\n" +
                "– Tôm rửa sạch, để nguyên đầu đuôi. Ngâm tôm vào rượu trắng khoảng 15 phút.\n" +
                "\n" +
                "– Trộn muối tôm và mật ong lại với nhau, tạo thành hỗ hợp sền sệt, nếu đặc quá bạn có thể cho vào một ít nước ấm cho loãng bớt. Sau đó rưới hỗn hợp lên tôm, ướp tôm trong vòng 60 phút, rồi có thể đem đi nướng.");
        chebien3.add("Nguyên liệu:\n" +
                "\n" +
                "– 1/2 trái bí ngô non\n" +
                "\n" +
                "– 1/2 trái dứa\n" +
                "\n" +
                "– 1 trái cà tím\n" +
                "\n" +
                "– 1/2 củ cà rốt\n" +
                "\n" +
                "– 100 gram khoai môn\n" +
                "\n" +
                "– 1/3 muỗng canh mật ong\n" +
                "\n" +
                "– Lá thơm\n" +
                "\n" +
                "– 1 muỗng cà phê\n" +
                "\n" +
                "– Muối, hạt nêm\n" +
                "\n" +
                "– Rau mùi (ngò rí)\n" +
                "\n" +
                "Cách làm:\n" +
                "– Sơ chế rau củ, rửa sạch, cắt nhỏ vừa ăn, ngâm khoai môn, cà tím, bí ngô non trong nước có nêm ít muối cho ra bớt nhựa và khỏi thâm.\n" +
                "\n" +
                "– Vớt củ, quả ra tô to, ướp với muối, mật ong, lá thơm, rau mùi, hạt nêm khoảng 5 phút. Lần lượt xiên củ, quả vào xiên tre, nướng trên bếp nướng (hoặc than hoa) cho chín đều.");
        chebien3.add("Nguyên liệu:\n" +
                "\n" +
                "– 1/2 con gà\n" +
                "\n" +
                "– 1 thìa dầu ăn\n" +
                "\n" +
                "– 1 thìa đường\n" +
                "\n" +
                "– 1/2 muỗng canh nước lọc\n" +
                "\n" +
                "– 1 thìa mù tạt\n" +
                "\n" +
                "– 2 thìa ớt bột\n" +
                "\n" +
                "– 2 thìa mật ong\n" +
                "\n" +
                "– 1 thìa hành tỏi băm nhuyễn\n" +
                "\n" +
                "– 1/2 thìa hạt tiêu\n" +
                "\n" +
                "– 1 thìa nước tương\n" +
                "\n" +
                "– 1 quả cà chua\n" +
                "\n" +
                "– 1 thìa muối\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "– Gà sơ chế cho sạch, cắt làm nhiều phần.\n" +
                "\n" +
                "– Cách làm nước sốt BBQ: đặt chảo lên bếp vặn nhỏ lửa, đun nóng chảo rồi cho dầu ăn vào, khi dầu nóng già thì cho hành tỏi vào phi vàng, sau đó cà chua đã thái hạt lựu vào xào cùng. Lần lượt cho gia vị khác vào: mù tạt, ớt bột, mật ong, nước tương, nước lọc và cuối cùng cho hạt tiêu vào, bật to bếp đun sôi hỗn hợp trên trong vòng 10 phút cho sốt sền sệt là được, trong quá trình đun các bạn phải khuấy đều hỗn hợp.\n" +
                "\n" +
                "– Khi đã chuẩn bị xong nước sốt, các bạn nên để nước sốt nguội bớt rồi mới cho vào ướp gà. Cho gà vào một bát to, đổ toàn bộ sốt BBQ đã chuẩn bị trên vào ướp cùng. Ướp gà 6-8h trong ngăn lạnh của tủ lạnh để gà ngấm đều gia vị, sau đó cho vào lò nướng.");
        chebien3.add("Nguyên liệu:\n" +
                "\n" +
                "– 500 gram sườn\n" +
                "\n" +
                "– 1 muỗng canh xì dầu\n" +
                "\n" +
                "– 2 thìa cà phê mật ong\n" +
                "\n" +
                "– 2 thìa cà phê dầu hào\n" +
                "\n" +
                "– 5 thìa cà phê dầu ăn, mỡ gà thay thế sẽ ngon hơn\n" +
                "\n" +
                "– 1 thìa cà phê dầu mè\n" +
                "\n" +
                "– 1 muỗng canh nước mắm\n" +
                "\n" +
                "– 1 lon Coca\n" +
                "\n" +
                "– Hành tím, tỏi\n" +
                "\n" +
                "– Hạt nêm, hạt tiêu\n" +
                "\n" +
                "– 3 củ sả đập dập\n" +
                "\n" +
                "– 3 muỗng canh nước cốt dừa\n" +
                "\n" +
                "– 1 miếng bơ nhỏ bằng 2 muỗng cà phê\n" +
                "\n" +
                "– 1 trái cam tươi.\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "Trộn đều hỗn hợp trên vào phần sườn ít nhất trong thời gian 2 tiếng trước khi nướng, chỉ cần trộn đều hỗn hợp trên và dùng tay bôi lên trên miếng sườn trong hỗn hợp đó. Sau đó dùng nilon đậy kín miệng của tô và cho vào tủ lạnh (cho vào ngăn mát), đủ thời gian có thể đem ra nướng");
        chebien3.add("Nguyên liệu:\n" +
                "\n" +
                "– 1 kg bạch tuộc\n" +
                "\n" +
                "– 1 quả chuối chát\n" +
                "\n" +
                "– 1 quả ớt chuông\n" +
                "\n" +
                "– 3 trái ớt xanh\n" +
                "\n" +
                "– Khế, rau răm, dứa\n" +
                "\n" +
                "– 4 muỗng canh lớn sa tế\n" +
                "\n" +
                "– 1 muỗng cà phê muối\n" +
                "\n" +
                "– 1 muỗng cà phê hạt nêm\n" +
                "\n" +
                "– 2 muỗng cà phê mật ong\n" +
                "\n" +
                "– Tắc (quất)\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "– Sơ chế bạch tuộc, rửa với nước muối loãng.\n" +
                "\n" +
                "– Ướp bạch tuộc với 4 muỗng canh lớn sa tế, tỏi băm nhuyễn, 1 muỗng canh dầu ăn, 1 muỗng cà phê muối, 2 muỗng cà phê mật ong, 1 muỗng cà phê hạt nêm trộn đều lên. Thời gian ướp là 30 phút, sau đó có thể nướng trên lò.");
        chebien3.add("Nguyên liệu:\n" +
                "\n" +
                "– 500 gram cá lóc (hay còn gọi là cá quả hoặc cá chuối, có thể thay bằng loại yêu thích)\n" +
                "\n" +
                "– 1 gói bánh tráng\n" +
                "\n" +
                "– 100 gram bún tươi\n" +
                "\n" +
                "– 1/2 củ gừng\n" +
                "\n" +
                "– 1/2 củ hành tây\n" +
                "\n" +
                "– 2 muỗng cà phê muối\n" +
                "\n" +
                "– 4 muỗng cà phê nước mắm\n" +
                "\n" +
                "– 1 muỗng cà phê đường trắng\n" +
                "\n" +
                "– 1/2 muỗng cà phê tiêu\n" +
                "\n" +
                "– 1/2 muỗng cà phê hạt nêm\n" +
                "\n" +
                "– 2 muỗng canh mật ong\n" +
                "\n" +
                "– 1 muỗng cà phê dầu hào\n" +
                "\n" +
                "– 1 muỗng cà phê dầu điều\n" +
                "\n" +
                "– 1 quả dưa leo 15 gram đậu phộng\n" +
                "\n" +
                "– Hành lá, xà lách\n" +
                "\n" +
                "– 2 quả cà chua\n" +
                "\n" +
                "– 1/2 muỗng cà phê nước cốt chanh\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "– Sơ chế cá với nước muối loãng hoặc rượu trắng để khử mùi tanh.\n" +
                "\n" +
                "– Gừng gọt vỏ, giã nhỏ, ướp gừng cá bớt tanh và khi nướng có thêm hương vị. Thoa lên mình cá hai muỗng cà phê muối, hai muỗng cà phê nước mắm, một muỗng nhỏ hạt nêm, ít hạt tiêu, rồi dùng tay chà hỗn hợp gia vị vào thân cá cho ngấm đều, để món cá nướng cuộn bánh tráng được đậm đà hơn.\n" +
                " \n" +
                "– Hành tây lột vỏ, bổ múi cau. Xếp hành tây lên trên giấy nhôm (loại dùng để nướng trong lò), và đặt cá lên trên, bọc kín cho vào ngăn mát tủ lạnh, để qua đêm.\n" +
                "\n" +
                "– Trộn nước sốt nướng cá: 2 muỗng canh mật ong, 1 muỗng cà phê dầu hào, 1 muỗng cà phê dầu điều. Dùng hỗn hợp nước sốt phết đều lên thân cá.\n" +
                "\n" +
                "– Hành lá rửa sạch, thái nhỏ. Đổ dầu ăn đang sôi vào bát hành lá thái sẵn để hành chín, sau đó phết lên cá nướng cuốn bánh tráng.\n" +
                "\n" +
                "– Nướng cá trong vòng từ 30 đến 45 phút, ở nhiệt độ 200 độ C. Bạn lưu ý thỉnh thoảng hãy lấy cá ra và phết hỗn hợp gia vị lên thân cá để cá nướng không bị khô. Khi cá chuyển màu vàng sậm, lấy cá ra khỏi lò, khi ấy món cá nướng đã có thể ăn.");
        chebien3.add("Nguyên liệu:\n" +
                "\n" +
                "– 1 con mực tươi, hoặc thay bằng mực ống, số lượng tùy vào sức ăn\n" +
                "\n" +
                "– Hành tím, tỏi khô\n" +
                "\n" +
                "– Muối ớt tinh\n" +
                "\n" +
                "– Đường, bột nêm\n" +
                "\n" +
                "Cách làm:\n" +
                "– Sơ chế mực với nước muối, rửa sạch.\n" +
                "\n" +
                "– Hành tím, tỏi bóc vỏ rồi băm nhuyễn.\n" +
                "\n" +
                "– Trộn đều muối ớt cùng với hành tỏi băm nhuyễn và chút đường, bột nêm. Lượng muối ớt tùy theo khẩu vị ăn cay của bạn. Xoa đều gia vị vừa trộn lên 2 mặt của mực rồi để ướp trong khoảng một giờ đồng hồ cho thấm gia vị, sau đó có thể mang đi nướng.");
        chebien3.add("Nguyên liệu chuẩn bị\n" +
                "\n" +
                "Tôm hùm: khoảng 900g\n" +
                "Phô mai mozzarella hoặc phô mai cheddar: 250g\n" +
                "Tỏi: 1 củ\n" +
                "Muối: 1 thìa cafe\n" +
                "Hạt tiêu xay: 1 thìa cafe\n" +
                "Rau thơm trang trí\n" +
                "Cách làm tôm hùm nướng phô mai\n" +
                "\n" +
                "Để chế biến món ăn này, đầu tiên bạn cần sơ chế các nguyên liệu thật sạch sẽ. Tôm hùm sau khi mua về nên dùng bàn chải cứng đành sạch các vết bẩn, vết nhờn bám trên vỏ tôm. Còn tỏi thì bóc vỏ, băm nhuyễn, rau thơm nhặt rễ, rửa sạch, thái nhỏ để trang trí. Phô mai bào thành các sợi nhỏ và để riêng. Làm nóng lò nướng ở nhiệt độ 220 độ C trong 10 phút.\n" +
                "\n" +
                "Bước tiếp theo, bạn lấy dao rạch đôi bụng tôm chia thành hai phần riêng biệt. Để món nướng ngon hơn bạn có thể khía nhỏ 2 - 3 đường trên bề mặt thịt tôm. Sau đó rắc hạt tiêu và muối lên thịt tôm, rồi bỏ phô mai đã bào sợi lên trên. Lưu ý dàn đều phô mai để tôm được đều vị hơn. Ướp tôm khoảng 10 - 20 phút rồi bạn cho vào trong lò đã làm nóng và nướng 20 phút đến khi thịt tôm chín mềm và phô mai chảy ra. Không nên nướng quá lửa nếu không thịt tôm sẽ bị khô. Nhấc tôm ra khỏi lò và rắc rau thơm lên trang trí.\n" +
                "\n" +
                "Lưu ý: Khi ăn đồ nướng tại nhà, bạn không nhất thiết phải chuẩn bị tôm hùm vì loại tôm này khá đắt đỏ, bạn hoàn toàn có thể thay bằng tôm sú tươi. Tuy nhiên, nên sử dụng những con to, chắc thịt thì thành phẩm mới đảm bảo vị ngon như ý muốn.");
        chebien3.add("Nguyên liệu cần chuẩn bị \n" +
                "\n" +
                "Mực: 500g\n" +
                "Sa tế tôm: 1 lọ\n" +
                "Muối: 1 thìa cafe\n" +
                "Ớt bột: 2 thìa cafe\n" +
                "Dầu điều: 1 thìa canh\n" +
                "Cách làm mực nướng sa tế\n" +
                "\n" +
                "Để làm các món nướng ngon mà không mất nhiều thời gian thì bạn nên chuẩn bị các nguyên liệu thật đầy đủ trước khi bắt tay vào làm. Đầu tiên, mực mua về đem rửa sạch, bóc bỏ phần vỏ đen để trông đẹp hơn và không còn mùi tanh. Bạn có thể thái thành các miếng vừa ăn hoặc để nguyên con đều được. Bạn nên khía thân mực theo hình ô trám thì sau khi nướng thành phẩm sẽ bắt mắt hơn rất nhiều.\n" +
                "\n" +
                "Tiếp theo là đến công đoạn ướp mực. Cách ướp đồ nướng tại nhà thường không quá phức tạp, bạn chỉ cần cho mực vào bát tô, ướp với muối, sa tế và ớt bột trong khoảng 20 phút trước khi nướng. Trong quá trình nướng, để món nướng ngon hơn thì thường xuyên quét dầu điều lên trên bề mặt mực để mực lên màu và không bị khô. Mực nướng chín nhanh nên bạn hãy để ý thời gian nướng nhé.");
        chebien3.add("Nguyên liệu cần chuẩn bị\n" +
                "\n" +
                "Ba chỉ bò mỹ đông lạnh dạng cuộn: 500g\n" +
                "Nấm kim châm: 4-5 túi\n" +
                "Nước sốt BBQ: 1 bát\n" +
                "\n" +
                "Cách làm bò cuộn nấm kim châm siêu đơn giản\n" +
                "\n" +
                "Cách làm món nướng tại nhà này cực kỳ đơn giản. Bạn chỉ cần rửa sạch nấm kim châm và chia thành các phần nhỏ khoảng 1 ngón tay. Không nên chia quá to vì khi nướng sẽ khó chín, lại dễ cháy xém thịt bên ngoài. Đối với phần thịt ba chỉ bò mỹ, bạn nên mua loại đã cuộn sẵn trong ngăn đông đá. Khi về chỉ cần bỏ ra ngoài khoảng 5 phút trước khi bắt đầu cuộn. Cách làm thịt bò nướng kiểu này không mất công tẩm ướp nhưng bạn nên khéo léo trong khâu cuộn nấm để không vị rách nhé.\n" +
                "\n" +
                "Sau khi cuộn xong bạn nên bảo quản trong ngăn mát cho đến khi nướng. Cách tốt nhất là khi ăn nướng tại nhà bạn chuẩn bị trước bữa tiệc khoảng 10 phút, khi cuộn xong là có thể đặt lên bếp nướng luôn. Trong quá trình nướng, bạn nên quết thêm một lớp sốt BBQ để thịt đậm đà và ngon hơn nhé. Với món nướng tại nhà tưởng phức tạp nhưng hóa ra lại rất đơn giản này chắc chắn bạn sẽ nhận được nhiều lời khen đó.");
        chebien3.add("Nguyên liệu cần chuẩn bị\n" +
                "\n" +
                "Cá: 500g\n" +
                "Riềng: 1 củ\n" +
                "Sả: 1 củ\n" +
                "Bột nghệ: 1 thìa cafe\n" +
                "Thìa là: 1 mớ\n" +
                "\n" +
                "Cách làm cá nướng giấy bạc\n" +
                "\n" +
                "Cá mua về bạn rửa sạch với muối và chanh để hết mùi tanh rồi để ráo nước và rắc đều bột nghệ cả hai mặt. Riềng, sả bỏ vỏ, cho vào cối giã nhuyễn. Rau thìa là bỏ rễ, rửa sạch. Tiếp theo đến công đoạn chuẩn bị đồ nướng tại nhà. Bạn lấy một tờ giấy bạc lớn, đặt một lớp riềng, sả bên dưới rồi để cá lên, lại tiếp tục đặt thêm một lớp riềng và sả nữa, cuối cùng là thìa là. Nếu còn dư riềng và sả bạn có thể nhét thêm vào bụng cá. Cuối cùng bạn gói chặt lại và cuộn thêm 2 lớp giấy bạc nữa và đặt lên bếp nướng khoảng 30 - 45 phút là cá sẽ chín.\n" +
                "\n" +
                "Mẹo nhỏ cho bạn: Một cách làm đồ nướng tại nhà ngon hơn đó là sử dụng nghệ tươi thay vì bột nghệ, cá khi nướng lên sẽ thơm hơn rất nhiều mà không bị đắng nếu bạn chót cho quá nhiều nghệ.");
        chebien3.add("Nguyên liệu chuẩn bị\n" +
                "\n" +
                "Thịt dê tươi: 400g\n" +
                "Rượu trắng hoặc bia\n" +
                "Sả: 3 nhánh\n" +
                "Hành khô: 3 củ\n" +
                "Ớt, gừng\n" +
                "Hạt nêm, dầu ăn, dầu hào, mì chính, chao\n" +
                "\n" +
                " Cách làm thịt dê nướng tảng ngon như ngoài hàng\n" +
                "\n" +
                "Khi làm món nướng tại nhà như thịt dê, khâu sơ chế cực kỳ quan trọng vì nếu không biết cách, thành phẩm sẽ có mùi ngai ngái rất khó ăn. Tuy nhiên thực tế cách làm sạch thịt dê lại cực kỳ đơn giản. Bạn bóp thịt dê với rượu trắng hoặc bia trong khoảng 2 - 3 phút rồi rửa sạch với nước là hết mùi hôi. Hành khô, sả, ớt, gừng bóc vỏ rồi băm nhuyễn, trộn vào bát cùng các nguyên liệu còn lại ta được một hỗn hợp nước sốt, ướp với thịt dê trong vòng 1 tiếng rồi đem nướng trên bếp nướng BBQ.");
        chebien3.add("Nguyên liệu chuẩn bị\n" +
                "\n" +
                "Cánh gà: 7 - 8 chiếc\n" +
                "Đường nâu: 3/4 bát\n" +
                "Nước tương: 3/4 chén\n" +
                "Bột bắp: 1 thìa canh\n" +
                "Dầu mè: 1 thìa canh\n" +
                "Tướng ớt Hàn Quốc: 5 thìa canh\n" +
                "Tiêu, gừng, tỏi, muối\n" +
                "Nước trắng: 50ml\n" +
                "\n" +
                "Cách làm cánh gà nướng sốt BBQ\n" +
                "\n" +
                "Đầu tiên, để làm cánh gà sốt BBQ thì bạn phải chế biến được một bát sốt BBQ chuẩn Hàn Quốc. Bạn bóc tỏi, gừng và đập dập. Hòa tan 50ml nước trắng với bột bắp. Cho tất cả các nguyên liệu vào một chiếc nồi và đun ở lửa vừa cho đến khi sệt lại. Trong quá trình đun liên tục khuấy để không bị vón cục. Bạn để nguội nước sốt BBQ sau đố mới ướp vào thịt. Ngoài cánh gà bạn có thể ướp với các món nướng đơn giản khác cũng rất ngon và hợp vị.\n" +
                "\n" +
                "Gà sau khi rửa sạch và để ráo sẽ ướp với nước sốt BBQ trong 20 - 30 phút trước khi đem nướng. Bạn có thể nướng trên bếp nướng than hoa không khói hoặc bếp nướng điện, bếp cồn,... đều được. Trong quá trình nướng, có thể quết thêm 1 - 2 lớp sốt BBQ để cánh gà không bị khô. Bạn có thể áp dụng cách làm này với các món BBQ tự làm khác nhé.\n" +
                "\n");
        chebien3.add("Nguyên liệu cần chuẩn bị\n" +
                "\n" +
                "Dẻ sườn thăn: 500g\n" +
                "Nước sốt BBQ\n" +
                "Cách làm sườn nướng BBQ\n" +
                "\n" +
                "Nguyên liệu làm sườn nướng BBQ không phức tạp, bạn có thể sử dụng chính loại nước sốt BBQ khi ướp cánh gà để ướp dẻ sườn. Tuy nhiên công đoạn quan trọng chính là khâu tẩm ướp. Khi làm thịt nướng BBQ tại nhà, nhất là với sườn nướng bạn cần có thời gian. Sườn sau khi rửa sạch cần được để rao hết nước nếu không sẽ làm loãng sốt và khiến vị bị nhạt. Sau đó bạn cho nước sốt BBQ vào ướp với sườn khoảng 6 - 8 tiếng trong tủ lạnh để ngấm đều và sâu và các thớ thịt.\n" +
                "\n" +
                "Một mẹo nhỏ cho cách ướp đồ nướng ngon tại nhà mà không phải ai cũng biết đó là sử dụng trực tiếp bàn tay của bạn để xoa đều nước sốt. Hơi ấm từ bàn tay sẽ giúp nước sốt thấm sâu hơn và miếng sườn sau khi nướng sẽ cực kỳ mềm và đậm đà đó.");
        chebien3.add("Nguyên liệu chuẩn bị\n" +
                "\n" +
                "Nầm lợn: 500g\n" +
                "Chao ngon: 1 hũ\n" +
                "Chanh: 1/2 quả\n" +
                "Tương ớt, rượu trắng, dầu mè, nước mắm\n" +
                "Tỏi: 1 củ\n" +
                "Cách làm nầm nướng chao\n" +
                "\n" +
                "Nầm sau khi mua về bạn rửa sạch với rượu trắng để hết mùi hôi, sau đó rửa lại một lần với nước và để ráo, thái miếng vừa ăn. Chao chắt nước thừa chỉ để lại một chút. Cho tất cả các nguyên liệu vào một bát và trộn đều, ướp với nầm khoảng 20 phút rồi đem đi nướng. Nướng nầm bạn cần chú ý thời gian nướng vì nếu nướng quá lửa sẽ bị dai, còn nếu chưa chín ăn sẽ có mùi ngai ngái.");
        chebien3.add("Nguyên liệu cần chuẩn bị\n" +
                "\n" +
                "Cà tím: 2 quả\n" +
                "Ớt, hành lá cắt nhỏ, dầu ăn\n" +
                "Cà tím rửa sạch, thái lát ngâm vào chậu nước muối loãng để không bị thâm. Tiếp theo bạn cho dầu ăn lên chảo, đợi dầu nóng và cho hành, ớt vào phi thơm khoảng 15 giây rồi tắt bếp. Sau đó rưới mỡ hành lên mặt cà tìm và nướng trên bếp. Cà tìm khi nướng sẽ chín mềm nên bạn cẩn thận nếu không rất dễ bị nát.");

    }
    public void nhau(){
        stringArrayList4.add("Bắp bò ngâm mắm");
        stringArrayList4.add("Bắp xào");
        stringArrayList4.add("Bò cuốn nấm");
        stringArrayList4.add("Bò chiên tẩm vừng");
        stringArrayList4.add("Bột chiên");
        stringArrayList4.add("Cơm cháy chà bông");
        stringArrayList4.add("Cút lộn xào me");
        stringArrayList4.add("Chả cốm");
        stringArrayList4.add("Chả tôm ngô");
        stringArrayList4.add("Chân gà hầm mật ong");
        stringArrayList4.add("Da heo muối ớt");
        stringArrayList4.add("Bánh tráng trộn");
        stringArrayList4.add("Dồi nõn nhồi thịt");
        stringArrayList4.add("Gà chiên xù");
        stringArrayList4.add("Gà nướng xả ớt");
        stringArrayList4.add("Bánh gạo cay");
        stringArrayList4.add("Thịt xiên nướng");
        stringArrayList4.add("Khoai lang lệ phố");
        stringArrayList4.add("Khoai tây nghiền nướng");

        anh4.add(R.drawable.jf_laumam);
        anh4.add(R.drawable.jf_lauthaichuacaypng);
        anh4.add(R.drawable.jf_laugalagiang);
        anh4.add(R.drawable.jf_duoibo);
        anh4.add(R.drawable.othiem);
        anh4.add(R.drawable.lauhaisan);
        anh4.add(R.drawable.thaclac);
        anh4.add(R.drawable.laubo);
        anh4.add(R.drawable.echmangchua);
        anh4.add(R.drawable.reucua);
        anh4.add(R.drawable.jf_laumam);
        anh4.add(R.drawable.phanthiet);
        anh4.add(R.drawable.namchay);
        anh4.add(R.drawable.ghemangchua);
        anh4.add(R.drawable.namthapcam);
        anh4.add(R.drawable.laude);
        anh4.add(R.drawable.laucakeo);
        anh4.add(R.drawable.misonhat);
        anh4.add(R.drawable.hanquoc);

        chebien4.add("* Nguyên liệu:\n" +
                "– Bắp bò: 2kg\n" +
                "– Gừng: 1 củ cỡ vừa \n" +
                "– ớt đỏ: 50gr\n" +
                "– Cà rốt : 1 củ nhỏ \n" +
                "– Tỏi : 50gr \n" +
                "– 1 nhánh quế, 2 bông hoa hồi, 1/2 quả thảo quả \n" +
                "– Gia vị: muối tính , nước mám, đường vàng, giấm gạo, nước\n" +
                "– 1 hũ thủy tinh để ngâm thịt bò\n" +
                "* Cách làm: \n" +
                "– Bắp bò mua về rửa sạch, lau khô. Dùng dao lạng bỏ những phần màng và mỡ bám xung quanh. Bước này rất quan trọng để bảo quản được lâu dài.Nếu vẫn chưa lọc sạch mỡ thì bắp bò rất dễ bị hỏng trong khi ngâm. \n" +
                "– Bắp bò luộc bỏ nước đầu cho ra hết bọt bẩn .\n" +
                "– Nướng thơm quế, hoa hồi, thảo quả, 1/2 của gừng đâp dập rồi bỏ vào nồi cùng bắp bò, đổ nước ngập mặt thịt, thêm 1 thìa muối tinh. Đun to lửa đến khi sôi thì hạ lửa ở mức vừa, luộc đến khi thịt chín hoặc xiên đầu đũa vào không thấy nước hồng nữa là được. \n" +
                "– Rửa SẠCH ớt, tỏi, cà rốt & ĐỂ KHÔ. \n" +
                "– Thái lát tỏi và cà rốt. Món này ngâm cùng ớt không phải để lấy vị cay mà lấy mùi thơm của tỏi ớt nên mình để cả quả. Ngâm ớt, tỏi, cà rốt với 2-3 thìa giấm và 1 thìa đường cho ngon. ngâm khoảng 15-20p vớt ra để ráo \n" +
                "– Các bạn đong khoảng 3 bát ăn cơm nước sạch bỏ vào nồi, đun sôi. Sau đó lần lượt cho đường , mắm, muối tinh và giấm vào tùy khẩu vị. Lưu ý: vì món này là món ngâm nên mình khuyên là làm hỗn hợp mắm đậm đà và thiên mặn ngọt nhiều nhé, để khi thẩm thấu vào miếng thịt sẽ thơm hơn. nếu làm nhạt như các bạn chấm nem thì thành phẩm sẽ nhạt nhẽo và hơi tanh. 1/2 củ gừng còn lại nạo sạch vỏ, thái lát mỏng thả vào mắm cho thơm. \n" +
                "– Sau khi đã nêm các gia vị vừa miệng, các bạn đun thật sôi hỗn hợp mắm. Để ra ngoài cho nguội hăn. \n" +
                "– Bắp bò sau khi luộc chín, vớt ra, bổ đôi, để nguội hẳn. \n" +
                "– Hũ thủy tinh mọi người cũng tráng qua nước sôi, lau khô rồi dùng nhé. \n" +
                "– Khi mọi thứ đã nguội hoàn toàn ( thịt bò, nước mắm) và khô hoàn toàn ( hũ thủy tinh), xếp bò vào hũ, bỏ cà rốt, ớt, tỏi vào hũ cùng, bày trí cho đẹp mắt rồi chan nước mắm ngập thịt. Đậy chặt nắp khoảng 3-4 hôm là dùng được Biểu tượng cảm xúc grin mọi người nhớ để hũ thịt ở nơi mát mẻ nhé, sau khi thịt đã ngấm, mọi người bỏ tủ lạnh nhé.");
        chebien4.add("Nguyên liệu:\n" +
                "\n" +
                "– Bắp nếp tách hạt: 500g (Có thể dùng bắp ngọt)\n" +
                "– Tép hoặc tôm khô: 1,5 lạng\n" +
                "– Hành lá: vài cọng, thái nhỏ, để riêng phần đầu trắng\n" +
                "– Bơ Tường An (bơ lạt): 3-4 muỗng súp\n" +
                "– Gia vị: Đường, nước mắm, hạt nêm, tương ớt.\n" +
                "Cách làm:\n" +
                "– Rửa tôm/tép khô qua vài lần nước cho sạch, sau đó ngâm trong nước cho mềm. Vớt ra để ráo.\n" +
                "\n" +
                "– Bắc chảo lên bếp, phi thơm phần hành màu trắng với một chút dầu ăn rồi trút tôm/ tép khô vào xào với chút gia vị cho ngấm rồi trút bắp vào xào. Nêm 1 muỗng canh nước mắm, 1/2 muỗng canh đường, 1/2 muỗng cafe hạt nêm, 3-4 muỗng canh bơ Tường An rồi xào cho tôm ngấm gia vị. Nêm nếm lại vừa miệng. Cuối cùng cho hành lá vào đảo đều lên rồi tắt bếp");
        chebien4.add("Nguyên liệu: \n" +
                "\n" +
                "80g thịt bò\n" +
                "20g cà rốt\n" +
                "20g cần tây\n" +
                "30g nấm kim châm\n" +
                "5g tiêu, muối\n" +
                "Dầu ăn\n" +
                "\n" +
                "Cách làm:\n" +
                "Bước 1:\n" +
                "\n" +
                "Chuẩn bị nguyên liệu: rửa sạch cà rốt, cần tây và nấm kim châm, chần sơ với nước sôi rồi vớt ra để ráo nước. Rau củ bạn thái sợi dày khoảng 2mm, dài 15cm, nấm kim châm dùng tay tách rời ra.\n" +
                "\n" +
                "Thịt bò thái mỏng, càng mỏng càng tốt với chiều dài khoảng 10cm, chiều rộng 6cm là vừa.\n" +
                "\n" +
                "Bước 2:\n" +
                "\n" +
                "Trải 2 lát thịt bò ra đĩa hoặc thớt, rắc chút muối rồi xếp rau củ và nấm lên.\n" +
                "Từ từ cuộn lại thật chặt, làm lần lượt đến khi hết thịt và rau củ.\n" +
                "Bước 3:\n" +
                "\n" +
                "Làm nóng dầu ăn trong chảo.\n" +
                "Khi thấy khói trắng bốc lên thì bạn cho thịt cuộn vào áp chảo, khi thịt chín một mặt thì lật sang áp chảo tiếp những mặt khác; làm lần lượt đến khi hết\n" +
                "Bước 4:\n" +
                " \n" +
                "Thịt sau khi chiên xong bạn để lên đĩa có lót giấy thấm dầu để vài phút cho ráo dầu rồi rắc chút tiêu là xong. Nếu bạn không thích mùi vị “nguyên thủy” của thịt bò thì ướp thịt với xốt thịt nướng trước khi cuộn sẽ là một gợi ý hay dành cho bạn.\n" +
                "\n" +
                "Món bò cuốn nấm nghe qua thì thật quen thuộc, chắc hẳn bạn sẽ liên tưởng ngay tới món thịt bò cuốn chỉ toàn nấm kim châm ở bên trong. Tuy nhiên với phiên bản mới này, món ăn được “cải tiến” và biến tấu đi chút ít, được thêm chút vị ngọt của cà rốt, mùi thơm của cần tây và trông cũng đẹp mắt hơn hẳn so với kiểu làm thịt cuốn nấm bạn đã từng biết đến. Ngày cuối tuần, bạn hãy thử làm cả nhà bất ngờ với tài khéo léo của mình bằng món ăn này nhé!");
        chebien4.add("Nguyên liệu:\n" +
                "\n" +
                "– 350g thịt bò\n" +
                "– Bột bắp\n" +
                "– Sốt tương đậu nành, muối, ớt bột, hạt thì là, vừng trắng, dầu thực vật và tăm xỉa răng\n" +
                "\n" +
                "Cách làm\n" +
                "– Thịt bò khi mua về bạn nên cho vào tủ lạnh khoảng 30 phút trước khi chế biến để cho miếng thịt cứng lại dễ thái hơn. Thịt bò cắt miếng vuông cỡ 1,5cm, sau đó bỏ thịt vào thố trộn, ướp với 1 muỗng canh bột bắp và 2 muỗng canh tương đậu nành trong chừng 20 phút cho thấm.\n" +
                " \n" +
                "Trộn đều 1 muỗng canh bột ớt (lượng ớt điều chỉnh tùy khẩu vị), 1 muỗng cà phê muối, 1 muỗng canh bột thì là cùng ít vừng trắng trong một bát nhỏ. Chia phần gia vị này làm đôi, 1 nửa đem trộn đều với thịt bò, phần còn lại để riêng.\n" +
                "\n" +
                "Dùng tăm đầu nhọn xiên qua mỗi miếng thịt bò. Làm nóng chảo với lượng dầu ngập mặt. Chờ dầu sôi lần lượt thả từng xiên thịt vào chiên. Lúc này lại hạ lửa vừa, thỉnh thoảng đảo nhẹ xiên thịt trong chảo cho vàng đều khắp mặt.\n" +
                "\n" +
                "Chiên thịt trong khoảng 2 phút rồi vớt ra rổ có lót sẵn giấy thấm dầu cho ráo dầu thừa. Đổ thịt bò ra bát, xóc đều với phần gia vị (gồm ớt bột, hạt thì là, vừng trắng và muối) còn lại. Sau đó, trút thịt vào chảo nóng trở lại, chiên trong 1 phút nữa thì vớt ra cho ráo.\n" +
                "\n" +
                "Trút thịt chiên tẩm vừng ra đĩa có lót sẵn rau sống xung quanh. Rau sống xanh mướt vừa làm nền bắt mắt cho món ăn, vừa để ăn kèm giúp chống ngán. \n" +
                "\n" +
                "Thịt bò chiên tẩm vừng hứa hẹn sẽ là món mặn ngon cơm ngày lạnh, không chỉ là món nhắm tốn mồi cho anh xã mà còn khiến các bé trong nhà thích thú. Nếu làm cho các bé thì mẹ có thể bỏ riêng 1 phần không có ớt để chiên nhé! Từng xiên thịt có màu vàng nâu hấp dẫn, dậy mùi thơm của thì là, đậm đà thấm vị mà lại đượm chút thơm bùi của vừng rang chín quyến rũ.");
        chebien4.add("– Bột gạo: 250g\n" +
                "– Bột năng: 25g\n" +
                "– Hột gà: 2 quả\n" +
                "– Đu đủ bào sợi\n" +
                "– Muối, nước tương, hành lá, đậu phộng rang, gia vị…\n" +
                "\n" +
                "Thực hiện:\n" +
                "\n" +
                "CHUẨN BỊ: \n" +
                "\n" +
                "Làm đu đủ : Đu đủ bào sợi ngâm với nước lạnh cùng tí xíu muối cho ra hết chất mủ. Xong khi gần ăn thì vớt ra để ráo, nếu ai thích ăn chua thì pha dấm đường rồi ngâm đu đủ vào 10 phút trước khi ăn, với tỉ lệ 1 dấm + 1 đường + 2 nước.\n" +
                "\n" +
                "Làm nước chấm : 1 nước tương + 1 đường + 1/2 dấm đỏ + 1 nước nếu thích ăn chan nước tương vô cùng bột chiên, nếu thích chấm từng miếng bột chiên vào chén nước chấm thì pha 1/2 chén nước.");
        chebien4.add("Nguyên liệu:\n" +
                "\n" +
                "– 250gr gạo nếp\n" +
                "– 250gr gạo tẻ (gạo thường dùng nấu cơm)\n" +
                "– 100 gr ruốc thịt (chà bông)\n" +
                "– Hành lá: 5-6 nhánh\n" +
                "– Gia vị: 3 thìa đường, 3 thìa nước mắm, 3 muỗng canh nước lọc, 1 thìa ớt bột, 1 thìa cf bột nêm\n" +
                "\n" +
                "Cách làm:\n" +
                "– Trộn đều gạo nếp với gạo tẻ rồi vo sạch đổ vào nồi cơm điện, cho nước vừa sấp mặt gạo, pha thêm vào 1 muỗng canh dầu ăn và 1 muỗng cà phê bột nêm, khuấy đều rồi nấu vừa chín tới như nấu cơm bình thường.\n" +
                "– Bạn trải cơm nếp đã nấu chín ra khay, dàn đều thành một lớp mỏng.(dùng tay để ép cơm hoặc 1 chai sạch lăn đều qua để cơm được nén chặt xuống khay).\n" +
                "– Khi cơm nếp đã nguội thì dùng màng bọc thực phẩm bọc kín khay cơm, cho vào tủ lạnh để qua đêm.( Việc cho cơm vào tủ lạnh sẽ làm cơm nếp se lại, cứng cáp và dễ sấy và tiết kiệm thời gian sấy trong lò rất nhiều.)\n" +
                "– Hôm sau, bạn mang cơm nếp ra cắt thành từng miếng vừa ăn rồi xếp cơm lên lên khay, sấy trong lò nướng ở 120 độ C trong vòng 45 phút.\n" +
                "– Trở mặt cơm nếp, sấy thêm 30- 40 phút cho cơm nếp khô hoàn toàn. Trong quá trình sấy, dùng cây đũa kênh cửa lò để hơi nước thoát ra, cơm sẽ mau khô hơn. (Nếu không có lò sấy, có thể bọc kín khay cơm nếp rồi phơi ra ngoài trời nắng trong vòng 1 – 2 ngày để cơm khô tự nhiên.)\n" +
                "– Đun nóng chảo dầu lửa nhỏ rồi thả từng miếng cơm nếp vào chiên vàng đều 2 mặt, để lên rổ có lót giấy thấm dầu.\n" +
                "– Pha nước mắm theo tỉ lệ 3-3-3, tức là 3 muỗng canh nước mắm + 3 muỗng canh đường + 3 muỗng canh nước lọc; khuấy đều thành hỗn hợp nước mắm mặn ngọt vừa sánh,thêm 1 thìa ớt bột vào, khuấy đều.\n" +
                "– Lấy ½ chén dầu cho vào chảo, đợi chảo nóng thì cho hành vào, đảo nhanh tay và tắt bếp ngay khi hành lá vừa chuyển qua màu xanh đậm, có mùi thơm.\n" +
                "– Xếp cơm cháy vừa chiên xong lên khay, rưới 1 lớp nước mắm đường, 1 lớp mỡ hành rồi rắc chà bông đều lên trên cùng là xong.");
        chebien4.add("Nguyên liệu:\n" +
                "\n" +
                "30 quả trứng cút lộn (hoặc 10 hột vịt lộn)\n" +
                "1 lạng me chín\n" +
                "Đậu phộng rang giã sơ\n" +
                "Rau răm\n" +
                "Tỏi băm nhuyễn\n" +
                "Hành củ: một phần băm nhuyễn, một phần thái lát.\n" +
                "Đường, nước mắm, gia vị\n" +
                "Mẩu gừng và chút ớt, giã nhuyễn\n" +
                "Cách làm:\n" +
                "\n" +
                "– Hành củ thái lát đem phi vàng với ít dầu rồi để ráo, chờ khi ăn mới dùng đến.\n" +
                "– Me cho vào chén với chút nước ấm, dằm cho ra nước me rồi bỏ xác và hột đi.\n" +
                "– Cút lộn /vịt lộn rửa cho sạch vỏ. Sau đó luộc chín trong nước.\n" +
                "– Trứng chín rồi thì nhẹ nhàng lột vỏ trứng.\n" +
                "– Bắc chảo lên bếp, phi thơm hành tỏi băm rồi cho trứng lộn chín vào xào săn.\n" +
                "– Tiếp đó cho nước cốt me vào, xào tới khi sôi được vài phút thì nêm đường, nước mắm và các gia vị khác cho vừa miệng (quan trọng là nêm đủ đường để cân bằng vị chua ngọt).\n" +
                "– Cho tiếp gừng giã nhuyễn vào, nấu tiếp vài phút nữa là xong.\n" +
                "– Tắt bếp, múc trứng lộn xào me ra dĩa, rưới sốt me trong chảo lên rồi rắc đậu phộng, rau răm. Ăn không hoặc chấm bánh mì đều ngon.");
        chebien4.add("Nguyên liệu: \n" +
                "Thịt nạc, mỡ phần, cốm non, trứng gà, nước mắm, hành khô, hạt tiêu.\n" +
                "\n" +
                "Cách làm:\n" +
                "– Xay thịt + mỡ cho nhuyễn rồi dùng máy đánh trứng quyện cho thịt mềm dẻo, thành giò sống. (Khâu này làm ngại nhất và không khéo thì thịt sẽ bị bở, chả không ngon. Nên tiện và đảm bảo nhất là mua thịt và mang đến hàng giò thuê xay, quện luôn)\n" +
                "– Đập trứng vào cốm trộn đều, để 1 lúc cho cốm mềm ra.\n" +
                "– Trong thời gian đợi cốm mềm, trộn thịt xay đã quện cùng nước mắm, hành khô, hạt tiêu và 1 ít dầu ăn. Sau đó, đổ cốm đã nở mềm vào trộn đều.\n" +
                "– Cho nước vào nồi đun sôi để hấp chả cốm. Đặt 1 chiếc rá vào nồi, lót lá sen lên trên vào xúc từng thìa hỗn hợp cốm thịt vào . Lấy thìa chỉnh miếng thịt, cốm cho tròn đẹp (Lười như em thì làm thế, chứ chịu khó thì nặn từng miếng tròn tòn, dẹt dẹt rồi hấp sẽ đẹp hơn)\n" +
                "– Hấp chả cốm chừng 10 – 15p cho chín. Sau đó cho lên chảo dầu sôi rán vàng.\n" +
                "– Chả cốm chấm nước mắm ớt ăn với cơm nóng hay bún đậu đều rất ngon.");
        chebien4.add("Nguyên liệu:\n" +
                "\n" +
                "– Tôm tươi: 300gr\n" +
                "– Ngô ngọt 1/2 bắp (hoặc 1/3 hộp ngô ngọt bán sẵn trong siêu thị), cà rốt: 1/2 củ, gừng, đậu.\n" +
                "– 2 thìa nhỏ bột ngô (hoặc bột năng), 4 thìa nhỏ bột chiên giòn\n" +
                "– Gia vị, hạt tiêu, muối, bột ngọt.\n" +
                "\n" +
                "Cách làm:\n" +
                "– Trộn đều hỗn hợp tôm băm nhỏ với bột ngọt hoặc bột năng đến khi quánh lại.\n" +
                "– Tiếp theo cho ngô nguyên lại, cà rốt, đậu, gừng băm nhỏ vào đảo đều với gia vị: 1/2 thìa cf muối, 1 thìa bột ngọt, 1 thìa tiêu.\n" +
                "– Cuối cùng bạn vo thành những viên tròn rồi chiên vàng trong chảo ngập dầu");
        chebien4.add("Nguyên liệu:\n" +
                "– Chân gà ( 500g )\n" +
                "– Sườn non, sườn sụn, thịt nạc vai ( 300g )\n" +
                "– Mật ong: 2 thìa\n" +
                "– Tỏi, ớt, gừng\n" +
                "– Nước hàng ( nước cốt dừa )\n" +
                "– Gia vị: mắm, muối, tiêu, đường.\n" +
                "\n" +
                "Cách làm:\n" +
                "– Vớt chân gà ra chặt làm 3 vừa dùng.\n" +
                "– Trộn đều chân gà + sườn non, sườn sụn, thịt lại vào xoong.\n" +
                "– Tẩm ướp gia vị 2 thìa mắm, 1/2 muối, 1 thìa đường, 2 thìa mật ong, 1 thìa nước hàng.\n" +
                "– Ướp khoảng 30′ rồi bắc lên bếp đun lửa to cho bùng lên rồi hạ nhỏ lửa liu diu đun cho đến khi phần nước hơi sền sệt ở đáy là thưởng thức được");
        chebien4.add("Nguyên liệu:\n" +
                "\n" +
                "Da heo\n" +
                "Đường\n" +
                "Ớt\n" +
                "Muối\n" +
                "Tỏi\n" +
                "Cách làm:\n" +
                "B1: Da heo đem vào luột sơ qua cho chín, sau đó đem ra lóc bớt mỡ đi (vì da càng mỏng thì nó sẽ càng phồng to ra)\n" +
                "B2: Cắt da heo thằng từng lắt nhỏ rửa sạch với nước lạnh thêm vài lần cho sạch\n" +
                "B3: Để cho ráo da heo rồi ướp da vị vào: gồm ớt, muối, đường (tùy sở thích và độ cay từng người mà bạn có thể tùy ý bỏ nhiều hay ít ớt, và đường cũng tùy người thích hay không)\n" +
                "B4: Đem đi phơi 2 lần nắng, 1 ngày mỗi lần vào buổi từ 10h tới 3h chiều là đẹp (khi nào thấy nó quéo lại là ok)\n" +
                "B5: Đem chiên trong chảo ngập dầu, lài dầu mới không nên dùng loại dầu chiên đi chiên lại nhiều lần làm mất mùi sau này.\n" +
                "B6: Phi tỏi ớt và để cho nó khô lại rồi bỏ vào cũng với da heo đã chiên xong để nguội, rồi bỏ vào trông thẩu nhựa (Nhớ xóc cho điều gia vị).");
        chebien4.add("Nguyên liệu để làm bánh tráng trộn:\n" +
                "\n" +
                "– Bánh tráng khô\n" +
                "– 1 quả xoài xanh\n" +
                "– 10 quả trứng cút\n" +
                "– 3 trái tắc (quả quất)\n" +
                "– 5gr ruốc khô giòn\n" +
                "– 40gr khô bò sợi\n" +
                "– Hành lá, hành tím\n" +
                "– Sa tế, dầu ăn, nước tương, muối Tây Ninh\n" +
                "– Rau răm\n" +
                "– Đậu phộng (lạc)\n" +
                "Hướng dẫn cách làm bánh tráng trộn\n" +
                "\n" +
                "Bước 1:\n" +
                "Đầu tiên, các ấy dùng kéo cắt bánh tráng thành các đoạn dài. Bánh tráng này mua ở siêu thị hay chợ đều có.\n" +
                " \n" +
                "Bước 2:Tiếp theo gọt vỏ xoài và bào thành sợi dài nhé.\n" +
                " \n" +
                "Bước 3:Bạn xắt hành tím thành lát mỏng rồi phi cho thật thơm.\n" +
                "\n" +
                "Bước 4:Mình pha sa tế với dầu ăn và thêm tí tóp mỡ chiên giòn nữa nha.\n" +
                "\n" +
                "Bước 5:Hành lá rửa sạch để ráo nước, thái nhỏ ra, dầu ăn nóng đổ vào để làm nước mỡ hành.\n" +
                "\n" +
                "Bước 6:Sau đó, bạn luộc trứng cút chín rồi bóc vỏ sạch sẽ, khô bò xé nhỏ ra.\n" +
                "\n" +
                "Bước 7:Chúng mình cho bánh tráng, xoài vào một cái đĩa có đáy sâu hoặc cái bát lớn đồng thời cho khô bò, ruốc khô, mỡ hành, nước sa tế vào bát.\n" +
                "\n" +
                "Rắc cho tí muối và nước tương vào trộn đều tay.\n" +
                "\n" +
                "Bước 8:Vắt thêm 1 trái tắc (quả quất) vào sẽ dậy mùi hơn.\n" +
                "\n" +
                "Bước 9:Cuối cùng, cho rau răm cắt nhỏ và đậu phộng (lạc) vào, trộn lại lần cuối là xong.");
        chebien4.add("Nguyên liệu: \n" +
                "Nõn đuôi lợn (heo) có một số vùng có tên gọi khác: Một số vùng lại gọi là Khấu linh, khu vực Bắc miền Trung (Thanh Hóa, Nghệ An, Hà Tĩnh,…) lại gọi là Nõn đuôi hay khấu đuôi,…: Cần lượng nõn đuôi dài tổng cộng khoảng 30-35cm (khoảng 300gr) – Thịt lợn (heo) băm nhỏ hoặc xay nhỏ. Nên chọn thịt nửa nạc, nửa mỡ để món ăn không bị khô và giá thành lại rẻ (như thịt ba chỉ, thịt má,.v.v…): 150-200gr Lượng thịt này cũng chỉ tương đối vì phụ thuộc vào nõn đuôi to hay nhỏ (nếu nõn đuôi có loại nhỏ thì chỉ cần khoảng 100-150gr) Có thể biến tấu bổ sung thêm một ít cuống họng hoặc sụn sống mũi băm thật nhỏ để khi ăn hơi giòn lật sật… – Rau húng quế (còn gọi là húng giổi, húng chó, húng vịt, húng lợn,…): đây là loại rau để tạo mùi vị chủ đạo của món dồi này. – Mộc nhĩ (nấm Mèo) ngâm nở. – Rau răm, hành lá, mùi tàu (ngò gai). – Hành củ băm – Nước mắm, gia vị (hoặc hạt nêm), hạt tiêu xay. – Để pha nước chấm: Nước mắm, hạt tiêu xay, tỏi băm nhỏ, tương ớt hoặc ớt, dấm (hoặc chanh) \n" +
                "Chế biến: Rửa sạch nõn đuôi bằng dấm hay muối, khi rửa phải bóp thật kỹ, vừa bóp vừa tuốt cho sạch nhớt cả bên ngoài và bên trong. Các loại rau (húng quế, rau răm, hành lá, mùi tàu) thái nhỏ. Hành củ, mộc nhĩ băm nhỏ. \n" +
                "Đun sôi nước, nêm chút muối, cho nõn đuôi vào luộc qua. – Trộn đều thịt băm, thịt sụn, mộc nhĩ băm, hành củ băm, các loại rau đã thái nhỏ, hạt tiêu, gia vị (mắm, muối) Ghi chú: Luộc qua để nõn đuôi bớt nhớt, bớt hôi và không bị phình không đều khi nhồi. Nếu nõn đuôi tươi, rửa sạch kỹ và nhồi đã có kinh nghiệm thì có thể không cần luộc qua. Đặc biệt nếu bước chế biến sau cùng không rán (chiên) mà nướng thì không cần luộc qua món ăn sẽ thơm hơn.\n" +
                "Buộc một đầu đoạn nõn đuôi, nhồi tất cả thịt đã trộn đều vào thành dồi, lưu ý vừa nhồi vừa vuốt cho đều nhân để món ăn trông tròn đều. Nhồi xong buộc chặt đầu còn lại. \n" +
                "Đun nước với chút muối cho món dồi nõn đuôi đã nhồi vào luộc, khi sôi giảm nhỏ lửa để dồi chín, lưu ý khi luộc thỉnh thoảng dùng tăm nhọn xăm lỗ để món dồi không bị phình và bục vỡ. Khi xăm không thấy nước đỏ chảy ra là dồi đã chín. Ghi chú: Nếu sau này không rán mà nướng thì có thể không cần luộc chín mà cho lên nướng ngay món ăn sẽ thơm hơn. \n" +
                "Nướng có thể các bạn nướng trong lò điện hoặc nướng trên bếp than hoa. \n" +
                "Mình chia sẻ thêm cách chiên món nõn đuôi nhồi cũng là một cách làm nhanh rút ngắn thời gian mà thành phẩm ra vẫn thơm ngon ạ!\n" +
                "Bắc chảo lên bếp, cho mỡ hay dầu ăn đun nóng già, cho dồi nõn đuôi vào rán (chiên) vàng, có thể chiên giòn bên ngoài tùy ý thích: \n" +
                "Món dồi thành phẩm có mùi thơm đặc trưng của lá húng quế. – Khi ăn thái mỏng, chấm với nước chấm pha mắm, tỏi, tương ớt, nước, dấm (hoặc chanh), hạt tiêu cho có vị chua cay, ngọt. Ăn kèm với rau húng quế.");
        chebien4.add("Nguyên liệu:\n" +
                "Cánh gà: 4 chiếc\n" +
                "Bột chiên xù, bột chiên giòn.\n" +
                "Trứng gà: 2 quả\n" +
                "Tỏi: 1 củ\n" +
                "Gia vị: Hạt tiêu, bột canh, mỳ chính.\n" +
                "Cách làm:\n" +
                "B1: Cánh gà ta đem rửa sạch với nước muối pha loãng, rửa sạch lại với nước. Ướp với 1 thìa cà phê mỳ chính + 1 thìa cà phê hạt tiêu và vài tép tỏi băm nhỏ. Ướp trong khoảng 15 phút cho thấm gia vị.\n" +
                "B2: Đập trứng gà ra bát, đánh tan. Đổ bột chiên giòn ra đĩa, lăn cánh gà qua bột chiên giòn tạo một lớp bột mỏng rồi nhúng qua trứng.\n" +
                "B3: Tiếp tục, lăn lại qua bột chiên xù. Cho cánh gà vào túi đựng thực phẩm bọc kín lại để trong tủ lạnh từ 30 – 40 phút cho bột bám chắc vào cánh rồi mới đem đi chiên vàng.\n" +
                "B4: Bắc chảo lên bếp. đổ dầu vào đun nóng rồi cho cánh gà vào chiên. Lúc đầu chiên để lửa to cho bột bám vào cánh. Sau đó, hạ nhỏ lửa xuống chiên để cho cánh được chín đều bên trong. Cuối cùng, vớt ra giấy thấm dầu cho hút hết dầu thừa.");
        chebien4.add("Nguyên liệu:\n" +
                "– Cánh gà hoặc đùi gà: 400gr\n" +
                "– Sả: 5-7 củ, tỏi, hành: 3-4 tép.\n" +
                "– Gia vị: Ớt bột hay ớt sa tế, muối, đường, mật ong, dầu hào.\n" +
                "\n" +
                "Cách làm:\n" +
                "– Cánh gà rửa sơ, bạn có thể chặt làm đôi, dùng dao khứa vài đường lên thân cánh gà để khi ướp nhanh thấm gia vị hơn.\n" +
                "– Trần cánh gà qua nước sôi khoảng 5p để loại bỏ chất bẩn bám ngoài.\n" +
                "– Sả bỏ lớp vỏ bên ngoài, băm nhỏ.\n" +
                "– Cho cánh gà vào âu sạch, thêm hỗn hợp gia vị: tương ớt hay ớt sa tế, 1 thìa canh mật ong, sả băm, 2 thìa cf muối, 1 thìa dầu hào, 1 thìa cf đường rồi trộn đều, ướp qua đêm hay ướp từ 4 đến 5 tiếng.\n" +
                "– Xếp cánh gà vào khuôn nướng (khi bạn nướng thì phần sả băm bên ngoài sẽ nhanh bị cháy hơn do đó bạn phải lót giấy nướng để phần thịt cánh gà không bị dính vào đáy khuôn.) Dùng thìa phết hỗn hợp nước sả ướp lên bề mặt cánh gà.\n" +
                "– Nướng ở nhiệt độ 190 độ C khoảng 20-25 phút mỗi mặt, lật cánh gà cho đến khi phần cánh gà chín vàng.");
        chebien4.add("Nguyên liệu:\n" +
                "– Bánh gạo: 200gr\n" +
                "– Ớt Gochujang: 1 thìa; ớt bột: 1/2 thìa\n" +
                "– Gia vị: Xì dầu: 1 thìa; Đường: 1 thìa; Nước lọc: 1 thìa; Muối: 1/2 thìa; Mắm: 1/2 thìa\n" +
                "– Tỏi tây, dầu ăn, Vừng rang, trứng cút\n" +
                "\n" +
                "Cách làm:\n" +
                "– Luộc bánh gạo cay trong nước sôi khoảng 2p. rồi vớt ra rổ xả nước lạnh cho khỏi bị dính.\n" +
                "– Bí quyết để bánh gạo cay ngon là nước sốt chua cay. Các bạn trộn tất cả hỗn hợp gồm ớt Gochujang, ớt bột, xì dầu, đường, nước lọc vào bát, khuấy cho đường tan, nêm vừa miệng là được\n" +
                "– Đun nóng một ít dầu ăn ở chảo, phi tỏi thơm, cho bánh gạo ở bước 1 vào đảo khoảng 2 phút.\n" +
                "– Cho tiếp hỗn hợp bát tương ớt đã pha ở bước 2 vào đảo đều, xào khoảng 4-6 phút đến khi hỗn hợp tương ớt bám đều quanh bánh gạo.\n" +
                "– Tắt bếp, cho vừng rang chín vào đảo đều, đổ ra đĩa dùng nóng, trang trí với một ít tỏi tây thái nhỏ,trứng cút bổ đôi lên bề mặt.");
        chebien4.add("Nguyên liệu:\n" +
                "\n" +
                "– Thịt nạc vai: 400gr\n" +
                "– Cà rốt, hành tây: 1 củ\n" +
                "– Gia vị: mắm, muối, bột ngọt, đường, mật ong, tiêu\n" +
                "– Ngũ vị hương: 2 gói.\n" +
                "– Que xiên thịt\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "– Tẩm ướp thịt với gia vị: 1 thìa mắm, 1/2 thìa muối, 1 thìa đường, 1 thìa mật ong, 1 thìa tiêu, 1/2 thìa bột ngọt.\n" +
                "– Để ngấm khoảng 15-30p rồi cho ngũ vị hương vào đảo đều.\n" +
                "– Bắt đầu xiên thịt, cà rốt, hành tây xen kẽ nhau.\n" +
                "– Cuối cùng nớng thịt trong lò nướng 30 phút ở 200 độ C. (Bạn có thể chiên thịt bằng chảo dầu nhé)");
        chebien4.add("Nguyên liệu:\n" +
                "\n" +
                "– Khoai môn: 1kg\n" +
                "– 5 lạng khoai lang Nhật (giống khoai tím)\n" +
                "– 3 thìa Mayonnaise\n" +
                "– 7 lạng đậu xanh đã tách vỏ\n" +
                "– 1 quả trứng gà\n" +
                "– 5 thìa bột mì\n" +
                "– bột chiên xù: 1 gói\n" +
                "\n" +
                "Cách làm:\n" +
                "– Sau khi khoai đã nghiền nhuyễn. Ta cho hỗn hợp trứng, bột mì vào khuấy tơi.\n" +
                "– Nặn khoai thành hình tròn kích thước vừa dùng. Tương tự ta nặn nhân đậu xanh kích thước bằng 1/2 khoai môn.\n" +
                "-Tiếp đó ta năn khoai qua bột chiên xù. Cất trong ngăn đá khoảng 30p cho khoai cứng lại.\n" +
                "– Cuối cùng ta chiên khoai cho vàng giòn vỏ bên ngoài là đã hoàn thành.");
        chebien4.add("Nguyên liệu:\n" +
                "– Khoai tây: 2 củ\n" +
                "– Bơ: 30gr\n" +
                "– Lòng đỏ trứng: 4 lòng\n" +
                "– Gia vị: 1/2 thìa muối, 1 thìa tiêu;\n" +
                "– Cà rốt: 1/2 củ\n" +
                "– 350ml kem whipping\n" +
                "Cách làm:\n" +
                "– Hấp khoai khoảng 10p cho khoai chín nhừ rồi nghiền nhuyễn. (Bạn cũng có thể cho khoai vào lò quay trong thời gian 8 phút)\n" +
                "– Để khoai tây nguội, sau đó cho 20gr bơ tan chảy, lòng đỏ trứng, muối, bột tiêu đen và 250ml kem whipping vào âu khoai trộn đều cho 2 hỗn hợp sánh quyện vào nhau.\n" +
                "– Cho hỗn hợp khoai vào túi bắt bông kem. (Lắp đui tùy chọn, bạn có loại nào dùng luôn loại đó cũng được nhé, mỗi đui sẽ cho ra 1 hình dạng khác nhau bắt mắt.\n" +
                "– Lót giấy nến lên khay nướng, bóp khoai thành dạng hình nón với kích thước vừa dùng.\n" +
                "– Đánh 1 quả trứng và phần kem whipping còn lại. rồi quét hỗn hợp này lên khoai tây hình xoắn ốc.\n" +
                "– Bật lò ở 180 độ C, nướng khoảng 20 phút là được.");
    }
    public void thit(){
        stringArrayList5.add("Thịt heo chiên xóc tỏi");
        stringArrayList5.add("Thịt heo hầm cà rốt");
        stringArrayList5.add("Thịt heo bọc sả chiên giòn");
        stringArrayList5.add("Thịt heo rang muối ớt");
        stringArrayList5.add("Thịt heo kho mắm ruốc");
        stringArrayList5.add("Thịt heo kho tàu");
        stringArrayList5.add("Thịt heo cuộn măng hầm");
        stringArrayList5.add("Thịt heo kho củ cải trắng");
        stringArrayList5.add("Thịt heo xào lăn");
        stringArrayList5.add("Thịt heo kho gừng");
        stringArrayList5.add("Thịt heo xào chua ngọt");
        stringArrayList5.add("Thịt heo giả cầy");
        stringArrayList5.add("Thịt heo xào sả ớt");
        stringArrayList5.add("Thịt heo xào hành tây");
        stringArrayList5.add("Thịt heo xào cải chua");
        stringArrayList5.add("Thịt heo xá xíu");
        stringArrayList5.add("Thịt heo kho thơm");
        stringArrayList5.add("Thịt heo nướng chao");
        stringArrayList5.add("Thịt heo nướng mật ong");
        stringArrayList5.add("Thịt heo rang tôm");

        anh5.add(R.drawable.sachanh);
        anh5.add(R.drawable.hapgung);
        anh5.add(R.drawable.caibexanh);
        anh5.add(R.drawable.tuongbot);
        anh5.add(R.drawable.giavi);
        anh5.add(R.drawable.muoixa);
        anh5.add(R.drawable.luot);
        anh5.add(R.drawable.trungcuontom);
        anh5.add(R.drawable.tomhapnam);
        anh5.add(R.drawable.trungcuontom);
        anh5.add(R.drawable.ab_trungganuong);
        anh5.add(R.drawable.dauphunhoitom);
        anh5.add(R.drawable.trungcuontom);
        anh5.add(R.drawable.tranglonhapgungram);
        anh5.add(R.drawable.ngheuhap);
        anh5.add(R.drawable.echhapbido);
        anh5.add(R.drawable.muchapthai);
        anh5.add(R.drawable.tomhapnam);
        anh5.add(R.drawable.dauphunhoitom);
        anh5.add(R.drawable.a2);

        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "500g thịt ba chỉ\n" +
                "100g bột bắp\n" +
                "Nước mắm\n" +
                "Nước ép tỏi\n" +
                "Tỏi phi\n" +
                "Đường, tiêu\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "Mẹo lựa thịt heo ngon\n" +
                "\n" +
                "Thịt ba chỉ chị em lựa miếng ngon không quá mỡ, cũng không quá nạc, miếng thịt ngon thường bên ngoài sẽ có lớp màng khô, phần bên trong sẽ săn lại, mặt cắt thịt thường có màu hồng sáng, mềm mại.\n" +
                "\n" +
                "Bước 1: Chị em rửa sạch với muối để khử mùi hôi, rửa lại với nước, sau đó thái sợi miếng vừa ăn.\n" +
                "\n" +
                "Ướp thịt với 3 thìa cà phê nước mắm, 1 thìa đường, ½ thìa tiêu, 1 thìa bột bắp, sau đó dùng bao tay trộn đều, ướp trong 15 phút để thịt thấm gia vị.\n" +
                "\n" +
                "Bước 2: Chiên vàng giòn phần thịt đã ướp, sau đó cho ra dĩa có giấy thấm dầu để giúp thịt không bị quá ngậy.\n" +
                "\n" +
                "Bước 3: Thịt chiên xong chị em đem xóc đều với tỏi phi sẵn trước đó, dọn ra dĩa, trang trí thêm một ít xà lách và dưa leo tỉa hoa để món ăn thêm bắt mắt");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "400g thịt ba chỉ\n" +
                "1 củ cà rốt\n" +
                "1 lát gừng\n" +
                "Hành lá\n" +
                "2 tép tỏi\n" +
                "Nước màu, nước mắm, hoa hồi\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Thịt ba chỉ rửa sạch, thái miếng vừa ăn.\n" +
                "\n" +
                "Gừng chị em cạo vỏ, thái lát, hành lá bỏ rể, rửa sạch, thái nhỏ phần đầu hành, tỏi bóc vỏ, thái nhỏ.\n" +
                "\n" +
                "Cà rốt gọt vỏ thái miếng dày 1cm, có thể tỉa hoa để món ăn thêm đẹp mắt.\n" +
                "\n" +
                "Bước 2: Luộc thịt cùng ½ củ gừng và hoa hồi để giảm mùi hôi và giúp thịt thơm ngon hơn.\n" +
                "\n" +
                "Sau khi thịt sôi, vớt ra để ráo và rửa lại lần 2 với nước sạch, để ráo\n" +
                "\n" +
                "Sau đó cho thịt vào chảo chống dính bật bếp đến khi thịt vàng cạnh thì tắt bếp\n" +
                "\n" +
                "Tiếp theo cho ít nước màu và nước mắm vào đảo đều để thịt lên màu, nước màu sôi thì chị em cho hành, tỏi, gừng và cà rốt vào đảo 5 phút.\n" +
                "\n" +
                "Cho ít nước vào xăm xắm thịt đun to lửa đến khi thịt sôi thì giảm dần, để lửat riu riu trong 40 phút, đến khi thấy thịt mềm, cạn còn ⅓ nước thì nêm gia vị vừa miệng là hoàn thành.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "300g thịt lợn xay nhuyễn\n" +
                "2 củ hành khô\n" +
                "1 củ tỏi\n" +
                "8-10 cây sả\n" +
                "1 thìa cà phê tiêu\n" +
                "1 thìa cà phê đường\n" +
                "Dầu ăn\n" +
                "1 thìa nước mắm\n" +
                "1 thìa bột năng\n" +
                "Một ít bột ngọt (nếu cần)\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Sả chị em rửa sạch, cắt phần gốc, lá già, băm nhỏ 1-2 củ, phần còn lại để khúc dài sau đó đập giập nhẹ để món ăn thơm và dậy mùi hơn.\n" +
                "\n" +
                "Hành khô chị em bóc vỏ và băm nhuyễn.\n" +
                "\n" +
                "Bước 2:  Thịt xay chị em cho vào tô thêm ít hành, tỏi, sả băm cùng gia vị (đường, hạt nêm, nước mắm, tiêu, bột năng, 1 thìa dầu ăn), dùng bao tay trộn đều và ướp thịt trong 20 phút để thấm gia vị.\n" +
                "\n" +
                "Bước 3: Chị em tiến hành nặn chả bằng cách xúc 1 thìa thịt lên cho vào lòng bàn tay rồi dàn mỏng, sau đó đặt 1 cây sả vào giữa, gói thịt lại cho chặt tay đến khi thịt bám vào quanh cây sả là được, cứ như thế làm đến hết (lưu ý không nên nặn chả quá to sẽ khó chín khi chiên)\n" +
                "\n" +
                "Bước 4: Cho dầu vào chảo chiên vàng đều các cây chả, sau đó vớt ra để ráo dầu, bày ra dĩa, thêm ít rau ngò trang trí.\n" +
                "\n" +
                "Món này có thể ăn với cơm, bún chấm cùng tương ớt hoặc nước mắm đều ngọt tuyệt đấy nhé!");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "250g thịt ba chỉ\n" +
                "30g tỏi băm\n" +
                "1 củ sả băm\n" +
                "30g ớt băm (ớt đỏ và ớt xanh)\n" +
                "Muối, hạt nêm\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1:  Để làm món thịt heo rang muối ớt ngon, chị em nên lựa loại ba chỉ heo hơi mỡ tí xíu, sau đó rửa sạch, thái khúc vừa ăn (đừng thái quá mỏng khi chiên thịt sẽ co rúm lại), để ráo.\n" +
                "\n" +
                "Bước 2: Chị em cho thịt vào chảo rang đến khi thịt ra mỡ, hơi vàng và thịt săn lại thì cho tỏi băm vào đảo đều từ 2-3 phút thì cho tiếp sả và ớt băm vào, lúc này nên để lửa riu riu nhỏ, cho thêm ít muối và hạt nêm đảo đều đến khi thịt thấm gia vị thì tắt bếp, dọn ra dĩa.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "200g thịt ba chỉ\n" +
                "45g mắm ruốc\n" +
                "4 cây sả băm nhỏ\n" +
                "1 củ hành khô băm nhỏ\n" +
                "2 quả ớt tươi băm nhỏ\n" +
                "Đường\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Đối với món thịt heo kho mắm ruốc chị em nên chọn phần thịt ba chỉ hơi nạc một xíu để món ăn ngon hơn.Sau đó rửa sạch thịt, cắt khúc vừa ăn là được\n" +
                "\n" +
                "Bước 2: Pha mắm ruốc với 2 thìa nước sôi, khuấy đều, để mắm ruốc sạch hơn chị em nên ray lạ, sau đó cho mắm ruốc ra chén.\n" +
                "\n" +
                "Bước 3: Thêm 2 thìa đường vào chén mắm ruốc rồi khuấy tan\n" +
                "\n" +
                "Bước 4: Phi thơm hành khô trong chảo dầu, sau đó cho thêm sả băm vào đảo đều, tiếp đó cho thịt vào xào cùng đến khi thịt săn thì cho mắm ruốc vào cùng ớt, kho đến khi nồi thịt sốt keo lại là được.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "500g thịt ba chỉ (hoặc thịt chân giò)\n" +
                "3 củ hành khô\n" +
                "1 củ tỏi\n" +
                "1 quả dừa tươi\n" +
                "10 quả trứng cút (3-4 quả trứng gà)\n" +
                "Hành lá\n" +
                "Đường nâu\n" +
                "Nước hàng kho thịt\n" +
                "Muối\n" +
                "Nước mắm, mì chính, dầu ăn, hạt tiêu\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Thịt ba chỉ chị em lựa miếng không quá nạc khi nấu sẽ bị khô, nên chọn miếng có phần mỡ khi nấu thịt sẽ mềm và ngon ngậy hơn.\n" +
                "\n" +
                "Mua về, chị em rửa sạch, có thể ngâm với nước muối loãng từ 3-5 phút để thịt sạch và đỡ mùi hơn, sau đó để ráo.\n" +
                "\n" +
                "Hành khô bóc vỏ, băm nhỏ, hành lá rửa sạch, cắt khúc. Dừa bổ lấy nước, cùi dừa thái lát mỏng cho ra bát.\n" +
                "\n" +
                "Bước 2: Ướp thịt với ít hành khô băm, 1 thìa mì chính, 2 thìa nước mắm, 2 thìa dầu ăn, 1 thìa hạt tiêu trong 30 phút để thịt thấm gia vị.\n" +
                "\n" +
                "Bước 3: Luộc trứng (có thể cho thêm ít muối, dấm để trứng nhanh chín và dễ bóc sau khi luộc). Trứng chín, vớt ra, bóc vỏ và cho ra bát riêng.\n" +
                "\n" +
                "Bước 4: Chị em tiến hành thắng nước hàng (có thể mua ngoài chợ nhưng tự làm sẽ an toàn và ngon hơn nhiều).\n" +
                "\n" +
                "Cho 3 thìa đường nâu vào chảo, 4 thìa nước và khuấy đều. Cho chảo đường lên bếp, để lửa vừa, nấu đến khi đường sôi và chuyển sang màu nâu cánh gián, nước sánh lại thì tắt bếp, đổ ra bát riêng.\n" +
                "\n" +
                "Bước 5: Cho 2 thìa dầu vào nồi, phi thơm với phần tỏi băm còn lại, cho thêm ½ thìa nước mắm đến món ăn đậm vị.Trút thịt đã ướp vào nồi cùng cùi dừa đảo đều đến khi thịt săn lại thì cho 2 thìa nước hàng vào đảo cùng.\n" +
                "\n" +
                "Đổ nước dừa tươi vào xâm xấp mặt thịt là được, vặn lửa to để nồi thịt sôi, sau đó vặn nhỏ để thịt kho chín mềm. Trong quá trình kho bạn không nên đậy vụng để thịt chín mềm và không bị nát, có thể hớt phần bọt trên để thịt kho trong hơn và có vị thanh.\n" +
                "\n" +
                "Để lửa riu riu kho trong 30 phút, nước cạn có thể cho thêm phần nước dừa vào, nêm nếm gia vị vừa ăn đến khi thịt chuyển sang màu nâu đỏ thì cho trứng cút vào, nấu thêm 2-3 phút nữa thì tắt bếp.\n" +
                "\n" +
                "Cho thịt ra dĩa, rưới phần nước kho thịt nâu óng sóng sánh lên để thêm hấp dẫn, cùng 1 ít cọng rau mùi, ớt đỏ để thêm bắt mắt.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "6 dải thịt heo thái mỏng\n" +
                "1 cây măng\n" +
                "1 hộp nấm ngọc chấm xám\n" +
                "2 nhánh hành lá\n" +
                "Bột bắp, dầu hào, gia vị\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Măng chị em gọt vỏ, luộc chín và vớt ra ngâm với nước lạnh. Sau đó thái miếng nhỏ hình chữ nhật.\n" +
                "\n" +
                "Nấm ngâm với muối rồi rửa sạch, bỏ gốc.\n" +
                "\n" +
                "Hành lá rửa sạch cắt khúc\n" +
                "\n" +
                "Bước 2: Trải từng miéng thịt lên khay phẳng, rắc một chút bột bắp và gia vị, xếp lần lượt măng, nấm, hành lá vào cuộn tròn.\n" +
                "\n" +
                "Bước 3: Cho ít dầu vào chảo, đặt từng miếng thịt cuộn vào và chiên vàng đều.\n" +
                "\n" +
                "Bước 4: Hòa tan bột bắp và dầu hào vào 1 chén nhỏ rồi đổ vào chảo riêng đun tới khi sôi hơi sánh lại là được.\n" +
                "\n" +
                "Bước 5: Xếp từng phần thịt cuộn đã chiên chín ra dĩa, rưới sốt lên trên là xong.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "400g thịt ba chỉ\n" +
                "2 củ cải trắng\n" +
                "1 muỗng đường\n" +
                "Hành khô, nước nắm, hạt nêm\n" +
                "1 trái ớt\n" +
                "Hành lá\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Thịt ba chỉ nên lựa loại da mỏng, mỡ trắng, giòn, sau đó rửa sạch với nước muối loãng để thịt sạch hơn và để ráo.\n" +
                "\n" +
                "Cắt thịt thành từng miếng dày vừa ăn ướp với ít nước mắm, hạt nêm, mì chính, tiêu, hành khô đập giập trong 30 phút để thịt thấm gia vị.\n" +
                "\n" +
                "Bước 2: Trong khi đợi thịt thấm gia vị chị em làm nước màu bằng cách cho đường vào chảo nhỏ, đun đến khi đường chuyển sang màu nâu thì cho thêm ít nước đến khi sền sệt là được.\n" +
                "\n" +
                "Bước 3: Củ cải gọt vỏ, rửa sạch, thái khoanh vừa ăn, sau đó xốc với ít muối, sau đó cho vào cùng thịt ướp trong 15 phút,\n" +
                "\n" +
                "Bước 4: Cho thịt và củ cải vào nồi bật lửa vừa phải đến khi thịt hơi săn thì thêm ít nước vừa ngập thịt và củ cải là được.\n" +
                "\n" +
                "Sau đó đun sôi lần 2 thì nêm nếm gia vị vừa ăn, để lửa riu riu tới khi thịt và củ cải mềm, thêm ít ớt sừng để tăng vị cay nếu thích.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "300g thịt ba chỉ (chọn thịt có nạc, mỡ và bì)\n" +
                "4 củ sả\n" +
                "2 quả ớt\n" +
                "1 củ tỏi\n" +
                "1 củ hành khô\n" +
                "Muối, hạt tiêu, dầu ăn, dầu hào\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Thịt ba chỉ chị em rửa sạch, để ráo và thái miếng mỏng hoặc to vừa ăn.\n" +
                "\n" +
                "Sả bóc lớp ngoài, thái chéo mỏng\n" +
                "\n" +
                "Ớt rửa sạch, bổ dọc bỏ hạt và thái chéo mỏng\n" +
                "\n" +
                "Tỏi, hành bóc vỏ băm nhuyễn\n" +
                "\n" +
                "Uớp thịt với ít sả, ớt, 1 thìa dầu hào, 1 thìa muối, 1 thìa hạt tiêu trong 20 phút để thịt thấm gia vị.\n" +
                "\n" +
                "Bước 2: Phi thơm tỏi, cho thịt vào xào đều đến khi thịt hơi săn thì thêm ít muối vừa ăn thì tắt bếp, dọn ra dĩa với ít hành, ngò để món ăn thêm đẹp mắt.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "500g thịt ba chỉ ngon\n" +
                "1 củ gừng, hành khô, ớt mau\n" +
                "Đường, bột canh, nước mắm, hạt tiêu\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Ba chỉ chị em chọn phần không bị long, phần mỡ và nạc ngang nhau, sát muối quanh thân thịt, trần qua nuóc nóng thật sạch, sau đó thái từng miếng tầm 3cm.\n" +
                "\n" +
                "Ướp thịt với ít đường, nước mắm trong 30 phút để thịt thấm gia vị.\n" +
                "\n" +
                "Bước 2: Gừng chị em cạo sạch vỏ, rửa sạch với nước và thái mỏng.\n" +
                "\n" +
                "Phi thơm dầu với hành tím, gừng, cho thịt vào xào cùng thêm ít ớt màu đảo đều để thịt thấm gia vị, đậy nắp vung để nước thịt chảy ra, đun đến khi cạn, phần mỡ hòa với đường tạo thành màu nâu cánh gián là được.\n" +
                "\n" +
                "Món thịt heo kho gừng thích hợp ăn cùng cơm nóng trong những ngày se lạnh, mưa sẽ vô cùng ngon.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "300g thịt heo\n" +
                "Gừng, trứng gà, ớt chuông, thơm, cà rốt, hành tây\n" +
                "Sốt cà chua, bột mì, bột nở, giấm gạo\n" +
                "Dầu hào, bột khoai tây, dầu ăn, nước tương, đường, muối\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Trước tiên thịt heo rửa sạch, cắt thành những viên nhỏ vừa ăn. Ướp thịt với 1 muỗng nước tương, 1 muỗng dầu hào, ¼  muỗng nước gừng khoảng 30 phút.\n" +
                "\n" +
                "Bước 2: Ta làm nước sốt chua ngọt trong khi thịt đang ướp, gồm 1 chén nước, nửa chén giấm gạo, 3 muỗng đường, 2 muỗng bột khoai tây, ¼ muỗng muối. Nấu hỗn hợp này trên bếp cho tới khi nước sốt sền sệt lại là tắt bếp.\n" +
                "\n" +
                "Bước 3: Trộn bột mì và bột khoai tây theo tỉ lệ 2:1 cùng nửa muỗng bột nở, cho thêm nước vào đánh đều tay cho thành hơi lỏng. Đập trứng ra tô đánh tan lòng đỏ rồi đổ chung vào hỗn hợp bột đánh đều một lần nữa, nếu bị đặc thì cứ cho thêm nước vào để lỏng ra.\n" +
                "\n" +
                "Bước 4: Đun nóng với lửa vừa lượng dầu ngập đáy chảo, thịt heo nhúng qua bột và dầu ăn rồi cho vào chảo chiên vàng hai mặt rồi vớt ra. Sau thịt thì chiên ớt chuông, hành tây, thơm, cà rốt đã cắt nhỏ và đảo cho chín tới là vớt ra.\n" +
                "\n" +
                "Bước 5: Cho cả thịt và rau củ đã chiên vào chung với nước sốt, nấu nhỏ lửa cho tới khi thịt và rau đều ngấm sốt thì tắt bếp, dọn ra dĩa.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "500g chân giò heo hoặc thịt ba chỉ\n" +
                "Củ riềng, nghệ tươi, sả, ớt\n" +
                "Mẻ, mắm tôm\n" +
                "Muối, nước mắm, bột ngọt, hạt nêm\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Củ riềng, sả, ớt rửa sạch rồi cắt nhỏ hoặc thái lát. Nghệ gọt vỏ rồi giã nát để lấy nước.\n" +
                "\n" +
                "Bước 2: Thịt heo rửa sạch, đem nướng cho xém phần da một tí. Sau đó đem rửa lại và cắt thành từng miếng nhỏ. Nếu nấu bằng chân giò, dùng rơm thui vàng chân giò hoặc cho vào lò vi sóng nướng sao cho vàng. Sau khi nướng xong cũng đem rửa sạch, cạo cháy và chặt thành từng miếng vừa ăn.\n" +
                "\n" +
                "Bước 3: Ướp thịt đã cắt nhỏ với riềng đã xay nhuyễn, mẻ, mắm tôm, nước nghệ, bột ngọt, ớt, hạt nêm trong khoảng 30 phút.\n" +
                "\n" +
                "Bước 4: Đun nóng dầu trong nồi, cho thịt đã ướp vào đảo đều cho tới khi thịt hơi săn lại. Tiếp theo cho khoảng ⅔ nước ngập thịt rồi cho lửa nhỏ nấu tới khi thịt chín mềm là tắt bếp");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "300g thịt ba chỉ\n" +
                "4 cây sả, 2 trái ớt, tỏi, hành tím\n" +
                "Muối, tiêu, dầu ăn, dầu hào\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Thịt đem rửa sạch, để ráo nước rồi cắt miếng nhỏ vừa ăn.\n" +
                "\n" +
                "Bước 2: Sả, ớt rửa sạch rồi cắt nhỏ. Tỏi, hành tím lột vỏ rồi đem băm.\n" +
                "\n" +
                "Bước 3: Ướp thịt với sả, ớt cắt nhỏ, dầu hào, muối, tiêu trong khoảng 20 phút.\n" +
                "\n" +
                "Bước 4: Phi thơm hành, tỏi băm với dầu nóng, cho thịt vào xào đều tay. Khi thịt gần chín nêm lại gia vị cho vừa ăn tùy khẩu vị từng nhà. Tiếp tục xào đến khi thịt chín thì cho ra dĩa, ăn với cơm nóng.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "300 thịt heo\n" +
                "2 củ hành tây, hành tím\n" +
                "Hạt nêm, bột ngọt, nước mắm, tiêu, dầu hào\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Thịt heo rửa sạch rồi cắt thành miếng mỏng vừa ăn. Ướp thịt với nước mắm, hạt nêm, bột ngọt, dầu hào, hành tím băm trong 20 phút.\n" +
                "\n" +
                "Bước 2: Hành tây lột vỏ, cắt thành miếng cau rồi tách từng lá.\n" +
                "\n" +
                "Bước 3: Cho dầu ăn vào chảo đun nóng, tiếp đó cho thịt vào xào. Tới khi thịt bắt đầu có màu vàng thì cho hành tây vào xào cùng. Cứ xào cho tới khi hành có màu vàng và chín thì tắt bếp. Dọn món ra dĩa và rắc tiêu xay lên cho hấp dẫn.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "300g thịt ba chỉ\n" +
                "1 chén cải chua\n" +
                "Hành lá, ớt, tỏi, hành tím\n" +
                "Đường, nước mắm, hạt nêm, tiêu\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Thịt heo sau khi rửa sạch, để ráo, cắt thành miếng nhỏ vừa ăn. Ướp thịt với hành tím băm, nước mắm và hạt nêm.\n" +
                "\n" +
                "Bước 2: Cải chua cắt nhỏ. Hành, tỏi, ớt rửa sạch và băm nhỏ.\n" +
                "\n" +
                "Bước 3: Cho dầu và đường vào chảo để thắng với lửa nhỏ. Tới khi đường đổi màu vàng cánh gián thì cho tỏi, ớt băm vào xào thơm.\n" +
                "\n" +
                "Bước 4: Cho thịt vào xào đều tay khoảng 6-7 phút thì cho tiếp cải chua vào, để lửa nhỏ rim cho tới khi cải chua cũng thấm gia vị thì đảo một lần nữa. Thịt chín thì tắt bếp dọn ra dĩa cho tiêu lên.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "400g thịt heo nạc vai hoặc mông\n" +
                "Tỏi, mật ong, ngũ vị hương\n" +
                "Dầu hào, nước tương, đường, dầu ăn, muối, tiêu, dầu mè\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Thịt heo đem rửa sạch, để ráo, sau đó cắt thành những miếng to bản.\n" +
                "\n" +
                "Bước 2: Tỏi lột vỏ rồi băm nhỏ. Trộn tất cả gia vị gồm: tỏi, 2 muỗng dầu hào, 2 muỗng nước tương, 3 muỗng mật ong, 4 muỗng đường, 1 muỗng ngũ vị hương, 1 muỗng dầu ăn, ít muối, tiêu, dầu mè. Sau đó cho vào chảo để lửa nhỏ khuấy đều cho tan hết vừa sôi thì tắt bếp, để nguội.\n" +
                "\n" +
                "Bước 3: Ướp thịt với nước sốt đã nguội, để thịt ngon hơn nên ướp 1 ngày hoặc qua đêm. Nếu không có thời gian cũng phải ướp ít nhất là 3 tiếng.\n" +
                "\n" +
                "Bước 4: Khi đã ướp xong cho thịt lên lò nướng điện hay than đều được. Nướng đều cho tới khi thịt chín vàng cả hai mặt thì có thể đem cắt thành những miếng mỏng vừa ăn dọn ra dĩa.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "300g thịt ba chỉ\n" +
                "Nửa trái thơm\n" +
                "3 củ hành tím, 1 trái ớt\n" +
                "Hạt nêm, nước mắm, tiêu, nước màu\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Thịt heo rửa sạch, cắt thành những miếng vuông vừa ăn. Ướp thịt với 1 muỗng nước màu, 1 muỗng nước mắm, ít tiêu xay, 1 muỗng hạt nêm, hành tím băm trong khoảng 20 phút.\n" +
                "\n" +
                "Bước 2: Thơm sau khi cắt vỏ và mắt, cũng cắt thành những miếng vuông nhưng dày hơn thịt. Hành tím lột vỏ, băm nhỏ. Ớt bỏ hột, cắt nhỏ.\n" +
                "\n" +
                "Bước 3: Phi thơm hành với dầu ăn, cho thịt heo vào đảo đều. Khi thịt săn lại, cho nước vào hầm với thịt.\n" +
                "\n" +
                "Bước 4: Khi nước sôi, cho ớt vào và để lửa nhỏ. Nấu cho tới khi nước đã cạn đi bớt thì cho thơm vào. Kho thêm 15 phút thì tắt bếp.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "500g thịt heo vai hoặc bắp đùi\n" +
                "5 viên chao\n" +
                "Dầu ăn, sa tế, đường, bột ngọt, nước\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Thịt heo rửa sạch, để ráo, cắt thành những miếng mỏng vừa ăn. Ướp thịt với chao, 3 muỗng sa tế, 2 muỗng nước cốt tỏi, 2 muỗng đường, 2 muỗng dầu ăn, 1 muỗng bột ngọt trong khoảng 3-4 tiếng.\n" +
                "\n" +
                "Bước 2: Nướng thịt đã ướp với lò vi sóng hoặc lò than đều được. Nếu nướng với lò vi sóng thì chỉnh thời gian là 15 phút rồi lấy ra để quét thêm một lớp sa tế lên bề mặt thịt cho màu đẹp mắt, thấm vị. Nướng lò than cũng phải quét lớp sa tế lên thịt khoảng 2-3 lần.\n" +
                "\n" +
                "Bước 3: Khi thịt chín, xếp thịt lên dĩa, có thể trang trí thêm cà chua, dưa leo cho đẹp mắt, ăn ngon miệng hơn.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "2 miếng thịt cổ lợn (500g)\n" +
                "1 cây sả\n" +
                "4 tép tỏi\n" +
                "3 củ hành tóm\n" +
                "1 cuốn cây rau mùi\n" +
                "2 thìa xì dầu\n" +
                "2 thìa nước mắm\n" +
                "2 thìa đường nâu\n" +
                "1 thìa nước cốt chanh\n" +
                "Mật ong\n" +
                "Lá chanh\n" +
                "Nước chấm (2 thìa nước mắm, 2 thìa nước cốt chanh, 1 trái ớt cắt khoanh, 1 thìa nước, 1 thìa đường nâu)\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Thịt cho em rửa sạch, để ráo, sau đó bọc khay nướng thịt với giấy bạc (nên làm nóng lò ở 200 độ C trước)\n" +
                "\n" +
                "Bước 2: Băm nhỏ sả,ớt, lá chanh, hành tím, rau mùi\n" +
                "\n" +
                "Bước 3: Ướp thịt với xì dầu, nước mắm, rượu gạo, đường nâu, nước cốt chanh, 1 phần sả, tơi, lá chanh, hành tóm, rau mùi đã băm nhỏ ướp trong 1h để thịt thấm gia vị\n" +
                "\n" +
                "Bước 4: Nướng thịt trong 8 phút, sau đó mở lò lật lại và nướng thêm 8 phút nữa.\n" +
                "\n" +
                "Bước 5: Sau đó phết mật ong lên thị và nướng thêm 2-3 phút là được.\n" +
                "\n" +
                "Trộn đều gia vị trong nước chấm để ăn kèm là xong.");
        chebien5.add("Nguyên liệu:\n" +
                "\n" +
                "300g thịt ba chỉ\n" +
                "300g tôm\n" +
                "2 củ hành tím, tỏi\n" +
                "Nước mắm, nước màu, đường, muối, tiêu, dầu ăn\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Tôm rửa sạch, bỏ đầu, để ráo rồi ướp với một ít muối.\n" +
                "\n" +
                "Bước 2: Thịt ba chỉ rửa sạch, cắt miếng mỏng. Hành tím, tỏi băm nhỏ.\n" +
                "\n" +
                "Bước 3: Phi thơm hành, tỏi với một ít dầu, cho thịt vào đảo đều với lửa to. Tới khi thịt săn lại thì cho tôm vào rang cùng. Khi tôm cũng chuyển sang màu đỏ thì cho gia vị nước mắm, đường, nước màu.\n" +
                "\n" +
                "Bước 4: Cứ đảo đều tay cho thịt và tôm thấm gia vị, gần chín có thể nêm lại cho vừa ăn. Tới khi nước chỉ còn sền sệt và tôm, thịt đã chín, ta tắt bếp và có thể rắc thêm hành lá lên cho đẹp mắt.\n" +
                "\n" +
                "Trên đây là tổng hợp 20 món ăn từ thịt heo vô cùng đơn giản nhưng lại cực kỳ hấp dẫn mà chị em có thể thực hiện trong thực đơn bữa cơm gia đình của mình.");

    }
    public void chien(){
        stringArrayList6.add("MỰC CHIÊN MẮM");
        stringArrayList6.add("CÁNH GÀ CHIÊN BƠ");
        stringArrayList6.add("THỊT BA CHỈ QUAY GIÒN BÌ");
        stringArrayList6.add("TÔM TẨM BỘT CHIÊN XÙ");
        stringArrayList6.add("NEM CUA BỂ");
        stringArrayList6.add("VỊT CHIÊN CAY");
        stringArrayList6.add("THỊT CHIÊN NƯỚC MẮM");
        stringArrayList6.add("CÁNH GÀ CHIÊN NƯỚC MẮM");
        stringArrayList6.add("CÁ CƠM CHIÊN TỎI ỚT");
        anh6.add(R.drawable.jf_laumam);
        anh6.add(R.drawable.jf_laugalagiang);
        anh6.add(R.drawable.phanthiet);
        anh6.add(R.drawable.namchay);
        anh6.add(R.drawable.ghemangchua);
        anh6.add(R.drawable.namthapcam);
        anh6.add(R.drawable.laude);
        anh6.add(R.drawable.laucakeo);
        anh6.add(R.drawable.misonhat);
        chebien6.add("Nguyên liệu\n" +
                "\n" +
                "3 lạng mực ống\n" +
                "1 củ tỏi, 1 nhánh gừng nhỏ\n" +
                "Các gia vị: 1 muỗng canh nước mắm ngon, 1 muỗng cà phê mì chính, 1 muỗng canh đường, tương ớt, muối, dầu ăn.\n" +
                "Cách chế biến\n" +
                "\n" +
                "Bước 1: Trước tiên các bạn hãy làm sạch mực: bạn hãy bỏ hết phần túi mực của mực ra rồi rửa mực lại cùng với nước muối loãng (hoặc các bạn có thể dùng rượu trắng để rửa mực). Việc rửa mực với nước muối loãng không chỉ làm giảm được độ tanh, làm mực thơm ngon hơn mà còn giúp mực trở nên săn chắc hơn. Khi đã rửa sạch mực thì các bạn hãy cho mực ra rổ để cho ráo nước.\n" +
                "\n" +
                "Bước 2: Tỏi bóc vỏ băm nhỏ; gừng rửa sạch, cạo vỏ, đập dập (hoặc các bạn có thể thái chỉ).\n" +
                "\n" +
                "Bước 3: Để món mực chiên nước mắm thêm thơm ngon hơn thì các bạn hãy chú ý đến việc pha nước mắm, các bạn không nên cho trực tiếp vào mực nhé. Bạn hãy trộn đều 1 muỗng canh nước mắm với 1 muỗng canh đường, 1 muỗng cà phê mì chính trong 1 cái bát con.\n" +
                "\n" +
                "Bước 4: Khi mực đã ráo nước thì bạn hãy cho mực vào chiên trong chảo dầu nóng. Khi chiên mực bạn hãy chiên cho ngập dầu. đến khi mực đã chín vàng thì bạn hãy vớt mực ra cho vào 1 cái đĩa và lót giấy thấm dầu ở dưới để thấm bớt dầu khi ăn sẽ không gây cảm giác bị ngấy.\n" +
                "\n" +
                "Bước 5: Tiếp theo bạn hãy đổ bớt dầu trong chảo vừa chiên mực ra 1 cái bát con đun nóng chảo dầu rồi cho số tỏi đã băm vào trong chảo phi thơm và cho mực cùng với số gừng đã thái vào trong chảo đảo thật đều. Sau đó bạn cho số nước mắm đã pha ở bước 3 vào trong chảo đảo đều. Bạn hãy đun khoảng 2 – 3 phút cho phần nước mắm cạn bám xung quanh mực và mực chuyển sang màu vàng cánh gián thì lúc đó bạn hãy tắt bếp. Cuối cùng các bạn chỉ cần cho mực ra đĩa rồi dùng nóng ăn với cơm. Để cho món mực chiên nước mắm thêm thơm ngon độc đáo hơn thì các bạn hãy chuẩn bị thêm chút rau mùi trang trí lên đĩa mực chiên nước mắm và 1 đĩa tương ớt để chấm cùng với mực.");
        chebien6.add("Nguyên liệu:\n" +
                "\n" +
                "Cánh gà: 5 cái, bạn phải chọn cánh gà còn tươi ngon, thịt sáng hồng, có độ đàn hồi khi ấn tay vào và tốt nhất là giống gà kiến hay gà tam hoàng cho thịt dai ngon tự nhiên nhé.\n" +
                "Bơ vàng: 100g.\n" +
                "Tỏi: 100g.\n" +
                "Dưa leo: 1 trái.\n" +
                "Cà chua: 1 trái.\n" +
                "Gừng tươi: 1 nhánh nhỏ.\n" +
                "Sả: 5 cây.\n" +
                "Bột chiên giòn: 100g.\n" +
                "Gia vị: Muối, hạt nêm, bột ngọt, nước mắm, tiêu bột, dầu ăn.\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "– Gừng tươi: Gọt vỏ, rửa sạch, giã nhỏ.\n" +
                "\n" +
                "– Tỏi: Lột sạch, băm nhỏ.\n" +
                "\n" +
                "– Sả: Làm sạch, băm nhỏ.\n" +
                "\n" +
                "Bước 2: Cánh gà:\n" +
                "\n" +
                "– Rửa sạch với nước có pha 2 thìa muối với gừng tươi giã nhỏ để cánh gà được sạch và thơm ngon hơn khi chế biến, chặt cánh gà làm 2 cho vừa ăn.\n" +
                "\n" +
                "– Ướp cánh gà với 1/3 phần tỏi băm, sả băm nhỏ, ½ thìa muối, 2 thìa hạt nêm, 1 thìa nước mắm, 1 thìa bột ngọt, ½ thìa đường, 1 thìa tiêu bột, 2 thìa dầu ăn trong 1 tiếng để gà ngấm gia vị kỹ hơn, có thể cho vào ngăn mát tủ lạnh 3-4 tiếng trước khi chiên nhé, làm như vậy cách làm cánh gà chiên bơ sẽ hấp dẫn hơn và món cánh gà chiên thơm ngon.\n" +
                "\n" +
                "– Bột chiên giòn: Cho ra đĩa.\n" +
                "\n" +
                "– Dưa leo, cà chua: Rửa sạch, thái lát, xếp lên đĩa dùng để bày món cánh gà chiên bơ.\n" +
                "\n" +
                "– Lần lượt lấy từng miếng cánh gà lăn qua đĩa bột chiên giòn 2-3 lần để bột phủ đều lên miếng cánh gà.\n" +
                "\n" +
                "– Cho vào chảo một lượng dầu ăn vừa đủ, đun dầu sôi nóng già, vặn lửa nhỏ vừa rồi cho cánh gà đã được tẩm bột chiên giòn vào chiên, bạn nhớ để nhỏ lửa để cánh gà chín đều từ trong ra ngoài và giòn tan nhé, khi thấy cánh gà chín vàng đều các mặt, dậy mùi thơm hấp dẫn thì bạn vớt ra, cho vào đĩa có giấy thấm dầu.\n" +
                "\n" +
                "– Tiếp đó, bạn sử dụng 1 chảo khác, vặn lửa nhỏ liu riu làm nóng chảo, cho bơ vào để bơ tan chảy rồi cho 2/3 tỏi băm còn lại vào phi thơm.\n" +
                "\n" +
                "– Bày cánh gà đã chiên vàng giòn ra đĩa có sẵn cà chua và dưa leo sao cho đẹp mắt rồi sử dụng hỗn hợp bơ – tỏi rưới đều lên khắp cánh gà là bạn đã hoàn thành món cánh gà chiên bơ ngon và vô cùng hấp dẫn rồi đấy.");
        chebien6.add("Nguyên liệu:\n" +
                "\n" +
                "Phần thịt quay: 1 tảng thịt ba chỉ (1kg); 1 muỗng canh muối (hạt); 2 muỗng canh xì dầu; 1 muỗng canh giấm; 1 muỗng cà phê muối tinh\n" +
                "Nước chấm: Chanh thái miếng; gạo rang giã nhỏ; bột ớt; nước mắm; nước cốt me; đường; chanh; rau mùi, hành lá thái nhỏ; tất cả đều vừa đủ\n" +
                "Dầu ăn để chiên\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Thịt ba chỉ rửa sạch. Cho nước vào nồi đun nóng cùng với muối và xì dầu. Sau đó thả tảng thịt ba chỉ vào. Đun sôi cho thịt chín tái bên ngoài. Vớt thịt ra để ráo.\n" +
                "\n" +
                "Bước 2: Dùng giấy thấm khô bề mặt thịt. Dùng dĩa xiên nhiều lỗ lên bề mặt da của miếng thịt sau đó thoa giấm và muối tinh lên.\n" +
                "\n" +
                "Bước 3: Mang ra phơi ngoài nắng khoảng 1 giờ hoặc phơi ở nơi thoáng mát, có gió.\n" +
                "\n" +
                "Bước 4: Đun nóng dầu ăn trong một chảo thật lớn. Dầu ăn phải nhiều để làm chìm được miếng thịt. Để thịt không cháy hoặc dính dưới đáy chảo, bạn có thể cho một chiếc giá đỡ nhỏ dưới lòng chảo. Khi dầu nóng, cho miếng thịt vào chiên cho đến khi cả hai mặt vàng ươm, bì nổ giòn đều. Nhớ lật để cả hai mặt chín đều.\n" +
                "\n" +
                "Sau đó vớt ra, để lên giấy thấm đầu rồi thái miếng vừa ăn.\n" +
                "\n" +
                "Bước 5: Pha nước chấm\n" +
                "\n" +
                "Cho tất cả các nguyên liệu pha nước chấm vào trong bát, khuấy đều là được.");
        chebien6.add("Nguyên liệu\n" +
                "\n" +
                "Tôm sú: 8 con\n" +
                "Trứng gà: 1 quả\n" +
                "Bột xiên xù: 1 gói\n" +
                "Bột mỳ: 3 thìa\n" +
                "Tiêu, gia vị, hạt nêm, dầu ăn: vừa đủ\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Tôm sú rửa sạch, cắt bỏ chân và bóc vỏ, khi bóc bạn chừa lại phần đuôi của con tôm. Sau khi bóc tôm xong ướp với chút muối, hạt nêm và tiêu, nếu nhà bạn có trẻ con thì đừng cho hạt tiêu nhé. Bạn hãy ướp tôm chừng 15 phút.\n" +
                "\n" +
                "Bước 2: Trứng gà đập ra bát và đánh tơi với bột mỳ, để cho trứng và bột mỳ đánh tơi nhất thì bạn hãy rây qua bột mỳ khi cho vào trứng nhé để bột mỳ không bị vón cục.\n" +
                "\n" +
                "Bước 3: Cho bột chiên xù ra đĩa rộng. Cầm đuôi tôm nhúng vào hỗn hợp bột mì và trứng đã đánh sẵn sau đó bạn cho tôm vào lăn với lớp bột chiên xù. Tại bước này bạn cần lăn tôm đều tay để tạo ra một lớp vỏ dày xung quanh thân của con tôm sau đó nhanh tay chuyển con tôm đã tẩm bột chiên sang đĩa bột chiên xù. Tại đây thì bạn lăn nhẹ con tôm hoạc dùng thìa đổ nhẹ bột chiên xù lên mình con tôm sao cho đều nhất.\n" +
                "\n" +
                "Bước 4: Đổ dầu vào chảo đun sôi dầu và thả tôm đã lăn vào rán vàng giòn. Khi con tôm chuyển màu vàng ươm thì bạn có thể vớt ra và khi vớt ra bạn hãy nhớ là thấm với giấy ăn cho bớt dầu đi nhé thì món tôm sẽ bớt ngấy hơn.");
        chebien6.add("Nguyên liệu:\n" +
                "\n" +
                "Thịt lợn nạc vai :250gr\n" +
                "Cua biển : 1 con\n" +
                "Trứng gà 3 quả\n" +
                "Su hào, cà rốt – mỗi loại một củ\n" +
                "Bánh đa nem thường hoặc bánh ram của Hà Tĩnh,cứ chuẩn bị một gói.\n" +
                "Giá :50 gr\n" +
                "Miến: 10gr\n" +
                "Nấm hương: 10 gr\n" +
                "Mộc nhĩ: 10gr\n" +
                "Tỏi, hành tím, đu đủ xanh, cà rốt\n" +
                "Nguyên liệu nước chấm: nước mắm, bột nêm, tiêu, muối, dấm, chanh – gia vị\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Cua biển rửa sạch,luộc chín và gỡ lấy thịt. Thịt heo rửa sạch, băm nhỏ.\n" +
                "\n" +
                "Bước 2: Su hào, cà rốt các bạn gọt vỏ, rửa sạch rồi bao sợi nhuyễn. Miến, nấm huong, mộc nhĩ ngâm với nước nóng cho nở, ngâm riêng mỗi loại vào bát to. Miến cắt khúc nhỏ, nấm h\u001Dương, mộc nhĩ băm nhỏ. Giá rửa sạch, thái nhỏ\n" +
                "\n" +
                "Bước 3: Cho thịt lợn, thịt cua, cà rốt, su hào, nấm, giá và đập trứng gà vào trộn thật đều, nêm thêm muối, hạt nêm, tiêu vào và đảo đều tiếp sao cho tất cả ngấm đều gia vị\n" +
                "\n" +
                "Bước 4: Bạn cho giấm vắt chanh vào bát nhỏ. Nhúng bánh tráng vào để khi rán giòn hơn hoặc xát quả cà chua lên bánh (đối với bánh tráng thường nhé) còn nếu dùng bánh tráng của Hà Tĩnh khônh cần làm gì, cứ thế gói thẳng, nem rất giòn và không bị vỡ.\n" +
                "\n" +
                "Trải bánh tráng ra mặt phẳng rồi cho nhân vào giữa, dẹp đều, gấp 4 góc lại thành hình vuông.\n" +
                "\n" +
                "Bước 5: Cho dầu vào chảo, dầu sôi già mới cho nem vào rán, lật đều các mặt đến khi nem vàng ươm, chín đều và giòn rụm thì cho ra đĩa đã lót giấy thấm dầu. Bạn lấy dao cắt nem ra làm đôi hoặc làm 4 tùy khẩu vị. Tiếp theo bạn xếp rau sống lên đĩa rồi cho nem lên trên.\n" +
                "\n" +
                "Pha nước chấm chua ngọt: Gồm đu đủ xanh, cà rốt đem gọt vỏ, rửa sạch rồi thái lát mỏng. Cho chút nước mắm, chanh, đường, hạt nêm, nước dùng vừa đủ lên đun, nước sôi cho đu đủ, cà rốt thái lát vào trần qua cho ngấm. Đổ nước chấm ra bát nhỏ. Băm ớt, tỏi vào bát nước chấm nếu thích.");
        chebien6.add("Nguyên liệu\n" +
                "\n" +
                "Vịt xiêm: 1 con, hành khô, tỏi, rau thơm.\n" +
                "Gia vị ướp: 3 thìa cà phê hạt nêm, 4 thìa cà phê tiêu đen, 2 thìa cà phê ớt bột, 3 thìa cà phê dầu hào, 2 thìa cà phê nước cốt dứa, 1 thìa cà phê nước cốt dừa, 1 thìa cà phê nước ép gừng, ½ thìa cà phê nước ép tỏi.\n" +
                "Thành phần nước xốt: ½ quả dứa ép lấy nước, ½ thìa canh sa tế, 1 thìa cà phê nước mắm ngon, 3 thìa cà phê đường nâu, 1 thìa cà phê dầu hào, 1 thìa canh tương ớt, 2 thìa canh dấm ăn, 2 thìa cà phê hạt nêm, 3 thìa canh nước lọc.\n" +
                "Cách làm\n" +
                "\n" +
                "Vịt xiêm làm sạch, chặt thành miếng vuông vừa ăn rồi xát với chút rượu gừng, rửa sạch, để ráo. Ướp vịt với phần gia vị ướp đã chuẩn bị.\n" +
                "\n" +
                "Đeo bao tay nylon, bóp đều vịt với gia vị, để thấm khoảng 3-4 tiếng hoặc qua đêm thì càng ngon.\n" +
                "\n" +
                "Bạn có thể xếp vịt vào lò nướng nướng đến khi vịt chín vàng. Nếu không có lò nướng thì đun nóng dầu ăn, áp chảo vịt. Bạn nên áp chảo mặt có da trước để vịt ra bớt mỡ, áp chảo 2 mặt sao cho chín vàng đều. Trong quá trình chiên vịt, bạn có thể đậy vung vào cho miếng vịt chín hết từ trong ra ngoài.\n" +
                "\n" +
                "Vịt chín vàng vớt ra đĩa có lót giấy thấm dầu.\n" +
                "\n" +
                "Dứa ép lấy nước, thêm vào phần nước ép dứa những nguyên liệu đã chuẩn bị cho phần xốt, trộn đều thành hỗn hợp đồng nhất. Phần xốt này bạn có thể gia giảm vị mặn, ngọt, cay theo ý mình. Nếu muốn ăn cay hơn thì bạn thêm sa tế, nếu muốn ngọt hơn thì thêm nước ép dứa.\n" +
                "\n" +
                "Phi thơm hành, tỏi băm rồi đổ phần vịt chiên trở lại nồi, đảo đều rồi cho nước xốt vào. Ban đầu bật lửa lớn đến khi nước xốt sôi, tiếp tục đảo đều, nêm nếm rồi hạ nhỏ lửa, đun tới khi xốt sệt và bám đều vào miếng vịt.\n" +
                "\n" +
                "Bày thịt vịt xốt cay ra đĩa, rắc tiêu, rau thơm ăn nóng. Món này có thể ăn với cơm hoặc bánh mỳ nhưng ngon nhất vẫn là ăn cùng cơm nóng.");
        chebien6.add("Nguyên liệu:\n" +
                "\n" +
                "1kg thịt ba chỉ\n" +
                "45ml nước mắm\n" +
                "15ml xì dầu\n" +
                "5g tiêu đen\n" +
                "60g bột chiên giòn\n" +
                "7g đường\n" +
                "Dầu ăn\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Đầu tiên, bạn cho thịt vào thố. Thêm nước mắm, xì dầu, tiêu đen, bột chiên giòn và đường vào.\n" +
                "\n" +
                "Bước 2: Trộn đều thịt với gia vị. Ở một số công thức, người ta còn cho 1/2 quả trứng đánh đều vào cùng với thịt để lớp vỏ khi rán có màu vàng hơn.\n" +
                "\n" +
                "Bước 3: Trong chảo sâu lòng, bạn đổ dầu vào đun cho nóng. Khi dầu nóng, ta thả thịt vào rán ngập dầu.\n" +
                "\n" +
                "Bước 4: Bạn rán cho đến khi phần vỏ miếng thịt chuyển màu vàng nâu và giòn lại.\n" +
                "\n" +
                "Bước 5: Lấy thịt ra, thấm cho ráo dầu rồi xắt thành miếng. Thịt rán vẫn sẽ rất mềm ở trong, lại có phần vỏ ngoài giòn tan, ăn thích cực luôn!\n" +
                "\n" +
                "Bạn có thể pha nước chấm với công thức: 4-5 thìa canh nước mắm ngon, 1 củ hành tím, 1/2 thìa cà phê đường, 1 thìa cà phê chanh, một ít vừng trắng, một ít ngò xắt nhuyễn .");
        chebien6.add("Nguyên liệu\n" +
                "\n" +
                "800g cánh gà\n" +
                "1,5 củ tỏi\n" +
                "5 củ hành tím\n" +
                "4 trái ớt\n" +
                "1 muỗng tiêu\n" +
                "5 muỗng đường\n" +
                "Nửa chén nước mắm\n" +
                "Cách làm\n" +
                "\n" +
                "Cánh gà: Rửa sạch, mỗi cánh gà chặt thành 2 khúc (không ướp gia vị).\n" +
                "\n" +
                "Tỏi, hành tím, ớt: Băm nhuyễn.\n" +
                "\n" +
                "Chiên gà: Bắc chảo dầu thật nóng, sau đó chiên gà (chiên ngập dầu). Gà phải chiên thật là giòn, vàng, không bị ướt dính.\n" +
                "\n" +
                "Áo nước mắm cho gà: Lấy cái chảo khác để áo nước mắm cho gà vừa mới chiên xong.\n" +
                "\n" +
                "Lấy nửa muỗng dầu ăn, đợi dầu ăn nóng, bỏ tỏi, hành tím, ớt đã băm nhuyễn vào, cho thêm 1 muỗng tiêu. Khi thấy hành, tỏi, ớt hơi khô chuyển sang màu vàng thì cho nửa chén nước mắm nguyên chất, 5 muỗng đường vào.\n" +
                "\n" +
                "Khuấy hỗn hợp đều tay, khi cảm thấy bắt đầu sệt lại thì cho gà đã chiên vào.\n" +
                "\n" +
                "Tiếp tục đảo gà cho đến khi chuyển sang màu hơi đậm thì tắt bếp.");
        chebien6.add("Nguyên liệu:\n" +
                "\n" +
                "300 cá cơm\n" +
                "1 muỗng canh bột năng\n" +
                "2 tép tỏi\n" +
                "1 muỗng cà phê ớt bột\n" +
                "2 muỗng canh mật ong\n" +
                "1 muỗng canh nước mắm\n" +
                "1 muỗng cà phê muối\n" +
                "1/2 chén dầu ăn\n" +
                "Cách làm:\n" +
                "\n" +
                "Cá cơm rửa sạch, bỏ đầu và ruột cá, rửa lại lần nữa với nước, để ráo. Tỏi bóc vỏ, giã nhỏ.\n" +
                "\n" +
                "Ướp vào cá 1 muỗng cà phê muối khoảng 30 phút, sau đó, lăn đều cá cơm với một lớp bột năng mỏng.\n" +
                "\n" +
                "Làm nóng dầu ăn trong nồi, cho cá cơm vào chiên vàng giòn.\n" +
                "\n" +
                "Vớt cá cơm ra đĩa có lót săn giấy nến để thấm dầu.\n" +
                "\n" +
                "Trộn mật ong, nước mắm, ớt bột vào chén nhỏ.\n" +
                "\n" +
                "Phi thơm tỏi giã nhuyễn. Cho hỗn hợp mật ong, ớt bột đã trộn vào nồi, đảo đều.\n" +
                "\n" +
                "Cuối cùng chỉ việc cho cá cơm vào, chiên đến khi hỗn hợp nước sốt cay cạn lại, ngấm đều cá cơm thì tắt bếp. Lúc này bạn hãy chú ý cho lửa nhỏ xuống để đun cá với hỗn hợp.\n" +
                "\n" +
                "Cho ra đĩa, ăn cùng với cơm sẽ rất ngon. Vị cay cay, mặn mặn rất đậm đà, hấp dẫn.\n" +
                "\n" +
                "Món ăn khi hoàn thành sẽ có màu vàng cánh gián rất hấp dẫn. Những con cá chín đều giòn cùng với vị đậm đà thơm ngọt của mật ong và cay cay của tỏi và ớt tạo ra một hương vị thơm ngon rất đặc trưng. Có thể ăn kèm cá cơm chiên tỏi ớt cay thơm với dưa leo và rau sống thì rất là đưa cơm luôn đấy nhé!");

    }
    public void luot(){
        stringArrayList7.add("Thịt bắp bò luộc gừng sả");
        stringArrayList7.add("Tràng lợn trộn măng tươi");
        stringArrayList7.add("Đậu bắp luộc chấm chao");
        stringArrayList7.add("Thịt lợn luộc ngâm nước mắm");
        stringArrayList7.add("Bún thịt luộc chấm mắm nêm");
        stringArrayList7.add("Lòng non luộc chấm với mắm ruốc");
        stringArrayList7.add("Bắp cải luộc chấm nước mắm trứng");
        stringArrayList7.add("Lòng lợn luộc trộn hành tây");
        anh7.add(R.drawable.sachanh);
        anh7.add(R.drawable.hapgung);
        anh7.add(R.drawable.caibexanh);
        anh7.add(R.drawable.tuongbot);
        anh7.add(R.drawable.giavi);
        anh7.add(R.drawable.muoixa);
        anh7.add(R.drawable.luot);
        anh7.add(R.drawable.tomhapnam);
        chebien7.add("Nguyên liệu:\n" +
                "\n" +
                "300 cá cơm\n" +
                "1 muỗng canh bột năng\n" +
                "2 tép tỏi\n" +
                "1 muỗng cà phê ớt bột\n" +
                "2 muỗng canh mật ong\n" +
                "1 muỗng canh nước mắm\n" +
                "1 muỗng cà phê muối\n" +
                "1/2 chén dầu ăn\n" +
                "Cách làm:\n" +
                "\n" +
                "Cá cơm rửa sạch, bỏ đầu và ruột cá, rửa lại lần nữa với nước, để ráo. Tỏi bóc vỏ, giã nhỏ.\n" +
                "\n" +
                "Ướp vào cá 1 muỗng cà phê muối khoảng 30 phút, sau đó, lăn đều cá cơm với một lớp bột năng mỏng.\n" +
                "\n" +
                "Làm nóng dầu ăn trong nồi, cho cá cơm vào chiên vàng giòn.\n" +
                "\n" +
                "Vớt cá cơm ra đĩa có lót săn giấy nến để thấm dầu.\n" +
                "\n" +
                "Trộn mật ong, nước mắm, ớt bột vào chén nhỏ.\n" +
                "\n" +
                "Phi thơm tỏi giã nhuyễn. Cho hỗn hợp mật ong, ớt bột đã trộn vào nồi, đảo đều.\n" +
                "\n" +
                "Cuối cùng chỉ việc cho cá cơm vào, chiên đến khi hỗn hợp nước sốt cay cạn lại, ngấm đều cá cơm thì tắt bếp. Lúc này bạn hãy chú ý cho lửa nhỏ xuống để đun cá với hỗn hợp.\n" +
                "\n" +
                "Cho ra đĩa, ăn cùng với cơm sẽ rất ngon. Vị cay cay, mặn mặn rất đậm đà, hấp dẫn.\n" +
                "\n" +
                "Món ăn khi hoàn thành sẽ có màu vàng cánh gián rất hấp dẫn. Những con cá chín đều giòn cùng với vị đậm đà thơm ngọt của mật ong và cay cay của tỏi và ớt tạo ra một hương vị thơm ngon rất đặc trưng. Có thể ăn kèm cá cơm chiên tỏi ớt cay thơm với dưa leo và rau sống thì rất là đưa cơm luôn đấy nhé!");
        chebien7.add("Nguyên liệu:\n" +
                "\n" +
                "- 300g tràng lợn\n" +
                "- 150g măng tươi\n" +
                "- 1 củ cà rốt nhỏ\n" +
                "- Muối, giấm, đường, nước mắm, tỏi, ớt quả\n" +
                "- Rau thơm\n" +
                "- 1 thìa canh bột mỳ\n" +
                "- 1 nhánh gừng nhỏ\n" +
                "- Lạc rang chín, giã thô.\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1:\n" +
                "\n" +
                "- Tràng lợn rửa sạch, trộn vào một thìa canh bột mỳ hay một thìa canh nước mắm để khoảng 15 phút sau đó rửa lại cho thật sạch.\n" +
                "\n" +
                "- Mục đích trộn bột mỳ hay nước mắm vào tràng lợn là để tẩy bớt mùi hôi của tràng lợn. \n" +
                "\n" +
                "Bước 2:\n" +
                "\n" +
                "- Cho tràng lợn vào nồi, thêm gừng giã mịn và nước lạnh ngập tràng, đun sôi, luộc chín tràng, để nguội, cắt nhỏ.\n" +
                "\n" +
                "Bước 3:\n" +
                "\n" +
                "- Măng tươi rửa sạch, xé sợi.\n" +
                "\n" +
                "- Cho măng vào nồi luộc mềm, lấy ra xả lại nhiều lần nước cho bớt mùi chua, để ráo nước.\n" +
                "\n" +
                "Bước 4:\n" +
                "\n" +
                "- Cà rốt rửa sạch, cạo vỏ, thái sợi, trộn vào bát cà rốt nửa thìa nhỏ muối, một thìa nhỏ đường cát trắng, một thìa nhỏ giấm, để yên khoảng 15 phút.\n" +
                "\n" +
                "- Rau thơm rửa sạch, để ráo.\n" +
                "\n" +
                "Bước 5:\n" +
                "\n" +
                "- Tỏi, ớt giã nhuyễn, pha một thìa canh nước mắm với một thìa canh đường, hòa cho đường tan thì cho tỏi ớt vào. \n" +
                "\n" +
                "- Cho tràng lợn, cà rốt đã vắt bớt nước, măng tươi và bát nước mắm vào âu sạch, dùng đũa trộn đều, nêm nếm lại gia vị cho vừa ăn, khi dùng thêm lạc rang, rau thơm đã thái nhỏ. Múc ra đĩa dùng làm món nộm ăn với cơm hay ăn chơi đều ngon.");
        chebien7.add("dau-bap-luoc-5-944759-1368228825_500x0.j\n" +
                "Nguyên liệu:\n" +
                "\n" +
                "- 200g đậu bắp\n" +
                "- 3 miếng chao, đường\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "- Đậu bắp mua về rửa sạch, để ráo rồi cắt bỏ đầu.\n" +
                "\n" +
                "- Đun một nồi nước cho thật sôi rồi cho đậu bắp vào luộc khoảng 3 - 4 phút là đậu chín có màu xanh thẫm, vớt ra rổ để ráo. Không luộc lâu, đậu bắp sẽ bị nhũn và mất màu xanh đẹp.\n" +
                "\n" +
                "- Cho chao ra chén nhỏ cùng với một ít nước chao rồi dầm nát, sau đó trộn với khoảng nửa thìa nhỏ đường cho đều, nêm lại cho vừa ăn (tùy theo độ mặn của chao mà gia giảm lượng đường cho vừa).\n" +
                "\n" +
                "- Gắp đậu bắp ra đĩa, dọn kèm với chén chao pha đường.\n" +
                "\n" +
                "- Lưu ý: khi mua đậu bắp nên chọn loại tươi non khi luộc sẽ giòn, ngọt, mềm và không bị dai, xơ.");
        chebien7.add("Nguyên liệu:\n" +
                "\n" +
                "- 1 kg thịt chân giò\n" +
                "- Nước mắm 350ml\n" +
                "- Đường 350g\n" +
                "- Nước 100ml\n" +
                "- 3 tép tỏi to: cắt lát mỏng.\n" +
                "\n" +
                "Cách làm\n" +
                "\n" +
                "-Thịt chân giò cạo rửa cho sạch da, sau đó bạn luộc miếng thịt khoảng 30 phút, thịt chín vớt ra, rửa qua nước lạnh cho thịt không bị đen.\n" +
                "\n" +
                "- Nấu nước mắm: cho mắm, đường, nước vào nồi và cho lên bếp nấu 15-20 phút cho đường tan và hơi sánh lại, trong lúc nấu thì bạn nhớ hớt bọt bỏ đi, để nước mắm nguội.\n" +
                "\n" +
                "- Bạn cho miếng thịt đã luộc chín và tỏi cắt lát vào lọ thủy tinh. Sau đó, cho nước mắm đường vào và dùng mành tre gài lại sao cho thịt luôn ngập trong nước mắm đường. Sau 3 ngày là có thể ăn được.");
        chebien7.add("Nguyên liệu:\n" +
                "\n" +
                "- 300g thịt ba chỉ\n" +
                "- 2 lát dứa\n" +
                "- Nửa chai mắm nêm (300ml)\n" +
                "- Đường, ớt, chanh, tỏi, hạt nêm, giấm\n" +
                "- 1 củ cà rốt\n" +
                "- Rau xà lách, diếp cá, rau răm, húng (bạn có thể thêm các loại rau thơm khác tùy theo sở thích)\n" +
                "- Lạc rang vàng, giã nhuyễn\n" +
                "- Bún.\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "- Luộc thịt, thêm vào nồi luộc thịt khoảng nửa thìa nhỏ muối, chút xíu hạt nêm.\n" +
                "\n" +
                "- Đun tầm 8 phút, tùy theo miếng thịt dày hay mỏng. Tắt bếp, đậy kín nắp nồi. Thịt sẽ tiếp tục chín, không nên đun thịt lâu, sẽ làm thịt không ngọt và da không dai.\n" +
                "\n" +
                "- Thịt chín lấy ra thái lát vừa ăn, xếp lên đĩa.\n" +
                "\n" +
                "- Băm nhuyễn dứa.\n" +
                "\n" +
                "- Giã nhuyễn tỏi, ớt và ba thìa canh đường, trộn dứa và tỏi ớt vào bát mắm nêm. Dùng thìa trộn đều, nêm nếm lại tùy theo khẩu vị của bạn, vắt vào bát mắm nêm vài giọt chanh.\n" +
                "\n" +
                "- Rau xà lách, rau diếp cá, rau răm, húng bỏ bớt cọng già, rửa sạch, để lên rổ cho ráo nước.\n" +
                "\n" +
                "- Cà rốt bào sợi, ngâm vào bát cà rốt ít nước lọc, ba thìa canh giấm, hai thìa nhỏ muối và hai thìa nhỏ đường.\n" +
                "\n" +
                "- Khi ăn bạn thái rau nhỏ để phía dưới bát, thêm bún, xếp vài lát thịt, bên trên chan nước mắm nêm, cà rốt ngâm giấm đường và rắc ít lạc đã rang, trộn đều lên.");
        chebien7.add("Nguyên liệu:\n" +
                "\n" +
                "- 1 bộ lòng non (300g)\n" +
                "- 2 thìa canh mắm ruốc\n" +
                "- 1 nhánh gừng\n" +
                "- Giấm, chanh, rượu trắng và muối\n" +
                "- Đường, tỏi, ớt\n" +
                "- Rau răm, rau thơm, húng lìu, dưa leo.");
        chebien7.add("Nguyên liệu\n" +
                "\n" +
                "Nửa cái bắp cải cỡ vừa, 1 quả trứng gà hoặc vịt, nước mắm ngon.\n" +
                "\n" +
                "Cách làm\n" +
                "\n" +
                "- Bắp cải cắt miếng to cỡ 1/4 bàn tay, rửa sạch rồi cho ra rổ cho ráo nước.\n" +
                "- Bắc nồi nước lên bếp đun sôi với lửa to vừa rồi cho bắp cải vào luộc, chú ý canh sao cho bắp cải vừa chín tới mới ngon. Nếu là bắp cải loại mềm thì thời gian luộc khoảng 3 phút là được, còn bắp cải cứng thì thời gian luộc sẽ lâu hơn. Khi bắp cải chín thì vớt ra rổ cho ráo nước, rồi xếp ra đĩa.\n" +
                "- Trứng luộc khoảng 12 phút là chín, sau đó ngâm trứng vào nước lạnh cho nguội rồi bóc vỏ, cắt thành từng miếng nhỏ rồi cho vào bát cùng với nước mắm nguyên chất loại ngon.\n" +
                "\n");
        chebien7.add("Nguyên liệu:\n" +
                "\n" +
                "-300g lòng lợn, bạn có thể thêm gan, hay bao tử lợn\n" +
                "-1 củ hành tây nhỏ\n" +
                "-Rau răm, rau thơm hoặc mùi tàu\n" +
                "-Giấm, chanh, muối, nước mắm, bột nêm.\n" +
                "\n" +
                "Bạn ngâm hành trong nước lạnh để bớt hăng.\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "- Lòng lợn rửa sạch, dùng tay chà muối, giấm và chanh lên khắp thân lòng lợn, để 15 phút sau đó xả sạch với nước lạnh.\n" +
                "- Luộc lòng lợn chín, thêm vào nồi nước luộc chút giấm để lòng được trắng. Lòng chín vớt ra để nguội, thái nhỏ.\n" +
                "- Hành tây thái khúc ngắn vừa ăn, ngâm hành trong nước lạnh để giữ hành giòn và bớt mùi hăng của hành. Để 15 phút sau đó vớt ra rổ cho ráo nước.\n" +
                "- Trộn lòng vào hành tây, nêm vào chút muối, bột nêm, nước mắm và vắt vài giọt chanh, trộn đều.\n" +
                "- Thêm rau răm, rau thơm, hay mùi tàu thái nhỏ vào.");

    }
    public void chay(){
        stringArrayList8.add("Món Gỏi Cuốn Ngũ Sắc");
        stringArrayList8.add("Đậu Hủ Non Sốt Nấm Tươi");
        stringArrayList8.add("Đậu Phụ Cuốn Lá Lốt\n");
        stringArrayList8.add("Rau Cuộn Chay");
        stringArrayList8.add("Canh rong biển hạt sen");
        stringArrayList8.add("Canh nấm hạt sen");
        stringArrayList8.add("Canh chua chay");
        stringArrayList8.add("Hủ tiếu chay");
        stringArrayList8.add("Nem rán chay");
        stringArrayList8.add("Canh bông cải chay");
        stringArrayList8.add("Đậu hũ xào rau củ");
        stringArrayList8.add("Gỏi đu đủ chay");
        stringArrayList8.add("Súp đậu đỏ");
        stringArrayList8.add("Giá xào đậu hũ");
        stringArrayList8.add("Đậu hũ kho sả ớt");
        stringArrayList8.add("Canh bí đỏ đậu phộng");
        anh8.add(R.drawable.ab_khoai_lang_ken);
        anh8.add(R.drawable.ab_thach_dua);
        anh8.add(R.drawable.ab_che_khoai_lang);
        anh8.add(R.drawable.ab_xoai);
        anh8.add(R.drawable.ab_banh_goi);
        anh8.add(R.drawable.ab_khoai_tay);
        anh8.add(R.drawable.ab_banhranman);
        anh8.add(R.drawable.ab_tokbokki);
        anh8.add(R.drawable.ab_phomaique);
        anh8.add(R.drawable.ab_suachua);
        anh8.add(R.drawable.ab_banhplan);
        anh8.add(R.drawable.ab_banhkemchuoi);
        anh8.add(R.drawable.ab_trasuachanchau);
        anh8.add(R.drawable.ab_suachua);
        anh8.add(R.drawable.cacbohydrate);
        anh8.add(R.drawable.ab_banh_goi);
        chebien8.add("Chuẩn bị nguyên liệu:\n" +
                "Nguyên liệu cho gỏi cuốn\n" +
                "12 tờ bánh tráng, đường kính 22cm.\n" +
                "2 quả bơ,\n" +
                "Rau mùi tươi, non.\n" +
                "Rau húng bạc hà.\n" +
                "300g bắp cải tím\n" +
                "2 củ cà rốt to\n" +
                "2 quả dưa chuột\n" +
                "100g giá đỗ.\n" +
                "Nguyên liệu cho nước sốt:\n" +
                "150g đậu phụ.\n" +
                "70g bơ đậu phộng mịn.\n" +
                "2 thìa canh rượu gạo.\n" +
                "1 thìa canh bột miso.\n" +
                "3 thìa cà phê mật ong.\n" +
                "3 thìa cà phê gừng xay nhỏ.\n" +
                "1 tép tỏi nhỏ nghiền nát.\n" +
                "Các bước thực hiện:\n" +
                "Cách làm gỏi cuốn chay ngon, đẹp mắt để giảm cân tại nhà\n" +
                "Bước 1:\n" +
                "Các thành phần trong nước sốt bao gồm: đậu phụ + bơ đậu phộng mịn + rượu gạo + bột miso + gừng và xay nhỏ + mật ong cho vào máy xay sinh tố xay thật mịn.\n" +
                "Rồi cho ra bát đồ chấm để riêng.\n" +
                "Bước 2:\n" +
                "Tất cả nguyên liệu làm gỏi cuốn đều rửa sạch với nước. Trong đó:\n" +
                "\n" +
                "Bơ thái lát mỏng.\n" +
                "Bắp cải tím, thái sợi nhỏ.\n" +
                "Cà rốt và dưa chuột thái sợi bằng que diêm.\n" +
                "Bước 3:\n" +
                "Cách Làm Bao Tử Chay Cuốn Rau Thanh Đạm\n" +
                "Làm mềm bánh tráng bằng cách nhúng vào nước lạnh rồi để ráo.\n" +
                "Trải bánh tráng lên mặt phẳng rồi cuốn theo thứ tự: 2 lát quả bơ, 2 ngọn rau mùi, 2 ngọn rau bạc hà, một ít bắp cải tím, cà rốt, dưa chuột, giá đỗ.\n" +
                "Cuốn hai đầu bánh tráng và cuộn chặt tay.\n" +
                "Bước 4:\n" +
                "Cắt đôi gỏi cuốn rồi trang trí lên đĩa, chấm cùng nước sốt đã làm.");
        chebien8.add("Nguyên liệu:\n" +
                "Đậu hũ non sốt nấm đông cô chay chuẩn bị đón Rằm\n" +
                "Đậu hũ non: 1 gói\n" +
                "Nấm đông cô tươi: 100g\n" +
                "1 nhánh hành lá\n" +
                "1 nhánh mùi\n" +
                "Dầu hào chay\n" +
                "Nước tương\n" +
                "Muối\n" +
                "Dầu mè\n" +
                "Bột năng.\n" +
                "Hướng dẫn làm món đậu hũ non sốt nấm đông cô cho mùa lễ Vu Lan\n" +
                "Cách làm:\n" +
                "Bước 1:\n" +
                "Nấm đông cô cắt phần chân già, rửa sạch, ngâm trong nước muối loãng có pha một thìa bột năng khoảng 15 phút cho sạch.\n" +
                "Đậu hũ non rửa sạch, thái miếng xếp ra đĩa. Dùng màng thực phẩm bao lại, làm chín trong lò vi song khoảng 2 phút.\n" +
                "Hoặc chị em cũng có thể làm chín đậu hũ non bằng cách trần qua nước sôi thêm chút muối.\n" +
                "Hành lá, rau mùi bỏ rễ, rửa sạch, cắt nhỏ. Chú ý phần gốc hành xắt nhỏ để riêng.\n" +
                "Bước 2:\n" +
                "Nấm sau khi ngâm, vớt ra để ráo, thái lát mỏng.\n" +
                "Bắc chảo lên bếp, cho 1 thìa dầu mè.\n" +
                "Khi dầu nóng cho phần đầu hành ở trên vào phi thơm. Tiếp đó cho nấm vào xào chín, thêm chút dầu hào chay, nước tương vào đảo kỹ.\n" +
                "Hòa 1 thìa bột năng với chút nước, cho vào chảo nấm đảo đều, nêm nếm cho vừa ăn.\n" +
                "Bước 3:\n" +
                "Nấm chín, tắt bếp, cho hành lá, mùi xắt nhỏ ở trên vào đảo đều.\n" +
                "Cho nấm cùng với nước sốt ở trên vào đĩa đậu hũ non đã làm chín.\n" +
                "Dùng thìa dưới đều phần nước sốt lên các miếng đậu để đậu hũ được ngấm đều.");
        chebien8.add("Nguyên liệu:\n" +
                "Đậu phụ\n" +
                "Mộc nhĩ\n" +
                "Nấm hương\n" +
                "Váng đậu\n" +
                "Lá lốt\n" +
                "Hành baro\n" +
                "Dầu ăn, muối, tiêu\n" +
                "Cách làm\n" +
                "Cách Làm Đậu Hũ Cuốn Lá Lốt Chiên Ngon Như Nhà Hàng\n" +
                "Bước 1:\n" +
                "Lá lốt rửa sạch, để ráo.\n" +
                "Mộc nhĩ, nấm hương ngâm nở với muối và một thìa bột năng, rồi đem thái nhỏ.\n" +
                "Hành baro băm nhỏ.\n" +
                "Váng đậu ngâm mềm, băm nhỏ.\n" +
                "Bước 2:\n" +
                "Nghiền nhuyễn đậu phụ cho thật mịn, nêm thêm chút muối sau đó trộn mộc nhĩ, nấm hương, váng đậu và hành baoro.\n" +
                "\n" +
                "Bước 3:\n" +
                "Cho nhân vào và cuộn lá lốt lại. Đun nóng dầu và thả chả lá lốt vào chiên cho chín, sau đó vớt ra để ráo dầu.");
        chebien8.add("Nguyên liệu:\n" +
                "10 bẹ lớn bắp cải tròn\n" +
                "10 bẹ lớn bắp cải tím\n" +
                "200g bắp non\n" +
                "200g su su\n" +
                "200g cà rốt\n" +
                "2 miếng đậu hũ chiên vàng\n" +
                "100g bông hẹ\n" +
                "1/2 chén chao\n" +
                "1 muỗng canh bơ đậu phộng.\n" +
                "Cách làm:\n" +
                "Bước 1:\n" +
                "Bắp cải trụng nước sôi, bỏ phần cọng cứng.\n" +
                "Bắp non, su su, cà rốt luộc chín, cắt khúc dài khoảng 5 cm.\n" +
                "Đậu hũ cắt như rau củ.\n" +
                "Bước 2:\n" +
                "Trải lá cải ra, cho rau củ, đậu hũ lên cuộn lại, cột bằng bông hẹ luộc.\n" +
                "Chao dằm nát, nêm vừa ăn, cho bơ đậu phộng vào trộn đều, để chấm với rau cuộn.");
        chebien8.add("Đổi thực đơn chay hàng ngày với canh rong biển hạt sen cũng là một gợi ý thú vị. Để làm món canh rong biển hạt sen, bạn cần chuẩn bị 10g rong biển, 100g hạt sen, 100g nấm rơm, 1 củ gừng nhỏ. Gia vị đi kèm gồm nước tương, muối, tiêu và bột ngọt.\n" +
                "\n" +
                "canh rong biển hạt sen cách nấu món chay ngon dễ làm\n" +
                "Canh rong biển hạt sen có tác dụng giải nhiệt rất tốt \n" +
                "\n" +
                "Rong biển ngâm cho nở rồi vớt ra để ráo nước. Nấm rơm rửa sạch, cắt đôi. Gừng cạo vỏ rửa sạch lại rồi đập dập. Bạn đun sôi ½ lít nước trên bếp, cho hạt sen và gừng vào đun lửa nhỏ trong khoảng 5 phút, sau đó cho nấm rơm vào, thêm nước tương, bột ngọt, muối, điều chỉnh lượng gia vị sao cho vừa ăn rồi tắt bếp.\n" +
                "\n" +
                "Chú ý không nên nấu rong biển quá lâu vì rong biển sẽ bị bở, nát, món ăn mất đi hương vị hấp dẫn.");
        chebien8.add("Nguyên liệu chính của món canh bổ dưỡng này bao gồm: 50g hạt sen, 50g nấm đông cô tươi, 50g nấm linh chi, 1 củ cà rốt, 100g đậu hũ non, ngò rí, tiêu xay, hạt nêm chay. Về cách chế biến, đầu tiên, bạn cắt cà rốt thành khúc vừa ăn.\n" +
                "\n" +
                "Nấm các loại sơ chế sạch, để ráo nước. Ngò rí cắt nhỏ. Đậu hũ non cắt miếng vừa ăn. Sau đó đun sôi 1 lít nước, cho hạt sen và cà rốt vào nấu khoảng 10 phút, tiếp tục cho các loại nấm vào nấu chín, cho 3 muỗng hạt nêm, cho đậu hũ vào tắt bếp, rắc thêm tiêu và ngò rí lên trên.");
        chebien8.add("Canh chua là món chay dễ làm, hấp dẫn làm cho bữa cơm gia đình thêm ngon miệng. Bạn chỉ cần chuẩn bị cà chua, đậu hũ non, me chua, dứa, đậu bắp, hành lá, ớt, giá, nấm rơm, rau mùi là đã có bát canh chua chay đậm hương vị Nam Bộ. Cách chế biến nhanh gọn, nguyên liệu đơn giản, dễ tìm, bát canh chua chay thanh mát chính là món ngon không thể bỏ qua.\n" +
                "\n" +
                "canh chua chay món chay ngon mỗi ngày\n" +
                "Canh chua chay có hương vị thanh mát hấp dẫn người ăn\n" +
                "\n" +
                "Đậu hũ non rửa sạch, trụng qua nước sôi sau đó cắt đôi. Đậu bắp rửa sạch, thái vát. Cà chua thái theo chiều dọc của quả cả ra thành 8 miếng kích cỡ vừa ăn. Dứa rửa sạch, thái lát mỏng. Nấm rơm rửa sạch, thái nhỏ. Hành lá, rau thơm nhặt sạch, rửa lại với nước rồi thái nhuyễn.\n" +
                "\n" +
                "Bạn nấu nước sôi, cho me vào đến khi me mềm thì vớt ra, cho tiếp đậu hũ non, nấm rơm, đậu bắp, cà chua và giá vào. Me dầm nhuyễn, nêm nếm thêm gia vị sao cho vừa ăn. Sau cùng khi các nguyên liệu đã chín đều thì bạn rắc hành lá, rau thơm và ớt vào để tăng hương vị cho món ăn.");
        chebien8.add("Nguyên liệu chế biến hủ tiếu chay gồm có 500g hủ tiếu khô, 3 quả lê, 3 quả táo, 2 củ cà rốt, 1 củ cải trắng, 8 miếng đậu hũ, 8 tai nấm đông cô, 8 cái nấm bào ngư, tàu hũ ky, 1 gói tôm chay, hành boa rô, ngò, hẹ, giá sống, xà lách cùng gia vị muối, đường phèn, hạt nêm chay.\n" +
                "\n" +
                "hủ tiếu chay các món chay ngon dễ làm\n" +
                "Hủ tiếu chay có hương vị thơm ngon, nước dùng ngọt thanh\n" +
                "\n" +
                "Hủ tiếu khô ngâm nước, trụng qua nước sôi và để ráo. Làm sạch các nguyên liệu cà rốt, củ cải trắng, nấm rồi cắt khúc vừa ăn. Tôm chay ngâm nước ấm cho nở. Đậu hũ, tàu hũ ky chiên vàng. Ngò, hẹ, giá sống, xà lách, hành boa rô rửa sạch.\n" +
                "\n" +
                "Ngò, hành boa rô cắt nhỏ, hẹ cắt khúc. Tiếp đến bạn hầm chín táo, lê và lọc lấy nước dùng. Thêm cà rốt, củ cải trắng vào nấu mềm với nước dùng, nêm nếm gia vị với muối, đường, hạt nêm chay sao cho vừa ăn.\n" +
                "\n" +
                "Phi thơm hành boa rô rồi cho tôm chay, nấm bào ngư, nấm trắng, đậu hũ vào xào, thêm một ít nước dùng rồi và đun lửa liu riu. Sau khi cà rốt, củ cải trắng chín mềm, cho hủ tiếu trụng vào bát, chan nước dùng và cho hỗn hợp đậu hũ, các loại nấm xào, ngò, hẹ, boa rô phi vàng lên trên. Hủ tiếu chay ăn kèm với giá sống, xà lách, chanh và ớt để tăng thêm mùi vị cho món ăn.");
        chebien8.add("Nguyên liệu chính bao gồm bánh đa nem, miến, cà rốt, hành tây, nấm hương, mộc nhĩ, hành lá. Gia vị chế biến không thể thiếu hạt nêm, tiêu, dầu ăn.\n" +
                "\n" +
                "Sau bước sơ chế và làm sạch, bạn trộn đều các nguyên liệu, ướp gia vị rồi cuốn nhân thịt với tàu hũ ky, đem chiên giòn trên chảo ngập dầu là đã có món nem rán chay rất thơm ngon rồi. Nếu không thích món nem nhiều dầu mỡ, bạn có thể thay tàu hũ ky bằng bánh đa nem. Đừng ngần chế biến nem rán chay để mâm cơm chay của nhà mình thêm màu sắc nhé.");
        chebien8.add("Cách làm canh bông cải xanh chay rất đơn giản, bạn chỉ cần chuẩn bị các nguyên liệu gồm 300g bông cải xanh, 150g nấm rơm, 100g cà rốt, hành boa rô, cùng gia vị như hạt nêm, bột ngọt, muối, tiêu.\n" +
                "\n" +
                "\n" +
                "canh bông cải chay các món chay ngon dễ nấu\n" +
                "Bữa ăn chay không thể thiếu món canh bông cải xanh ngọt mát (Ảnh: Internet)\n" +
                "\n" +
                "Trước khi nấu canh, bạn sơ chế bông cải, cắt bỏ phần già, lấy lá non, thái miếng vừa ăn rồi ngâm qua nước muối loãng, sau đó rửa sạch, để ráo nước. Nấm rơm rửa sạch, để ráo nước rồi cắt làm đôi. Cà rốt cạo vỏ, rửa sạch, để ráo nước rồi thái khúc cùng kích cỡ với bông cải. Hành boa rô rửa sạch, thái nhỏ.\n" +
                "\n" +
                "Tiếp đến bạn bắc chảo lên bếp, cho dầu vào, phi thơm hành boa rô rồi cho nấm rơm vào xào khoảng 5 phút. Sau khi nấm chín thì bạn bắc nồi nước lên bếp, đun sôi rồi thả cà rốt, bông cải xanh vào. Nêm nếm gia vị với hạt nêm, bột ngọt và một chút muối, chú ý hớt bọt để nước canh được trong.\n" +
                "\n" +
                "Quan sát thấy bông cải đã chín mềm thì rắc tiêu và một ít hành ngò để món ăn dậy mùi thơm hấp dẫn rồi tắt bếp. Món canh bông cải xanh nấu chay này ăn với cơm nóng là ngon nhất.");
        chebien8.add("Nguyên liệu chính bao gồm: 2 miếng đậu hũ, 1 củ sen nhỏ, 1 củ cà rốt, 1 củ cải, 50g nấm hương hoặc có thể thay thế bằng nấm rơm. Phần gia vị gồm 3 muỗng muối, 3 muỗng xì dầu, 5 tép tỏi đập dập, 2 muỗng nhỏ hạt tiêu, 2 muỗng nước màu đường.\n" +
                "\n" +
                "\n" +
                "đậu hũ xào rau củ cách làm món chay ngon\n" +
                "Đậu hũ xào rau củ là món chay dễ làm, hương vị hấp dẫn (Ảnh: Internet)\n" +
                "\n" +
                "Cách thực hiện như sau: Đậu hũ rửa sạch, cắt thành miếng vuông vừa ăn và chiên giòn 4 mặt. Củ sen gọt vỏ, cắt miếng rồi ngâm trong bát nước giấm pha loãng hoặc nước cốt chanh để củ sen không bị thâm.\n" +
                "\n" +
                "Cà rốt, củ cải bào vỏ, thái khúc. Nấm rửa sạch, ngâm vào bát nước muối loãng khoảng 10 – 15 phút cho nấm nở rồi rửa sạch. Sau đó, bạn cho đậu hũ, củ sen, cà rốt, củ cải, nấm và gia vị vào chảo, xào khoảng 1 phút đến khi các nguyên liệu chín đều.");
        chebien8.add("Nguyên liệu làm gỏi đu đủ chay gồm có 300g đu đủ, 1 củ cà rốt, 3 quả dưa leo, 3 miếng đậu hũ hoặc đậu hũ ky, rau răm, đậu phộng rang và các loại gia vị đường, nước mắm, muối, nước cốt chanh. Đu đủ gọt vỏ, bào sợi mỏng. Cà rốt gọt vỏ, thái sợi mỏng. Dưa leo rửa sạch, gọt vỏ rồi thái sợi. Rau răm nhặt bỏ lá úa, rửa sạch rồi để ráo nước.\n" +
                "\n" +
                "Đậu hũ cắt sợi rồi chiên giòn trên chảo dầu. Sau khi đậu hũ đã nguội, bạn ướp đu đủ, cà rốt, dưa leo, đậu hũ cùng với với hỗn hợp nước mắm, đường, muối và nước cốt chanh, trộn đều để các nguyên liệu thấm gia vị. Sau cùng cho rau răm vào trộn và rắc một ít đậu phộng rang để món ăn tăng hương vị thơm ngon.");
        chebien8.add("Những ngày ăn chay nóng nực, còn gì tuyệt bằng việc thưởng thức một bát súp đậu đỏ vừa thơm ngon, mát lành lại vừa có thể giảm cân hiệu quả. Đậu đỏ có tác dụng thanh lọc cơ thể, giảm cân, bảo vệ đường ruột và hỗ trợ hệ tiêu hóa rất tốt. Ăn súp đậu đỏ đều đặn hàng tuần sẽ giúp bạn có một cơ thể cân đối và làn da khỏe mạnh.");
        chebien8.add("Giá tươi sống chứa nhiều vitamin và khoáng chất. Chế biến món giá xào đậu phụ là cách bổ sung chất dinh dưỡng rất tốt cho cơ thể. Giá sau khi mua về, bạn nhặt bỏ rễ giá, rửa sạch nhiều lần với nước rồi vớt ra để ráo. Hành lá, hành khô, rau mùi rửa sạch, thái nhỏ.\n" +
                "\n" +
                "Tiếp đến chiên vàng đậu hũ cho đến khi đậu chín đều hai mặt. Đun nóng chảo, đổ dầu ăn vào rồi phi thơm hành khô, cho đậu vào đảo nhẹ tay, nêm nước mắm, hạt nêm và muối cho vừa ăn. Sau khi đậu đã thấm nước mắm thì cho giá vào xào lửa lớn, nhanh tay đảo đều trong khoảng 4 – 5 phút rồi tắt bếp. Rắc hành lá, rau mùi, tiêu xay lên trên món ăn, múc ra đĩa và thưởng thức.");
        chebien8.add("Một món chay khác không kém phần hấp dẫn chính là đậu hũ kho sả ớt. Đậu hũ non mềm, chiên vàng đều rồi kho gia vị đậm đà với sả, ớt cay nồng tạo nên một món ăn có hương vị đặc biệt cuốn hút. Màu vàng đậm, đỏ tươi đẹp mắt của sả, ớt khiến món ăn hấp dẫn và kích thích vị giác hơn.\n" +
                "\n" +
                "\n" +
                "đậu hũ kho sả ớt món chay ngon dễ làm\n" +
                "Đậu hũ non mềm, chiên vàng đều rồi kho gia vị đậm đà với sả, ớt cay nồng (Ảnh: Internet)\n" +
                "\n" +
                "Sau khi rửa đậu hũ, bạn cắt thành những miếng nhỏ vừa ăn, đem chiên ngập dầu trên chảo nóng. Sả bóc vỏ, rửa sạch, băm nhuyễn. Ớt sừng bỏ hạt, thái nhuyễn. Phi thơm sả, ớt trong nồi, sau đó đổ đậu hũ đã chiên vào đảo đều và kho đến khi đậu chín mềm. Thêm vào xì dầu, muối, đường, bột ngọt, hạt nêm và một chút nước để có nước kho sền sệt, vị mặn đậm đà.");
        chebien8.add("Bí đỏ là một trong những thực phẩm rất được ưa chuộng và có thể dễ dàng để chế biến thành nhiều món ăn đa dạng, thơm ngon. Hạt bí đỏ chứa nhiều axit béo omega – 3, omega – 6 và nhiều chất physterol tốt cho sức khỏe\n" +
                "\n" +
                "Trong bí đỏ cũng chứa hàm lượng axit glutamine đóng vai trò quan trọng trong hoạt động của não bộ. Bên cạnh đó, đậu phộng cũng có công dụng giảm lượng cholesterol và ngăn ngừa nguy cơ mắc các bệnh về tim. Ăn canh bí đỏ đậu phộng thường xuyên sẽ cải thiện, tăng cường trí não cũng như giúp bạn giảm căng thẳng, mệt mỏi.");

    }
    public void kho(){
        stringArrayList9.add("THỊT LỢN KHO DƯA CẢI CHUA");
        chebien9.add("Nguyên liệu\n" +
                "\n" +
                "Thịt lợn ba chỉ: 300g\n" +
                "Dưa cải chua: 150g\n" +
                "Hành khô, tỏi\n" +
                "Gia vị: dầu ăn, hạt nêm, muối\n" +
                "Cách làm\n" +
                "\n" +
                "Ngâm dưa muối chua trong nước sạch khoảng 10 phút để dưa bớt mặn rồi vớt ra, vắt bớt nước.\n" +
                "\n" +
                "Thịt lợn rửa sạch, thái miêng vừa ăn rồi ướp với hạt nêm, nước mắm, hành tỏi băm nhỏ. Ướp khoảng 15 phút cho thịt ngấm gia vị.\n" +
                "\n" +
                "Cho thịt đã ướp gia vị vào nồi xào qua với chút nước mắm cho thịt săn lại. Sau đó cho nước và một chút nước hàng vào nồi sao cho gần ngập mặt thịt, đun nhỏ lửa cho đến khi nước trong nồi cạn bớt thì cho dưa chua vào kho cùng.\n" +
                "\n" +
                "Tiếp tục để nhỏ lửa cho đến khi cạn nước, nêm hạt tiêu cho nồi thịt kho, đảo đều rồi tắt bếp. Cho thịt kho dưa chua ra đĩa rồi thưởng thức với cơm nhé!\n" +
                "\n");
        stringArrayList9.add("THỊT KHO RUỐC SẢ");
        chebien9.add("Nguyên liệu:\n" +
                "\n" +
                "Thịt ba chỉ: 500 gr thái miếng vừa\n" +
                "5 củ sả thái nhuyễn\n" +
                "1 củ tỏi băm nhỏ\n" +
                "3 thìa đường\n" +
                "3 thìa mắm ruốc\n" +
                "Ớt bột tùy sở thích ăn cay\n" +
                "Các bước làm:\n" +
                "\n" +
                "Hòa 3 thìa đường, 3 thìa mắm ruốc, và 1/2 thìa ướt bột vào 1 cái bát và quậy đều.\n" +
                "\n" +
                "Đun nóng chảo, cho thịt vào rán 7p để mỡ chảy ra, sau đó cho tỏi và sả bằm vào xào, xào thêm 5p để xả chín vàng thơm.\n" +
                "\n" +
                "Cho bát mắm ruốc vào chảo, đảo đều, rim trong 10 để nhỏ lửa để thịt ngấm gia vị và mắm ruốc keo lại rồi tắp bếp.");
        stringArrayList9.add(" Thịt ba chỉ kho củ riềng");
        chebien9.add("Nguyên liệu làm Thịt ba chỉ kho củ riềng:\n" +
                "\n" +
                "500g thịt ba chỉ\n" +
                "3 tép tỏi\n" +
                "1 củ riềng\n" +
                "1 củ hành tím\n" +
                "1 trái ớt sừng\n" +
                "2 cây hành lá\n" +
                "2 muỗng đường cát trắng\n" +
                "3 muỗng nước mắm\n" +
                "Cách làm Thịt ba ba chỉ kho củ riềng:\n" +
                "\n" +
                "Thịt ba chỉ bỏ phần da, cắt miếng nhỏ dày khoảng 0.5cm.\n" +
                "Riềng giã nát. Trộn đều nước mắm, đường, ớt băm, tỏi băm trong một chén nhỏ.\n" +
                "\n" +
                "Ướp thịt\n" +
                "\n" +
                "Xào xơ thịt cho săn lại và hơi cháy xém các cạnh. Sau đó trộn chén nước mắm vào, đảo đều, nấu khoảng 5 phút. Cuối cùng cho riềng vào, trộn đều, để 3-5 phút cho thịt ráo là được.\n" +
                "\n" +
                "Chiên thịt\n" +
                "\n" +
                "Gắp thịt ra dĩa và trang trí. Cuối cùng là thưởng thức thành quả nào. \n" +
                "\n");
        stringArrayList9.add("Heo quay kho cải chua");
        chebien9.add("Nguyên liệu làm Heo quay kho cải chua:\n" +
                "\n" +
                "400g thịt heo quay\n" +
                "200g cải chua\n" +
                "2 trái ớt\n" +
                "2 muỗng hành tím băm\n" +
                "1 muỗng bột ngọt\n" +
                "2 muỗng dầu ăn\n" +
                "1 muỗng đường cát trắng\n" +
                "1 muỗng hạt nêm\n" +
                "1 muỗng nước mắm\n" +
                "Cách làm Heo quay kho cải chua:\n" +
                "\n" +
                "Heo quay chặt thành từng miếng mỏng vừa ăn.Dưa cải chua rửa qua nhiều lần với nước cho bớt mặn, cắt khúc vừa ăn.\n" +
                "\n" +
                "Làm nóng dầu ăn trong chảo, phi thơm hành tím băm rồi cho thịt heo quay vào xào khoảng 5 phút.Cho cải chua vào xào cùng, 1/2 chén nước, nêm đường, bột ngọt, hạt nêm và nước mắm.\n" +
                "\n" +
                "Tiếp tục kho đến khi ngấm gia vị rồi tắt bếp. Cho món ăn ra đĩa, bạn có thể ăn kèm với cơm và ớt nếu muốn.");
        stringArrayList9.add("Cá nục kho cà");
        chebien9.add("Nguyên liệu làm Cá nục kho cà:\n" +
                "\n" +
                "700g cá nục\n" +
                "500g cà chua\n" +
                "50g hành lá\n" +
                "15g hành tím băm\n" +
                "20g ớt bột\n" +
                "100g sốt cà chua\n" +
                "15g tỏi băm\n" +
                "2 muỗng đường cát trắng\n" +
                "1 muỗng muối\n" +
                "300ml nước dừa\n" +
                "2 muỗng nước mắm\n" +
                "10 trái ớt\n" +
                "1 muỗng hạt nêm\n" +
                "2 muỗng dầu ăn\n" +
                "Cách làm Cá nục kho cà:\n" +
                "\n" +
                "Cá nục làm sạch, cắt đôi. Cà chua cắt bỏ cuống, bỏ hạt, xắt hạt lựu. Tỏi và hành tím băm nhuyễn.\n" +
                "\n" +
                "sơ chế cá\n" +
                "\n" +
                "Xếp đầu hành trắng vào nồi đất, rồi đến 1 lớp cá nục, rãi đều lên trên cá nục ớt bột, muối, nước mắm và ớt hiểm\n" +
                "\n" +
                "7 cách làm món kho việt\n" +
                "\n" +
                "Lớp thứ 2 cũng tương tự, xếp hết số cá nục và những gia vị cũng như số ớt hiểm còn lại lên trên. Rót nước dừa vào nồi, mở lửa kho cá đến khi nước dừa sôi lên thì hạ lửa kho liu riu 30 phút (không đậy nắp nồi).\n" +
                "\n" +
                "7 cách làm món kho việt\n" +
                "\n" +
                "Trong lúc chờ kho cá sẽ làm nước sốt cà chua. Cho vào nồi dầu ăn, phi vàng hành tím và tỏi băm. Tiếp theo cho phần cà chua đã cắt hạt lựu vào, xào đều tay đến khi cà chua mềm nhừ.\n" +
                "\n" +
                "7 cách làm món kho việt\n" +
                "\n" +
                "Lúc này thêm cà chua cô đặc (tomato paste) vào, nêm thêm đường, hạt nêm, khuấy đều cho gia vị hòa tan vào sốt cà chua. Nêm nếm lại cho vừa miệng.\n" +
                "\n" +
                "7 cách làm món kho việt\n" +
                "\n" +
                "Sau khi cá nục được kho 30 phút, đổ sốt cà chua vừa nấu vào nồi, dùng đũa giàn đều nước sốt ra xung quanh. Đậy nắp, kho lửa liu riu ít nhất 30 phút đến khi ăn thử thấy thịt cá thấm sốt cà, nước sốt cà sền sệt là được. Nếu bạn muốn kho cá nục rục xương và có thể ăn xương được thì kho trên bếp lâu hơn, thi thoảng châm thêm nước dừa hoặc sốt cà để tránh làm cá bị cháy.\n" +
                "\n" +
                "7 cách làm món kho việt\n" +
                "\n" +
                "Cách làm đơn giản và nhanh chóng, chúng ta đã có ngay món cá nục kho rồi.");
        stringArrayList9.add("Thịt kho củ sen tương hột");
        chebien9.add("Nguyên liệu làm Thịt kho củ sen tương hột:\n" +
                "\n" +
                "200g thịt heo\n" +
                "159g củ sen\n" +
                "70g tương hột\n" +
                "1 trái ớt nhỏ\n" +
                "1 trái ớt sừng\n" +
                "2 cây hành lá\n" +
                "1 muỗng tỏi băm\n" +
                "1/2 muỗng tiêu\n" +
                "1 muỗng dầu ăn\n" +
                "1/2 muỗng muối\n" +
                "1 trái chanh\n" +
                "2,5 muỗng bột nêm\n" +
                "1,5 muỗng đường\n" +
                "Cách làm Thịt kho củ sen tương hột:\n" +
                "\n" +
                "Thịt heo cắt miếng vừa ăn, ướp với muối, hạt nêm, tiêu, đầu hành lá băm, tỏi băm trong khoảng 10-15 phút. Hành lá cắt khúc. Ớt hiểm đập dập. Ớt sừng cắt miếng vuông nhỏ. Củ sen gọt bỏ vỏ, cắt lát, ngâm nước có vắt 1 miếng chanh cho không bị thâm.\n" +
                "\n" +
                "Sơ chế sườn, sen\n" +
                "\n" +
                "Đặt nồi lên bếp, cho dầu ăn và đường vào đun thành nước màu. Cho thịt vào xào săn, thêm tương hột và củ sen vào, đảo đều. Cho thêm hạt nêm, đường và nước vào, tiếp tục kho ở lửa nhỏ đến khi nước sánh lại. Cho hành lá và ớt sừng, ớt hiểm vào đảo đều.\n" +
                "\n" +
                "7 cách làm món kho việt\n" +
                "\n" +
                "Độ mềm của thịt heo, giòn ngọt của của sen, hương vị của tương hột sẽ là món thịt kho hấp dẫn cho cả nhà.\n" +
                "\n");
        stringArrayList9.add("Thịt kho nấm và coca");
        chebien9.add("Nguyên liệu làm Thịt kho nấm và coca:\n" +
                "\n" +
                "400g thịt ba chỉ\n" +
                "10 cái nấm hương\n" +
                "200ml coca\n" +
                "1 cây hành lá\n" +
                "1/2 muỗng tỏi băm\n" +
                "1/2 muỗng tiêu\n" +
                "1,5 muỗng đường\n" +
                "1 muỗng hạt nêm\n" +
                "1/2 muỗng hành tím băm\n" +
                "1 muỗng dầu ăn\n" +
                "1 muỗng nước mắm\n" +
                "Cách làm Thịt kho nấm và coca:\n" +
                "\n" +
                "Thịt rửa sạch, cắt miếng vừa ăn, cho vào nồi với lượng nước xâm xấp. Đun sôi khoảng 2-3 phút rồi rửa lại thịt cho sạch.\n" +
                "\n" +
                "7 cách làm món ăn việt\n" +
                "\n" +
                "Ướp thịt với hạt nêm, nước mắm, tiêu và hành tỏi băm nhỏ.\n" +
                "\n" +
                "Cho đường và dầu ăn vào nồi, đun đến khi đường ngả màu vàng cánh gián. Cho thịt đã ướp vào đảo đều, nhanh tay để thịt áo nước màu.\n" +
                "\n" +
                "Thêm nấm hương rửa sạch. Sau đó thêm Coca vào. Đun nhỏ lửa đến khi nước thịt cạn bớt và sánh lại thì nêm lại gia vị vừa ăn rồi tắt bếp.\n" +
                "\n" +
                "7 cách làm món kho việt \n" +
                "\n" +
                "Lấy thịt ra đĩa, thêm chút hành lá và ăn với cơm nóng.\n" +
                "\n");
        stringArrayList9.add("Cá lóc kho tộ");
        chebien9.add("Nguyên liệu làm Cá lóc kho tộ:\n" +
                "\n" +
                "1 con cá lóc\n" +
                "2 nhánh hành lá\n" +
                "2 trái ớt\n" +
                "4 củ hành tím\n" +
                "1 muỗng nước màu\n" +
                "1/2 muỗng tiêu\n" +
                "1/2 muỗng bột ngọt\n" +
                "2 muỗng hạt nêm\n" +
                "2 muỗng đường cát trắng\n" +
                "3 muỗng nước mắm\n" +
                "Cách làm Cá lóc kho tộ:\n" +
                "\n" +
                "Cá lóc làm sạch, cắt khúc nhỏ dày khoảng 1.5-2 cm.\n" +
                "\n" +
                "7 cách làm món kho việt\n" +
                "\n" +
                "Pha loãng nước màu với 1,5 muỗng canh nước ấm. Xếp cá vào nồi đất, ướp với hạt nêm, muối, bột ngọt, đường, tiêu, nước mắm, nước màu đã pha và 2 trái ớt cắt nhỏ ướp trong khoảng 10 phút.\n" +
                "\n" +
                "7 cách làm món kho việt\n" +
                "\n" +
                "Đun sôi nồi cá vừa ướp. Hành tím cắt lát mỏng, phi sơ với dầu ăn. Khi nồi cá sôi cho hành tím cùng dầu vào trộn đều.\n" +
                "\n" +
                "7 cách làm món kho việt\n" +
                "\n" +
                "Thêm nước lọc vào rồi đậy nấp đun trong 30 phút. Sau đó cho hành lá, ớt cắt lát vào rồi tắt bếp.\n" +
                "\n" +
                "7 cách làm món kho việt\n" +
                "\n" +
                "Bày trí đẹp mắt và thưởng thức với cơm. Nếu muốn chấm cùng rau sống thì lúc kho không kho cạn sệt mà chừa lại một ít nước kho để chấm kèm.");
        stringArrayList9.add("Gà kho gừng sợi");
        chebien9.add("Nguyên liệu làm Gà kho gừng:\n" +
                "\n" +
                "600g thịt gà\n" +
                "1 củ gừng\n" +
                "3 nhánh ngò rí\n" +
                "1 muỗng bột nghệ\n" +
                "2 muỗng nước mắm\n" +
                "1 muỗng bột ngọt\n" +
                "2 muỗng dầu ăn\n" +
                "2 muỗng tỏi băm\n" +
                "2 muỗng hạt nêm\n" +
                "2 muỗng đường\n" +
                "1/2 muỗng tiêu\n" +
                "Cách làm Gà kho gừng sợi:\n" +
                "\n" +
                "Thịt gà chặt nhỏ, ướp với nước mắm, muối, đường, hạt nêm trong 10 phút. Gừng gọt vỏ, cắt sợi nhỏ.\n" +
                "\n" +
                "7 cách làm món kho việt\n" +
                "\n" +
                "Phi thơm tỏi băm cùng gừng cho dậy mùi rồi bỏ gà đảo đều với lửa nhỏ cho săn lại. Cho nước ướp gà, bột nghệ vào, 1 chén nước lọc, đảo đều. Sau đó, đem gà ra nồi nhỏ, đun nhỏ lửa đến khi nước gần cạn thì thêm bột ngọt vào, đảo đều cho thịt ngấm gia vị, tắt bếp.\n" +
                "\n" +
                "7 cách làm món kho việt\n" +
                "\n" +
                "Cho gà kho gừng ra đĩa, trang trí thêm ngò rí rồi dùng nóng với cơm.");


        anh9.add(R.drawable.sachanh);
        anh9.add(R.drawable.hapgung);
        anh9.add(R.drawable.caibexanh);
        anh9.add(R.drawable.tuongbot);
        anh9.add(R.drawable.giavi);
        anh9.add(R.drawable.muoixa);
        anh9.add(R.drawable.luot);
        anh9.add(R.drawable.tomhapnam);
        anh9.add(R.drawable.giavi);
    }
    public void xao(){
        stringArrayList10.add("Mực ống xào dứa");
        chebien10.add("Nguyên liệu\n" +
                "500g mực tươi;\n" +
                "1 trái dứa chín đã gọt vỏ;\n" +
                "1 củ nhỏ gừng tươi;\n" +
                "100ml rượu trắng;\n" +
                "Cần tây, rau ngò, tỏi tây;\n" +
                "Gia vị: Dầu ăn, nước mắm, muối, bột ngọt.\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Mực đổ vào chậu nước rửa sạch, lấy kéo hoặc dao cắt bỏ hết túi mực vứt đi, phần xương cứng dọc theo thân mực cũng rút bỏ. Nên rửa mực với một chút rượu trắng có pha một vài lát gừng để khử mùi tanh.\n" +
                "Rửa sạch trái dứa rồi bổ làm 4 phần bằng nhau, rồi tách dứa thành từng miếng nhỏ vừa nấu. Cần tây cắt bỏ phần rễ và phần gốc già, rửa sạch cắt khúc ngắn.\n" +
                "Tỏi tây rửa sạch chia làm hai phần: Phần đầu trắng xắt mỏng, phần còn lại xắt khúc như cần tây. Gừng củ rửa sạch, gọt vỏ, băm nhuyễn.\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Đặt một cái chảolên bếp cho một chút dầu ăn vào bật lửa, đợi khi dầu ăn sôi thì trút hết phần đầu trắng của tỏi tây vào cùng với số gừng băm nhuyễn vào phi thật thơm.\n" +
                "Sau đó, đổ mực vào đảo đều nhớ phải xào mực với ngon lửa lớn. Nêm thêm gia vị gổm: nước mắm, bột ngọt, hạt nêm cho vừa ăn, để ý mực vừa chín tới là bắc xuống bếp ngay tranh để chín quá mực sẽ bị dai.\n" +
                "Đổ mực vào một cái tô rồi lại bắc chảo lên cho tiếp một chút dầu ăn nữa vào rồi đổ dứa, tỏi tây, cần tây vào xào khoảng 5 phút. Cũng nêm thêm gia vị vào rồi dùng đũa đảo đều cho tới khi chín");
        stringArrayList10.add("Mực xào rau củ");
        chebien10.add("Nguyên liệu\n" +
                "2 con mực ống;\n" +
                "2 quả dưa leo;\n" +
                "1 quả cà chua;\n" +
                "1/3 quả thơm;\n" +
                "3,4 nhánh tỏi;\n" +
                "2 quả ớt tươi;\n" +
                "1 nhánh nhỏ gừng;\n" +
                "Gia vị: dầu ăn, hạt nêm, tiêu, muối, bột ngọt,…\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Mực tươi rút bỏ túi mực, mắt mực, mai mực và rửa sach. Tiếp đó thái mực hình vảy rồng hoặc hình bông hoa thành những miếng vừa ăn. Để khủ mùi tanh mực trần sơ với nước nóng băm vào ít gừng.\n" +
                "Gừng tươi thát lát, băm nhỏ. Thơm gọt vỏ, cắt bỏ các mắt, thái miếng có độ dày vừa ăn. Dưa leo gọt vỏ, thái chéo. Cà chua bổ múi cau.\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Bắc chảo lên bếp, cho vào 1 muỗng dầu ăn và phi thơm phần tỏi băm. Tỏi thơm thì cho mực vào xào qua cho mực săn lại.\n" +
                "Sau đó cho cà chua, khóm và phần gừng băm còn lại vào. Tiếp tục xào với lửa vừa, nêm thêm các loại gia vị như bột canh, hạt nêm, mì chính. Khi thấy các loại nguyên liệu chín tới thì tắt bếp, rắc thêm hạt tiêu và trút mực xào dưa leo ra đĩa, thưởng thức khi còn nóng.");
        stringArrayList10.add("Sườn xào chua ngọt");
        chebien10.add("Nguyên liệu\n" +
                "600g Sườn lợn non;\n" +
                "1 củ tỏi;\n" +
                "3 củ hành tím;\n" +
                "5 muỗng giấm gạo;\n" +
                "Gia vị: Hạt tiêu, bột canh, dầu ăn, đường, nước mắm, tương ớt.\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Sườn non rửa sạch với nước. Sau đó, chần với nước sôi để bớt mùi hôi. Chẻ sườn thành từng dẻ rồi chặt thành từng miếng vừa ăn.\n" +
                "Pha nước sốt sườn xào chua ngọt: 5 thìa đường, 4 thìa nước mắm, 5 thìa dấm, 3 thìa nước sôi để nguội và 4 thìa tương ớt.\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Đun sôi chảo trên bếp, cho sườn vào xào. Có thể cho thêm một chút nước và 1 thìa bột canh để sườn không bị cháy cũng như ngấm gia vị.\n" +
                "Đảo đều trong 3p sau đó đổ nước xâm xấp. Sau đó, bạn đậy vung, hạ nhỏ lửa và om trong khoảng 15p nữa cho sườn chín mềm cũng như ngấm gia vị.\n" +
                "Khi sường đã mềm, bạn cho nước sốt vào và đảo tiếp lần nữa. Để lửa ở mức thấp nhất, om thêm 3 phút nữa. Cho tiếp tỏi băm nhuyễn vào đảo đều. Nêm nếm gia vị một lần nữa cho vừa ăn rồi tắt bếp. Bạn múc ra đĩa và trang trí cho đẹp mắt.");
        stringArrayList10.add("Thịt heo xào bông cải");
        chebien10.add("Nguyên liệu\n" +
                "500g bông cải xanh;\n" +
                "200g thịt thăn heo;\n" +
                "2 trái cà chua;\n" +
                "Vài tép tỏi;\n" +
                "Hành lá, ngò rí;\n" +
                "Gia vị: Muối, tiêu, đường, nước mắm, dầu ăn.\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Thịt thăn heo rửa sạch xắt lát mỏng vừa ăn, ướp với 2 muỗng cà phê nước mắm, tỏi băm, ¼ muỗng cà phê tiêu say.\n" +
                "Bông cải xanh tách nhánh nhỏ, rửa sạch, ngâm nước muối loãng khoảng 10 phút. Cà chua rửa sạch, xắt miếng nhỏ. Tỏi bóc vỏ, đập dập.\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Bắc chảo lên bếp, cho dầu vào phi thơm tỏi. Cho thịt heo đã ướp vào xào nahnh tay, lửa lớn. Khi thịt chín, cho bông cải và cà chua vào tiếp tục xào chín. Sau đó cho hành lá vào trộn đều.\n" +
                "Múc bông cải ra đĩa, rắc thêm ít tiêu lên trên mặt. Dọn kèm chén xì dầu với vài lát ớt để chấm.");
        stringArrayList10.add("Thịt bò xào ngồng tỏi");
        chebien10.add("Nguyên liệu\n" +
                "200g thịt bò;\n" +
                "200g ngồng tỏi;\n" +
                "1 củ tỏi, hành khô;\n" +
                "Gia vị: dầu ăn, bột nêm, bột ngọt.\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu Thịt bò rửa sạch, thái mỏng. Ngồng tỏi tước sơ vỏ, cắt khúc rửa sạch. Sau đó trần qua nước sôi.\n" +
                "\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Phi thơm hành, tỏi với dầu ăn. Cho thịt bò vào xào sơ, nêm gia vị vừa miệng rồi cho thịt bò ra đĩa. Sau đó, cho ngồng tỏi vào chảo xào\n" +
                "Cuối cùng cho thịt bò vào xào cùng ngồng tỏi. Nêm mì chính rồi cho thịt bò xào ngồng tỏi ra đĩa.");
        stringArrayList10.add("Đậu hũ non xào bò");
        chebien10.add("Nguyên liệu\n" +
                "300g thịt thăn bò;\n" +
                "1 hộp đậu phụ non;\n" +
                "1/2 củ cà rốt;\n" +
                "1/2 cây súp lơ xanh;\n" +
                "1 củ hành tây nhỏ;\n" +
                "Gia vị: Muối, dầu hào, đường, nước tương, hành lá, tỏi, hạt tiêu.\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Thịt thăn bò rửa sạch, thái lát mỏng, ướp vào bát thịt bò một thìa nhỏ dầu hào, một ít hạt tiêu, một ít dầu ăn, trộn đều, ướp khoảng 30 phút.\n" +
                "Hành tây, súp lơ xanh, cà rốt cạo vỏ, rửa sạch. Súp lơ xanh tước bỏ bớt phần xơ cứng, cắt khúc ngắn. Cà rốt thái khoanh tròn, hành tây bổ múi cau. Đậu phụ non rửa sạch, thái hạt lựu lớn.\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Đun nóng ba thìa nhỏ dầu ăn, phi tỏi thơm, cho thịt bò vào xào nhanh tay lửa lớn, thịt bò chín tái đổ ra bớt, để qua một bên.\n" +
                "Dùng lại chảo đó, cho cà rốt, súp lơ xanh vào xào, rưới vào một thìa xanh xì dầu, một ít dầu hào, một ít đường và một ít nước lọc, nấu sôi.\n" +
                "Nấu từ 6 -9 phút, ăn thử phần cà rốt chín thì cho tiếp đậu phụ non, hành tây vào đun cùng, cầm tay cầm của chảo lắc đều, đậy kín nắp, đun sôi thêm khoảng 10 – 13 phút.\n" +
                "Nêm nếm lại gia vị cho vừa ăn, cuối cùng cho bát thịt bò đã xào vào nấu cùng, nấu tiếp khoảng 3 phút thì tắt bếp, thêm hành lá thái nhỏ vào, múc ra đĩa, rắc lên bề mặt một ít hạt tiêu dùng làm món mặn ăn với cơm.");
        stringArrayList10.add("Rau muống xào tỏi");
        chebien10.add("Nguyên liệu\n" +
                "1 bó rau muống;\n" +
                "4 nhánh tỏi;\n" +
                "Gia vị: Dầu ăn, muối, nước mắm, hạt nêm, bột ngọt.\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Rau muống nhặt sạch, bỏ những lá úa vàng, sâu già. Sau đó, đem ngâm với nước muối loãng trong chừng 10 – 15 phút, rửa sạch nhiều lần với nước rồi vớt ra rổ để ráo.\n" +
                "Tỏi bóc sạch lớp vỏ khô bên ngoài, đập dập và băm nhuyễn.\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Đun sôi một nồi nước lớn, cho chút muối vào để luộc rau muống được tươi xanh. Sau đó, cho rau muống vào luộc khoảng tầm 1 phút.\n" +
                "Chuẩn bị một âu nước đá. Sau đó, vớt rau muống ra khỏi nước luộc rau và cho ngay sang âu nước đá. Bước này sẽ giúp món rau muống xào tỏi ăn rất giòn ngon.\n" +
                "Bắc một chảo lớn lên bếp, cho một muỗng canh dầu ăn vào đun sôi. Sau đó, cho tỏi băm nhuyễn vào phi thơm rồi cho rau vào xào vừa chín. Nêm nếm gia vị muối, nước mắm, hạt nêm, bột ngọt cho món rao muống xào tỏi được ưng ý rồi tắt bếp.");
        stringArrayList10.add("Bông cải xào tương ớt");
        chebien10.add("Nguyên liệu\n" +
                "1 bông cải trắng;\n" +
                "2 củ tỏi;\n" +
                "1 trái chanh;\n" +
                "2 cây hành lá;\n" +
                "Gia vị: nước tương, tương ớt, dầu thực vật.\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu: Cắt bông cải làm đôi, bỏ cuống, cắt thành những miếng nhỏ và rửa sạch Hành lá nhặt, rửa sạch và cắt nhỏ. Tỏi bóc vỏ và băm nhuyễn. Chanh cắt đôi.\n" +
                "\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Cho dầu ăn vào chảo. Phi thơm tỏi, cho bông cải vào. Xào đều bông cải trên bếp khoảng vài phút đến khi bông cải trở vàng thì cho nước tương vào.\n" +
                "Vắt chanh vào xào đều. Sau đó cho hành lá vào. Xào đều bông cải, đến đây bông cải đã gần như chín rồi. Bạn lấy tương ớt cho vào chảo bông cải xào đều lần nữa là xong.");
        stringArrayList10.add("Đậu hũ xào bông cải");
        chebien10.add("Nguyên liệu\n" +
                "4 miếng đậu hũ non;\n" +
                "1 bông cải xanh;\n" +
                "2 tép tỏi;\n" +
                "1 muỗng canh bột bắp hòa tan;\n" +
                "Gia vị: tương đậu nành, xì dầu, dầu mè, đường, dầu thực vật.\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Bông cải cắt nhỏ và rửa sạch. Cho bông cải vào nồi nước sôi trần sơ. Cắt đậu hũ thành khối vuông vừa ăn và đặt sang một bên.\n" +
                "Tỏi bóc vỏ và băm nhuyễn. Trộn nước xốt: lấy một cái tô cỡ vừa, cho nước tương đậu nành, xì dầu, dầu mè, đường vào trộn đều.\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Đun nóng 2 muỗng canh dầu trong chảo sâu lòng trên lửa vừa và cho thêm tỏi vào phi thơm. Sau đó, thêm bông cải xanh và đảo nhanh tay trên lửa lớn đến khi bông cải chuyển màu xanh sáng.\n" +
                "Thêm đậu hũ non vào xào đều, chế nước gia vị vào đảo nhanh tay cho đều gia vị. Hòa tan bột bắp với 20ml nước lọc. Tiếp tục cho từ từ nước bột bắp vào, nấu thêm 2 phút và tắt bếp.");
        stringArrayList10.add("Bún xào chay");
        chebien10.add("Nguyên liệu\n" +
                "150g bún gạo;\n" +
                "1 miếng tàu hũ chiên;\n" +
                "1 củ cà rốt;\n" +
                "200g cải thìa;\n" +
                "300g nấm đùi gà;\n" +
                "1 miếng tàu hũ ky;\n" +
                "Tỏi, ớt;\n" +
                "Gia vị: Nước tương, bột ngọt, đường, hạt nêm chay.\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Cải thìa chẻ đôi hoặc chẻ 3 rồi đem ngâm với nước muối pha loãng. Tiếp theo, đem rửa lại với nước sạch rồi vớt ra để ráo. Bún gạo đem trụng với nước sôi cho mềm rồi vớt ra để ráo nước. Sau đó, cho dầu ăn vào bún và trộn đều lên.\n" +
                "Tàu hũ đem chiên vàng giòn các mặt rồi cắt thành từng miếng vừa ăn. Tàu hũ ky đem ngâm với nước cho mềm rồi cắt miếng vừa ăn. Cà rốt gọt sạch vỏ, rửa sạch rồi thái sợi.\n" +
                "Nấm đùi gà đem ngâm với nước, rửa sạch rồi xé thành từng sợi. Tỏi bóc vỏ, ởt rửa sạch băm nhỏ.\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Cho chảo lên bếp, cho dầu ăn vào đun nóng rồi cho ½ tỏi băm vào phi thơm. Tiếp đến, bạn cho cà rốt và nấm đùi gà vào xào săn lại.\n" +
                "Tiếp theo, bạn cho cải thìa vào cùng cho đến khi các nguyên liệu vừa chín tới. Lúc này bạn cho tàu hũ ky vào. Nêm nếm với 1 muỗng nước tương, ít bột ngọt, ít đường, ½ muỗng hạt nêm rồi trộn đều lên cho vừa ăn.\n" +
                "Khi nguyên liệu đã thấm gia vị, tắt bếp và cho bún gạo vào trộn đều lên. Có thể cho thêm 1 muỗng dầu mè vào để món ăn ngon hơn.\n" +
                "Làm nước tương ăn bún: cho 6 muỗng canh nước tương, 4 muỗng canh nước dừa, 2 muỗng đường, ít bột ngọt. Sau đó bắc lên bếp nấu sôi rồi tắt bếp. Khi nước chấm nguội hẳn thì bạn cho tỏi và ớt băm vào trộn đều lên.");
        stringArrayList10.add("Mì xào hải sản");
        chebien10.add("Nguyên liệu\n" +
                "2 vắt mì tôm;\n" +
                "400g tôm sú;\n" +
                "300g mực ống;\n" +
                "300g chả cá viên;\n" +
                "500g rau cải xanh;\n" +
                "200g giá sống;\n" +
                "200g đậu cô ve;\n" +
                "Gừng, ớt, cà rốt, hành tây, hành lá, hành tím, tỏi;\n" +
                "Gia vị: Hạt nêm, tiêu, nước mắm, đường, bột ngọt, dầu ăn, dầu ăn.\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Mì chần qua nước sôi để sợi mì rời và mềm hơn, sau đó chần qua nước lạnh để sợi mì không bị dính. Để mì ráo nước.\n" +
                "Tôm bóc vỏ, bỏ đầu, rửa sạch rồi để cho ráo nước. Ướp ½ phần tôm với ½ muỗng hạt nêm, ½ muỗng bột ngọt, ½ muỗng đường, thêm một chút hạt tiêu, dầu ăn và hành tỏi băm nhuyễn.\n" +
                "Mực làm sạch, rút túi mực rồi để cho ráo nước, thái mực thành những miếng vừa ăn. Chả cá viên cắt làm đôi.\n" +
                "Rau cải xanh rửa thật sạch để ráo nước, cắt thành khúc ngắn vừa. Giá rửa sạch, bỏ rễ rồi để cho ráo nước. Đậu cô ve rửa sạch, để ráo nước rồi cắt khúc, để nguyên nhưng khứa nhẹ thân đậu.\n" +
                "Cà rốt gọt vỏ, rửa sạch rồi sợi hoặc tỉa hoa cho đẹp mắt. Hành tây bóc vỏ, rửa sạch, cắt hình cau nhỏ, hành lá cắt nhỏ. Hành tỏi khô bóc vỏ, rửa sạch rồi băm nhuyễn.\n" +
                "Bước 2: Chế biến\n" +
                "\n" +
                "Cho dầu ăn vào đun nóng trên chảo chống dính, cho hành tỏi đã băm nhuyễn vào phi thơm. Cho tiếp tôm và mực vào xào cho tái rồi đổ ra đĩa để riêng.\n" +
                "Phi thơm hành tỏi rồi băm nhuyễn, cho thêm bột ớt nếu bạn muốn ăn cay. Cho cá viên vào xào qua trong khoảng 3 phút, cho phần cà rốt, đậu cô ve vào xào chín tới rồi đổ riêng ra một tô khác.\n" +
                "Phi thơm gừng tươi, cho cải xanh, giá sống và mì vào xào trên bếp trong khoảng 1 – 2 phút, đổ hỗn hợp tôm mực và cà rốt, đậu cô ve… đã xào vào. Đảo đều hỗn hợp rồi nêm nếm thêm gia vị vừa ăn. Trước khi tắt bếp thì cho thêm hành lá, hành tây và chút tiêu vào để món ăn có thêm hương vị thơm ngon.\n" +
                "Cho mì ra đĩa, thêm rau và hải sản trang trí cho đẹp mắt rồi thưởng thức khi còn nóng. Món ăn có thể ăn kèm với tương ớt hoặc một số loại rau sống để không bị ngấy.\n");
        stringArrayList10.add("Nõn đuôi heo xào dưa chua");
        chebien10.add("Nguyên Liệu\n" +
                "\n" +
                "1 bát nhỏ Dưa chua\n" +
                "\n" +
                "1 cái nõn đuôi\n" +
                "\n" +
                "1/2 quả cà chua\n" +
                "\n" +
                "Hành hoa\n" +
                "\n" +
                "Hat tiêu, hat nêm, nước mắm\n" +
                "\n" +
                "cách làm\n" +
                "\n" +
                "Nõn đuôi mua về rửa và bóp sạch với muối.luộc sơ rồi thái miếng vừa ăn\n" +
                "\n" +
                "Cho hành khô vao phi thơm.cho. Cà chua và dưa vao đảo đều.cho nõn đuôi vào xào\n" +
                "Nêm nếm gia vi vừa ăn, rắc hành hoa va tiêu nóng lên đảo đều. Cho vài giọt mắm cho thơm trước khi trút ra đĩa");
        stringArrayList10.add("Lòng gà xào mướp hương");
        chebien10.add("Nguyên liệu:\n" +
                "\n" +
                "– Lòng gà: 2 bộ\n" +
                "\n" +
                "– Mướp hương: 2 quả\n" +
                "\n" +
                "– Hành hoa: 2 nhánh\n" +
                "\n" +
                "– Dầu ăn\n" +
                "\n" +
                "– Bột nêm, súp, mì chính\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "– Mướp gọt vỏ, rửa sạch, thái miếng vừa ăn.\n" +
                "\n" +
                "– Lòng gà sau khi làm sạch ướp gia vị với 1 thìa hạt nêm, hành băm nhỏ.\n" +
                "\n" +
                "– Phi thơm hành với chút xíu dầu ăn cho lòng gà vào xào chín. Sau đó xúc lòng gà ra đĩa.\n" +
                "\n" +
                "– Vẫn chảo đó thêm chút dầu ăn cho mướp hương vào xào nhanh tay, nêm chút xíu gia vị.\n" +
                "\n" +
                "– Cuối cùng cho lòng gà vào xào đảo đều, nêm gia vị vừa miệng.\n" +
                "\n" +
                "– Thêm chút hành hoa thái nhỏ và chút mì chính.\n" +
                "\n" +
                "Tắt bếp cho lòng gà xào mướp ra đĩa ăn cùng với cơm trắng.");
        stringArrayList10.add("Cà tím xào thịt băm đưa cơm");
        chebien10.add("Nguyên liệu:\n" +
                "\n" +
                "– 2 quả cà tím to\n" +
                "\n" +
                "– 150 gr thịt heo băm nhỏ, bạn có thể dùng thịt heo xay\n" +
                "\n" +
                "– Gia vị: 2 muỗng canh dầu hào; 1/2 muỗng cà phê tiêu; 1 muỗng cà phê dầu mè; 1 muỗng canh đường; 2 muỗng canh xì dầu; 1 muỗng canh tỏi băm\n" +
                "\n" +
                "– 1 nhánh hành lá thái nhỏ\n" +
                "\n" +
                "– 1muỗng cà phê bột năng hòa chung 2 muỗng canh nước lạnh\n" +
                "\n" +
                "– 300 ml nước lạnh hay nước xương gà.\n" +
                "\n" +
                "Thực hiện:\n" +
                "\n" +
                "Bước 1: Cà tím rửa sạch, thái miếng to. Bắc chảo dầu lên bếp, dầu nóng cho cà vào chiên nhanh khoảng 2 phút. Sau đó vớt cà ra tô.\n" +
                "\n" +
                "Bước 2: Nấu 1 nồi nước sôi, cho cà đã chiên vào luộc 3-4 phút.\n" +
                "\n" +
                "Sau đó vớt cà ra tô. (Cách này giúp miếng cà loại bỏ bớt dầu và săn bóng rất ngon).\n" +
                "\n" +
                "Bước 3: Bắc chảo lên bếp, cho 1 muỗng canh dầu, dầu nóng cho tỏi băm vào xào thơm.\n" +
                "\n" +
                "Bước 4: Tiếp đó cho thịt băm vào xào tơi.\n" +
                "\n" +
                "Bước 5: Cho hết gia vị vào xào cho thịt thấm. Kế đến cho nước vào nấu sôi, khi nước sôi cho chén nước bột năng vào khuấy đều. Cuối cùng cho cà tím vào đảo đều. Nấu thêm vài phút, nêm nếm lại vừa ăn là tắt bếp.\n" +
                "Cho cà ra dĩa, rắc hành lá thái nhỏ lên trên. Món này dùng nóng với cơm rất tuyệt.");
        stringArrayList10.add("Măng xào thịt thơm ngon và hấp dẫn");
        chebien10.add("Nguyên liệu\n" +
                "\n" +
                "Thịt ba chỉ: 300g\n" +
                "\n" +
                "Măng: 600g\n" +
                "\n" +
                "Dầu ăn: 100ml\n" +
                "\n" +
                "Hành tươi, hành khô\n" +
                "\n" +
                "Nước mắm, muối, mì chính\n" +
                "\n" +
                "Lưu ý, để cách làm măng xào thịt được ngon nhất thì bạn nên chọn mua loại thịt ba chỉ ngon, ít mỡ như vậy khi ăn sẽ không bị ngấy.\n" +
                "\n" +
                "Thực hiện cách làm măng xào thịt\n" +
                "\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "– Thịt ba chỉ mua về rửa sạch, thái miếng mỏng vừa ăn. Sau đó bạn đem số thịt đã thái ướp với chút nước mắm, hạt tiêu, mì chính. Bạn nên ướp trong khoảng thời gian từ 15 – 20 phút để cho thịt có thể ngấm gia vị.\n" +
                "\n" +
                "– Măng sau khi mua về bạn hãy rửa sạch lại với nước, chẻ thành những sợi dài, mỏng vừa ăn. Ngâm lại với nước trong vòng 30 phút, bóp lại sạch với muối giảm bớt vị hăng của măng, rửa lại với nước. Tiếp tục đem măng luộc chín mềm, vớt ra, để ráo nước.\n" +
                "\n" +
                "Trong măng có chứa độc tố, nếu chế biến không cẩn thận nó sẽ khiến người ăn bị ngộ độc. Chính vì vậy, để loại bỏ độc tố đó, bạn nên luộc lại măng một lần nữa trước khi thực hiện hướng dẫn làm măng xào thịt, việc làm này cũng làm giảm bớt vị đắng của măng. Sau đó vớt ra và để ráo nước.\n" +
                "\n" +
                "Bước 2: Thực hiện cách làm măng xào thịt\n" +
                "\n" +
                "Cho chảo lên bếp cùng một một chút dầu ăn. Khi dầu nóng thì cho hành khô vào phi thơm sau đó cho thịt ba chỉ vào đảo cùng đến thịt săn lại. Nên xào với lửa to để thịt nhanh chín và mềm. Sau đó bạn hãy cho măng vào xào cùng. Nêm nếm gia vị cho vừa ăn.\n" +
                "\n" +
                "Lưu ý: nếu khi xào măng bị khô bạn cho thêm chút nước dùng vào cách này vừa làm măng ngọt hơn , khi ăn măng sẽ mềm mà không bị khô.\n" +
                "\n" +
                "Khi măng chín bạn hãy cho hành lá vào đảo đều, nếu thích ăn cay thì bạn có thể cho thêm 1 vài lát ớt, đảo lại 1,2 lần sau đó tắt bếp và cho măng xào thịt ra đĩa, rắc thêm hạt tiêu cho thơm. Chỉ với một vài thao tác đơn giản là bạn đã hoàn thành cách làm măng xào thịt đơn giản tại nhà rồi.");


        anh10.add(R.drawable.sachanh);
        anh10.add(R.drawable.ab_khoai_lang_ken);
        anh10.add(R.drawable.ab_thach_dua);
        anh10.add(R.drawable.ab_che_khoai_lang);
        anh10.add(R.drawable.ab_xoai);
        anh10.add(R.drawable.ab_banh_goi);
        anh10.add(R.drawable.ab_khoai_tay);
        anh10.add(R.drawable.ab_banhranman);
        anh10.add(R.drawable.ab_tokbokki);
        anh10.add(R.drawable.ab_phomaique);
        anh10.add(R.drawable.ab_suachua);
        anh10.add(R.drawable.ab_banhplan);
        anh10.add(R.drawable.ab_banhkemchuoi);
        anh10.add(R.drawable.ab_suachua);
        anh10.add(R.drawable.cacbohydrate);
    }
    public void asang(){
        stringArrayList11.add("Cơm rang");
        chebien11.add("Nguyên liệu\n" +
                "300g gạo ngon và cho vào nồi nấu chín.\n" +
                "1 quả dưa chuột.\n" +
                "150g tôm đã bóc vỏ.\n" +
                "1/3 quả cà rốt.\n" +
                "1/3 bắp ngô.\n" +
                "2 quả trứng.\n" +
                "Một số phụ liệu khác như: Đậu Hà Lan, giăm bông, hành lá , gia vị vừa đủ.\n" +
                "\n" +
                "Cách làm\n" +
                "Bước 1: Khâu chuẩn bị nguyên liệu\n" +
                "\n" +
                "Cắt dưa chuột và giăm bông thành hạt lựu, sau đó cắt nhỏ hành lá rồi đập trứng, để riêng lòng đỏ, còn lòng trắng thì đánh tan.\n" +
                "Tiếp theo bóc vỏ tôm và cho vào lòng trắng trứng, ướp trong khoảng 10 phút.\n" +
                "Bước 2: Làm chín nguyên liệu\n" +
                "\n" +
                "Cho ngô, đậu Hà Lan và cà rốt vào chảo luộc chín khoảng 10 phút, sau đó vớt ra đĩa cho ráo nước.\n" +
                "Tiếp theo đó, làm nóng 1 chảo khác và cho một ít dầu ăn vào, đổ tôm vào chiên cho đến khi tôm chín.\n" +
                "\n" +
                "Sau khi tôm đã chín, thêm một ít dầu vào chảo rồi cho ngô, đậu Hà Lan, dưa chuột, cà rốt, giăm bông vào xào nóng lên, nêm muối vào đảo đều và cho ra đĩa.\n" +
                "Bước 3: Chiên cơm và trứng\n" +
                "\n" +
                "Đổ dầu vào chảo, sau đó đổ trứng đã được đánh tan trước đó vào chảo chiên vàng lên, đảo đều.\n" +
                "Ngay sau đó, đổ cơm vào chảo trứng, chiên cho đến khi cơm đã săn lại thì cho hỗn hợp rau củ vừa chuẩn bị vào rang một lúc. Cuối cùng cho tôm vào, nêm nếm sao cho vừa miệng là được.");
        stringArrayList11.add("Món xôi");
        chebien11.add("Nguyên liệu\n" +
                "1kg gạo nếp.\n" +
                "300g thịt ba chỉ.\n" +
                "1 gói bột cốt dừa.\n" +
                "Một số gia vị khác.\n" +
                "Nguyên liệu nấu xôi thịt\n" +
                "\n" +
                "\n" +
                "Cách làm\n" +
                "Bước 1: Ngâm gạo\n" +
                "\n" +
                "Gạo nếp thuộc loại gạo hạt ngắn, cứng và rất dễ dính khi nấu, chính vì vậy, cần ngâm từ 6-8 tiếng để cho hạt gạo được mềm.\n" +
                "Sau khi đã ngâm đủ số tiếng thì vo sạch lại với nước và đổ ra rổ sạch cho ráo nước.\n" +
                "Bước 2: Cắt thịt\n" +
                "\n" +
                "Với thịt thì cần mua loại thịt ba chỉ và thái theo miếng vuông rồi đem đi ướp với các gia vị từ 10-15 phút cho ngấm đều thịt.\n" +
                "Tiếp theo, cho thịt vào nồi và thêm một ít gia vị nữa cùng hành băm nhỏ vào, bật bếp kho với lửa nhỏ cho đến khi thịt được chín mềm.\n" +
                "Bước 3: Hấp xôi\n" +
                "\n" +
                "Gạo sau khi đã ráo nước thì cho vào nồi hấp, lưu ý cần cho thêm chút muối ăn và xóc đều gạo.\n" +
                "Đậy kín nắp nồi và hấp tầm khoảng từ 20 đến 25 phút là xôi đã chín. Lúc này cần xới đều xôi lên rồi rưới đều nước cốt dừa lên trên, đậy nắp lại và tiếp tục hấp thêm 5 phút nữa.\n" +
                "Xôi thịt thơm ngon bổ dưỡng\n" +
                "\n" +
                "Bước 4: Thưởng thức\n" +
                "\n" +
                "Sau khi xôi chín, lúc này bạn chỉ cần xới xôi ra bát hoặc đĩa và ăn kèm cùng với thịt kho. Đây là món ăn thơm ngon, bổ dưỡng và chắc chắn sẽ khiến cho mọi người trong gia đình bạn yêu thích. Ngoài ra, người dùng còn có thể tận dụng những công thức nấu xôi để sáng tạo thành những món xôi hấp dẫn hơn, ví dụ như: Cách làm xôi chiên nhân thịt, ăn là nghiện");
        stringArrayList11.add("Cháo gà");
        chebien11.add("Nguyên liệu\n" +
                "1 con gà khoảng 1,5kg, lưu ý nên chọn gà ta để nấu vì thịt gà ta dai hơn.\n" +
                "100g gạo nếp, 100g gạo tẻ.\n" +
                "3 củ hành khô, 1 quả chanh.\n" +
                "Các loại rau thơm như: Rau mùi, hành lá, tía tô.\n" +
                "Một số gia vị khác.\n" +
                "Nguyên liệu nấu cháo gà\n" +
                "\n" +
                "Cách làm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Việc đầu tiên cần làm là trộn 2 loại gạo với nhau rồi ngâm khoảng 1 giờ và đãi sạch lại với nước, vớt ra rổ cho ráo nước.\n" +
                "Làm sạch gà rồi luộc chín. Sau khi chín thì vớt ra, để nguội và xé thịt thành miếng nhỏ, lược xương.\n" +
                "Rau thơm đem bỏ cuống, lá úa, sau đó rửa sạch, thái nhỏ. Hành khô bóc vỏ, rửa sạch, rồi đập dập.\n" +
                "Bước 2: Nấu cháo\n" +
                "\n" +
                "Cho hết chỗ gạo đã ngâm trước đó vào nồi nước vừa luộc gà cùng với một nửa chỗ thịt gà vừa xé và hành khô, sau đó hầm cho đến khi hạt gạo nở bung và nhừ.\n" +
                "Vớt xương gà ra ngoài và nêm gia vị sao cho vừa miệng, đồng thời rắc rau thơm lên trên.");
        stringArrayList11.add(" Bún thịt nấu chua");
        chebien11.add("Nguyên liệu làm bún thịt nấu chua:\n" +
                "- 400-500g bún\n" +
                "\n" +
                "- 100-150g thịt nạc vai xay nhỏ\n" +
                "\n" +
                "- 3 trái cà chua\n" +
                "\n" +
                "- vài nhánh hành lá\n" +
                "\n" +
                "- 1 mớ rau mùi tàu\n" +
                "\n" +
                "- 1 giắt me (để nấu canh chua)\n" +
                "\n" +
                "- 1 củ hành tím khô\n" +
                "\n" +
                "- Dầu ăn, nước mắm, hạt nêm\n" +
                "\n" +
                "Cách làm bún thịt nấu chua:\n" +
                "– Thịt nạc ướp với chút mắm.\n" +
                "\n" +
                "– Cà chua rửa sạch, thái múi cau.\n" +
                "\n" +
                "– Hành lá, mùi tàu thái nhỏ.\n" +
                "\n" +
                "– Hành tím bỏ vỏ, thái lát.\n" +
                "\n" +
                "– Làm nóng dầu ăn trong nồi, cho hành tím vào phi thơm rồi cho thịt nạc vào xào đều. Thịt vừa chín tới thì cho cà chua vào, đảo khoảng 2-3 phút thì thêm nước dùng cho vừa ăn.");
        stringArrayList11.add("Mì xào thịt bò");
        chebien11.add("Nguyên liệu làm mì xào thịt bò:\n" +
                "- 1 mớ ngồng cải (hoặc rau cải)\n" +
                "\n" +
                "- 300gr thịt bò\n" +
                "\n" +
                "- 3-4 gói mỳ tôm\n" +
                "\n" +
                "- 3 muỗng canh xì dầu\n" +
                "\n" +
                "- 3 muỗng canh dầu hào\n" +
                "\n" +
                "- Đường, dầu ăn, tỏi.\n" +
                "\n" +
                "Cách làm mì xào thịt bò:\n" +
                "- Rau ngồng cải nhặt đoạn non, rửa sạch.\n" +
                "\n" +
                "- Thịt bò thái miếng mỏng, ướp với 1 muỗng canh xì dầu, đường, 1 muỗng canh dầu hào trộn đều để khoảng 10-15 phút.\n" +
                "\n" +
                "- Ngâm mỳ vào nước lạnh cho mì nở ra.\n" +
                "\n" +
                "- Cho chảo lên bếp và cho tỏi vào phi thơm, cho tiếp thịt bò vào xào qua, xào thịt bò săn lại thì cho ra đĩa.\n" +
                "\n" +
                "- Tiếp tục cho rau cải vào xào. Sau đó thêm 1/4 bát con nước vào đảo cùng và đậy vung 3-5 phút cho rau ngồng cải chín. Dùng dao cắt thử xem rau đã chín mềm thì vớt ra đĩa.\n" +
                "\n" +
                "- Cho tiếp mỳ vào chảo, đảo đều. Tiếp đó, bạn cho thịt bò, rau cải, thêm 2 muỗng canh xì dầu, 2 muỗng canh dầu hào vào đảo đều. Nếu bạn thích ăn cay có thể cho thêm chút tương ớt vào xào chung với mì để vị cay đều hơn, nhanh tay khoảng 1-2 phút cho ngấm gia vị rồi tắt bếp, bày lên đĩa.\n" +
                "\n" +
                "Lưu ý:\n" +
                "\n" +
                "- Không ướp nước mắm với thịt bò vì như thế thịt bò sẽ chảy nước.\n" +
                "\n" +
                "- Nếu không có thời gian ngâm mì, bạn có thể chần mì qua nước sôi rồi vớt ra, cho ít dầu ăn vào đảo đều để mì không bị rối khi xào.\n" +
                "\n" +
                "- Nếu thích ăn mì xào thịt bằm thì bạn có thể băm/ xay thịt bò rồi chế biến như bình thường nhé. ");
        stringArrayList11.add(" Mì xào nghêu");
        chebien11.add("Nguyên liệu làm mì xào nghêu:\n" +
                "- 300g mì\n" +
                "\n" +
                "- 1kg nghêu\n" +
                "\n" +
                "- 4 muỗng canh dầu ô liu\n" +
                "\n" +
                "- 1 củ hành tây cắt nhỏ\n" +
                "\n" +
                "- 1 muỗng súp thì lá cắt nhỏ\n" +
                "\n" +
                "- 4 muỗng cà phê tỏi băm\n" +
                "\n" +
                "- 80ml rượu mùi\n" +
                "\n" +
                "- 2 muỗng súp cà chua hộp\n" +
                "\n" +
                "- 1-2 muỗng cà phê đường\n" +
                "\n" +
                "- Muối\n" +
                "\n" +
                "Cách làm mì xào nghêu:\n" +
                "- Nghêu rửa sạch, để ráo nước.\n" +
                "\n" +
                "- Mì luộc chín, để ráo.\n" +
                "\n" +
                "- Đun nóng dầu ô liu trong cái chảo lớn, mức lửa vừa, thêm hành tây, trút nghêu và thì là vào đảo nhanh, rắc muối. Khuấy đều và xào cho đến khi nghêu mở, khoảng 4-5 phút, thêm tỏi băm nhỏ và xào trong 1 phút nữa.\n" +
                "\n" +
                "- Cho sốt cà chua vào nước hấp nghêu, nêm muối và đường. Khuấy đều, đun lửa liu riu khoảng 20 phút.\n" +
                "\n" +
                "- Mì luộc lần lượt các nhiệt đến một hơi sôi chậm và nấu trong 20 phút. Trong khi nước sốt cà chua là nấu ăn, đun nóng một nồi nước lớn muối cho mì ống.\n" +
                "\n" +
                "- Nếu muốn nước sốt mịn, thêm rượu. Bạn có thể cho nước sốt vào máy xay một lượt.\n" +
                "\n" +
                "- Đun phần nước sốt lên, cho mì vào, cho phần nghêu đảo chín trên vào, trộn đều.");
        stringArrayList11.add("Bún bò cà chua");
        chebien11.add("Nguyên liệu làm bún bò cà chua:\n" +
                "- Cà chua khoảng 3 trái to vừa, lột vỏ, một nửa cắt nhỏ, một nửa cắt múi, để riêng\n" +
                "\n" +
                "- Thịt bò băm khoảng 200 g\n" +
                "\n" +
                "- 1 củ sả, rửa sạch, đập dập\n" +
                "\n" +
                "- 1 tép tỏi, băm nhỏ\n" +
                "\n" +
                "- 1 củ hành ta, thái mỏng\n" +
                "\n" +
                "- Dầu ăn, muối, tiêu, nước mắm\n" +
                "\n" +
                "- Hành ngò, cắt nhỏ\n" +
                "\n" +
                "- Bún\n" +
                "\n" +
                "Cách làm bún bò cà chua:\n" +
                "- Bắt nồi lên bếp, cho dầu vào, dầu nóng, cho hành vào phi xém vàng, dậy mùi thơm. Ướp hành phi này, tỏi, muối, tiêu vào thịt bò. Trộn đều, ướp khoảng 30'.\n" +
                "\n" +
                "- Trong một nồi khác, cho sả đập dập và 2 tô nước, đun sôi khoảng 20'~30' cho sả ra nước thơm. Xong vớt sả bỏ đi.\n" +
                "\n" +
                "- Bắt nồi dầu trở lại bếp, nồi nóng, cho thịt vào xào cho thịt săn lại. Cho thịt ra đĩa.\n" +
                "\n" +
                "- Cho 1/2 cà chua cắt nhỏ vào nồi đã xào thịt, xào cho cà chua ra màu đẹp. Cho thịt trở lại nồi.\n" +
                "\n" +
                "- Cho nước đun sôi có hương sả ở bước 3) và 1/2 phần cà chua còn lại vào, nêm vưà ăn, hơi nhạt một tí. Đun thêm khoảng 5-10 phút. Nếu muốn ăn thịt tái thì chỉ xào 1/2 số thịt, còn lại 1/2 lúc này bỏ vào. Thịt vừa tái thì tắt lửa. Lúc này mới nêm mắm vào sao cho vừa miệng ăn.\n" +
                "\n" +
                "- Cho bún và hành ngò vào tô. Múc nước và cà chua vào tô và thưởng thức.");
        stringArrayList11.add("Bánh mì chảo");
        chebien11.add("Nguyên liệu làm bánh mì chảo:\n" +
                "- Bánh mì: 2 chiếc\n" +
                "\n" +
                "- Xúc xách: 2 cây loại ngon (mình hay làm xúc xích hun khói)\n" +
                "\n" +
                "- Trứng gà: 2 quả\n" +
                "\n" +
                "- Dưa chuột: 1 quả\n" +
                "\n" +
                "- Cà chua: 3 quả\n" +
                "\n" +
                "- Pate: 100 gam\n" +
                "\n" +
                "- Hành- tỏi băm\n" +
                "\n" +
                "- Hành lá, rau mùi, ớt\n" +
                "\n" +
                "- Gia vị: Đường, hạt nêm, nước mắm, dầu ăn.\n" +
                "\n" +
                "Cách làm bánh mì chảo:\n" +
                "- Lấy dao khía nhẹ lên thân xúc xích thành những đường chéo song song. Việc này giúp cho xúc xích khi chiên có hình dáng đẹp mắt.\n" +
                "\n" +
                "- Bắc chảo lên bếp, cho dầu ăn vào đun nóng rồi cho xúc xích vào chiên chín đều hai mặt. Sau đó, gắp xúc xích ra đĩa, để qua giấy thấm dầu cho ráo dầu.\n" +
                "\n" +
                "- Bạn để nguyên chảo rồi đập tiếp quả trứng vào ốp la, để lửa nhỏ cho dễ kiểm soát độ chín của trứng, lúc trứng còn ướt bạn rắt lên một ít muối để hương vị thêm đậm đà hơn. Bạn có thể chiên lòng đào hoặc chín tùy thẻo sở thích của mình. Sau đó, gắp trắng ra đĩa cùng với xúc xích.\n" +
                "\n" +
                "- Cà chua rửa sạch, thái lát mòng. Dưa chuột bạn cũng đem rửa sạch, tốt nhất là ngâm với nước muối loãng rồi thái thành từng miếng vừa ăn.\n" +
                "\n" +
                "Làm nước sốt bánh mì:\n" +
                "\n" +
                "– Để làm nước sốt được ngon, mịn thì bạn nên bóc vỏ cà chua: Lấy dao khứa thành hình chữ thập lên đầu quả cà chua. Đặt một nồi nước nhỏ lên bếp đun sôi, tắt bếp. Sau đó, thả 2 quả cà chua vào để khoảng 5 phút rồi cho ra nước lạnh. Lúc này bạn có thể bóc vỏ cà chua một cách dễ dàng.\n" +
                "\n" +
                "– Bạn cầm quả cà chua rồi thái luôn vào một cái bát, không nên thái qua thớt vì lúc này cà chua bị mất vỏ, khi thái dễ bị nát và mất nước.\n" +
                "\n" +
                "– Vẫn sử dụng chảo vừa rán xúc xích và trứng, bạn cho thêm ít dầu ăn vào đun nóng rồi cho hành- tỏi băm vào phi thơm, cho cà chua vào chảo xào cùng với hành tỏi, đun nhỏ lửa cho nhuyễn cà, cho vào một ít ớt cay để vị sốt nồng ngon hơn. Bạn đổ thêm vào nửa bát con nước lọc, nêm lại gia vị, rắc một ít hạt tiêu vào cho dậy mùi. Nước sốt bánh mì sánh mịn, vị chua chua, cay cay vừa phải là ngon.\n" +
                "\n" +
                "– Bày xúc xích và trứng, dưa chuột và ít pate vào trong chảo nước sốt cà, bày một ít rau mùi lên trên cho đẹp mắt. Bánh mì bạn có thể đem nướng nóng lên nếu thích rồi ăn kèm với sốt trong chảo. Tuy nhiên, nếu đãi cả nhà thì bạn không thể để trong chảo được, với chảo làm ở nhà có quai nhìn sẽ hơi mất mĩ quan, bạn có thể bày ra đĩa sâu lòng nhé.");
        stringArrayList11.add("Miến xào thịt bằm");
        chebien11.add("Nguyên liệu làm miến xào thịt bằm:\n" +
                "- 85g miến rong\n" +
                "\n" +
                "- 80g thịt heo\n" +
                "\n" +
                "- 1 muỗng canh sa tế (độ cay điều chỉnh tùy khẩu vị)\n" +
                "\n" +
                "- Vài tép tỏi; 1 cây hành lá; 1 nhánh gừng nhỏ\n" +
                "\n" +
                "- Gia vị: dầu ăn, nước tương, dầu hào, muối\n" +
                "\n" +
                "Cách làm miến xào thịt bằm:\n" +
                "- Miến rửa sạch, ngâm với nước lạnh cho đến khi miến mềm rồi mới vớt miến ra cắt thành đoạn nhỏ vừa ăn. Nếu bạn đang vội, bạn có thể ngâm miến với nước ấm cho tiết kiệm thời gian.\n" +
                "\n" +
                "- Thịt rửa sạch, thái miếng rồi băm nhỏ. Tỏi bóc vỏ lụa, bằm nhỏ. Gừng cũng cạo vỏ, bằm nhuyễn. Hành lá thái nhỏ, để riêng phần đầu hành trắng.\n" +
                "\n" +
                "- Làm nóng chảo với chừng 2 muỗng canh dầu ăn, khi dầu nóng, trút đầu hành trắng, tỏi và gừng bằm nhỏ vào phi thơm trên lửa vừa.\n" +
                "\n" +
                "- Khi thấy thịt băm săn lại, thêm 1 muỗng canh sa tế vào xào chung cho đến khi thịt thấm đều màu. Lượng sa tế này bạn có thể tăng hay giảm tùy theo khẩu vị của gia đình.\n" +
                "\n" +
                "- Cho miến vào, đảo nhẹ tay cho đến khi miến trộn lẫn với các nguyên liệu.\n" +
                "\n" +
                "- Thêm 160ml nước nóng hoặc nước dùng, tiếp tục đun sôi rồi mới hạ nhỏ lửa, đun liu riu trong khoảng vài phút cho sợi miến nở mềm. Nêm 1 muỗng canh nước tương; 1 muỗng canh dầu hào và ½ muỗng cà phê muối cho thật vừa miệng. Cuối cùng, rắc hành lá cắt nhỏ lên trên mặt, đảo đều lại lần nữa rồi tắt bếp.");
        stringArrayList11.add("Miến gà");
        chebien11.add("Nguyên liệu làm miến gà:\n" +
                "– Miến dong: 2 lạng\n" +
                "\n" +
                "– Đùi gà ngon: 2 cái\n" +
                "\n" +
                "– Nấm đông cô, nấm mèo: 5 tai\n" +
                "\n" +
                "– Hành hoa, rau răm: 1 ít\n" +
                "\n" +
                "– Măng khô: 100 g\n" +
                "\n" +
                "– Gia vị\n" +
                "\n" +
                "Cách làm miến gà:\n" +
                "- Nấm mèo, nấm hương, măng khô ngâm nước nóng già, rửa sạch, sau đó cắt bỏ chân nấm rồi thái nhỏ, măng khô cắt phần già, xé nhỏ.\n" +
                "\n" +
                "- Miến dong ngâm nước lạnh cho mềm rồi cắt khúc.\n" +
                "\n" +
                "- Bắc chảo dầu cho hành khô vào phi thơm, cho tiếp nấm hương, mộc nhĩ vào xào, tiếp đến cho măng khô vào xào cùng, nêm 1 muỗng bột canh (bột nêm).\n" +
                "\n" +
                "- Đùi gà rửa sạch với nước muỗi loãng cho vào nồi luộc chín sau đó vớt đùi gà để khô. Xé sợi thịt gà rồi cho vào xào cùng với hỗn hợp nấm hương, mộc nhĩ. Còn phần nước dùng gà đun nhỏ lửa thêm ít bột nêm, bột canh cho vừa miệng sau đó thêm mộc nhĩ, nấm hương vào đun khoảng 2-3 phút.\n" +
                "\n" +
                "- Miến chần qua nước sôi hoặc có thể thả luôn vào nồi nước dùng rồi vớt ra, xếp thịt gà, hành dăm thái nhỏ, mộc nhĩ, măng chua, rau rút lên. Sau đó từ từ chan nước dùng lên và dùng nóng.");
        stringArrayList11.add("Bánh mì nướng muối ớt");
        chebien11.add("Nguyên liệu làm bánh mì nướng muối ớt:\n" +
                "- Bánh mì ổ: 10 ổ\n" +
                "\n" +
                "- Ruốc : 3 muỗng canh Chà bông: 3 muỗng canh\n" +
                "\n" +
                "- Xúc xích: 2 cây\n" +
                "\n" +
                "- Ớt sa tế\n" +
                "\n" +
                "- Tương ớt\n" +
                "\n" +
                "- Sốt mayonnaise\n" +
                "\n" +
                "- Hành lá\n" +
                "\n" +
                "- Gia vị thông thường: đường, bột ngọt, dầu ăn.\n" +
                "\n" +
                "Cách làm bánh mì nướng muối ớt:\n" +
                "- Bánh mì chọn loại bánh mì nhỏ, cho vào túi ni lon và ép hơi dẹp.\n" +
                "\n" +
                "- Pha nước sốt muối ớt: 2 muỗng đường, 1 muỗng cà phê bột ngọt, 2 muỗng ớt sa tế, 2 muỗng tương ớt, trộn đều cho gia vị tan hết.\n" +
                "\n" +
                "- Xúc xích cắt sợi dài khoảng 3cm.\n" +
                "\n" +
                "- Làm mỡ hành: hành lá cắt nhuyễn cho vào 1 xí muối, dầu cho vào chảo, đun thật sôi, đổ dầu vào hành để làm mở hành, làm như vậy sẽ làm hành không bị thâm đen.\n" +
                "\n" +
                "- Nướng bánh mì: dùng cọ phết đều nước sốt muối ớt lên đều khắp bánh mì, cho bánh mì vào lò nướng ( ngon nhất là nướng than), khoảng 1 phút để bánh vừa đủ giòn thì lấy ra, phết ít mỡ hành lên trên.\n" +
                "\n" +
                "- Cắt bánh mì thành những miếng vừa ăn, cho lên dĩa, cuối cùng cho thêm ruốc, chà bông, xúc xích, tương ớt và sốt mayonnaise lên trên.");
        stringArrayList11.add("Mì Ý trộn");
        chebien11.add("Nguyên liệu làm mì Ý trộn:\n" +
                "- 375g mì pasta\n" +
                "\n" +
                "- 2 muỗng canh dầu ô liu\n" +
                "\n" +
                "- 1 củ hành tây tím nhỏ, cắt lát mỏng\n" +
                "\n" +
                "- 2 tép tỏi, băm nhỏ\n" +
                "\n" +
                "- 400g cà chua hộp\n" +
                "\n" +
                "- 1 muỗng cà phê đường\n" +
                "\n" +
                "- 2 muỗng canh lá húng quế cắt nhuyễn\n" +
                "\n" +
                "Cách làm mì Ý trộn:\n" +
                "- Luộc pasta trong một cái nồi nước sôi lớn, thêm chút muối và dầu ăn.\n" +
                "\n" +
                "- Mì chín, trụng mì qua nước lạnh, rồi để ráo.\n" +
                "\n" +
                "- Bắc chảo dầu lên bếp, đun nóng dầu, thêm hành tây vào đảo khoảng 3 phút, hành thơm, mềm, rồi thêm tỏi, đảo 1 phút.\n" +
                "\n" +
                "- Kế tiếp trút cà chua hộp, nêm chút đường, đun đến khi hỗn hợp sôi, trong 5 phút. Tắt lửa.\n" +
                "\n" +
                "- Cho mì ra đĩa, trút hỗn hợp cà chua vào, trộn đều, nêm chút muối, tiêu và rau húng quế. Dùng nóng.");
        stringArrayList11.add("Bánh cuốn nhân tôm");
        chebien11.add("Nguyên liệu làm bánh cuốn nhân tôm:\n" +
                "Phần bánh cuốn:\n" +
                "\n" +
                "- 200g bột gạo\n" +
                "\n" +
                "- 30g bột năng\n" +
                "\n" +
                "- 30g bột mỳ\n" +
                "\n" +
                "- ½ muỗng cafe muối\n" +
                "\n" +
                "- 2 muỗng canh dầu ăn\n" +
                "\n" +
                "- 350ml nước ấm\n" +
                "\n" +
                "- 240ml nước nóng\n" +
                "\n" +
                "Phần nước chấm:\n" +
                "\n" +
                "- 2 muỗng cafe đường\n" +
                "\n" +
                "- 120ml nước\n" +
                "\n" +
                "- 2 muỗng canh nước tương đen\n" +
                "\n" +
                "- 2 muỗng canh dầu hào\n" +
                "\n" +
                "Phần nhân tôm:\n" +
                "\n" +
                "- ¼ chén tôm khô\n" +
                "\n" +
                "- 1 muỗng canh dầu ăn\n" +
                "\n" +
                "- ¼ muỗng cafe muối\n" +
                "\n" +
                "- ¼ chén hành lá xắt nhỏ\n" +
                "\n" +
                "- Hạt mè rang\n" +
                "\n" +
                "Cách làm bánh cuốn nhân tôm:\n" +
                "- Rửa sạch tôm khô, ngâm trong nước ấm 10 phút sau đó xả đi rồi cắt nhỏ tôm. Thêm dầu ăn vào chảo nhỏ ở lửa vừa, cho tôm vào xào khoảng 2 phút thì thêm muối, hành lá, đảo đều rồi tắt lửa.\n" +
                "\n" +
                "- Cho bột gạo, bột năng, bột mỳ và muối vào tô, thêm dầu ăn và 120ml nước ấm vào trộn cho đến khi hỗn hợp mịn đều thì cho nước nóng vào. Sau đó cho bột nghỉ trong 45 phút. Sử dụng khuôn nhôm 20x20cm để tráng bánh. Bạn nên dùng nồi hoặc chảo lòng sâu để hấp bánh, lưu ý rằng nồi phải có nắp đậy và có thể để ngập 5cm nước. Khi nước đã sôi, bạn đặt khuôn nhôm vào. Dùng phới silicon chịu nhiệt để phết mỏng một lớp dầu lên khuôn nhôm, sau đó đổ bột vào khuôn, dùng nhấc nồi để tráng bột cho đều.\n" +
                "\n" +
                "- Đậy nồi lại trong khoảng 3 phút là bánh chín. Bạn cẩn thận lấy bánh ra khỏi khuôn nhé!\n" +
                "\n" +
                "- Rắc phần nhân tôm và hành lá lên, sau đó cuộn bánh lại, dùng dao sắc cắt thành từng miếng nhỏ vừa ăn. Làm nước chấm bằng cách cho đường và nước vào chảo, đun cho đến khi đường tan hoàn toàn thì thêm nước tương, dầu hào vào, để lửa nhỏ cho đến khi tất cả hòa quyện là được.");


        anh11.add(R.drawable.jf_laumam);
        anh11.add(R.drawable.jf_lauthaichuacaypng);
        anh11.add(R.drawable.jf_laugalagiang);
        anh11.add(R.drawable.jf_duoibo);
        anh11.add(R.drawable.othiem);
        anh11.add(R.drawable.lauhaisan);
        anh11.add(R.drawable.thaclac);
        anh11.add(R.drawable.laubo);
        anh11.add(R.drawable.echmangchua);
        anh11.add(R.drawable.reucua);
        anh11.add(R.drawable.jf_laumam);
        anh11.add(R.drawable.phanthiet);
        anh11.add(R.drawable.namchay);
    }
    public void canh(){
        stringArrayList12.add("CANH MƯỚP NẤM RƠM");
        chebien12.add("Nguyên liệu:\n" +
                "\n" +
                "– 1 quả mướp\n" +
                "\n" +
                "– 50g nấm rơm\n" +
                "\n" +
                "– 50g tôm tươi bóc vỏ\n" +
                "\n" +
                "– Hành lá\n" +
                "\n" +
                "– 2 muỗng cà phê bột canh\n" +
                "\n" +
                "– 1 muỗng cà phê hạt NÊM\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "– Nấm rơm gọt bỏ chân, ngâm nước muối loãng khoảng 15 phút.\n" +
                "Canh mướp nấu nấm rơm ngon lạ, hấp dẫn\n" +
                "\n" +
                "– Mướp bỏ vỏ, cắt miếng vừa ăn.\n" +
                "\n" +
                "– Bắc nồi lên bếp, cho dầu vào phi thơm hành tím băm, trút tôm vào xào chín sơ, thêm nước, đun sôi.\n" +
                "\n" +
                "– Khi nước sôi, nêm vào nồi 2 muỗng cà phê bột canh. Thả mướp và nấm vào nồi. Đun to lửa cho nồi canh sôi trở lại, bạn tắt bếp và nêm thêm vào 1 muỗng cà phê hạt nêm cho vừa miệng.\n" +
                "\n" +
                "– Múc canh ra tô, rắc hành lá thái nhỏ lên trên, ăn nóng.");
        stringArrayList12.add("CANH KHOAI MỠ NẤU TÔM");
        chebien12.add("Nguyên liệu làm canh khoai mỡ nấu tôm\n" +
                "\n" +
                "Khoai mỡ: 400g\n" +
                "\n" +
                "Tôm: 200g\n" +
                "\n" +
                "Mùi tàu + ngò ôm + hành tím\n" +
                "\n" +
                "Gia vị: muối + nước mắm\n" +
                "\n" +
                "Dưới đây, là các bước đơn giản của cách làm canh khoai mỡ nấu tôm ngon:\n" +
                "\n" +
                "Bước 1: Sơ chế nguyên liệu làm canh khoai mỡ nấu tôm\n" +
                "\n" +
                "Khoai mỡ gọt vỏ, rửa sạch dùng muỗng nạo nhỏ hoặc băm nhỏ và để riêng ra bát.\n" +
                "\n" +
                "Tôm rửa sạch, bóc vỏ, lột chỉ đen ở lưng và băm nhỏ.\n" +
                "\n" +
                "Hành tím bóc vỏ rửa sạch, thái lát. Ngò ôm và ngò gai nhặt sạch gốc và rửa sạch.\n" +
                "\n" +
                "Bước 2: Thực hiện cách làm canh khoai mỡ nấu tôm\n" +
                "\n" +
                "Bắc xoong lên bếp cho dầu ăn đun nóng già, thì cho hành tím vào phi thơm. Tiếp theo cho tôm và muối vào xào chín tôm, xúc tôm ra bát.\n" +
                "\n" +
                "Tiếp tục thực hiện hướng dẫn làm canh khoai mỡ nấu tôm, vẫn sử dụng chảo vừa xào tôm, các bạn đổ nước vào nồi đun sôi, cho khoai mỡ vào nấu chín. Khi khoai chín cho tôm đã xào vào đảo đều và nêm nếm gia vị vừa ăn.\n" +
                "\n" +
                "Cuối cùng tắt bếp, bắc xoong múc canh khoai mỡ ra bát, cho thêm ngò gai, ngò ôm vào cho có mùi thơm.");
        stringArrayList12.add("CANH NGAO NẤU DỨA");
        chebien12.add("Nguyên liệu:\n" +
                "\n" +
                "– Ngao tươi: 1 kg.\n" +
                "\n" +
                "– Dứa: 1 quả.\n" +
                "\n" +
                "– Cà chua: 2 quả.\n" +
                "\n" +
                "– Hành, dăm.\n" +
                "\n" +
                "– Hành khô: 1 củ.\n" +
                "\n" +
                "– Gia vị: dầu ăn, bột nêm, mì chính.\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "– Ngao rửa sạch nhiều nước đem luộc sôi.\n" +
                "\n" +
                "– Gạn phần nước trong, lấy phần ruột rửa lại lần nữa. Hành, dăm rửa sạch thái nhỏ.\n" +
                "\n" +
                "– Cà chua rửa sạch, một quả bổ múi cau, một quả thái hạt lựu. Dứa gọt vỏ rồi thái mỏng vừa ăn.\n" +
                "\n" +
                "– Phi thơm hành khô với dầu ăn. Cho cà chua vào xào chín. Nêm một chút bột nêm.\n" +
                "\n" +
                "– Cho ngao vào xào. Sau đó xúc ra bát tô.\n" +
                "\n" +
                "– Đổ nước ngao rồi cho dứa vào đun sôi chừng 10 phút. Khi nồi canh sôi cho cà chua vào. Cuối cùng là phần ngao xào. Nêm gia vị vừa miệng.\n" +
                "\n" +
                "– Khi gần ăn cho hành dăm cùng chút mì chính. Tắt bếp cho canh ra bát dùng nóng.");
        stringArrayList12.add("CANH THỊT BÒ NẤU NẤM KIM CHÂM");
        chebien12.add("Nguyên liệu:\n" +
                "\n" +
                "Nấm kim châm\n" +
                "\n" +
                "Thịt thăn bò\n" +
                "\n" +
                "Đậu phụ\n" +
                "\n" +
                "Hành lá\n" +
                "\n" +
                "Cà rốt\n" +
                "\n" +
                "Nước xương.\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "– Nấm kim châm rửa sạch, để ráo.\n" +
                "\n" +
                "– Thịt bò đem bỏ ngăn đá cho cứng khoảng 50% (dễ thái hơn) đem ra thái lát mỏng, to bản.\n" +
                "\n" +
                "– Trải miếng thịt bò ra, cho nấm vào cuộn chặt, dùng hành lá chần qua nước sôi buộc cho đẹp (không cần buộc cũng được vì thịt bò đang ở dạng đá, cuốn là dính chặt vào nhau ngay, không sợ bung)\n" +
                "\n" +
                "– Đun sôi nước dùng, thả cà rốt, rồi đến đậu phụ xắt nhỏ vào, nêm nếm vừa miệng.\n" +
                "\n" +
                "– Đợi nước sôi bùng thì thả thịt bò đã cuốn nấm vào rồi bắc nồi ra ngay. Có thể rắc thêm ít hành, mùi hạt tiêu. Ăn nóng.");
        stringArrayList12.add("CANH KHỔ QUA NHỒI THỊT");
        chebien12.add("Nguyên liệu\n" +
                "\n" +
                "Khổ qua: 2 đến 3 quả, Thịt nạc: 300 gr, Xương đã róc thịt: 500 gr, Nấm mèo: 8 tai, Hành lá, ngò rí Trứng vịt: 1 quả Nước mắm, tiêu, bột ngọt, muối\n" +
                "\n" +
                "Sơ chế\n" +
                "\n" +
                "Đầu tiên khổ quả bạn dùng dao mổ ở đầu trái (đối diện với cuống) dùng muỗng cà phê cho vào ruột trái lấy hết hạt ra, rửa sạch và để ráo.\n" +
                "\n" +
                "Nấm mèo bạn mang ngâm với nước sôi cho nở tai nấm, sau đó thái nhuyễn sợi chỉ. Hành lá rửa sạch thái nhỏ. Ngò rí rửa sạch để ráo. Thịt heo lạng bỏ phần da, thái mỏng và băm nhỏ, có thể cho vào máy xay sinh tố cho khỏi mất thời gian, Cho tiêu, muối, bột ngọt, đường vào vừa ăn. Sau đó trộn đều với nấm mèo, trứng vịt và hành lá.\n" +
                "\n" +
                "Sau đó bạn dồn hỗn hợp thịt vừa trộn vào khổ qua cho vừa đầy nhé.\n" +
                "\n" +
                "Muốn nước dùng ngon ngọt hơn bạn hãy sơ chế với xương mang rửa với nước muối xả sạch, chặt nhỏ hầm lấy 1,5 lít nước dùng, khi nước sôi bạn nhớ vớt hết bọt nổi lên trên để nước trong hơn.\n" +
                "\n" +
                "Chế biến\n" +
                "\n" +
                "Bây giờ bạn nấu nước hầm xương rồi cho vào một ít muối và lần lượt cho khổ qua vào, để lửa to cho nước sôi lên, vớt bọt và bắt đầu để lửa nhỏ cho khổ qua mềm. Vớt bọt thường xuyên và không đậy nắp nồi để nước dùng trong khổ qua xanh mướt hơn và mềm vừa ăn, nêm lại nước dùng bằng nước mắm, bột ngọt, muối cho vừa ăn. Cho canh ra bát lớn rồi rắc ngò rí lên trên cho thơm nhé! Vậy là bạn đã hoàn thành rồi đấy!");
        stringArrayList12.add("CANH CẢI THẢO CUỘN THỊT HEO");
        chebien12.add("Nguyên liệu làm món canh cải thảo cuộn thịt:\n" +
                "\n" +
                "– 4 lá cải thảo\n" +
                "\n" +
                "– 200g thịt ba rọi cắt thành 4 – 5 miếng mỏng dài\n" +
                "\n" +
                "– 10 – 12 cây đậu cô ve, 1/2 củ cà rốt cắt thanh dài\n" +
                "\n" +
                "– 500 – 700 ml nước dùng\n" +
                "\n" +
                "– Gia vị: muối, tiêu, hạt nêm\n" +
                "\n" +
                "Cách làm món canh cải thảo cuộn thịt:\n" +
                "\n" +
                "Bước 1: Cải thảo rửa sạch, cắt thành những miếng có bản to bằng chiều ngang miếng thịt. Luộc sơ cho chín rồi rửa lại bằng nước lạnh để giữ màu của lá. Vớt ra để ráo nước.\n" +
                "\n" +
                "Bước 2: Trải miếng cải thảo lên tấm thớt, lạng bỏ bớt phần thân trắng cho mỏng để dễ cuộn. Đặt miếng thịt lên miếng cải thảo. Rắc ít tiêu, muối lên. Xếp vài cây đậu cô ve và cà rốt lên tuỳ thích.\n" +
                "\n" +
                "Bước 3: Cuộn từ từ miếng cải thảo lại cho đến hết như cuộn chả giò. Dùng tăm ghim chặt 2 đầu cải thảo cho lá cải thảo dính vào, không bị bung ra. Đổ nước dùng vào nồi, đun sôi.\n" +
                "\n" +
                "Bước 4: Cắt đôi cuộn cải thảo và cho vào nồi nước đã sôi đun cho sôi lại thì nêm tí muối, hạt nêm cho vừa miệng và tắt bếp.");
        stringArrayList12.add("CANH NHA ĐAM THỊT BÒ");
        chebien12.add("Nguyên liệu\n" +
                "\n" +
                "– Nha đam: 1 bẹ\n" +
                "\n" +
                "– Hành lá, hành củ\n" +
                "\n" +
                "– Ớt, gia vị\n" +
                "\n" +
                "– Thịt bò bắp: 1 lạng\n" +
                "\n" +
                "Sơ chế\n" +
                "\n" +
                "– Thịt bò xắt nhỏ, ướp với hành củ băm, hột nêm, muối, dầu ăn.\n" +
                "\n" +
                "– Nha đam gọt vỏ, cắt thành từng miếng to. Chuẩn bị một nồi nước sôi có tí muối.\n" +
                "\n" +
                "– Rửa nha đam qua nước lạnh cho ra bớt nhớt. Sau đó trụng nhanh vào nồi nước sôi rồi bỏ nha đam ngay vào tô nước đá lạnh. Các bước trên là để nha đam bớt đắng, nhớt mà vẫn còn bổ dưỡng.\n" +
                "\n" +
                "Chế biến\n" +
                "\n" +
                "– Bắc nồi cho vào ít dầu ăn phi thơm hành củ rồi cho bò vào xào sơ rồi vớt bò ra riêng. Đổ một lượng nước đủ nấu canh vào chính cái nồi đó, đun sôi, rồi thả thịt bò và nha đam vào, nêm nếm lại gia vị.\n" +
                "\n" +
                "– Nấu tiếp chừng vài phút cho vừa chín. Tắt bếp, rắc hành ngò, ăn nóng với cơm");
        stringArrayList12.add("CANH TÔM RAU CẢI NON");
        chebien12.add("Tôm giàu canxi, rau cải non nhiều vitamin C, hai thực phẩm này không chỉ giúp giải nhiệt mà còn rất tốt cho sức khỏe.\n" +
                "\n" +
                "Nguyên liệu:\n" +
                "\n" +
                "100gr tôm tươi hoặc một nhúm tôm khô\n" +
                "\n" +
                "Rau cải non 1 bó\n" +
                "\n" +
                "Cách làm: Tôm tươi đem bỏ vỏ, giã nhỏ. Rau cải non làm sạch. Phi thơm hành, cho tôm vào đảo đều, nêm chút gia vị cho thấm. Tiếp tục đổ nước và tôm và đun sôi. Sau đó thả rau cải non vào, nêm gia vị. Lửa sôi bùng khoảng 1 phút thì tắt bếp");
        stringArrayList12.add("CANH MỌC NẤU CỦ QUẢ");
        chebien12.add("Nguyên liệu:\n" +
                "\n" +
                "– 250 g giò sống\n" +
                "\n" +
                "– 50 g thịt nạc vai\n" +
                "\n" +
                "– Nấm hương, mộc nhĩ\n" +
                "\n" +
                "– 1 quả su su, 1/2 củ cà rốt hoặc su hào, khoai tây tùy mùa vụ\n" +
                "\n" +
                "– Gia vị, hạt tiêu.\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "– Giò sống trộn lẫn với chút thịt nạc vai băm nhỏ, nấm hương, mộc nhĩ thái vụn, chút bột canh và hạt tiêu.\n" +
                "\n" +
                "– Nặn thành những viên tròn nhỏ rồi thả vào nồi nước đun sôi khoảng 7-8 phút cho chín. Vớt mọc ra để riêng.\n" +
                "\n" +
                "– Su su, cà rốt, su hào, khoai tây gọt vỏ… bổ miếng vừa ăn.\n" +
                "\n" +
                "– Cho củ quả vào đun, chú ý thời gian khác nhau đối với các loại củ quả.\n" +
                "\n" +
                "– Nêm nếm lại gia vị cho vừa ăn. Sau đó cho mọc vào, rắc thêm hành lá thái nhỏ là xong.");
        stringArrayList12.add("CANH THIÊN LÝ NẤU CUA");
        chebien12.add("Nguyên liệu\n" +
                "\n" +
                "-300 g cua đồng, 200 g hoa thiên lý, 600 ml nước, gia vị gồm muối, bột canh, mì chính.\n" +
                "\n" +
                "Sơ chế\n" +
                "\n" +
                "– Rửa sạch cua bằng cách cho vào xoong nước xóc xóc hoặc dùng đũa khuấy nước mạnh. Sau đó xé bỏ mai, yếm rồi tráng nước lại lần nữa. Nếu muốn xé cua dễ, bạn hãy cho cua vào ngăn đá tủ lạnh khoảng 5-10 phút hoặc thả vài viên đá vào túi cua để cua lạnh mà co các càng lại, bạn sẽ dễ dàng thao tác. Sau khi cua đã được bóc mai, yếm và rửa sạch, cho vào cối giã hoặc xay, đừng quên cho thêm vài hạt muối. Lọc cua bằng rổ lưới mắt nhỏ. Nếu không yên tâm, có thể lọc hai lần cho hết cặn và vỏ cua trong nước.\n" +
                "\n" +
                "– Lấy tăm khêu gạch từ mai cua, thả vào một bát con, sau đó tráng qua nước cho hết mùi hôi.\n" +
                "\n" +
                "– Hoa thiên lý nhặt sạch cuống, rửa qua nước muối loãng, lưu ý thao tác nhẹ tay.\n" +
                "\n" +
                "Chế biến\n" +
                "\n" +
                "– Bắc nồi nước cua lên bếp, để lửa to. Dùng đũa khuấy theo chiều kim đồng hồ để thịt cua không bị lắng xuống đáy nồi, cho đến khi nước cua chuyển sang màu đục.\n" +
                "\n" +
                "– Khi nồi nước bắt đầu sôi, đổ gạch cua vào đun cùng, vặn nhỏ lửa, cua sẽ kết thành mảng. Nếu ta cứ để lửa to lúc nước sôi, cua sẽ vỡ vụn trông không ngon, chưa kể còn dễ làm nước canh trào ra ngoài.\n" +
                "\n" +
                "– Sau khi thịt cua đã đóng mảng, thả hoa thiên lý vào, vặn lửa to lên một chút. Tra gia vị vừa miệng.\n" +
                "\n" +
                "– Rau chín, múc canh ra bát, thưởng thức cùng cơm và một bát cà pháo.");
        stringArrayList12.add("CANH CHUA NẤU CÁ LÓC");
        chebien12.add("Nguyên liệu:\n" +
                "\n" +
                "Một con cá lóc khoảng 500g, 1 cây bạc hà, 5 quả đậu bắp, ¼ trái thơm, 2 quả cà chua, 50g giá sống, 1 vắt me chua, rau ngò om, ngò gai. Nước mắm, muối, đường, hạt nêm, tỏi phi thơm.\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "Đậu bắp cắt khúc, thơm cắt mỏng, cà chua cắt theo kiểu múi cam, bạc hà tước vỏ, cắt khúc xéo. Cá lóc làm sạch, cắt ra từng khứa to. Nấu một nồi nước sôi, cho chút muối vào nồi, thả cá vào nấu khoảng 5 phút, cá chín tới, vớt ra. Sau đó thả me vào rồi vớt ra dằm chắc lấy nước đổ lại vào nồi nấu sôi, nêm các loại gia vị cho có vị ngọt, chua, mặn vừa khẩu vị. Tiếp đến cho đậu bắp, cà chua, thơm, bạc hà, giá vào nấu sôi trở lại, nêm nếm vừa ăn. Bỏ cá trở lại nồi cho nóng. Múc canh chua, cá lóc ra tô, rắc ngò gai, ngò om, ớt và chút tỏi phi cho thơm.\n" +
                "\n" +
                "Cách dùng:\n" +
                "Món này dùng nóng với cơm hay bún đều ngon. Ăn canh chua cá lóc muốn ngon thì nước chấm phải là nước chấm trong (chưa pha chế), dầm ớt vào cho cay.");
        stringArrayList12.add("CANH HẾN NẤU CHUA");
        chebien12.add("NGUYÊN LIỆU:\n" +
                "\n" +
                "– Hến: 1kg\n" +
                "\n" +
                "– 2 trái cà chua\n" +
                "\n" +
                "– 1 quả khế\n" +
                "\n" +
                "– 1 củ hành tím\n" +
                "\n" +
                "– Rau răm, hành lá.\n" +
                "\n" +
                "– Gia vị: muối, bột nêm.\n" +
                "\n" +
                "THỰC HIỆN:\n" +
                "\n" +
                "Bước 1: Hến mua về rửa sạch sau đó ngâm trong chậu nước đầy, có thể thêm 2 trái ớt xắt cho hến sạch hơn.\n" +
                "\n" +
                "Bước 2: Cho hến vào nồi luộc đến khi hến sôi, vặn bớt bếp lại, thêm chút muối vào nồi luộc hến và dùng đũa khuấy đều cho phần thịt hến tách ra khỏi vỏ.\n" +
                "\n" +
                "Bước 3: Đổ hến ra rổ, phần nước luộc để cho lắng, gạn lấy phần nước trong để riêng, đổ bỏ phần cặn.\n" +
                "\n" +
                "Bước 4: Cho hến đã luộc vào rổ, đãi trong chậu nước đầy, lấy thịt hến, rửa sạch, để ráo.\n" +
                "\n" +
                "Bước 5: Cà chua rửa sạch, bổ múi. Hành lá, rau răm nhặt bỏ rễ, gốc già, rửa sạch. Khế rửa sạch, cắt bỏ riềm, thái miếng. Hành tím bóc vỏ, rửa sạch, thái mỏng.\n" +
                "\n" +
                "Bước 6: Bắc nồi lên bêp, cho thìa dầu ăn. Khi dầu nóng già, cho hành tím vào phi thơm sau đó cho thịt hến và chút gia vị vào xào săn. Sau đó chút ra bát để riêng.\n" +
                "\n" +
                "Bước 7: Thêm thìa dầu ăn nữa, cho 1/2 chỗ cà chua trên vào xào kỹ. Khi cà chua chín mềm cho bát nước luộc hến vào đun sôi. Nước sôi cho nốt phần cà chua còn lại và khế vào đun tiếp 2 phút rồi cho phần thịt hến đã xào ở trên vào, nêm nếm vừa miệng.\n" +
                "\n" +
                "Tắt bếp, cho hành lá, rau răm xắt nhỏ vào đảo đều, cho canh ra bát tô là được.");
        stringArrayList12.add("CANH GÀ NẤM HƯƠNG");
        chebien12.add("Nguyên liệu làm canh gà nấm hương :\n" +
                "\n" +
                "Thịt gà: 500g\n" +
                "\n" +
                "Nấm đông cô (nấm hương): 1 lạng\n" +
                "\n" +
                "Các gia vị thông thường, Hành lá\n" +
                "\n" +
                "Hướng dẫn làm canh gà nấn hương món ăn ngon hấp dẫn :\n" +
                "\n" +
                "Bước 1 : Bạn đem gà sát qua muối rồi đem rửa sạch rồi chặt miếng vừa ăn. Sau đó bạn đem luộc qua nước sôi rồi xả lại bằng lạnh cho sạch nhé, tiếp đó bạn cho thịt gà vào bát ô tô rồi cho thịt gà chút mắm muối ướp khoảng 30 phút để cho thịt gà được thấm đều gia vị khi ăn món canh nấm hương thịt gà sẽ đậm đà hơn\n" +
                "\n" +
                "Bước 2 : Bạn đem nấm ngâm vào nước nóng cho mềm ra rồi đem rửa thật sách cắt bỏ chân rồi xắt làm đôi.\n" +
                "\n" +
                "Bước 3 : Bạn cho nồi lên bếp cho nấm vào cho thịt gà đã được ướp vào sau đó đổ nước ngập hơn mặt thịt một tí, nấu lửa lớn sôi rồi hạ cho nhỏ đun tới khi nào thịt gà chín kỹ mềm ra thì là được nhé\n" +
                "\n" +
                "Bước 4 : Nêm nếm lại gia vị, đun thêm 2-3 phút nữa rồi tắt bếp. Múc ra tô, rắc hành lá thái nhỏ lên trên vậy là bạn đã hoàn thành được món canh ngon cho gia đình mình rồi.");
        stringArrayList12.add("CANH HẸ NẤU NẤM THỊT");
        chebien12.add("NGUYÊN LIỆU\n" +
                "\n" +
                "100g thịt nạc vai\n" +
                "\n" +
                "100g nấm rơm\n" +
                "\n" +
                "1 bìa đậu\n" +
                "\n" +
                "1 nắm hẹ\n" +
                "\n" +
                "Nước mắm, gia vị, mỳ chính, hành khô\n" +
                "\n" +
                "Bước 1:\n" +
                "\n" +
                "Trộn thịt xay với hành khô, gia vị, mỳ chính và chút dầu ăn.\n" +
                "\n" +
                "Viên thành những viên nhỏ rồi để vào ngăn mát tủ lạnh chừng 30 phút.\n" +
                "\n" +
                "Bước 2:\n" +
                "\n" +
                "Nấm rơm ngâm nước ấm 20 phút.\n" +
                "\n" +
                "Đậu hũ xắt miếng vuông nhỏ.\n" +
                "\n" +
                "Nhúng đậu qua nước mắm pha loãng rồi vớt ra đĩa để khi ăn vừa miệng hơn.\n" +
                "\n" +
                "Hẹ xắt khúc 2 – 3cm.\n" +
                "\n" +
                "Bước 3:\n" +
                "\n" +
                "Đun sôi nước, cho thịt viên vào nấu sôi, hớt bọt nếu có.\n" +
                "\n" +
                "Tiếp theo cho nấm vào đun sôi lại.\n" +
                "\n" +
                "Rồi cuối cùng cho đậu và hẹ vào sôi lại thì tắt bếp, nêm lại gia vị vừa ăn.\n" +
                "\n" +
                "Tắt bếp, múc canh ra bát, dùng với cơm.");
        stringArrayList12.add("GHẸ NẤU CANH CHUA DỌC MÙNG");
        chebien12.add("Nguyên liệu\n" +
                "\n" +
                "+ Ghẹ: 3 con\n" +
                "\n" +
                "+ Dứa: 1/2 quả\n" +
                "\n" +
                "+ Cà chua: 1 quả to\n" +
                "\n" +
                "+ Dọc mùng: 500g\n" +
                "\n" +
                "+ Dấm bỗng: 100ml\n" +
                "\n" +
                "+ Hành hoa, hành khô, mùi tàu, vài nhánh sả, đường, gia vị, dầu ăn, dấm gạo, muối hạt.\n" +
                "\n" +
                "Cách làm\n" +
                "\n" +
                "Dọc mùng mua về, rửa qua cho sach đất cát, tước sạch sơ bên ngoài, cắt khúc vừa ăn, bóp dọc mùng với muối hạt và dấm gạo cho xẹp xuống, rửa lại nhiều lần với nước cho hết vị mặn và vắt thật khô dọc mùng. Đun 1 nồi nước sôi, cho vào 3 thìa canh dấm rồi cho dọc mùng vào trần qua để loại bỏ hoàn toàn vị ngứa của dọc mùng, vắt lại thật khô.\n" +
                "\n" +
                "– Cà chua cắt hạt lựu, sả, hành tím băm nhỏ, Dứa cắt miếng mỏng, hành hoa, mùi tàu nhặt rửa sạch thái nhỏ, để lại phần cọng hành trắng không thái nhé.\n" +
                "\n" +
                "– Ghẹ mua về các bạn làm sạch, cắt bỏ yếm, tách mai, để ráo nước. Cho chút dầu vào xào thơm hành tím và sả băm, cho cà chua vào xào cùng rồi cho ghẹ đã làm sạch, bỏ yếm, cắt miếng vào. Nêm gia vị vào ghẹ cho ngấm rồi cho thêm nước đủ canh cho cả nhà, đun sô nồi canh.\n" +
                "\n" +
                "– Nồi canh sôi lên các bạn cho dứa vào chờ sôi lại thì nêm 1 thìa cà phê đường vào rồi cho dẫm bỗng từ từ thêm vào nồi canh ghẹ để canh có vị chua dịu hậu ngọt. Tiếp tục cho dọc mùng vào nồi canh, chờ canh sôi lăn tăn thì tắt bếp thả hành hoa và rau mùi tàu vào là hoàn thiện.\n" +
                "\n" +
                "– Múc canh ra bát to, ghẹ tươi chín đỏ au, thịt ghẹ chắc ngấm gia vị đậm đà, nước canh chua ngọt cực kỳ hấp dẫn, thơm mùi sả, dấm bỗng với miếng dứa chín mềm, miếng dọc mùng giòn mát ăn với cơm sẽ đánh bay hết cảm giác nóng nực của mùa hè. Khi ăn các bạn có thể vớt ghẹ ra đĩa riêng hoặc để nguyên trong bát canh dọn kèm bát nước mắm nguyên chất thêm vài lát ớt cay là ngon tuyệt vời.");
        stringArrayList12.add("CANH ĐU ĐỦ GIÒ HE0");
        chebien12.add("Nguyên liệu:\n" +
                "\n" +
                "– Giò heo: 500g\n" +
                "\n" +
                "– Đu đủ hườm: 600g\n" +
                "\n" +
                "– Hành tím: 3 củ\n" +
                "\n" +
                "– Hành tím băm, hành lá, ngò rí\n" +
                "\n" +
                "– Tiêu, muối, nước mắm\n" +
                "\n" +
                "– Hạt nêm\n" +
                "\n" +
                "1. Sơ chế\n" +
                "\n" +
                "– Đu đủ gọt vỏ, cắt miếng vừa ăn. Hành lá, ngò rí cắt nhỏ.\n" +
                "\n" +
                "– Giò heo cạo rửa sạch, ướp với ½ m muối, ½ M hạt nêm, 1m hành tím băm và ít tiêu, để thấm.\n" +
                "\n" +
                "2. Nấu canh\n" +
                "\n" +
                "– Đun 1,5 lít nước ấm, cho giò heo vào đun lửa lớn, hớt bọt kỹ, nêm 1M hạt nêm Ajingon, cho tiếp đu đủ vào nấu lửa vừa đến khi đu đủ và giò chín mềm, nêm thêm 1m nước mắm, tắt bếp.\n" +
                "\n" +
                "3. Cách dùng\n" +
                "\n" +
                "– Múc canh ra tô, rắc thêm hành ngò và tiêu, dùng nóng.\n" +
                "\n" +
                "Mách nhỏ\n" +
                "\n" +
                "Chọn đu đủ già mới chuyển màu vàng hườm và còn độ cứng.Trong đu đủ sống có men phân giải chất đạm, nấu với thịt giúp thịt mau mềm.");


        anh12.add(R.drawable.jf_laumam);
        anh12.add(R.drawable.jf_lauthaichuacaypng);
        anh12.add(R.drawable.jf_laugalagiang);
        anh12.add(R.drawable.jf_duoibo);
        anh12.add(R.drawable.othiem);
        anh12.add(R.drawable.lauhaisan);
        anh12.add(R.drawable.thaclac);
        anh12.add(R.drawable.laubo);
        anh12.add(R.drawable.echmangchua);
        anh12.add(R.drawable.reucua);
        anh12.add(R.drawable.jf_laumam);
        anh12.add(R.drawable.phanthiet);
        anh12.add(R.drawable.namchay);
        anh12.add(R.drawable.ghemangchua);
        anh12.add(R.drawable.namthapcam);
        anh12.add(R.drawable.laude);
    }
    public void xoi(){
        stringArrayList13.add(" Xôi đỗ đen");
        chebien13.add("Nguyên liệu\n" +
                "\n" +
                "300g đỗ đen\n" +
                "3 bát con nếp\n" +
                "2 thìa nhỏ muối\n" +
                "2 thìa canh đường\n" +
                "2 thìa nhỏ dầu ăn\n" +
                "Vừng, lạc rang vàng\n" +
                "Cách làm:\n" +
                "\n" +
                "Đỗ đen rửa sạch, nhặt bỏ những hạt đậu hỏng. Ngâm đậu qua đêm\n" +
                "Nếp đãi sạch, ngâm đậu vào nước lạnh, để qua đêm, thêm vào thố đậu một thìa nhỏ muối.\n" +
                "\n" +
                "Đổ đậu vào nồi, cho thêm nước lạnh, thêm một thìa nhỏ muối, đun sôi đến khi ăn thử thấy hạt đậu mềm. Tắt bếp, đổ đậu lên rổ cho ráo nước.\n" +
                "\n" +
                "Trộn lẫn đậu và nếp, đổ vào chõ hấp xôi.\n" +
                "\n" +
                "Tiếp theo thêm đường vào nồi xôi, xới đều, đậy kín nắp.\n" +
                "\n" +
                "Đun tầm từ 10 đến 15 phút, rưới đều dầu ăn lên bề mặt xôi, dùng đũa xới đều (bạn có thể thêm nước cốt dừa tùy theo ý thích). Hấp đến khi xôi chín, hạt đầu mềm.\n" +
                "\n" +
                "Vừng, lạc, giã nhỏ, trộn vào bát vừng muối và đường.\n" +
                "\n" +
                "Múc xôi ra bát, bên trên rắc vừng và lạc");
        stringArrayList13.add(" Xôi đỗ xanh");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "400gr gạo nếp\n" +
                "200gr đỗ xanh (nên chọn loại đỗ xanh mà lòng của nó màu xanh, không nên chọn loại có lòng\n" +
                "màu trắng vì đó là đậu đã để lâu dễ gây sượng)\n" +
                "Một thìa cà phê muối tinh\n" +
                "Cách làm:\n" +
                "\n" +
                "Gạo nếp và đỗ xanh ngâm trước khoảng hai giờ, sau đó vo sạch để ráo nước. Riêng đỗ xanh cần vo và đãi cho sạch vỏ.\n" +
                "\n" +
                "Khi gạo và đỗ đã ráo nước thì cho vào nồi cơm điện, đồng thời cho thìa muối tinh trộn đều.\n" +
                "\n" +
                "Đổ nước sao cho ngập phần gạo khoảng 0,5cm. Cắm điện, đợi khi sôi thì mở nắp, nhanh tay đảo đều rồi đóng kín. Khi nồi cơm điện chuyển sang nút ủ ấm thì đợi thêm khoảng 10 phút là xôi đã chín tới.\n" +
                "\n" +
                "Mách nhỏ: Để món xôi ngon hơn nên ăn kèm với ruốc, lạp sườn hoặc thịt kho đã chuẩn bị từ trước. Cầu kì hơn nữa thì ăn cùng với thịt gà luộc.");
        stringArrayList13.add("Xôi đỗ đỏ");
        chebien13.add("Nguyên liệu\n" +
                "\n" +
                "500 gam gạo nếp ngon\n" +
                "300 gam đậu đỏ\n" +
                "200 gam dừa nạo khô\n" +
                "50 gam mè trắng\n" +
                "Gia vị : muối, đường\n" +
                "Cách làm:\n" +
                "\n" +
                "Tương tự cách nấu xôi đậu xanh còn vỏ, bạn nên ngâm đậu đỏ trong nước lạnh ít nhất 1-3 tiếng hay tốt nhất là qua đêm cho đậu đỏ thấm đủ nước, nhanh chín mềm khi nấu cũng như tiết kiệm năng lượng và thời gian hầm mềm đậu.\n" +
                "\n" +
                "Ngâm trong nước lạnh chừng 1-2 tiếng rồi vo sạch nếp trộn chung với đậu đỏ đã ngâm mềm với chút muối ăn.\n" +
                "\n" +
                "Khi nấu xôi đậu đỏ, bạn cũng dùng cách nấu xôi đậu xanh bằng chỏ để có món xôi dẻo mềm như ý. Nấu sôi già nồi nước chỏ hấp chừng 10 phút thì cho nếp trộn đậu đỏ vào rải đều trên xửng hấp rồi đậy nắp tiếp tục hấp cho xôi đậu đỏ chín mềm chừng 40 phút là được.\n" +
                "\n" +
                "Trong khi chờ xôi đậu đỏ chín thì ngâm dừa khô nạo trong nước nóng chừng 10 phút thì vắt ráo nước cốt dừa rồi nêm vào chút đường, muối.\n" +
                "\n" +
                "Khi xôi đậu đỏ chín mềm, hạt nếp nở to, đậu đỏ bở ra bột và còn thơm lừng mùi nếp quyện với nước dừa béo ngậy khiến ai cũng thích thú khi dùng điểm tâm sáng bằng món xôi đậu đỏ nóng sốt, dẻo ngon cùng muối mè rang vàng");
        stringArrayList13.add("Xôi ngô");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "200g gạo nếp\n" +
                "200g hạt ngô nếp\n" +
                "100g đậu xanh bỏ vỏ\n" +
                "100g đậu phộng/lạc rang sẵn\n" +
                "50g vôi tôi\n" +
                "5g muối; 120g đường; 2 củ hành tím; dầu ăn\n" +
                "Cách làm:\n" +
                "\n" +
                "Ngâm gạo nếp và đậu xanh trong nước ấm khoảng 30 phút. Trong thời gian đó, cho vôi tôi cùng 1 lít nước vào một tô lớn, khuấy đều lên rồi để yên cho vôi lắng xuống, hớt lấy một phần nước vôi trong phía trên.\n" +
                " \n" +
                "Đặt một chiếc nồi nhỏ lên bếp, cho hạt ngô nếp và một lượng nước vôi trong xâm xấp mặt ngô vào, mở lửa vừa, nấu trong khoảng 30 phút để hạt ngô tróc vỏ.\n" +
                "\n" +
                "Đổ hạt ngô ra một chiếc rổ, vừa xả nước vừa chà nhẹ tay cho vỏ ngô tróc hết ra khỏi hạt. Lược bỏ vỏ, lấy thịt ngô.\n" +
                "\n" +
                "Vo sạch gạo nếp rồi đem nấu chín cùng hạt ngô bằng nồi cơm điện.\n" +
                "Rửa sạch đậu xanh và đem hấp cách thủy trong 20 phút.\n" +
                "\n" +
                "Sau khi hấp, mang đậu xanh đi nghiền nát.\n" +
                "\n" +
                "Đặt một chiếc nồi nhỏ lên bếp, mở lửa vừa. Cho đậu xanh nghiền cùng 80g đường vào, đảo đều liên tục đến khi đường tan, đậu xanh hơi ướt thì tắt bếp.\n" +
                "\n" +
                "Giã nhỏ đậu phộng/ lạc rang và trộn với 5g muối, 40g đường để làm muối mè.\n" +
                "\n" +
                "Bóc vỏ, cắt nhỏ hành tím. Đặt một chiếc chảo nhỏ cùng một ít dầu ăn lên bếp, mở lửa lớn. Khi dầu nóng, thả hành tím vào phi nhanh. Khi hành chuyển sang màu vàng thì tắt bếp, vớt hành phi ra để ráo dầu.\n" +
                "Dọn xôi ngô ra chén/ dĩa, rắc đậu xanh, muối mè và hành phi lên dùng cùng.\n" +
                "\n" +
                "Lưu ý:\n" +
                "\n" +
                "Trong quá trình sên đậu xanh, chỉ để lửa nhỏ, tránh làm đậu xanh bị cháy khét.\n" +
                "\n" +
                "Khi nấu xôi, chú ý canh lượng nước ít hơn khi nấu cơm vì ngô hút nước nhiều, dễ bị nhão.");
        stringArrayList13.add(" Xôi lá nếp");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "Cho phần nấu xôi:\n" +
                "\n" +
                "4 bát gạo nếp\n" +
                "Lượng nước vừa đủ để nấu xôi\n" +
                "20 lá dứa tươi\n" +
                "½ muỗng cà phê muối\n" +
                "Phần rắc lên xôi:\n" +
                "\n" +
                "Dừa nạo sợi\n" +
                "Vừng\n" +
                "60g đường\n" +
                "5g muối\n" +
                "Cách làm:\n" +
                "\n" +
                "Lá dứa rửa sạch, cắt nhỏ cho vào máy xay, xay mịn. Lọc lấy phần nước cốt của lá dứa.\n" +
                "\n" +
                "Gạo đãi sạch cho đến khi trong nước. Để ráo, Đổ gạo, lá dứa và nước vào trong nồi cơm điện. Đảo đều. Rồi bật nồi cơm ở chế độ “Cook”. Nấu cho đến khi công tắc nồi bật sang nút giữ ấm. Mở nồi, đảo đều xôi rồi đậy vung, bật nút “Cook” nấu thêm 10-15 phút nữa để xôi được chín đều.\n" +
                "\n" +
                "Hạt vừng rang chín. Cho vừng vào túi, đập dập vừng một chút cho vừng thêm thơm.\n" +
                "\n" +
                "Trộn đường vào với hạt vừng, muối, để sang một bên.\n" +
                "\n" +
                "Cho xôi lá dứa ra đĩa, cho dừa nào lên trên, rắc hỗn hợp vừng lên rồi thưởng thức!");
        stringArrayList13.add("Xôi gấc");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "Gạo nếp\n" +
                "1 quả gấc\n" +
                "Một ít dừa nạo\n" +
                "Nước cốt dừa\n" +
                "Đường trắng\n" +
                "Cách làm:\n" +
                "\n" +
                "Ngâm gạo nếp với nước pha ít muối để qua đêm (từ 6-8 tiếng).\n" +
                "\n" +
                "Bổ đôi quả gấc, vét hạt gấc ra bát, cho một thìa rượu trắng với ít muối rồi trộn đều.\n" +
                "\n" +
                "Gạo đổ ra rổ để ráo, cho phần thịt gấc vào cùng, dùng tay bóp hạt gấc và trộn để phần thịt gấc được trộn đều với gạo nếp.\n" +
                "\n" +
                "Cho nước sôi vào nồi cơm điện, ấn nút “Cook”, cho gạo trộn gấc vào giá hấp của nồi cơm, chọc vài lỗ để hơi nước lên trên dễ dàng hơn. Trong quá trình nấu bạn đảo xôi vài lần để xôi được chín đều.\n" +
                "\n" +
                "Sau hai lần ấn nút “cook” là xôi chín lúc này bạn cho nước cốt dừa và đường vào xôi và đánh đều. Lượng đường tùy theo sở thích ăn ngọt của gia đình bạn. Đậy nắp nồi và để thêm 10 phút nữa cho đường và nước cốt dừa thấm đều vào hạt xôi là được.\n" +
                "\n" +
                "Cho xôi gấc ra đĩa, rắc dừa tươi bào sợi lên ngay lúc xôi còn nóng để ăn cùng.\n" +
                "\n" +
                "Từng hạt xôi gấc đỏ thắm, xem lẫn mùi thơm, béo ngậy của nước cốt dừa và dừa tươi, những miếng xôi gấc dừa ngon ngọt, đẹp mắt sẽ làm một món mà bạn nên thử nấu cho gia đình mình thưởng thức.\n" +
                "\n" );
        stringArrayList13.add("Xôi vò gấc");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "Gạo nếp cái hoa vàng: 300gr\n" +
                "Đậu xanh đã cà vỏ: 100gr\n" +
                "Gấc: 200gr ruột gấc cả hạt (nếu thích xôi có màu đỏ đậm hơn nữa thì tăng thêm lượng gấc)\n" +
                "Rượu trắng: 1 thìa ăn phở\n" +
                "Đường: 1 thìa ăn phở (nếu thích ăn ngọt có thể cho thêm)\n" +
                "Muối: 1 thìa cà phê vơi\n" +
                "Mỡ gà (dầu ăn): 1 thìa nhỏ\n" +
                "Cách làm:\n" +
                "\n" +
                "Đậu xanh ngâm nước khoảng 5 tiếng cho đậu nở căng, đem đãi sạch, nhặt bỏ hạt đậu bị đen.\n" +
                "\n" +
                "Gạo nếp cũng đem ngâm nước khoảng 5-6 tiếng cho nở. Đãi sạch, để cho gạo thật ráo nước rồi xóc gạo với muối.\n" +
                "\n" +
                "Gấc bổ đôi, dùng thìa xúc lấy phần thịt gấc cho vào bát. Thêm 1 chút rượu trắng rồi dùng tay bóp nhuyễn.\n" +
                "\n" +
                "Trộn đều gạo nếp với thịt gấc, nặn bỏ hạt gấc. Thêm chút đường vào gạo rồi xóc đều cho đường, gấc và gạo trộn đều vào nhau.\n" +
                "\n" +
                "Cho đậu xanh vào nồi hấp, hấp cho đậu chín mềm.\n" +
                "\n" +
                "Chút đậu đã chín mềm vào cối giã nhuyễn. Sau đó nắm đậu thành những nắm tròn nhỏ, dùng dao thái đậu thành những lát thật mỏng. Làm lặp đi lặp lại động tác nắm đậu rồi thái khoảng 2-3 lần, khi thấy đậu thật nhuyễn và tơi là được.\n" +
                "\n" +
                "Trong lúc giã đậu xanh thì cho gạo nếp vào nồi, hấp chín. Khi gạo chín thành xôi, lấy ½ chỗ đậu xanh đã thái nhuyễn trộn đều với xôi. Sau đó hấp xôi thêm khoảng 10 phút nữa.\n" +
                "\n" +
                "Chút xôi ra mâm, tải mỏng đều để xôi nhanh nguội. Trộn đều xôi với chút mỡ gà và ½ chỗ đậu xanh còn lại. Dùng tay vừa trộn vừa xoa nhẹ để đậu xanh bám đều vào xôi và tơi ra thành từng hạt.");
        stringArrayList13.add(" Xôi lá cẩm");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "200g dừa nạo\n" +
                "20g lá cẩm (tùy thích màu đậm hay nhạt, có thể tăng hay giảm lượng lá cẩm)\n" +
                "400g gạo nếp\n" +
                "Ít mè trắng rang vàng\n" +
                "Đường trắng\n" +
                "Nước cốt dừa (không bắt buộc)\n" +
                "Cách làm:\n" +
                "\n" +
                "Đun 80-100g đường (tùy thích ngọt nhiều hay ít) với 75g nước, vài cọng lá dứa. Đun tan đường thì cho dừa vào, sên cho nước cạn, dừa chuyển trong là được.\n" +
                "\n" +
                "Gạo nếp vo sạch, để ráo.\n" +
                "\n" +
                "Đun 450ml nước với lá cẩm, đun sôi, đậy nắp.\n" +
                "\n" +
                "Lược qua rây, tán lá cho ra được nhiều màu, lấy màu lá cẩm. Đong lại còn 400ml nước lá cẩm.\n" +
                "\n" +
                "Cho nếp và nước lá cẩm nóng vào nồi cơm điện (tỷ lệ 1 nếp, 1 nước) ấn nút nấu, nấu cho xôi chín.\n" +
                "\n" +
                "Giai đoạn này muốn xôi béo thì khi nấu xôi, bớt lại ít nước, xôi nấu chín sẽ khô, khi xôi chín thì cho thêm nước cốt dừa, đảo đều, ấn nút lại lần nữa.\n" +
                "\n" +
                "Xới xôi ra đĩa, cho dừa sên lên trên, rắc ít đường và mè rang vàng.");
        stringArrayList13.add(" Xôi cốm");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "450g cốm\n" +
                "100g đậu xanh\n" +
                "60g đường cát\n" +
                "Dừa nạo sợi\n" +
                "3 thìa súp dầu ăn\n" +
                "Cách làm:\n" +
                "\n" +
                "\n" +
                "\n" +
                "Ngâm đậu xanh với nước ấm trước ít nhất 6h để đậu xanh nở.\n" +
                "\n" +
                "Cho đậu xanh vào nồi đế dày, thêm nước ngang với mức đậu, đặt lên bếp đun sôi.\n" +
                "\n" +
                "Chắt hết nước, vặn nhỏ lửa nấu đậu xanh tiếp, cho đến khi đậu xanh bở là được. Cách làm này sẽ tiết kiệm thời gian hơn là đồ mà vẫn đảm bảo đậu chín, bở và tơi.\n" +
                "\n" +
                "Đậu xanh sau khi nguội, dùng chày nghiền mịn.\n" +
                "\n" +
                "Trộn cốm với dầu ăn. Đặt nồi hấp lên bếp, đổ cốm vào, lưu ý là cho ít nước trong nồi và để lửa nhỏ để tránh nước sôi trào lên cốm. Đồ kỹ cho đến khi thấy hạt cốm dẻo là được.\n" +
                "\n" +
                "Lấy cốm ra tô, thêm đường và dừa nạo vào trộn đều. Thêm đậu xanh đã nghiền vào, trộn đều lên. Đợi xôi nguội là có thể thưởng thức.");
        stringArrayList13.add("Xôi lạc");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "Gạo nếp: 300g\n" +
                "Lạc: 150g\n" +
                "Dừa nạo: 100g\n" +
                "Muối: 2 thìa\n" +
                "Cách làm:\n" +
                "\n" +
                "Lá nếp rửa sạch, cắt khúc, xay nhuyễn lọc lấy nước cốt.\n" +
                "\n" +
                "Gạo nếp vo sạch, ngâm nước lá nếp qua đêm.\n" +
                "\n" +
                "Lạc đem luộc chín.\n" +
                "\n" +
                "Gạo nếp sau khi ngâm đổ ra rá xóc với 2 thìa muối, rồi cho lạc vào xóc đều, trải lên trên lớp dừa nạo. Sau đó đem hấp cách thủy, khoảng 40-45 phút. Xôi lạc chín xới đều lên là được.\n" +
                "\n" +
                "Cho xôi lạc ra bát nếu thích bạn có thể ăn cùng với ít muối vừng cũng rất ngon nhé.");
        stringArrayList13.add("Xôi xéo");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "300gr gạo nếp\n" +
                "100gr đậu xanh cà vỏ\n" +
                "2 thìa cà phê bột nghệ\n" +
                "Gia vị: dầu ăn, muối, hành khô\n" +
                "Cách làm:\n" +
                "\n" +
                "Gạo nếp vo sạch, ngâm với nước cùng 2 thìa cà phê bột nghệ, 1 thìa cà phê muối để 8 tiếng qua đêm. Sáng hôm sau bạn vo lại gạo cho sạch, vớt ra rổ cho ráo nước.\n" +
                "\n" +
                "Cho gạo vào xửng hấp 20 phút. Thỉnh thoảng dùng đũa xơ lên để gạo chín đều. Miết tay thấy hạt gạo không còn nhân là được.\n" +
                "\n" +
                "Đậu xanh ngâm trước 4 tiếng, vo sạch để ráo nước trộn cùng với 1/2 thìa cà phê muối. Cho đậu xanh vào xửng hấp, dùng đũa tạo vài lỗ trên mặt xửng để đậu được chín đều. Hấp đậu khoảng 15-20 phút, các bạn kiểm tra bằng cách dùng tay miết thấy đậu mịn là được.\n" +
                "\n" +
                "Đậu chín cho máy xay hoặc cối giã mịn. Nắm chặt đậu thành những nắm tròn. Chúng ta nên nắm đậu khi đậu còn ấm thì viên đậu sẽ kết dính tốt, khi thái mỏng đậu không bị tơi ra.\n" +
                "\n" +
                "Hành khô bóc vỏ, thái thành những miếng mỏng. Nên thái hành trước khi phi khoảng vài tiếng để hành khô lại thì khi phi hành sẽ giòn rụm. Lưu ý: Khi phi dầu phải ngập mặt hành nên các bạn chọn chiếc nồi nhỏ hoặc chảo lòng sâu để tiết kiệm dầu. Cho hành vào khi dầu nóng già, vặn lửa liu riu. Khi hành vừa chuyển sang màu vàng thì tắt bếp, không nên đun lâu vì chút nữa hành sẽ chuyển sang màu đậm hơn.\n" +
                "\n" +
                "Vớt hành ra giấy thấm dầu hoặc cho ra rổ thưa mắt để dầu ráo. Xôi chín cho ra dĩa, dùng dao thái mỏng đậu xanh lên mặt xôi. Sau đó rắc hành phi và rưới một ít dầu dùng để phi hành lên trên để xôi xéo thơm ngon, đậm đà.");
        stringArrayList13.add("Xôi trắng lạp xưởng");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "400g gạo nếp, chút muối\n" +
                "2 cây lạp xưởng, 16 tai nấm hương khô, non nửa bát tôm khô, 2 củ hành tím\n" +
                "Xì dầu, hành phi\n" +
                "Cách làm:\n" +
                "\n" +
                "Gạo nếp vo sạch rồi ngâm nước khoảng 20 – 30 phút cho mềm. Sau đó cho vào nồi cơm điện cùng với chút muối và nước sao cho cao hơn mặt gạo một chút (khoảng 1/4 đốt ngón tay) rồi bật nút nấu.\n" +
                "\n" +
                "Lạp xưởng thái nhỏ, nấm hương ngâm mềm rửa sạch rồi cắt nhỏ, tôm khô ngâm nước khoảng 10 phút cho hơi mềm rồi để ráo, hành củ bóc vỏ thái mỏng.\n" +
                "\n" +
                "Cho vào chảo chút dầu rồi đun nóng, cho hành củ vào phi thơm rồi cho tiếp nấm hương, lạp xưởng vào xào, nêm vào nhân chút xì dầu.\n" +
                "\n" +
                "Cho tiếp tôm khô vào, thêm chút nước lã để xào nhân cho chín, ráo nhưng không bị khô quá. Khi nhân đã chín đều thì tắt bếp, rắc vào nhân ít hạt tiêu rồi trộn đều.\n" +
                "\n" +
                "Xới xôi trắng ra đĩa, rải nhân lên trên. Có thể dùng kèm với hành phi và xì dầu.");
        stringArrayList13.add("Xôi vò");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "500 gr gạo nếp ngon.\n" +
                "250gr đậu xanh cà vỏ.\n" +
                "1 muỗng cà phê muối.\n" +
                "2 thìa đường.\n" +
                "2 thìa dầu ăn.\n" +
                "Cách làm:\n" +
                "\n" +
                "Gạo vo sạch, ngâm khoảng 8 tiếng qua đêm. Rửa lại gạo cho sạch, để thật ráo nước sau đó cho 1/2 thìa cà phê muối trộn đều. Lưu ý là gạo phải để thật ráo nếu không nấu xôi hạt gạo sẽ không được tơi, dính liền với nhau. Nếu cẩn thận hơn, các bạn có thể lấy khăn bông thấm đều hạt gạo.\n" +
                "\n" +
                "Đỗ xanh ngâm trước 4 tiếng, rửa sạch, để ráo nước, trộn cùng 1/2 thìa cà phê muối. Cho đỗ vào xửng hấp chín. Dùng đũa tạo lỗ trên mặt xửng để đỗ được chín đều.\n" +
                "\n" +
                "Hấp đỗ khoảng 15- 20 phút là đỗ chín. Các bạn dùng tay miết hạt đỗ thấy mịn là được.\n" +
                "\n" +
                "Cho đỗ vào máy xay, xay nhuyễn. Cho 1/2 đậu xanh xay nhuyễn trộn cùng gạo nếp.\n" +
                "\n" +
                "Cho 2 thìa dầu ăn trộn cùng để hạt gạo bóng bẩy, béo ngậy, khi nấu không bị dính vào nhau.\n" +
                "\n" +
                "Đeo bao tay vò nhẹ để hạt gạo được bao bọc quanh 1 lớp đậu xanh. Đây chính là điều làm nên cái tên của món xôi này.\n" +
                "Cho gạo vào xửng hấp chín, tạo lỗ trên mặt xửng để gạo chín đều.\n" +
                "\n" +
                "Hấp khoảng 20 phút là gạo chín, dùng tay miết hạt gạo thấy không còn nhân là được. Lưu ý trong quá trình hấp cứ khoảng 5-10 phút thì các bạn dùng khăn bông lau hết phần nước ở nắp vung để nước không chảy xuống giúp hạt gạo được khô ráo.\n" +
                "\n" +
                "Cho xôi ra mâm, trút hết 1/2 đậu xanh còn lại đảo đều.\n" +
                "\n" +
                "Cho xôi tiếp vào xửng hấp thêm khoảng 5 phút là được. Xôi chín, các bạn cho ra mâm, đợi xôi nguội cho thêm 2 thìa đường vào trộn đều để xôi có vị ngọt nhẹ.\n" +
                "\n" +
                "Thế là chúng ta đã có món xôi vò béo ngậy, thơm ngon. Mỗi hạt xôi được bao quanh một lớp đậu xanh bùi bùi. Từng hạt tơi mịn tách rời nhau ra nhưng vẫn dẻo thơm, mềm mại. Các bạn có thể ăn xôi vò cùng vị thanh nhẹ của chè hoa cau.");
        stringArrayList13.add("Xôi hạt sen");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "500gr gạo nếp ngon\n" +
                "150gr hạt sen khô\n" +
                "2 thìa nhỏ muối\n" +
                "Cách làm:\n" +
                "\n" +
                "Vo gạo nếp và nhặt vỏ hạt nép nếu có, sau đó cho gạo vào một âu phù hợp và ngâm với nước trong thời gian từ 1-2 tiếng.\n" +
                "\n" +
                "Cùng lúc đó, rửa hạt sen khô nhiều lần cho sạch rồi chuẩn bị một âu riêng có nước rồi ngâm hạt sen thời gian khoảng 1 tiếng.\n" +
                "\n" +
                "Thời gian sau 1 tiếng, cho hạt sen vào nồi (hoặc nồi áp suất) hầm cho hạt sen được chín mềm.\n" +
                "\n" +
                "Khi hạt sen chín đồng thời cũng là lúc ngâm gạo đủ thời gian. Vớt gạo ra, để cho ráo nước. Tiếp theo cho hạt sen đã chín mềm vào trộn cùng gạo và nêm thêm chút muối trắng cho xôi có vị đậm đà. Tiếp tục, cho gạo vào hạt sen đã trộn lẫn cùng nhau vào xửng hấp.\n" +
                "\n" +
                "Hấp với nhiệt lửa to và hấp trong thời gian từ 30-35 phút là xôi chín dẻo, hạt sen bở và nở ra hoà quyện cùng hạt xôi vô cùng thơm ngon.");
        stringArrayList13.add("Xôi cá rô hấp lá sen");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "500g cá rô\n" +
                "400g nếp\n" +
                "30g cà rốt\n" +
                "10g nấm hương\n" +
                "10g mộc nhĩ\n" +
                "Hành tím phi, muối, tiêu, hạt nêm, lá sen\n" +
                "Cách làm:\n" +
                "\n" +
                "Ngâm nếp qua đêm, sau khi ngâm, vo sạch, để ráo nước. Trộn nếp với chút mỡ gà, muối, 1 muỗng cà phê hạt nêm, nước cốt dừa, đem hấp trong 10 phút.\n" +
                "\n" +
                "Cá rô làm sạch vẩy, gỡ lấy thịt, thái miếng vừa ăn. Cà rốt, nấm hương, nấm rơm, mộc nhĩ thái nhỏ. Cho dầu ăn vào chảo, xào chung cá với các nguyên liệu. Sau đó trộn chung với xôi.\n" +
                "\n" +
                "Hấp xôi thêm 5 phút cho thấm gia vị. Sau đó, cho xôi vào lá sen hấp thêm khoảng 10 phút. Xôi chín, rắc hành phi lên trên.");
        stringArrayList13.add("Xôi dừa");
        chebien13.add("Nguyên liệu\n" +
                "\n" +
                "300g gạo nếp\n" +
                "½ quả dừa bánh tẻ\n" +
                "150g đường hoa mai\n" +
                "1 ít vừng rang\n" +
                "Cách làm:\n" +
                "\n" +
                "Gạo nếp vo sạch, đem ngâm vào nước lạnh qua đêm hoặc nếu muốn nhanh bạn đem ngâm gạo vào nước hơi ấm chừng 3 giờ. Gạo sau khi nở đều, xả qua vòi nước mạnh rồi để ráo.\n" +
                "\n" +
                "Trong lúc đó, nạo cùi dừa thành sợi nhỏ.\n" +
                "\n" +
                "Đặt nồi hấp lên bếp, đổ 1 ít nước vào đáy nồi. Bật bếp đun sôi nước. Trộn gạo với dừa, đảo đều.\n" +
                "\n" +
                "Khi nước trong nồi hấp bắt đầu bốc hơi, bạn đổ gạo vào, dàn đều bề mặt, rồi giảm bớt lửa.\n" +
                "\n" +
                "Đồ xôi dừa chừng 15 phút thì lấy đũa đảo đều xôi lên. Sau đó rưới 2 thìa cà phê dầu ăn lên bề mặt xôi, trộn đều. Việc rưới dầu ăn 1 phần giúp xôi không bị khô phần nữa giúp hạt xôi được bóng hơn. Đồ tiếp chừng 10 phút nữa là xôi chín. Bạn có thể kiểm tra bằng cách nhìn hạt xôi đã nở đều, đảo đũa thấy dẻo. Và mùi thơm của dừa và gạo quện vào nhau ngào ngạt.\n" +
                "\n" +
                "Dỡ xôi ra một tô lớn, thêm đường vào, trộn đều lên. Công đoạn này phải thực hiện ngay khi lấy xôi ra bởi khi đó xôi còn nóng, đường mới tan hết được.\n" +
                "\n" +
                "Tiếp theo cho vừng rang vào trộn đều lên, đổ xôi vào một bát ăn cơm, nén chặt xuống. Sau đó úp ngược bát con lên trên một đĩa tròn có đường kính bằng hoặc to hơn 1 chút xíu so với bát nén xôi. Xôi có thể ăn nóng hoặc nguội đều ngon.");
        stringArrayList13.add("Xôi sắn");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "1 củ sắn (khoảng 500 gr)\n" +
                "Gạo nếp\n" +
                "Thịt mỡ\n" +
                "Hành lá; Hành khô\n" +
                "Lạp xưởng (ăn kèm nếu thích)\n" +
                "Cách làm:\n" +
                "\n" +
                "Sắn bóc vỏ, rửa sạch, cắt dọc để bỏ phần sơ, rồi cắt thành những miếng nhỏ bằng đốt ngón tay cái để khi nấu sắn nhanh mềm.\n" +
                "\n" +
                "Ngâm sắn trong nước vo gạo có thả chút muối từ 4-6 tiếng để loại bỏ bớt nhựa độc của sắn.\n" +
                "\n" +
                "Ngâm gạo nếp với nước sạch từ 4-6 tiếng đề gạo đồ được ngon.\n" +
                "Thịt mỡ bỏ bì thái nhỏ. Lạp xưởng thái nhỏ bằng đốt ngón tay. Hành khô bóc vỏ thái lát. Hành xanh thái nhỏ để sẵn.\n" +
                "\n" +
                "Sau thời gian ngâm gạo nếp và sắn. Bạn xả lại bằng nước sạch để ráo. Sau đó trộn gạo nếp với sắn thêm một thìa con muối vào xóc đều.\n" +
                "\n" +
                "Cho thịt mỡ vào chảo, rán cho đến khi thành tóp mỡ thì vớt phần tóp ra, phần mỡ chảy dùng để phi hành khô.\n" +
                "\n" +
                "Đảo chín lạp xưởng trên chảo mỡ rồi để riêng.\n" +
                "\n" +
                "Phần mỡ còn lại đang sôi bạn cho hành lá thái nhỏ và 1 thìa nước mắm ngon, rồi trút phần tóp mỡ đảo nhanh và tắt bếp luôn.\n" +
                "\n" +
                "Xôi sắn được nấu chín khi gạo và sắn chín mềm. Trong quá trình đồ xôi nếu muốn ngon hơn bạn chuẩn bị thêm 1 thìa canh nước cốt dừa rưới lên bề mặt xôi và trộn đều để xôi thêm vị cốt dừa thơm ngon.\n" +
                "\n" +
                "Giờ món xôi và các nguyên liệu đã xong để lên bát. Bạn đơm xôi ra bát, rưới mỡ hành lên bề mặt xôi, cho lạp xưởng và hành phi lên trên là bạn đã có một bát xôi sắn thơm ngon, hấp dẫn.");
        stringArrayList13.add("Xôi nếp cẩm");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "200g nếp cẩm\n" +
                "100g đậu xanh bóc vỏ\n" +
                "400ml nước dừa\n" +
                "100ml nước cốt dừa\n" +
                "60g đường\n" +
                "4g muối\n" +
                "5g bột năng\n" +
                "Một ít dừa bào\n" +
                "Cách làm:\n" +
                "\n" +
                "Đem ngâm nếp cẩm và đậu xanh trong nước ấm khoảng 1 tiếng.\n" +
                "Vo sạch nếp cẩm, cho vào nồi cơm điện cùng 400ml nước dừa và 2g muối rồi đem nấu.\n" +
                "\n" +
                "Lược bỏ nước bẩn, đem đậu xanh hấp cách thủy trong 30 phút.\n" +
                "Khi đậu xanh chín mềm, bắt xuống, nghiền nát. Đặt một chiếc nồi nhỏ lên bếp, cho đậu xanh nghiền cùng 20g đường vào, mở lửa nhỏ. Sên, đảo đều khoảng 2 phút rồi tắt bếp.\n" +
                "\n" +
                "Đặt một chiếc nồi nhỏ lên bếp, cho 100ml nước cốt dừa, 100ml nước sạch, 2g muối, 40g đường, 5g bột năng vào, mở lửa nhỏ. Khuấy đều đến khi hỗn hợp sánh lại thì tắt bếp.\n" +
                "\n" +
                "Lấy xôi nếp cẩm ra bát, ăn kèm cùng đậu xanh nghiền và nước cốt dừa.\n" +
                "\n" +
                "Lưu ý: Khi sên đậu xanh, tránh để lửa to sẽ làm đậu bị cháy.");
        stringArrayList13.add("Xôi pate");
        chebien13.add("Nguyên liệu:\n" +
                "\n" +
                "2 bát ăn cơm gạo nếp\n" +
                "Patê bạn có thể mua sẵn hay tự làm, muối, hành phi vàng\n" +
                "Cách làm:\n" +
                "\n" +
                "Nếp đãi sạch, ngâm nếp vào nước lạnh, khi ngâm bạn nhớ hòa vào nếp ít muối, ngâm qua đêm.\n" +
                "\n" +
                "Hôm sau đổ nếp ra rổ cho ráo nước, rồi cho nếp vào chõ hấp xôi, hấp chín .\n" +
                "\n" +
                "Khi ăn bạn múc xôi ra bát, phía bên trên múc ít patê, rồi múc ít hành phi rưới lên bề mặt. Đơn giản nhưng đã có bát xôi ngon lành.");

        anh13.add(R.drawable.sachanh);
        anh13.add(R.drawable.hapgung);
        anh13.add(R.drawable.caibexanh);
        anh13.add(R.drawable.tuongbot);
        anh13.add(R.drawable.giavi);
        anh13.add(R.drawable.muoixa);
        anh13.add(R.drawable.luot);
        anh13.add(R.drawable.trungcuontom);
        anh13.add(R.drawable.tomhapnam);
        anh13.add(R.drawable.ducthitbobam);
        anh13.add(R.drawable.trungcuontom);
        anh13.add(R.drawable.ab_trungganuong);
        anh13.add(R.drawable.dauphunhoitom);
        anh13.add(R.drawable.trungcuontom);
        anh13.add(R.drawable.tranglonhapgungram);
        anh13.add(R.drawable.ngheuhap);
        anh13.add(R.drawable.muchapthai);
        anh13.add(R.drawable.tomhapnam);
        anh13.add(R.drawable.a2);
    }
    public void ham(){
        stringArrayList14.add("Gà Hầm Thuốc Bắc");
        chebien14.add("Nguyên Liệu\n" +
                "½ con gà\n" +
                "4 bó rau ngải cứu\n" +
                "1 gói gia vị thuốc Bắc\n" +
                "1 củ nghệ tươi\n" +
                "Gia vị: Dầu ăn, hạt nêm, muối.\n" +
                "Cách Làm Gà Hầm Thuốc Bắc\n" +
                "Bước 1: Sơ Chế Nguyên Liệu\n" +
                "Chà xát muối lên bề mặt gà, rửa sạch, chặt thành miếng to.\n" +
                "Gọt vỏ củ nghệ, rửa sạch, đập dập.\n" +
                "Nhặt bỏ lá úa vàng của ngải cứu, rửa sạch với nước muối pha loãng, để trên rổ cho ráo nước.\n" +
                "Bước 2: Ướp Gà\n" +
                "Cho thịt gà vào âu lớn, cho thêm gói gia vị thuốc Bắc, 2 muỗng hạt nêm, trộn đều, ướp trong vòng 1 tiếng.\n" +
                "Sau thời gian đó, bạn gắp thịt gà ra bát lớn, cho rau ngải cứu vào cùng, thêm 1 muỗng hạt nêm, 2 muỗng dầu ăn, trộn đều, ướp thêm 30 phút.\n" +
                "Bước 3: Hầm Gà\n" +
                "Cho gà vào trong nồi, thêm 1-2 bát nước, bắc lên bếp đun sôi. Hạ lửa nhỏ, tiếp tục đun thêm khoảng 5 phút, tắt bếp, để nguội rồi lặp lại quy trình nấu thêm 2 lần nữa.");
        stringArrayList14.add("Canh Xí Páu Hầm Sườn");
        chebien14.add("Nguyên Liệu\n" +
                "200g củ cải muối\n" +
                "300g sườn non\n" +
                "Gia vị: Hạt nêm, đường, muối.\n" +
                "Cách Nấu Canh Xí Páu Hầm Sườn\n" +
                "Bước 1: Sơ Chế Nguyên Liệu\n" +
                "Rửa sạch củ cải muối, cắt thành lát mỏng rồi ngâm trong âu nước lạnh để bớt vị mặn. Xả củ cải muối lại nhiều lần với nước sạch, để ráo nước, vắt khô.\n" +
                "Rửa sạch sườn non với nước muối pha loãng rồi chần sơ qua với nước sôi để khử đi mùi tanh.\n" +
                "Bước 2: Nấu Canh\n" +
                "Cho sườn vào nồi nước, bắc lên bếp đun sôi.\n" +
                "Nước sôi, cho củ cải muối vào nấu chín.\n" +
                "Nêm nếm lại gia vị gồm hạt nêm, đường cho vừa ăn.\n" +
                "Thưởng thức canh xí páu hầm sườn ngay khi còn nóng kèm với cơm trắng.");
        stringArrayList14.add("Gà Hầm Hạt Sen");
        chebien14.add("Nguyên Liệu\n" +
                "½ con gà ta\n" +
                "50g hạt sen khô\n" +
                "50g nấm hương\n" +
                "2 củ hành khô\n" +
                "1 nhánh gừng\n" +
                "Ít rau mùi, hành lá\n" +
                "Gia vị: Hạt nêm, nước mắm, dầu ăn, tiêu xay, muối.\n" +
                "Cách Làm Gà Hầm Hạt Sen\n" +
                "Bước 1: Sơ Chế Nguyên Liệu\n" +
                "Bóc vỏ hành khô, đập dập, băm nhỏ. Gọt vỏ gừng, rửa sạch, cắt sợi chỉ.\n" +
                "Ngâm nấm hương trong bát nước ấm, cắt bỏ chân, rửa sạch.\n" +
                "Rửa sạch hạt sen khô, để trên rổ cho ráo nước.\n" +
                "Nhặt, rửa sạch hành lá, rau mùi, cắt thành khúc ngắn.\n" +
                "Chà xát muối lên bề mặt thịt gà, rửa sạch, chặt thành miếng nhỏ vừa ăn.\n" +
                "Bước 2: Ướp Thịt Gà\n" +
                "Cho thịt gà vào trong bát lớn, thêm 1 muỗng nước mắm, ½ muỗng tiêu xay, ½ hành tím băm nhỏ, 2 muỗng hạt nêm, trộn đều, ướp trong vòng khoảng 30 phút.\n" +
                "Bước 3: Hầm Gà\n" +
                "Cho 1 muỗng dầu ăn vào nồi, bắc lên bếp. Dầu sôi, cho số hành tím băm nhỏ còn lại cùng gừng cắt sợi chỉ vào phi thơm.\n" +
                "Cho thịt gà vào xào săn, đổ nước xâm xấp thịt gà, điều chỉnh lửa lớn. Nấu đến khi nước sôi, hạ lửa liu riu.\n" +
                "Cho hạt sen vào nồi, nước sôi lại cho nấm hương vào cùng.\n" +
                "Tiếp tục hầm thêm khoảng 20 phút, nêm nếm gia vị cho vừa ăn rồi cho hành lá, rau mùi vào và tắt bếp.");
        stringArrayList14.add("Canh Gà Hầm Rau Củ");
        chebien14.add("Nguyên Liệu\n" +
                "1 con gà ta\n" +
                "1 trái ngô ngọt\n" +
                "300g khoai mỡ (hoặc khoai môn)\n" +
                "50g nấm mèo\n" +
                "50g nấm kim châm\n" +
                "5 cây cải thìa\n" +
                "30g váng đậu\n" +
                "2 cây hành lá\n" +
                "1 nhánh gừng\n" +
                "Gia vị: Muối, hạt nêm, đường.\n" +
                "Cách Làm Gà Hầm Rau Củ\n" +
                "Bước 1: Sơ Chế Nguyên Liệu\n" +
                "Chà xát muối lên bề mặt gà, rửa lại nhiều lần với nước.\n" +
                "Gọt vỏ gừng, đập dập. Nhặt và rửa sạch hành lá.\n" +
                "Ngâm nấm mèo nở mềm rồi rửa sạch, cắt bỏ gốc của nấm kim châm, rửa sạch và cắt ngô ngọt thành khúc ngắn.\n" +
                "Gọt vỏ khoai mỡ, rửa sạch, cắt thành miếng vừa ăn. Rửa sạch cải thìa, ngâm váng đậu mềm rồi cắt khúc.\n" +
                "Bước 2: Hầm Gà\n" +
                "Cho gà vào nồi, thêm lượng nước vừa đủ, bắc lên bếp đun sôi.\n" +
                "Nước sôi, cho hành lá, gừng đập dập vào cùng, hạ nhỏ lửa, hầm gà chín mềm vớt ra đĩa.\n" +
                "Bước 3: Hầm Rau Củ\n" +
                "Cho lần lượt các nguyên liệu rau củ vào nồi nước hầm gà theo thứ tự ngô ngọt, nấm mèo, vàng đậu, đun khoảng 2 phút. Cho thêm khoai mỡ, 1 muỗng cà phê muối vào cùng, đun tiếp đến khi khoai vừa chín tới.\n" +
                "Bước 4: Hoàn Thiện Món Ăn\n" +
                "Cho cải thìa, nấm kim châm và gà vừa hầm vào nồi nước, đun sôi trở lại, nêm nếm đường, hạt nêm cho vừa ăn rồi tắt bếp.");
        stringArrayList14.add("Canh xương hầm rau củ");
        chebien14.add("Nguyên liệu:\n" +
                "\n" +
                "500g xương heo\n" +
                "\n" +
                "350g khoai tây bi\n" +
                "\n" +
                "2 củ cà rốt\n" +
                "\n" +
                "1 quả su su\n" +
                "\n" +
                "1 tép hành lá\n" +
                "\n" +
                "Gia vị: muối, bột nêm, tiêu\n" +
                "\n" +
                "Cách làm:\n" +
                "Bước 1\n" +
                "\n" +
                "Xương bạn chặt thành từng miếng bằng bao diêm, rửa sạch rồi đem chần qua nước sôi cho sạch bẩn và mùi hôi. Sau đó cho xương vào nồi, tra vào một ít bột canh, hành tím đập dập, đổ nước vào đun đến khi nước sôi, vặn nhỏ lửa ninh cho xương mềm. Tiện hơn bạn có thể cho vào nồi áp suất đun.\n" +
                "Bước 2\n" +
                "\n" +
                "Trong quá trình ninh xương bạn đem gọt vỏ khoai tây bi, cà rốt, su su, rửa sạch, để ráo. Thái cà rốt, su su thành những miếng nhỏ vừa, dày khoảng 1cm. Hành lá rửa sạch, thái khúc.\n" +
                "Bước 3\n" +
                "\n" +
                "Xương sau khi ninh mềm, cho cà rốt vào nồi cùng với muối, bột nêm nấu trên lửa vừa đến khi cà rốt bắt đầu chín.\n" +
                "Bước 4\n" +
                "\n" +
                "Tiếp đó, cho lần lượt khoai tây bi và su su vào nấu cho đến khi chín mềm.\n" +
                "Bước 5\n" +
                "\n" +
                "Nêm nếm lại gia vị cho vừa miệng rồi cho tiêu, hành lá vào thì tắt bếp.");
        stringArrayList14.add("Canh xương bò hầm khoai tây");
        chebien14.add("Nguyên liệu để làm món canh bò hầm\n" +
                "Xương bò, thịt sườn: 1Kg\n" +
                "Khoai tây: 3 củ\n" +
                "Cần tây, hành lá, cà chua\n" +
                "Gia vị: Muối, tiêu, hạt nêm, ngũ vị hương.\n" +
                "Cách thực hiện canh bò hầm\n" +
                "Sơ chế nguyên liệu\n" +
                "\n" +
                "Bò sau khi mua về bạn rửa sạch bằng nước gừng và giấm để bớt mùi hôi.\n" +
                "Khoai tây gọt vỏ cắt khúc vừa ăn\n" +
                "Hành tây bóc vỏ, bổ múi cau\n" +
                "Hành lá rửa sạch, thái nhỏ.\n" +
                "Các bước thực hiện\n" +
                "\n" +
                "Xương đem ướp với gia vị gồm hạt niêm, tiêu, một chút ngũ vị hương trong khoảng 15 phút. Sau đó cho vào nổi đào sơ qua thì đổ nước vào đun đến khi mềm.\n" +
                "Đến khi thấy xương bò đã mềm thì ta cho hành tây, cà chua vào nấu thêm khảng 10 phút nữa.\n" +
                "Tiếp theo, nêm nếm lại gia vị và cho hành tây cùng cần tây vào khoảng 1 phút là bạn đã có thể tắt bếp rồi.");
        stringArrayList14.add("Canh bí đỏ hầm xương");
        chebien14.add("Nguyên liệu canh bí đỏ hầm\n" +
                "Bí đỏ: 600g\n" +
                "Xương heo: 500g\n" +
                "Ngò rí, hành lá, tỏi\n" +
                "Gia vị thông thường: Tiêu, hạt nêm, nước mắm, đường, dầu ăn….\n" +
                "Các bước thực hiện canh bí hầm\n" +
                "Đầu tiên bạn cho xương vào một cái chậu cùng với nước muối pha loãng để rửa sạch. Sau đó, đem xương ra rửa lại bằn nước lạnh.\n" +
                "\n" +
                "Khi thịt đã được rửa sạch thì bạn đem ướp với: muối, đường, hạt nêm, nước mắm, tiêu xay trong khoảng 15 phút.\n" +
                "\n" +
                "Trong khi thịt đang ướp thì ta kết hợp đem tỏi, hành lá băm nhuyễn. Bí đỏ đem gọt vỏ, rửa sạch, bỏ hột và cắt thành từng miếng vừa ăn.\n" +
                "\n" +
                "Xương đã ướp xong, bạn cho lên nồi lên bếp thêm chút dầu vào xào sơ qua xương, tiếp đến đổ nước vào hầm trong khoảng thời gian 30 để xương mềm vừa tới thì cho bí đọ vào nấu cùng.\n" +
                "\n" +
                "Nấu thêm khoảng 15 phút, khi bí đỏ đã mềm thì bạn nêm nếm lại gia vị, cho hành lá, tiêu, ngò rí vào và múc ra tô là ta đã có cho mình món canh vô cùng ngon và bổ dưỡng rồi đó.");
        stringArrayList14.add("Canh đu đủ hầm xương heo");
        chebien14.add("Nguyên liệu cần thiết\n" +
                "Xương heo: 500g\n" +
                "Đu đủ: 1 quả\n" +
                "Nấm rơm: 200g\n" +
                "Hành lá, ngò hành khô\n" +
                "Nước mắm, hạt nêm, đường, dầu ăn, ớt, tỏi.\n" +
                "Cách nấu đu đủ hầm xương\n" +
                "Đủ đủ đem gọt vỏm cắt làm đôi, bỏ hột ở bên trong rồi đem rửa sạch với nước và cắt thành từng miếng.\n" +
                "\n" +
                "Xương bạn đem rửa sạch rồi chặt thành từng khúc trước khi đem chần sơ với nước sôi và cùng muối. Rửa lại lần nữa với nước.\n" +
                "\n" +
                "Hành tím khô, tỏi bóc vỏ rồi băm nhỏ. Nấm rơm, ngò rí, hành lá rửa sạch rồi cắt nhỏ.\n" +
                "\n" +
                "Đê canh ngon hơn, bạn nên phi thơm tỏi, hành sau đó cho xương vào xào sơ qua. Đến khi phần thịt săn lại thì bạn mới nên đổ nước vào hầm. Thời gian hầm thông thường từ 20 đến 30 phút tùy theo xương bạn mua. Hầm càng lâu thì nước dụng càng ngọt.\n" +
                "\n" +
                "Khi thấy xương đã mềm thì bạn cho đu đủ vào hầm thêm khoảng 15 phút nữa thì nêm nêm lại gia vị. Lưu ý trong lúc nấu nên vớt hết bọt để nước dùng ngon hơn.\n" +
                "\n" +
                "Cuối cùng là cho hành, ngò đã cắt sắt thêm chút tiêu xay nữa là có thể mời cả gia đình vào cùng thưởng thức rồi.");
        stringArrayList14.add("Canh xương heo hầm bắp");
        chebien14.add("Nguyên liệu làm canh hầm bắp\n" +
                "Xương heo: 500g\n" +
                "Khoai tây bi: 300g\n" +
                "Cà rốt: 2 củ\n" +
                "Su su: 1 củ\n" +
                "Hành lá\n" +
                "Gia vị các loại: Muối, hạt nêm, tiêu, nước mắm…\n" +
                "Cách làm món canh xương hầm bắp\n" +
                "Về cách sơ chế xương chắc mình sẽ không chia sẻ ở mục này nữa, vì ở trên đã có nhiều công thức cũng như đã nói về cách sơ chế rồi.\n" +
                "\n" +
                "Về phần khoai tây, cà rốt, su su, thì bạn rửa sạch rrooif cắt thành từng miếng. Hành lá đem rửa sạch rồi bạn cắt từng khúc khoảng 5 cm.\n" +
                "\n" +
                "Xương sau khi hầm mềm thì bạn cho các loại rau củ ở trên vào nấu thêm 10 đến 15 phút nữa thì bạn nêm nếm lại gia vị cho vừa ăn nhất.\n" +
                "\n" +
                "Cuối cùng bạn múc canh ra tô và thêm chút hành lá và tiêu ở trên nữa là xong món canh hầm thơm ngon bổ dưỡng rồi.");
        stringArrayList14.add("Xương dê nấu canh");
        chebien14.add("Xương dê: 800g\n" +
                "Đu đủ xanh: ½ quả\n" +
                "Hành, ngò rí, tiêu\n" +
                "Các gia vị: muối, hạt nêm, đường phèn,…\n" +
                "Cách chế miến món xương dê hầm\n" +
                "Xương dê nếu như bạn sơ chế không đúng cách rất dễ có mùi khi nấu đo đó bạn cần phải kỹ lưỡng trong khâu này nhé.\n" +
                "\n" +
                "Bạn nên cho xương dê vào nồi nước đun sôi để ra hết chất bẩn, sau đó vớt ra và rửa lại với nước sạch.\n" +
                "\n" +
                "Tiếp đến, bạn cho cho xương vào nồi đảo sơ qua cùng với hành băm sau đó cho nước vào nồi hầm. Có mẹo nhỏ là bạn nên cho thêm vài củ hành tím đập dập và đường phèn cùng lúc với xương như vậy sẽ thơm và ngon hơn.\n" +
                "\n" +
                "Trong lúc hầm xương, thì ta đem gọt vỏ đu đủ và sơ chế nó. Đến khi xương chín thì ta sẽ cho đu đủ vào nấu cùng. Nên nấu đến khi đu đủ mềm thì bạn gia vị cho vừa ăn là tốt nhất. Không nên nấu quá lâu đu đủ sẽ bị nát ăn sẽ không ngon.\n" +
                "\n" +
                "Nấu xong rồi thì giờ chúng ta cùng nhau thưởng thức xem thành quả ngon đến mức nào nhé.");

        anh14.add(R.drawable.sachanh);
        anh14.add(R.drawable.ab_khoai_lang_ken);
        anh14.add(R.drawable.ab_thach_dua);
        anh14.add(R.drawable.ab_che_khoai_lang);
        anh14.add(R.drawable.ab_xoai);
        anh14.add(R.drawable.ab_banh_goi);
        anh14.add(R.drawable.ab_khoai_tay);
        anh14.add(R.drawable.ab_banhranman);
        anh14.add(R.drawable.ab_tokbokki);
        anh14.add(R.drawable.ab_phomaique);
    }
    public void hsan(){
        stringArrayList15.add("Bạch tuộc xào cay kiểu Hàn");
        chebien15.add("Nguyên liệu:\n" +
                "\n" +
                "2 con bạch tuộc nhỏ\n" +
                "1 củ hành tây cỡ vừa\n" +
                "1 củ cà rốt lớn\n" +
                "6 quả ớt xanh, tỏi băm, bột ớt Hàn Quốc Gochugaru\n" +
                "Dầu mè, đường, nước tương, tiêu, hạt mè, mắm tôm\n" +
                "Cách làm:\n" +
                "\n" +
                "Bạn ngâm bạch tuộc trong nước muối lạnh, nếu là bạch tuộc đông lạnh thì chờ cho tan hết đá. Nếu bạch tuộc bị đóng băng quá lâu; cũng có thể dùng nước ấm hoặc rã đông trong lò vi sóng. Trong 1 bát tô, bạn cho bạch tuộc đã để ráo và muối hạt; bột và xoa bóp bạch tuộc trong vòng vài phút.\n" +
                "\n" +
                "Bạn đem bạch tuộc ra rửa sạch 2 lần với nước lạnh. Dùng dao hoặc kéo cắt phần bụng bạch tuộc ra. Lấy hết các bộ phận bên trong bụng nó và bỏ đi. Loại bỏ mắt bạch tuộc. Loại bỏ những bọc tròn đen dưới nách bạch tuộc. Rửa sạch lại bạch tuộc 2 lần với nước và để ráo hoàn toàn. Thái bạch tuộc thành miếng vừa ăn.\n" +
                "\n" +
                "Rửa sạch các loại rau củ và thái lát chúng. Bạn trộn bột ớt với đường, mắm tôm, nước tương, dầu mè, 1 chút tiêu và tỏi băm. Làm nóng chảo với dầu rồi cho bạch tuộc vào xào khoảng 1 phút; và xúc ra để sang một bên.\n" +
                "\n" +
                "Làm nóng chảo và xào cà rốt 1 phút trên lửa lớn. Thêm hành tây vào và xào. Thêm hành lá và ớt xanh, bạch tuộc vào chảo rau xào; và đổ gia vị đã trộn vào; nấu thêm 3 phút trên lửa lớn. Nêm thêm một chút muối nếu cần. Xúc món xào ra đĩa, rắc ít hạt mè lên trên và thưởng thức.");
        stringArrayList15.add("Tôm nướng muối ớt ngon đậm đà");
        chebien15.add("Nguyên liệu:\n" +
                "\n" +
                "Tôm sú: 500g\n" +
                "Ớt sừng: 5 trái,\n" +
                "Rau răm: 50g.\n" +
                "Chanh tươi: 1 trái.\n" +
                "Dưa leo: 1 trái.\n" +
                "Tiêu sọ xanh: 1 nhánh.\n" +
                "Gia vị: Tỏi, muối tinh, bột ngọt, dầu ăn, tiêu bột, ớt bột, tương ớt, nước mắm, đường, muối hạt.\n" +
                "Dụng cụ: Bếp nướng than hoa, vỷ nướng, xiên tre nhỏ (bao nhiêu con tôm thì bấy nhiêu xiên tre nhé), cối – chày để giã\n" +
                "Cách làm:\n" +
                "\n" +
                "Tôm sú rửa sạch, cắt bỏ bớt phần râu, để ráo.\n" +
                "\n" +
                "Ớt sừng rửa sạch, bỏ cuống, 2 trái để nguyên, 3 trái giã nhỏ. Tỏi lột vỏ, rửa sạch, băm nhỏ. Tiêu sọ xanh tách hạt, rửa sạch, để ráo. Chanh tươi lấy nước cốt. Dưa leo rửa sạch, gọt 2 đầu, chả kỹ mủ, thái lát tròn xếp quanh viền đĩa. Rau răm nhặt và rửa sạch, để ráo, trang trí phần dưới đĩa trình bày món tôm nướng muối ớt.\n" +
                "\n" +
                "Xiên tre đem ngâm vào nước lạnh để khi nướng tôm bằng bếp than hoa sẽ không bị cháy.\n" +
                "\n" +
                "Cho tôm vào tô lớn rồi cho các loại gia vị dùng để ướp tôm vào bao gồm: Ớt, tỏi đã băm nhỏ, 1 thìa muối tinh, 1 thìa nước mắm, 1 thìa bột ngọt, ½ thìa đường, ½ thìa tiêu bột, ½ thìa ớt bột, 2 thìa tương ớt, 2 thìa dầu ăn rồi ướp tôm trong 1 tiếng cho tôm ngấm gia vị, tốt nhất bạn cho tôm vào ngăn mát tủ lạnh trong quá trình ướp để món cách nướng tôm muối ớt thêm phần thơm ngon, đậm đà nhé.\n" +
                "\n" +
                "Sau khi tôm đã nướng gia vị, bạn vớt xiên tre ra khỏi nước lạnh, để khoảng 10 phút cho ráo rồi xiên thẳng từng con tôm và cho lên bếp than hoa để nướng, để tôm được ngon bạn cần để than ở nhiệt độ vừa phải và trở tôm đều tay để tôm chín đều, hấp dẫn, đẹp mắt và không bị cháy phần vỏ bên ngoài nhé. Khi thấy vỏ tôm chuyển qua màu đỏ gạch, dậy mùi thơm là nướng tôm muối ớt ngon đã đạt yêu cầu rồi đấy.\n" +
                "\n" +
                "Làm muối chanh ớt dùng kèm tôm nướng muối ớt: Cho 2 trái ớt sừng đỏ, 2 thìa muối hạt, ½ thìa bột ngọt, tiêu sọ tách hạt vào cối, giã thật nhỏ,cho ra đĩa nhỏ, khi ăn cho them 1 thìa nước cốt chanh nữa là bạn đã có 1 đĩa muối chanh ớt cực ngon rồi đấy.");
        stringArrayList15.add("Sò huyết xào tỏi");
        chebien15.add("Nguyên liệu:\n" +
                "\n" +
                "1kg sò huyết\n" +
                "Vài củ tỏi\n" +
                "Rau răm\n" +
                "Gia vị gồm hạt nêm, muối, đường, tiêu và dầu ăn.\n" +
                "Cách làm:\n" +
                "\n" +
                "Tỏi băm nhuyễn ra được khoảng 5 muỗng cafe.\n" +
                "\n" +
                "Làm nóng dầu trong chảo, cho tỏi vào xào đến khi chuyển màu hơi vàng (không được để tỏi thật vàng rồi mới cho vào vì đợi sò huyết chín sẽ làm cháy tỏi) thì thêm sò huyết, đảo đều tay, nêm nếm hạt nêm, muối, đường và tiêu cho vừa ăn.\n" +
                "\n" +
                "Bạn đảo khoảng 5 phút cho sò huyết vừa hơi mở miệng, tỏi thật vàng là ăn được.");
        stringArrayList15.add("Cách làm cua rang me");
        chebien15.add("Nguyên liệu:\n" +
                "\n" +
                "Cua thịt: 1Kg (Nên chọn Cua thịt Y3, Cua thịt Y5 hoặc Cua thịt Y7)\n" +
                "Me chua chín: 1/2 bát con\n" +
                "Tỏi: 4 tép băm nhuyễn\n" +
                "Hành tây: 1 củ nhỏ đã thái mỏng\n" +
                "Bột năng: 1 thìa\n" +
                "Dưa leo: 1 quả\n" +
                "Các gia vị khác: Đường, hạt tiêu, ớt, hạt nêm…\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Sơ chế cua\n" +
                "\n" +
                "Cua đem rửa sạch, tách bỏ phần mai, dùng đũa khều nhẹ phần gạch ở mai cua để riêng ra một cái bát nhỏ. Bạn có thể để cua nguyên con, nhưng nếu muốn cua ngấm đều gia vị tốt nhất nên cắt cua làm làm đôi, hoặc làm 4 tùy theo sở thích của từng người.\n" +
                "Phần càng cua vốn rất cứng vì vậy nên dùng dao hay chày đập hơi dập để các gia vị ngấm đều vào phần thịt trong càng cũng như tránh tình trạng nổ khi chiên.\n" +
                "\n" +
                "Lấy phần cua đã được sơ chế xong cho vào một cái tô lớn, cho thêm một chút hạt nêm và hạt tiêu rắc đều lên phần cua, đảo nhẹ để cua ngấm gia vị, ướp cua trong tô khoảng 30 phút.\n" +
                "\n" +
                "Sau khi cua ướp đã ngấm đều gia vị, bạn bắc chảo lên bếp, cho dầu vào chiên cua. Cua cần được chiên vàng sao cho không quá trắng cũng không bị cháy, sau đó vớt cua ra một cái rổ để ráo mỡ.\n" +
                "\n" +
                "Bước 2: Xào cua cùng nước sốt me\n" +
                "\n" +
                "Đây là công đoạn quan trọng nhất trong quá trình làm món Cua rang me, nước sốt me ngon hay không sẽ quyết định đến độ ngon của món ăn nên bạn cần chú ý hơn.\n" +
                "\n" +
                "Trước tiên cho me vào nước nóng, lấy muỗng đánh nhuyễn, gắp bỏ hết phần hạt, dùng dụng cụ lọc, lọc lấy khoảng 3/4 bát.\n" +
                "\n" +
                "Cho 2 thìa dầu ăn, đổ tỏi vào phi lên, khi tỏi có màu vàng nhạt và thơm thì cho hành tây, nước me cùng với đường và 2 muỗng cà phê hạt nêm vào cùng. Đun hỗn hợp trên đến khi nước me sôi thì cho thêm một chút ớt vào (Lượng ớt nhiều hay ít tùy theo vào sở thích ăn cay của mỗi người).\n" +
                "\n" +
                "Bột năng hòa tan cùng một chút nước, đổ từ từ vào nước sốt để tạo độ sánh, một tay đổ, một tay quấy đều để bột không bị vón cục.\n" +
                "\n" +
                "Nêm nếm lại gia vị một lần nữa, khi thấy các vị chua, cay, mặn, ngọt đã hài hòa thì cho cua vào xóc đều, đun nhỏ lửa 5 – 7 phút là được.\n" +
                "\n" +
                "Phần gạch cua: Cho một chút dầu vào phi thơm tỏi, đổ gạch cua vào, nêm một chút gia vị.");
        stringArrayList15.add("Nghêu nướng mỡ hành");
        chebien15.add("Nguyên liệu:\n" +
                "\n" +
                "Nghêu cỡ lớn\n" +
                "Lạc rang\n" +
                "Hành lá\n" +
                "Gia vị: hạt nêm, nước mắm, đường, hành tím, dầu ăn và tiêu\n" +
                "Cách làm:\n" +
                "\n" +
                "Ngâm nghêu thật kỹ cho sạch cát.\n" +
                "\n" +
                "Phi hành cho thơm. Sau đó, thêm đường, mắm, hạt nêm, tiêu và chút lạc rang đã giã vừa vào cùng.\n" +
                "\n" +
                "Hành lá đem cắt khúc chừng 0,5cm, đun nóng dầu ăn và đổ hành lá vào.\n" +
                "\n" +
                "Tiếp đó, cho phần hành vào bát, rồi đổ hỗn hợp trên vào cùng.\n" +
                "\n" +
                "Đem nghêu ra nướng đến khi mở miệng thì cho hỗn hợp trên vào. Bạn hãy chờ một chút khi chúng nóng đều là có thể thưởng thức được rồi.");
        stringArrayList15.add("Mực sốt tỏi ớt");
        chebien15.add("Nguyên liệu\n" +
                "\n" +
                "Mực\n" +
                "Tỏi, ớt, gừng, nước mắm, đường, dầu ăn\n" +
                "Cách làm\n" +
                "\n" +
                "Mực mang về rửa sạch rồi cho vào hấp sơ qua sau đó lại rửa sạch với nước rồi trụng qua nước sôi có pha với chút dấm, gừng để khử mùi tanh rồi để ráo nước.\n" +
                "\n" +
                "Tỏi, ớt đập dập rồi cho vào chảo dầu phi thơm và tắt bếp. Tiếp theo cho nước mắm, đường vào và bật lên bếp đun liu riu cho hỗn hợp sôi thì cho mực vào xào cùng. Xào đến khi mực săn lại, và nước sốt, gia vị hòa quyện vào mực thì tắt bếp.\n" +
                "\n" +
                "Mực sốt tỏi ớt ăn với cơm nóng rất ngon mà ai cũng phải tấm tắc khen ngon, bạn hãy thêm vào thực đơn nhé!");
        stringArrayList15.add("Mực hấp hành gừng");
        chebien15.add("Nguyên liệu\n" +
                "\n" +
                "Mực tươi: 500g, bạn có thể sử dụng mực ống, mực cơm, mực lá đều ngon nhé.\n" +
                "Gừng: 1 nhánh khoảng 100g.\n" +
                "Hành lá: 100g.\n" +
                "Ớt sừng đỏ: 6 trái.\n" +
                "Rau sống ăn kèm mực hấp gừng: 1 trái dưa leo, 1 trái vả (không bắt buộc nhé), rau thơm, rau mùi, xà lách.\n" +
                "Tỏi: 1 củ.\n" +
                "Chanh tươi: 1 trái.\n" +
                "Gia vị: Hạt nêm, nước mắm, đường, rượu trắng.\n" +
                "Cách làm\n" +
                "\n" +
                "Mực: Sơ chế, rửa sạch cùng với nước có pha rượu trắng và gừng đập dập cho mực bớt tanh, khi hấp sẽ thơm ngon hơn. Cắt mực thành từng khoanh tròn dài 3cm, khứa nhẹ trên thân mật. Nếu mực cơm nhỏ thì để nguyên con nhé. Ướp mực với 1 thìa hạt nêm, 1 thìa nước mắm, ½ thìa bột ngọt trong 20 phút cho mực ngấm gia vị.\n" +
                "\n" +
                "Gừng: Gọt vỏ, rửa sạch, chia làm 3 phần, 2/3 thái chỉ, 1/3 để nguyên. Hành lá: Nhặt vừa rửa sạch, để ráo, cắt khúc dài 5cm. Ớt sừng: 3 trái bỏ cuống, rửa sạch, chẻ đôi, bỏ hạt, thái chỉ, 3 trái để nguyên. Tỏi: Lột vỏ, rửa sạch, để ráo. Chanh tươi: Lấy nước cốt.\n" +
                "\n" +
                "Rau sống ăn kèm mực hấp hành gừng: Nhặt và rửa sạch, để ráo, dưa leo chà kỷ mũ 2 đầu, thái lát dài 3cm, vả gọt vỏ, thái lát mỏng ngâm với nước có pha ít chanh cho vả được trắng rồi bày ra đĩa sao cho hấp dẫn.\n" +
                "\n" +
                "Khi mực đã ngấm gia vị, trộn chung mực với gừng – ớt thái chỉ, hành thái khúc, cho vào xửng hấp cách thủy khoảng 10 phút tới khi mực vừa chín tới là được, bạn không nên hấp mực quá lâu sẽ khiến mực mất đi độ giòn ngon nhé. Bày món mực hấp hành gừng ra đĩa sao cho đẹp mắt.");
        stringArrayList15.add("Súp cua");
        chebien15.add("Nguyên liệu\n" +
                "\n" +
                "1 con cua to (chuẩn bị cua Cà Mau hoặc loại cua biển bạn thích)\n" +
                "2 quả trứng gà (chỉ lấy lòng trắng)\n" +
                "1 kg xương ống\n" +
                "1/2 chén đậu Hà Lan\n" +
                "1 chén bắp ngọt\n" +
                "2 muống bột năng\n" +
                "Rau mùi, hành lá\n" +
                "Cách làm\n" +
                "\n" +
                "Xương ống luộc qua rồi rửa sạch cho hết chất bẩn. Ninh xương khoảng 1 giờ rồi chắt lấy 1 lít nước dùng làm nước súp.\n" +
                "\n" +
                "Cua rửa sạch, luộc chín. Sau đó, gỡ lấy thịt cua.\n" +
                "\n" +
                "Bắc 1 cái chảo lên bếp, chảo nóng cho 1 ít dầu ăn rồi xào sơ thịt cua cho thơm.\n" +
                "\n" +
                "Rửa sạch bắp, đậu Hà Lan, mùi dây. Đánh tan lòng trắng trứng, hòa bột năng với nước vừa đủ.\n" +
                "\n" +
                "Bắc nồi nước dùng lên bếp, cho hạt bắp và đậu Hà Lan vào nấu. Đến khi hạt bắp và đậu nhừ thì cho cua vào, nêm nếm gia vị vừa ăn.\n" +
                "\n" +
                "Tiếp theo từ từ đổ lòng trắng trứng vào khấy theo 1 chiều để tạo vân cho đẹp.\n" +
                "\n" +
                "Sau cùng thì cho bột năng vào, chú ý là đổ từ từ, đến khi thấy nồi súp sánh lại thì dừng lại. Không nên đổ ngay cùng 1 lúc sẽ dễ bị đặc quá nhé.Nấu đến khi nồi súp chuyển màu trong thì múc ra chén, rắc rau mùi, thêm tiêu bột, ớt tùy ý lên và thưởng thức.");
        stringArrayList15.add("Tôm hấp thái");
        chebien15.add("Nguyên liệu:\n" +
                "\n" +
                "Tôm to: 10 con\n" +
                "Miến: 1 gói\n" +
                "Sả: 1 củ, thái lát nhỏ\n" +
                "Rau mùi thái nhỏ\n" +
                "Tỏi: 1 nhánh\n" +
                "Gia vị: 2 thìa dầu hào, 2 thìa xì dầu, ½ thìa đường, ½ thìa muối tiêu, 1 thìa rượu\n" +
                "Cách làm:\n" +
                "\n" +
                "Cho tỏi, hạt tiêu và rau mùi vào cối giã nhuyễn.\n" +
                "\n" +
                "Lấy một cái bát, trộn dầu hào, đường, xì dầu, muối tiêu, 1 chén nước và chỗ tỏi đã giã nhuyễn, trộn đều thành nước sốt.\n" +
                "\n" +
                "Đặt nồi lên bếp, cho dầu ăn vào, tiếp đến cho ½ chỗ sả thái nhỏ xuống dưới cùng.\n" +
                "\n" +
                "Miến ngâm nước mềm, sau đó cho một nửa chỗ miến lên trên sả, rồi đến tôm. Tưới ½ chỗ nước sốt vừa trộn vào.\n" +
                "\n" +
                "Tiếp tục làm một lớp nữa như thế: sả, miến, tôm, nước sốt.\n" +
                " \n" +
                "Đậy vung nồi, đun lửa nhỏ, hấp trong 20 phút. Chú ý kiểm tra thường xuyên để không bị cháy đáy nồi, có thể thêm một chút nước nếu bị khô quá.\n" +
                "\n" +
                "Cho 1 thìa rượu và rau mùi thái nhỏ lên trên, đậy vung nồi đun tiếp trong 1 phút.\n" +
                "\n" +
                "Kiểm tra để chắc chắn tôm đã chín rồi tắt bếp. Cho ra đĩa ăn nóng");
        stringArrayList15.add("Bạch tuộc sốt ớt chua cay kiểu Thái");
        chebien15.add("Nguyên Liệu\n" +
                "\n" +
                "500gr bạch tuộc, 1 quả trứng gà\n" +
                "\n" +
                "2 quả cà chua cắt hạt lựu, 1/3 chén rượu\n" +
                "\n" +
                "1 mc tỏi băm, 1 mc hành tím băm, 1 mcp muối, 2 mc đường cát\n" +
                "\n" +
                "2 mc ớt hiểm băm, 2 mc tương ớt, 1 mcp bơ\n" +
                "\n" +
                "Dầu ăn, khúc Đầu hành lá cắt\n" +
                "\n" +
                "Các bước\n" +
                "\n" +
                "Cho rượu vào nước để trụng sơ bạch tuộc, trở đều trong khoảng 1′. Vớt ra, ngâm vào nước lạnh cho giòn. Bạch tuộc để nguội, cắt vừa ăn.\n" +
                "\n" +
                "Cho dầu vào chảo, phi thơm tỏi và hành tím băm. Tiếp cà chua và muối vào đảo đều, thêm đường + tương ớt + đầu hành lá xào 1′. Rồi cho ớt băm + bơ vào đảo đều, cho bạch tuột vào xào với lửa lớn để không ra nước. Đậy nắp lại trong 2′, cho thêm xíu bơ nữa cho thơm. Vừa đảo đều vừa rót trứng gà từ từ vào, vậy là được rồi\n" +
                "\n" +
                "Ăn kèm với mì hay bánh mì đều được");
        stringArrayList15.add("Mực hấp sả sốt mắm chanh");
        chebien15.add("Nguyên liệu\n" +
                "\n" +
                "Mực 6 con (Tươi, nhỏ)\n" +
                "\n" +
                "Sả 1 cây, hành lá 2 nhánh, gừng 1 miếng, lá chanh 3 lá\n" +
                "\n" +
                "Nước mắm 1 muỗng canh\n" +
                "\n" +
                "Nước cốt chanh 3 muỗng canh\n" +
                "\n" +
                "Đường trắng 1 1/2 muỗng canh\n" +
                "\n" +
                "Tiêu 1/4 muỗng cà phê\n" +
                "\n" +
                "Tỏi băm 1 muỗng canh\n" +
                "\n" +
                "Ớt băm 1 muỗng canh\n" +
                "\n" +
                "Ngò rí 1 muỗng canh (Băm)\n" +
                "\n" +
                "Cách làm\n" +
                "\n" +
                "Gừng thái lát mỏng. Hành lá thái khúc, sả đập dập. Lá chanh xé nhỏ, cho hết vào đĩa. Mực làm và rửa sạch để xếp trên đĩa sả. Trong chén trộn đều 1 muỗng canh nước mắm, 3 muỗng nước cốt chanh, 1.5 muỗng canh đường, 1/4 muỗng cà phê tiêu, 2 muỗng canh ớt tỏi băm, 1 muỗng canh ngò rí băm.\n" +
                "\n" +
                "Nấu 1 nồi nước, chờ nước sôi, cho đĩa mực vào hấp 15 phút là mực chín. Tắt bếp, lấy đĩa mực ra, dùng dao cắt từng khoanh mực cho vừa ăn rồi dội nước sốt mắm chanh vừa pha, trộn đều lên có thể ăn.\n" +
                "\n" +
                "Mực hấp sả sốt mắm chanh với thịt mực tươi hấp chín giòn sần sật, trộn cùng nước sốt chua cay, mặn ngọt cực ngon. Có thể làm món mồi nhấm bia, rượu thì ngon hết biết luôn nhé!");
        stringArrayList15.add("Ốc bươu trộn kiểu thái");
        chebien15.add("Nguyên liệu\n" +
                "\n" +
                "Ốc bươu 500 gr (Thịt ốc bươu)\n" +
                "\n" +
                "Sả 5 cây, lá chanh 10 g\n" +
                "\n" +
                "Chanh 1 trái, hành tím 20 gr\n" +
                "\n" +
                "Ớt 2 trái, ớt bột 1 muỗng canh\n" +
                "\n" +
                "Tiêu 1/2 muỗng cà phê\n" +
                "\n" +
                "Nước mắm 3 muỗng canh\n" +
                "\n" +
                "Đường trắng 1 1/2 muỗng canh\n" +
                "\n" +
                "Hành lá 3 gr\n" +
                "\n" +
                "Cách làm ốc bươu trộn kiểu thái\n" +
                "\n" +
                "Sả, hành tím, ớt trái cắt thành lát mỏng, lá chanh cắt sợi, chanh cắt miếng. Sơ chế thịt ốc: rửa sạch dưới vòi nước nhiều lần. Trong một cái xoong. Đập dập sả cây, lá chanh cho nước vào đun sôi, bỏ thịt ốc vào luộc vừa chín tới, không luộc quá chín sẽ làm thịt ốc dai, mùi sả và lá chanh làm thịt ốc thơm hơn.\n" +
                "\n" +
                "Cho đường, nước mắm, tiêu, ớt bột, ớt trái, quấy cho tan đường.\n" +
                "Trong một cái tô lớn, cho ốc, sả, hành tím, lá chanh, vắt chanh, hỗn hợp nước mắm vào.\n" +
                "\n" +
                "Ta da! Trộn đều và thưởng thức thôi nào!");
        stringArrayList15.add("Bề bề rang me");
        chebien15.add("Nguyên Liệu\n" +
                "\n" +
                "+ 1kg Bề bề tươi\n" +
                "\n" +
                "+ 100g Cốt me\n" +
                "\n" +
                "+ Đường, muối, tỏi, ớt, tiêu, tiêu\n" +
                "\n" +
                "Cách nấu\n" +
                "\n" +
                "– Bề bề mua về chúng ta làm sạch, cắt bỏ đầu và ngạnh gai hai bên, có thể hấp trước hoặc để tươi ráo nước.\n" +
                "\n" +
                "– Chúng ta cho bề bề vào chảo dầu, chiên nóng cho đến khi thấy bề bề chín vàng đều thì tắt bếp, cho ra đĩa có để sẵn giấy để thấm dầu.\n" +
                "\n" +
                "– Đối với me, bạn cho vào bát nước nóng, dầm nhỏ thịt me và lọc bỏ hết hạt. Sau đó, cho vào nồi đun nóng, thêm\n" +
                "\n" +
                "2 thìa đường và 1 ít muối.\n" +
                "\n" +
                "– Khi cốt me sôi thì bạn cho bề bề vào đảo cùng, để lửa liu riu. Bạn có thể cho thêm một ít ớt tươi để thêm vị cay cho món ăn. Đun đến khi sốt me sệt dần, cho thêm tỏi đã đập dập vào và đảo đều thêm khoảng 1 phút thì tắt bếp.\n" +
                "\n" +
                "– Việc cuối cùng là cho bề bề ra đĩa và thưởng thức, tốt nhất là dùng ngay khi còn nóng.");


        anh15.add(R.drawable.jf_laumam);
        anh15.add(R.drawable.jf_lauthaichuacaypng);
        anh15.add(R.drawable.jf_laugalagiang);
        anh15.add(R.drawable.jf_duoibo);
        anh15.add(R.drawable.othiem);
        anh15.add(R.drawable.lauhaisan);
        anh15.add(R.drawable.thaclac);
        anh15.add(R.drawable.laubo);
        anh15.add(R.drawable.echmangchua);
        anh15.add(R.drawable.reucua);
        anh15.add(R.drawable.jf_laumam);
        anh15.add(R.drawable.phanthiet);
        anh15.add(R.drawable.namchay);
    }
    public void ncham(){
        stringArrayList16.add("Nước chấm cho món vịt, ngan, lợn quay");
        chebien16.add("Nguyên liệu\n" +
                "1 thìa bột năng.\n" +
                "5 tép tỏi.\n" +
                "5 củ hành tím.\n" +
                "2 thìa tương hột.\n" +
                "1/2 chén dầu ăn.\n" +
                "10 gr nấm mèo cắt sợi.\n" +
                "1 muỗng canh đường.\n" +
                "Nước chấm\n" +
                "\n" +
                "Cách thực hiện\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Cho 2 muỗng canh tương hột vào tô tán nhuyễn, sau đó thêm 100 ml nước, 1 muỗng canh đường, đảo đều để có hỗn hợp tương mịn, nhuyễn.\n" +
                "Nấm mèo cắt sợi ngâm nước ấm cho nở ra trong 15 phút.\n" +
                "Cho 1 muỗng bột năng vào tô thêm 50 ml nước, đảo đều.\n" +
                "Bước 2\n" +
                "\n" +
                "Cho dầu vào chảo đun nóng rồi phi thơm hành tỏi giã nhuyễn. Sau đó, cho hỗn hợp tương vào để sôi 2 - 3 phút.\n" +
                "Chế nước bột năng từ từ và khuấy đều tay, thêm nấm mèo vào, thấy nước hơi sệt sệt thì tắt bếp.\n" +
                "Chỉ với 2 bước đơn giản bạn đã hoàn thành xong cách pha nước chấm, bạn đã có thể thưởng thức cùng các món thịt quay, nướng.");
        stringArrayList16.add("Công thức nước chấm cho món bún đậu mắm tôm");
        chebien16.add("Nguyên liệu\n" +
                "1 thìa đường.\n" +
                "1/2 thìa giấm.\n" +
                "1 quả chanh hoặc quất.\n" +
                "1 thìa mắm tôm.\n" +
                "Dầu ăn.\n" +
                "Ớt thái lát hoặc băm nhỏ.\n" +
                "Rượu.\n" +
                "Cách thực hiện\n" +
                "Đánh bông mắm tôm với đường, rượu, quất hoặc giấm rồi cho thêm ớt đã được thái lát vào. Cho thêm chút đường để tăng vị đậm đà, bạn có thể tăng giảm đường và quất, chanh tùy vào khẩu vị mặn, nhạt của các thành viên trong gia đình.\n" +
                "\n" +
                "Bạn có thể sử dụng dầu rán đậu để cho vào bát mắm tôm, mục đích để mắm chín và tăng hương vị cho bát mắm tôm. Hoặc có cách khác đó là cho bát mắm tôm, thêm chút dầu hấp cách thủy trên bếp từ, nồi cơm điện sao cho phù hợp.");
        stringArrayList16.add("Nước chấm chua ngọt cho món thịt luộc");
        chebien16.add("Nguyên liệu\n" +
                "2 muỗng nước cốt chanh.\n" +
                "2 muỗng đường.\n" +
                "2 muỗng nước mắm.\n" +
                "4 muỗng nước lọc.\n" +
                "Tỏi, ớt băm nhuyễn.\n" +
                "\nCách thực hiện\n" +
                "Cho 2 muỗng đường vào 4 muỗng nước lọc rồi khuấy cho tới khi tan đường. Thêm mắm và nước cốt chanh (đã bỏ hạt) vào bát nước đường.\n" +
                "Tiếp theo cho tỏi ớt băm thật nhỏ vào bát mắm. Làm theo cách này tỏi ớt sẽ nổi lên phía trên, trông rất hấp dẫn.");
        stringArrayList16.add("Cách làm nước mắm chay");
        chebien16.add("Trang chủ hỗ trợ \n" +
                "Ẩm thực\n" +
                "Thực đơn hàng ngày\n" +
                "10 công thức pha nước chấm ngon chuẩn vị nhà hàng cho từng món ăn\n" +
                " 95.194 lượt xem\n" +
                "\n" +
                " \n" +
                "Ẩm thực là nguồn cảm hứng và yêu thích bất tận có lẽ không phải riêng ai. Mỗi món ăn đều được ghi dấu bởi hương vị đặc trưng của nó, điều làm nên sự khác biệt của một món ăn đó là nước chấm. Bạn có muốn pha được bát nước chấm ngon chuẩn vị nhà hàng không? Nếu có hãy tiếp tục theo dõi bài viết dưới đây nhé!\n" +
                "\n" +
                "công thức nước chấm ngon\n" +
                "\n" +
                "Công thức pha chế nước chấm ngon\n" +
                "\n" +
                "Dưới đây là 10 công thức nước chấm những món ăn hấp dẫn, cùng thực hiện cho gia đình nhé! Chế biến siêu đơn giản mà đã có món ăn chuẩn vị nhà hàng để chiêu đãi cả nhà.\n" +
                "\n" +
                "Máy xay tiêu, tỏi, cà phê, hạt khô\t\n" +
                "Máy xay tiêu, tỏi, cà phê, hạt khô - Trợ thủ đắc lực của người nội trợ\n" +
                "\n" +
                "Máy xay đa năng Kahchan CG9100 thiết kế nhỏ gọn, cối xay nhỏ, có thể xay xay các loại hạt như cà phê hạt, hạt ngũ cốc, hạt tiêu, lạc, gạo, dược liệu, các loại gia vị như tỏi, ớt giúp việc nội trợ trở nên đơn giản, nhanh chóng.\n" +
                "\n" +
                "Xem chi tiết\n" +
                "\n" +
                "1. Nước chấm cho món vịt, ngan, lợn quay\n" +
                "Nguyên liệu\n" +
                "1 thìa bột năng.\n" +
                "5 tép tỏi.\n" +
                "5 củ hành tím.\n" +
                "2 thìa tương hột.\n" +
                "1/2 chén dầu ăn.\n" +
                "10 gr nấm mèo cắt sợi.\n" +
                "1 muỗng canh đường.\n" +
                "Nước chấm\n" +
                "\n" +
                "Cách thực hiện\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Cho 2 muỗng canh tương hột vào tô tán nhuyễn, sau đó thêm 100 ml nước, 1 muỗng canh đường, đảo đều để có hỗn hợp tương mịn, nhuyễn.\n" +
                "Nấm mèo cắt sợi ngâm nước ấm cho nở ra trong 15 phút.\n" +
                "\n" +
                " \n" +
                "Cho 1 muỗng bột năng vào tô thêm 50 ml nước, đảo đều.\n" +
                "Bước 2\n" +
                "\n" +
                "Cho dầu vào chảo đun nóng rồi phi thơm hành tỏi giã nhuyễn. Sau đó, cho hỗn hợp tương vào để sôi 2 - 3 phút.\n" +
                "Chế nước bột năng từ từ và khuấy đều tay, thêm nấm mèo vào, thấy nước hơi sệt sệt thì tắt bếp.\n" +
                "Chỉ với 2 bước đơn giản bạn đã hoàn thành xong cách pha nước chấm, bạn đã có thể thưởng thức cùng các món thịt quay, nướng.\n" +
                "Xem thêm: Cách làm thịt heo quay bằng nồi chiên không dầu\n" +
                "\n" +
                "Nước chấm\n" +
                "\n" +
                "Nước chấm thịt quay ngon tại nhà \n" +
                "\n" +
                "2. Công thức nước chấm cho món bún đậu mắm tôm\n" +
                "Nguyên liệu\n" +
                "1 thìa đường.\n" +
                "1/2 thìa giấm.\n" +
                "1 quả chanh hoặc quất.\n" +
                "1 thìa mắm tôm.\n" +
                "Dầu ăn.\n" +
                "Ớt thái lát hoặc băm nhỏ.\n" +
                "Rượu.\n" +
                "Cách thực hiện\n" +
                "Đánh bông mắm tôm với đường, rượu, quất hoặc giấm rồi cho thêm ớt đã được thái lát vào. Cho thêm chút đường để tăng vị đậm đà, bạn có thể tăng giảm đường và quất, chanh tùy vào khẩu vị mặn, nhạt của các thành viên trong gia đình.\n" +
                "\n" +
                "Bạn có thể sử dụng dầu rán đậu để cho vào bát mắm tôm, mục đích để mắm chín và tăng hương vị cho bát mắm tôm. Hoặc có cách khác đó là cho bát mắm tôm, thêm chút dầu hấp cách thủy trên bếp từ, nồi cơm điện sao cho phù hợp.\n" +
                "\n" +
                "Nước chấm mắm tôm\n" +
                "\n" +
                "Nước chấm cho món bún đậu mắm tôm\n" +
                "\n" +
                "3. Nước chấm chua ngọt cho món thịt luộc\n" +
                "Nguyên liệu\n" +
                "2 muỗng nước cốt chanh.\n" +
                "2 muỗng đường.\n" +
                "2 muỗng nước mắm.\n" +
                "4 muỗng nước lọc.\n" +
                "Tỏi, ớt băm nhuyễn.\n" +
                "\n" +
                "Lọ xay tiêu Elmich EL7156\n" +
                "199.000đ\n" +
                "\n" +
                "Lọ xay tiêu Elmich EL7155\n" +
                "199.000đ\n" +
                "\n" +
                "Máy xay cà phê gia đình Kahchan CG9100\n" +
                "939.000đ\n" +
                "\n" +
                "Máy xay thịt Philips HR1393\n" +
                "749.000đ\n" +
                "\n" +
                "Máy xay thịt đa năng Chopper Midimori MDMR-800 (800W) - 3 lít\n" +
                "990.000đ\n" +
                "Cách thực hiện\n" +
                "Cho 2 muỗng đường vào 4 muỗng nước lọc rồi khuấy cho tới khi tan đường. Thêm mắm và nước cốt chanh (đã bỏ hạt) vào bát nước đường.\n" +
                "Tiếp theo cho tỏi ớt băm thật nhỏ vào bát mắm. Làm theo cách này tỏi ớt sẽ nổi lên phía trên, trông rất hấp dẫn.\n" +
                "\n" +
                " \n" +
                "Bạn có thể tùy chỉnh độ mặn nhạt bằng cách cho thêm nước lọc và đường, chanh.\n" +
                "Nước chấm\n" +
                "\n" +
                "4. Cách làm nước mắm chay\n" +
                "Nguyên liệu\n" +
                "1 trái dứa, đường, xì dầu, muối, nước.\n" +
                "Cách thực hiện\n" +
                "Dứa gọt vỏ bỏ mắt, băm nhuyễn.\n" +
                "Cho dứa vào chảo xào khoảng 3 phút, rồi cho thêm 1 lít nước, thêm 60 gr muối, 120 gr đường, 20 ml xì dầu, đun sôi khoảng 1 tiếng mở lửa riu riu.\n" +
                "Vớt bọt và lọc qua rây lọc, sau đó nấu sôi 1 lần nữa rồi tắt bếp để nguội.\n" +
                "Bạn có thể bảo quản trong chai, lọ để nơi khô thoáng hoặc cất trong tủ lạnh, khi ăn rót ra chén, thêm vài lát ớt nếu bạn ăn cay nhé.");
        stringArrayList16.add("Nước mắm chấm nem (chả giò)");
        chebien16.add("Nguyên liệu\n" +
                "1 quả chanh.\n" +
                "2 muỗng nước mắm.\n" +
                "1,5 muỗng dấm.\n" +
                "4 muỗng nước\n" +
                "2,5 muỗng đường\n" +
                "tỏi, ớt băm nhuyễn\n" +
                "lá mùi tàu thái sợi.\n" +
                "Cách thực hiện\n" +
                "Dấm, đường, nước lạnh cho vào bát hòa tan cùng với đường.\n" +
                "Cắt 1/2 trái chanh, lộn phần ruột chanh bên trong ra, dùng nĩa cạo những tép chanh nhỏ cho vào bát.\n" +
                "Thêm tỏi, ớt băm vào nhẹ nhàng hòa đều là được. Bạn có thể thưởng thức món nem, cuốn cùng rau sống thì sẽ tuyệt vời hơn nhé!");
        stringArrayList16.add("Nước chấm ốc");
        chebien16.add("Nguyên liệu cần chuẩn bị\n" +
                "2 thìa nước mắm ngon\n" +
                "1 thìa nước ấm\n" +
                "1 thìa nước cốt chanh\n" +
                "3 thìa đường\n" +
                "Gừng, ớt, xả, rau mùi bằm nhỏ\n" +
                "Quất (tắc) tươi, lá chanh\n" +
                "Dụng cụ: Dao, thớt, muỗng,...\n" +
                "Cách thực hiện\n" +
                "Bước 1: Bạn có thể cho mắm vào một bát nước, sau đó bắc lên bếp nấu cho tan đường.\n" +
                "Bước 2: Cho gừng, tỏi, ớt băm nhuyễn, nước cốt chanh vào trộn đều.\n" +
                "Bước 3: Tiếp đó rắc rau mùi, xả thái nhỏ lên trên và trộn đều. Cho thêm vài lát ớt tươi và thêm lá chanh thái nhỏ.\n" +
                "Bước 4: Để nguyên cả quả, cắt lát vào bát nước chấm để tăng thêm hương vị cho bát nước chấm.");
        stringArrayList16.add("Nước chấm tôm luộc, hấp");
        chebien16.add("Nguyên liệu\n" +
                "Gừng: 1 củ.\n" +
                "Hành lá: 100 gr.\n" +
                "Dầu ăn: 1 muỗng canh.\n" +
                "Nước tương: 5 muỗng canh.\n" +
                "Dấm ăn: 1 muỗng canh.\n" +
                "Đường: 15g.\n" +
                "Cách thực hiện\n" +
                "Bước 1\n" +
                "\n" +
                "Cạo sạch gừng bằng dao hoặc lấy thìa inox cạo sạch vỏ. Cắt nhỏ, cắt miếng, rồi băm nhuyễn.\n" +
                "Hành lá rửa sạch và thái thành từng khúc khoảng 1,5 - 2cm giúp tăng hương vị cho nước chấm.\n" +
                "Bạn không nên cắt quá nhỏ vì khi nấu sẽ dễ bị cháy.\n" +
                "Bước 2\n" +
                "\n" +
                "Lần lượt cho dầu ăn, nước tương vào chảo đun sôi.\n" +
                "Cho gừng vào đảo sơ 2 - 3 phút.\n" +
                "Hành lá vào sau cùng, nêm nếm thêm đường cho vừa miệng");
        stringArrayList16.add("Muối ớt xanh chấm hải sản");
        chebien16.add("Nguyên liệu\n" +
                "Ớt xiêm xanh: 100g\n" +
                "Chanh không hạt: 2 trái.\n" +
                "Sữa đặc: 60g.\n" +
                "Đường trắng: 50g.\n" +
                "Muối: 15g\n" +
                "Lá chanh: 10 lá non.\n" +
                "Cách thực hiện\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Ớt xiêm bỏ hạt và cuống.\n" +
                "Lá chanh rửa sạch, cắt nhỏ.\n" +
                "Chanh gọt vỏ, tách múi bỏ hạt.\n" +
                "Bước 2\n" +
                "\n" +
                "Cho các nguyên liệu ớt, lá chanh, muối, đường vào máy xay đa năng hoặc máy xay sinh tố để làm nhuyễn tất cả các nguyên liệu\n" +
                "\n" +
                "Bước 3\n" +
                "\n" +
                "Sau đó cho sữa đặc và múi chanh đã tách vào. Xay đến khi các nguyên liệu hòa quyện và dần trở nên mịn hơn. Bạn đã hoàn thành xong món muối ớt xanh chấm hải sản tuyệt ngon rồi nhé!\n" +
                "\n" +
                "Bạn có thể làm với lượng nhiều rồi cho vào hộp đựng thực phẩm, đóng chặt nắp và bảo quản trong tủ lạnh để ăn dần rất tiện dụng.");
        stringArrayList16.add("Nước chấm cho món bánh xèo");
        chebien16.add("Nguyên liệu\n" +
                "1 nhánh tỏi.\n" +
                "2 trái ớt.\n" +
                "5 muỗng canh đường.\n" +
                "1 trái chanh.\n" +
                "1/2 chén nước mắm.\n" +
                "1 bát nước sôi để nguội.\n" +
                "Cách thực hiện\n" +
                "Ớt bỏ hạt, cắt tròn rồi băm nhuyễn. Tỏi bóc vỏ, đập nhuyễn. Chanh vắt lấy nước, bỏ hạt để không bị đắng.\n" +
                "Pha nước chấm theo tỉ lệ: 2 muỗng nước sôi, 2 muỗng đường, 1 muỗng nước mắm, 1 muỗng chanh. Sau đó khuấy đều. Cho thêm ớt, tỏi băm vào bát khuấy đều.");
        stringArrayList16.add("Nước chấm cho món bánh cuốn");
        chebien16.add("Trang chủ hỗ trợ \n" +
                "Ẩm thực\n" +
                "Thực đơn hàng ngày\n" +
                "10 công thức pha nước chấm ngon chuẩn vị nhà hàng cho từng món ăn\n" +
                " 95.194 lượt xem\n" +
                "\n" +
                " \n" +
                "Ẩm thực là nguồn cảm hứng và yêu thích bất tận có lẽ không phải riêng ai. Mỗi món ăn đều được ghi dấu bởi hương vị đặc trưng của nó, điều làm nên sự khác biệt của một món ăn đó là nước chấm. Bạn có muốn pha được bát nước chấm ngon chuẩn vị nhà hàng không? Nếu có hãy tiếp tục theo dõi bài viết dưới đây nhé!\n" +
                "\n" +
                "công thức nước chấm ngon\n" +
                "\n" +
                "Công thức pha chế nước chấm ngon\n" +
                "\n" +
                "Dưới đây là 10 công thức nước chấm những món ăn hấp dẫn, cùng thực hiện cho gia đình nhé! Chế biến siêu đơn giản mà đã có món ăn chuẩn vị nhà hàng để chiêu đãi cả nhà.\n" +
                "\n" +
                "Máy xay tiêu, tỏi, cà phê, hạt khô\t\n" +
                "Máy xay tiêu, tỏi, cà phê, hạt khô - Trợ thủ đắc lực của người nội trợ\n" +
                "\n" +
                "Máy xay đa năng Kahchan CG9100 thiết kế nhỏ gọn, cối xay nhỏ, có thể xay xay các loại hạt như cà phê hạt, hạt ngũ cốc, hạt tiêu, lạc, gạo, dược liệu, các loại gia vị như tỏi, ớt giúp việc nội trợ trở nên đơn giản, nhanh chóng.\n" +
                "\n" +
                "Xem chi tiết\n" +
                "\n" +
                "1. Nước chấm cho món vịt, ngan, lợn quay\n" +
                "Nguyên liệu\n" +
                "1 thìa bột năng.\n" +
                "5 tép tỏi.\n" +
                "5 củ hành tím.\n" +
                "2 thìa tương hột.\n" +
                "1/2 chén dầu ăn.\n" +
                "10 gr nấm mèo cắt sợi.\n" +
                "1 muỗng canh đường.\n" +
                "Nước chấm\n" +
                "\n" +
                "Cách thực hiện\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Cho 2 muỗng canh tương hột vào tô tán nhuyễn, sau đó thêm 100 ml nước, 1 muỗng canh đường, đảo đều để có hỗn hợp tương mịn, nhuyễn.\n" +
                "Nấm mèo cắt sợi ngâm nước ấm cho nở ra trong 15 phút.\n" +
                "\n" +
                " \n" +
                "Cho 1 muỗng bột năng vào tô thêm 50 ml nước, đảo đều.\n" +
                "Bước 2\n" +
                "\n" +
                "Cho dầu vào chảo đun nóng rồi phi thơm hành tỏi giã nhuyễn. Sau đó, cho hỗn hợp tương vào để sôi 2 - 3 phút.\n" +
                "Chế nước bột năng từ từ và khuấy đều tay, thêm nấm mèo vào, thấy nước hơi sệt sệt thì tắt bếp.\n" +
                "Chỉ với 2 bước đơn giản bạn đã hoàn thành xong cách pha nước chấm, bạn đã có thể thưởng thức cùng các món thịt quay, nướng.\n" +
                "Xem thêm: Cách làm thịt heo quay bằng nồi chiên không dầu\n" +
                "\n" +
                "Nước chấm\n" +
                "\n" +
                "Nước chấm thịt quay ngon tại nhà \n" +
                "\n" +
                "2. Công thức nước chấm cho món bún đậu mắm tôm\n" +
                "Nguyên liệu\n" +
                "1 thìa đường.\n" +
                "1/2 thìa giấm.\n" +
                "1 quả chanh hoặc quất.\n" +
                "1 thìa mắm tôm.\n" +
                "Dầu ăn.\n" +
                "Ớt thái lát hoặc băm nhỏ.\n" +
                "Rượu.\n" +
                "Cách thực hiện\n" +
                "Đánh bông mắm tôm với đường, rượu, quất hoặc giấm rồi cho thêm ớt đã được thái lát vào. Cho thêm chút đường để tăng vị đậm đà, bạn có thể tăng giảm đường và quất, chanh tùy vào khẩu vị mặn, nhạt của các thành viên trong gia đình.\n" +
                "\n" +
                "Bạn có thể sử dụng dầu rán đậu để cho vào bát mắm tôm, mục đích để mắm chín và tăng hương vị cho bát mắm tôm. Hoặc có cách khác đó là cho bát mắm tôm, thêm chút dầu hấp cách thủy trên bếp từ, nồi cơm điện sao cho phù hợp.\n" +
                "\n" +
                "Nước chấm mắm tôm\n" +
                "\n" +
                "Nước chấm cho món bún đậu mắm tôm\n" +
                "\n" +
                "3. Nước chấm chua ngọt cho món thịt luộc\n" +
                "Nguyên liệu\n" +
                "2 muỗng nước cốt chanh.\n" +
                "2 muỗng đường.\n" +
                "2 muỗng nước mắm.\n" +
                "4 muỗng nước lọc.\n" +
                "Tỏi, ớt băm nhuyễn.\n" +
                "\n" +
                "Lọ xay tiêu Elmich EL7156\n" +
                "199.000đ\n" +
                "\n" +
                "Lọ xay tiêu Elmich EL7155\n" +
                "199.000đ\n" +
                "\n" +
                "Máy xay cà phê gia đình Kahchan CG9100\n" +
                "939.000đ\n" +
                "\n" +
                "Máy xay thịt Philips HR1393\n" +
                "749.000đ\n" +
                "\n" +
                "Máy xay thịt đa năng Chopper Midimori MDMR-800 (800W) - 3 lít\n" +
                "990.000đ\n" +
                "Cách thực hiện\n" +
                "Cho 2 muỗng đường vào 4 muỗng nước lọc rồi khuấy cho tới khi tan đường. Thêm mắm và nước cốt chanh (đã bỏ hạt) vào bát nước đường.\n" +
                "Tiếp theo cho tỏi ớt băm thật nhỏ vào bát mắm. Làm theo cách này tỏi ớt sẽ nổi lên phía trên, trông rất hấp dẫn.\n" +
                "\n" +
                " \n" +
                "Bạn có thể tùy chỉnh độ mặn nhạt bằng cách cho thêm nước lọc và đường, chanh.\n" +
                "Nước chấm\n" +
                "\n" +
                "4. Cách làm nước mắm chay\n" +
                "Nguyên liệu\n" +
                "1 trái dứa, đường, xì dầu, muối, nước.\n" +
                "Cách thực hiện\n" +
                "Dứa gọt vỏ bỏ mắt, băm nhuyễn.\n" +
                "Cho dứa vào chảo xào khoảng 3 phút, rồi cho thêm 1 lít nước, thêm 60 gr muối, 120 gr đường, 20 ml xì dầu, đun sôi khoảng 1 tiếng mở lửa riu riu.\n" +
                "Vớt bọt và lọc qua rây lọc, sau đó nấu sôi 1 lần nữa rồi tắt bếp để nguội.\n" +
                "Bạn có thể bảo quản trong chai, lọ để nơi khô thoáng hoặc cất trong tủ lạnh, khi ăn rót ra chén, thêm vài lát ớt nếu bạn ăn cay nhé.\n" +
                "Nước chấm\n" +
                "\n" +
                "5. Nước mắm chấm nem (chả giò)\n" +
                "Nguyên liệu\n" +
                "1 quả chanh.\n" +
                "2 muỗng nước mắm.\n" +
                "1,5 muỗng dấm.\n" +
                "4 muỗng nước\n" +
                "2,5 muỗng đường\n" +
                "tỏi, ớt băm nhuyễn\n" +
                "lá mùi tàu thái sợi.\n" +
                "Cách thực hiện\n" +
                "Dấm, đường, nước lạnh cho vào bát hòa tan cùng với đường.\n" +
                "Cắt 1/2 trái chanh, lộn phần ruột chanh bên trong ra, dùng nĩa cạo những tép chanh nhỏ cho vào bát.\n" +
                "Thêm tỏi, ớt băm vào nhẹ nhàng hòa đều là được. Bạn có thể thưởng thức món nem, cuốn cùng rau sống thì sẽ tuyệt vời hơn nhé!\n" +
                "Xem thêm: 6 tuyệt chiêu cho món nem rán vàng ươm, giòn rụm không thể cưỡng nổi\n" +
                "\n" +
                "Nước chấm\n" +
                "\n" +
                "Nước chấm món nem, giò chả\n" +
                "\n" +
                "6. Nước chấm ốc\n" +
                "Nguyên liệu cần chuẩn bị\n" +
                "2 thìa nước mắm ngon\n" +
                "1 thìa nước ấm\n" +
                "1 thìa nước cốt chanh\n" +
                "3 thìa đường\n" +
                "Gừng, ớt, xả, rau mùi bằm nhỏ\n" +
                "Quất (tắc) tươi, lá chanh\n" +
                "Dụng cụ: Dao, thớt, muỗng,...\n" +
                "Cách thực hiện\n" +
                "Bước 1: Bạn có thể cho mắm vào một bát nước, sau đó bắc lên bếp nấu cho tan đường.\n" +
                "Bước 2: Cho gừng, tỏi, ớt băm nhuyễn, nước cốt chanh vào trộn đều.\n" +
                "Bước 3: Tiếp đó rắc rau mùi, xả thái nhỏ lên trên và trộn đều. Cho thêm vài lát ớt tươi và thêm lá chanh thái nhỏ.\n" +
                "Bước 4: Để nguyên cả quả, cắt lát vào bát nước chấm để tăng thêm hương vị cho bát nước chấm.\n" +
                "Nước chấm ốc\n" +
                "\n" +
                "Nước chấm ốc nóng ngon\n" +
                "\n" +
                "7. Nước chấm tôm luộc, hấp\n" +
                "Nguyên liệu\n" +
                "Gừng: 1 củ.\n" +
                "Hành lá: 100 gr.\n" +
                "Dầu ăn: 1 muỗng canh.\n" +
                "Nước tương: 5 muỗng canh.\n" +
                "Dấm ăn: 1 muỗng canh.\n" +
                "Đường: 15g.\n" +
                "Cách thực hiện\n" +
                "Bước 1\n" +
                "\n" +
                "Cạo sạch gừng bằng dao hoặc lấy thìa inox cạo sạch vỏ. Cắt nhỏ, cắt miếng, rồi băm nhuyễn.\n" +
                "Hành lá rửa sạch và thái thành từng khúc khoảng 1,5 - 2cm giúp tăng hương vị cho nước chấm.\n" +
                "Bạn không nên cắt quá nhỏ vì khi nấu sẽ dễ bị cháy.\n" +
                "Bước 2\n" +
                "\n" +
                "Lần lượt cho dầu ăn, nước tương vào chảo đun sôi.\n" +
                "Cho gừng vào đảo sơ 2 - 3 phút.\n" +
                "Hành lá vào sau cùng, nêm nếm thêm đường cho vừa miệng\n" +
                "Nước chấm\n" +
                "\n" +
                "Nước chấm các loại hải sản\n" +
                "\n" +
                "8. Muối ớt xanh chấm hải sản\n" +
                "Nguyên liệu\n" +
                "Ớt xiêm xanh: 100g\n" +
                "Chanh không hạt: 2 trái.\n" +
                "Sữa đặc: 60g.\n" +
                "Đường trắng: 50g.\n" +
                "Muối: 15g\n" +
                "Lá chanh: 10 lá non.\n" +
                "Cách thực hiện\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "\n" +
                "Ớt xiêm bỏ hạt và cuống.\n" +
                "Lá chanh rửa sạch, cắt nhỏ.\n" +
                "Chanh gọt vỏ, tách múi bỏ hạt.\n" +
                "Bước 2\n" +
                "\n" +
                "Cho các nguyên liệu ớt, lá chanh, muối, đường vào máy xay đa năng hoặc máy xay sinh tố để làm nhuyễn tất cả các nguyên liệu\n" +
                "\n" +
                "Bước 3\n" +
                "\n" +
                "Sau đó cho sữa đặc và múi chanh đã tách vào. Xay đến khi các nguyên liệu hòa quyện và dần trở nên mịn hơn. Bạn đã hoàn thành xong món muối ớt xanh chấm hải sản tuyệt ngon rồi nhé!\n" +
                "\n" +
                "Bạn có thể làm với lượng nhiều rồi cho vào hộp đựng thực phẩm, đóng chặt nắp và bảo quản trong tủ lạnh để ăn dần rất tiện dụng.\n" +
                "\n" +
                "Muối ớt xanh\n" +
                "\n" +
                "Muối ớt xanh chấm hải sản\n" +
                "\n" +
                "9. Nước chấm cho món bánh xèo\n" +
                "Nguyên liệu\n" +
                "1 nhánh tỏi.\n" +
                "2 trái ớt.\n" +
                "5 muỗng canh đường.\n" +
                "1 trái chanh.\n" +
                "1/2 chén nước mắm.\n" +
                "1 bát nước sôi để nguội.\n" +
                "Cách thực hiện\n" +
                "Ớt bỏ hạt, cắt tròn rồi băm nhuyễn. Tỏi bóc vỏ, đập nhuyễn. Chanh vắt lấy nước, bỏ hạt để không bị đắng.\n" +
                "Pha nước chấm theo tỉ lệ: 2 muỗng nước sôi, 2 muỗng đường, 1 muỗng nước mắm, 1 muỗng chanh. Sau đó khuấy đều. Cho thêm ớt, tỏi băm vào bát khuấy đều.\n" +
                "Tham khảo: Cách làm bánh xèo bằng chảo chống dính cực dễ\n" +
                "\n" +
                "Nước chấm\n" +
                "\n" +
                "Nước chấm bánh xèo\n" +
                "\n" +
                "10. Nước chấm cho món bánh cuốn\n" +
                "Nguyên liệu\n" +
                "4 thìa nước mắm.\n" +
                "1 thìa giấm ăn.\n" +
                "2 thìa đường.\n" +
                "3 thìa nước sôi để nguội.\n" +
                "1 quả chanh (bạn có thể thay thế bằng quất nếu bạn thích ăn quất).\n" +
                "2 quả ớt.\n" +
                "3 tép tỏi.\n" +
                "Dụng cụ: Dao, thớt, thìa,...\n" +
                "Cách thực hiện\n" +
                "Bước 1: Ớt được rửa sạch, bỏ cuống, sau đó bổ đôi và loại bỏ hạt bên trong. Tiếp theo bạn thái ớt thành những lát mỏng và băm nhuyễn ớt.\n" +
                "\n" +
                "Bước 2: Tỏi bóc vỏ, sau đó đập và băm nhuyễn. Cách pha nước chấm bánh cuốn ngon hấp dẫn chính là tỏi được băm nhuyễn khi thả vào nước mắm sẽ nổi lên trên.\n" +
                " \n" +
                "Bước 3: Chanh tươi được bổ đôi sau đó vắt lấy nước và loại bỏ hạt ra ngoài.\n" +
                " \n" +
                "Bước 4: Thực hiện pha nước chấm bánh cuốn. Cho 4 thìa nước mắm, 1 thìa giấm ăn, 3 thìa nước sôi, 2 thìa nước cốt chanh, 2 thìa đường vào quấy đều. Đảm bảo đường được tan trong hỗn hợp nước mắm. Tiếp theo bạn cho ớt, tỏi băm nhuyễn vào.");


        anh16.add(R.drawable.sachanh);
        anh16.add(R.drawable.hapgung);
        anh16.add(R.drawable.caibexanh);
        anh16.add(R.drawable.tuongbot);
        anh16.add(R.drawable.giavi);
        anh16.add(R.drawable.muoixa);
        anh16.add(R.drawable.luot);
        anh16.add(R.drawable.trungcuontom);
        anh16.add(R.drawable.tomhapnam);
        anh16.add(R.drawable.ducthitbobam);
    }
    public void trmieng(){
        stringArrayList17.add("Bánh phô mai sầu riêng");
        chebien17.add("Nguyên liệu\n" +
                "200g cream cheese (kem phô mai);\n" +
                "20g đường bột hoặc đường kính hạt rất nhỏ mịn;\n" +
                "30g sữa đặc;\n" +
                "5g bột ngô;\n" +
                "130g thịt sầu riêng;\n" +
                "1 trứng gà + 2 lòng đỏ;\n" +
                "115ml whipping cream/ kem tươi với hàm lượng béo từ 30% trở lên.\n" +
                "Cách làm\n" +
                "Vặn lò nhiệt trên 240 độ, nhiệt dưới 220 độ. Chuẩn bị khuôn tròn đường kính 16cm. Lót giấy nến vào lòng khuôn sao cho mép giấy hơi chườm lên so với thành khuôn, để sau khi bánh chín mình có thể cầm giấy và nhấc lên dễ dàng.\n" +
                "Dùng phới dẹt hoặc phới lồng đánh cho cream cheese mềm nhuyễn. Cho đường, sữa đặc và bột ngô và sầu riêng vào đánh tan và hòa quyện (không nên trộn quá kĩ).\n" +
                "Trứng đánh tan. Cho từng ít trứng một vào hỗn hợp cream cheese, đánh đều sau mỗi lần thêm trứng.\n" +
                "Cuối cùng cho kem tươi vào trộn đều cho mịn mượt. Đổ bột vào khuôn đã lót giấy.\n" +
                "Nướng bánh trong vòng 28-30 phút. Bánh chín ngon nhất là khi phần bánh còn hơi rung rinh và khi thử cắm que tăm vào giữa bánh, rút lên thấy có ít vụn bánh bám vào que.\n" +
                "Để nguội rồi cho bánh vào tủ lạnh để khoảng 60-90 phút để cho ổn định. Lấy bánh ra khỏi khuôn. Dùng dao sắc, nhúng qua nước nóng, lau khô để cắt bánh. Nên chuẩn bị sẵn khăn ẩm hoặc giấy ăn để lau dao sau 1-2 lần cắt, bánh sẽ không bị lem nhem.");
        stringArrayList17.add("Bánh cuộn kem dâu");
        chebien17.add("Nguyên liệu\n" +
                "4 quả trứng gà, tách riêng lòng trắng và lòng đỏ;\n" +
                "25gr bột mì;\n" +
                "25gr bột bắp;\n" +
                "12gr bột dâu tây;\n" +
                "65gr đường cát;\n" +
                "nước cốt chanh, muối;\n" +
                "40ml sữa tươi không đường;\n" +
                "40gr dầu ăn;\n" +
                "Phần kem cuộn: 250ml kem tươi, 60gr đường.\n" +
                "Cách làm\n" +
                "Bật lò nướng 170 độ C, quét 1 lớp dầu ăn lên khuôn sau đó lót giấy nến và ấn 4 góc khuôn cho vuông vắn.\n" +
                "Đánh lòng đỏ trứng cho 1 xíu đường, dầu ăn khuấy đều tiếp đến cho sữa tươi vào khuấy đều rồi cho phần bột đã rây mịn vào trộn đều cho đến khi không còn thấy bột là được, để sang 1 bên.\n" +
                "Lấy 1/3 hỗn hợp lòng trắng cho vào tô lòng đỏ và trộn đều sau đó đổ ngược tô lòng đỏ sang tô lòng trắng rồi trộn đều bằng phới dẹt, 2 hỗn hợp hòa quyện vào nhau thì dừng lại.\n" +
                "Trút tất cả hỗn hợp bột còn lại vào khuôn dàn đều 4 góc cho phẳng mặt, cho khuôn bánh vào lò nướng 25 phút là bánh chín, lấy khuôn bánh ra để cho nguội.\n" +
                "Kem tươi, đường cho vào tô đánh đến khi kem bông lên là được, trét đều kem tươi lên bánh sau đó nhẹ nhàng cuộn bánh lại thành hình trụ tròn, vừa cuộn vừa kéo giấy nến ra sau đó bọc lại để bánh vào ngăn mát tủ lạnh 30 phút cho bánh định hình.");
        stringArrayList17.add("Chè sắn");
        chebien17.add("Nguyên liệu\n" +
                "2 củ sắn khoảng;\n" +
                "1 nhánh gừng nhỏ;\n" +
                "Muối, đường;\n" +
                "1 thìa canh bột sắn dây hoặc bột năng;\n" +
                "Dừa thái sợi, nước cốt dừa.\n" +
                "Cách làm\n" +
                "Củ sắn gọt bỏ vỏ, thái khúc, ngâm vào âu nước muối pha loãng khoảng từ 6 – 7 tiếng trước khi nấu.\n" +
                "Cho sắn vào nồi, đổ nước ngập, luộc sắn chín. Sắn sau khi chín, lấy ra thái hạt lựu. Cho đường vào nồi, thêm một ít gừng thái sợi, đun sôi và khuấy đều để đường tan hoàn toàn.\n" +
                "Nước sôi thì cho sắn vào đun cùng, hạ lửa nhỏ để vị ngọt của đường thấm sâu vào sắn, nêm nếm lại tùy theo khẩu vị của bạn.\n" +
                "Hòa lẫn bột sắn dây với một ít nước lọc để bột sắn dây tan, rồi rưới từ từ bát sắn dây vào nồi chè, vừa rưới vừa khuấy nhẹ tay cho bột sắn hòa với chè cho đến khi sắn sánh đặc lại và sôi nhẹ thì tắt bếp.\n" +
                "Múc sắn ra bát, rắc dừa sợi lên trên, dùng nóng. Nếu muốn vị béo hơn bạn có thể thêm chút nước cốt dừa sẽ rất ngon.");
        stringArrayList17.add("Chè dừa dầm");
        chebien17.add("Nguyên liệu\n" +
                "1 trái dừa non;\n" +
                "3 g thạch rau câu giòn;\n" +
                "2 g bột rau câu dẻo;\n" +
                "550 ml nước dừa tươi;\n" +
                "70 g đường.\n" +
                "Phần nước cốt dừa: 400 ml nước cốt dừa; 80 gr đường; 2 muỗng canh sữa đặc; 1/5 muỗng cà phê muối; 1 tô đá lạnh đập nhỏ; 10 g tinh bột bắp hòa chung; 70 ml nước lạnh.\n" +
                "\n" +
                "Cách làm\n" +
                "Nước dừa tươi + đường + 2 loại bột rau câu cho vào nồi hòa tan, sau đó bắc lên bếp nấu lửa hơi thấp. Vừa nấu vừa khuấy cho đến khi thạch sôi, hớt bột cho thạch trong trước khi tắt bếp. Đổ thạch ra khay, để nguội/lạnh trong ngăn mát tủ lạnh trước khi thái sợi hay thái hạt lựu nhỏ.\n" +
                "Cho hết phần nước cốt dừa vào nồi (trừ sữa đặc) bắc lên bếp nấu lửa nhỏ. Khi nước cốt dừa vừa sôi lăn tăn thì cho chén nước bột bắp vào khuấy tạo độ hơi sánh. Tắt bếp cho sữa đặc vào khuấy đều, để nguội.\n" +
                "Dừa non và thạch giòn dai cho vào ly. Tiếp đến là đá lạnh. Cuối cùng chan nước cốt dừa béo vào là hoàn tất.");
        stringArrayList17.add("Thạch dưa hấu");
        chebien17.add("Nguyên liệu\n" +
                "1 quả dưa hấu;\n" +
                "1 gói bột rau câu;\n" +
                "Đường, nước lọc.\n" +
                "Cách làm\n" +
                "Dưa hấu rửa sạch, dùng dao sắc bổ làm đôi theo chiều dọc. Lấy thìa nạo sạch phần ruột dưa hấu để ra một cái bát.\n" +
                "Phần ruột dưa hấu nhặt bỏ hạt, cho dưa hấu vào ép lấy nước hoặc cho vào máy xay sinh tố xay nhuyễn. Sau đó lọc lấy phần nước dưa hấu qua một rây lưới có mắt nhỏ.\n" +
                "Pha bột rau câu với lượng đường vừa đủ. Đun sôi khoảng 150 ml nước, sau đó cho bột rau câu vào khuấy cho tan hết, nấu khoảng 5 phút. Cuối cùng đổ phần nước dưa hấu vào, khuấy đều.\n" +
                "Đổ hỗn hợp trên vào hai nửa vỏ quả dưa, tránh đổ đầy kẻo nước thạch bị sánh ra ngoài.\n" +
                "Đặt dưa hấu vào tủ lạnh và để khoảng 4 tiếng cho thạch đông lại. Sau đó lấy ra, cắt miếng vừa ăn như hình và bày ra đĩa, những miếng thạch dưa hấu tươi ngon hấp dẫn chắc chắn sẽ khiến cả nhà thích thú lắm đấy.");
        stringArrayList17.add("Sữa ngô bổ dưỡng, thơm mát");
        chebien17.add("Nguyên liệu:\n" +
                "\n" +
                "Ngô ngọt: 1 bắp\n" +
                "Sữa tươi: 1 túi/ 200ml\n" +
                " Đường, sữa đặc có đường: tùy khẩu vị\n" +
                "Nước: 600ml (nếu thích uống loãng hoặc đặc hơn các bạn có thể tăng hoặc giảm lượng nước)\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Bắp ngô bạn làm sạch, không nên lấy lá và râu để đảm bảo an toàn cho sức khỏe, nếu chọn được ngô sạch thì có thể lấy lá và râu ngô để luộc cùng, sữa ngô sẽ ngon hơn.\n" +
                "\n" +
                "Bước 2: Bạn luộc chín ngô, vớt ngô ra để nguội. Sau đó tách hạt ngô để riêng, bỏ lõi.\n" +
                "\n" +
                "Bước 3: Bạn cho phần hạt ngô đã tách vào máy xay sinh tố, xay nhuyễn và lọc qua rây.\n" +
                "\n" +
                "Bước 4: Sữa ngô sau khi đã lọc đem đun sôi với đường, tùy khẩu vị. Khi sữa ngô sôi khoảng 5 phút thì vặn nhỏ lửa và thêm sữa tươi không đường vào. Khi cho sữa tươi vào không đun sôi mà thấy sữa lăn tan thì tắt bếp để lưu lại các chất trong sữa.");
        stringArrayList17.add("Làm kem trà xanh cực đơn giản");
        chebien17.add("Nguyên liệu:\n" +
                "\n" +
                "200ml kem tươi- Whipping cream\n" +
                "3 lòng đỏ trứng\n" +
                "200ml sữa tươi không đường\n" +
                "120g đường cát (gia giảm tùy khẩu vị)\n" +
                "2 muỗng canh bột trà xanh (có thể thay bằng bột ca cao hay các loại hoa quả tùy thích)\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1: Trộn đều bột trà xanh với 2 muỗng đường trong 1 bát nhỏ.\n" +
                "\n" +
                "Bước 2: Bạn đánh bông lượng đường còn lại với 3 lòng đỏ trứng gà.\n" +
                "\n" +
                "Bước 3: Cho sữa vào nồi để nấu cho ấm lên rồi rót 2 muỗng canh sữa vào hỗn hợp trà xanh trong bát và khuấy đều.\n" +
                "\n" +
                "Đổ hỗn hợp trà xanh vào nồi sữa, khuấy đều trên bếp nhỏ lửa để lòng đỏ trứng gà chín và hỗn hợp trộn đều. Khuấy đều tay đến khi hỗn hợp đặc lại thì tắt bếp.\n" +
                "\n" +
                "Bước 4: Bạn đánh bông kem tươi.\n" +
                "\n" +
                "Bước 5: Trộn đều kem tươi đã đánh bông vào nồi sữa –trứng để nguội cho vào hộp, cất vào ngăn đá khoảng 2 tiếng lấy ra đánh lại 1 lần bằng máy đánh trứng. Làm khoảng 3 lần cho kem tơi xốp.\n" +
                "\n" +
                "Bước 6: Múc kem ra chén hoặc ly và thưởng thức cùng topping.");
        stringArrayList17.add("Trà táo hoa quả mát lạnh, bổ dưỡng");
        chebien17.add("Nguyên liệu cẩn chuẩn bị:\n" +
                "\n" +
                "5 quả dâu\n" +
                "1 quả táo\n" +
                "30g dứa\n" +
                "1 gói trà túi lọc vị táo\n" +
                "2 quả chanh vàng\n" +
                "30ml mật ong\n" +
                "1,2l nước\n" +
                "Bạn có thể cho thêm 1 số loại quả khác tùy thích như kiwi hay xoài…\n" +
                "\n" +
                "Cách pha:\n" +
                "\n" +
                "Bước 1: Đầu tiên, bạn đem rửa và ngâm thật sạch các loại trái cây, sau đó cắt thành từng miếng nhỏ, cắt chanh thành lát mỏng.\n" +
                "\n" +
                "Bước 2: Sau đó, cho tất cả các loại hoa quả vào nồi, thêm nước vào đun.\n" +
                "\n" +
                "Bước 3: Khi nước đang nóng, bạn cho phần túi trà lọc vào rồi để yên trong 5 phút.\n" +
                "\n" +
                "Bước 4: Khi trà đã tan và nước nguội bớt, bạn thả chanh và thêm chút mật ong vào khuấy đều, đều, để nguội là có thể uống được rồi.");


        anh17.add(R.drawable.sachanh);
        anh17.add(R.drawable.ab_khoai_lang_ken);
        anh17.add(R.drawable.ab_thach_dua);
        anh17.add(R.drawable.ab_che_khoai_lang);
        anh17.add(R.drawable.ab_xoai);
        anh17.add(R.drawable.ab_banh_goi);
        anh17.add(R.drawable.ab_khoai_tay);
        anh17.add(R.drawable.ab_banhranman);
    }
    public void uong(){
        stringArrayList18.add("Soda 7 up chanh mật ong");
        chebien18.add("Nguyên liệu\n" +
                "\n" +
                "Nước soda 7 up: 250ml (hoặc có thể thay bằng loại soda đóng hộp nào khác tùy khẩu vị của bạn)\n" +
                "Nước lọc: 200 ml\n" +
                "Chanh tươi: 4 – 5 quả\n" +
                "Đường trắng: 40g\n" +
                "Mật ong: 2 thìa cafe\n" +
                "Đá viên\n" +
                "Vài nhánh bạc hà để trang trí\n" +
                "Dụng cụ\n" +
                "\n" +
                "Bình lớn, cốc/ly thủy tinh\n" +
                "Thìa, dao, thớt\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Chanh rửa sạch cắt đôi vắt lấy nước cốt. Bạn cũng có thể lấy một chút vỏ chanh thái và thái sợi để trang trí thêm cho cốc soda chanh mật ong của mình.\n" +
                "\n" +
                "Bước 2: Lấy một bình nhỏ, cho nước và đường vào khuấy đến khi đường tan hết. Sau đó thêm mật ong, nước cốt chanh vào tiếp tục khuấy đến khi hỗn hợp đều.\n" +
                "\n" +
                "Bước 3: Tiếp theo cho đá viên vào bình rồi mới đổ 250ml soda sau để không bị mất gas của soda. Cuối cùng thêm vài nhánh bạc hà, một lát chanh tươi và một vài sợi vỏ chanh thái sợi để trang trí thêm cho cốc soda của bạn rồi thưởng thức nhé.");
        stringArrayList18.add("Soda kem cherry");
        chebien18.add("Nguyên liệu\n" +
                "\n" +
                "Soda: 250 ml\n" +
                "Siro Cherry: 10ml\n" +
                "Siro đường: 30ml\n" +
                "Muối: 1/3 thìa cafe\n" +
                "Kem viên vị tùy thích\n" +
                "Cherry tươi: 3 – 4 quả trang trí\n" +
                "Dụng cụ\n" +
                "\n" +
                "Cốc/ly thủy tinh, thìa\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Bạn chuẩn bị cốc thủy tinh sau đó cho cherry tươi đã cắt đôi bỏ hạt xuống đáy cốc, rồi lần lượt thêm siro đường, siro cherry, muối và 2 – 3 viên kem vào cốc.\n" +
                "\n" +
                "Bước 2: Sau đó từ từ đổ 250 ml soda vào cốc là có thể thưởng thức ngay rồi. Khi uống bạn có thể dùng thìa khuấy nhẹ nhàng để siro tan hết nhé.\n" +
                "\n" +
                "Lưu ý rằng với món đồ uống soda kem này bạn hoàn toàn có thể thay thế cherry bằng các loại quả khác như dâu, cam… với cách làm tương tự nhé.");
        stringArrayList18.add("Soda mix trái cây việt quất");
        chebien18.add("Nguyên liệu\n" +
                "\n" +
                "Soda: 250 ml\n" +
                "\n" +
                "Mứt việt quất: 20ml\n" +
                "\n" +
                "Siro đường: 10ml\n" +
                "\n" +
                "Nước cốt chanh: 10 ml\n" +
                "\n" +
                "Quả việt quất tươi, lát chanh và nhánh bạc hà để trang trí\n" +
                "\n" +
                "Dụng cụ\n" +
                "\n" +
                "Bình, cốc/ly thủy tinh, thìa\n" +
                "\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Cho 20 ml mứt việt quất, siro đường và nước cốt chanh vào cốc, dùng thìa khuấy cho hỗn hợp đều nhau. Sau đó cho 150ml soda vào khuấy đều rồi bỏ đá viên đầy cốc. Tiếp theo chúng ta hãy rót nốt phần soda còn lại vào cốc để đảm bảo gas của soda không bị bay hết.\n" +
                "\n" +
                "Bước 2: Cuối cùng, thêm vài trái việt quất tươi, bạc hà và lát chanh vào trang trí rồi tận hưởng bạn nhé.");
        stringArrayList18.add("Soda xoài");
        chebien18.add("Nguyên liệu\n" +
                "\n" +
                "Nước soda: 250ml\n" +
                "Xoài chín: 1 quả\n" +
                "Nước cốt chanh: 20ml\n" +
                "Đường: 50g\n" +
                "Lá bạc hà, 1 lát chanh tươi để trang trí\n" +
                "Đá viên\n" +
                "Dụng cụ\n" +
                "\n" +
                "Máy xay sinh tố\n" +
                "Bình, cốc/ly thủy tinh\n" +
                "Thìa, dao, thớt\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Xoài chín gọt vỏ, cắt nhỏ thành từng miếng, sau đó cho vào máy xay sinh tố xay nhuyễn.\n" +
                "\n" +
                "Bước 2: Sau khi đã xay nhuyễn thì đổ nước xoài ra cốc, thêm đường, nước cốt chanh vào khuấy đều. Rồi mới cho 250ml soda vào cốc, thêm đá và trang trí bằng nhánh bạc hà, lát chanh tươi rồi thưởng thức.");
        stringArrayList18.add("Soda cam");
        chebien18.add("Nguyên liệu\n" +
                "\n" +
                "Cam: 4 trái\n" +
                "Đường: 40g\n" +
                "Nước soda: 100 ml\n" +
                "Nước cốt chanh: 30ml\n" +
                "Đá viên\n" +
                "Dụng cụ\n" +
                "\n" +
                "Máy xay sinh tố\n" +
                "Bình, cốc/ly thủy tinh\n" +
                "Thìa, dao, thớt\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Cam rửa sạch, cắt nhỏ thành từng miếng và bỏ vỏ, sau đó cho vào máy xay sinh tố.\n" +
                "\n" +
                "Bước 2: Sau đó xay cam cho đến khi nhuyễn, lọc lấy nước cốt cam và bỏ phần bã.\n" +
                "\n" +
                "Bước 3: Cho nước cốt cam vào cốc, thêm nước cốt chanh và đường khuấy thật đều, thêm đá viên cho đến đầy cốc rồi từ từ rót nước soda vào. Trang trí cốc bằng lát cam tươi là bạn có thể thưởng thức ngay lập tức rồi.");
        stringArrayList18.add("Soda sữa trứng gà");
        chebien18.add("Nguyên liệu\n" +
                "\n" +
                "Trứng gà: 1 quả\n" +
                "Sữa đặc: 200 ml\n" +
                "Soda: 250ml\n" +
                "Đá viên\n" +
                "Dụng cụ\n" +
                "\n" +
                "Cốc/ly thủy tinh, thìa\n" +
                "Máy đánh trứng hoặc phới đánh trứng bằng tay\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Đập trứng gà và chỉ lấy phần lòng đỏ, sau đó dùng máy hoặc phới đánh phần lòng đỏ trứng gà cùng với sữa đặc, đánh đều đến khi hỗn hợp bông lên và có màu đỏ nhạt hơn.\n" +
                "\n" +
                "Bước 2: Rót hỗn hợp lòng đỏ trứng gà trên vào cốc, rồi từ từ rót soda vào hỗn hợp đó. Khuấy đều hỗn hợp theo một chiều đến khi các nguyên liệu hòa quyện với nhau.\n" +
                "\n" +
                "Bước 3: Cuối cùng thêm đá vào ly soda sữa trứng gà và trang trí bằng nhánh bạc hà hay một chút bột ca cao là hoàn thành.");
        stringArrayList18.add("Soda táo xanh");
        chebien18.add("Nguyên liệu\n" +
                "\n" +
                "Nước táo xanh ép: 100ml\n" +
                "Syrup Green Apple: 10ml (để tạo màu xanh nếu có)\n" +
                "Đường: 30g\n" +
                "Nước soda: 200 ml\n" +
                "Nước cốt chanh: 30ml\n" +
                "Vài nhanh bạc hà hoặc lát táo xanh để trang trí\n" +
                "Đá viên\n" +
                "Dụng cụ\n" +
                "\n" +
                "Bình, cốc/ly thủy tinh\n" +
                "Thìa, dao, thớt\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Đầu tiên bạn cho 100ml nước ép táo xanh, 10ml syrup táo, đường và nước cốt chanh vào ly, khuấy thật đều cho đường tan hết và hỗn hợp hòa quyện với nhau.\n" +
                "\n" +
                "Bước 2: Tiếp theo đổ đầy đá viên vào cốc chứa hỗn hợp trên rồi mới từ từ rót nước soda vào ly để giữ được gas cho soda. Cuối cùng trang trí thêm bằng bạc hà, lát táo và lát chanh rồi thưởng thức.");
        stringArrayList18.add("Soda dâu\n");
        chebien18.add("Nguyên liệu\n" +
                "\n" +
                "Soda: 25ml\n" +
                "Nước cốt chanh: 20ml\n" +
                "Dâu tươi: 15 – 20 trái\n" +
                "Đường: 50g\n" +
                "Đá viên\n" +
                "Dâu tươi và nhánh bạc hà để trang trí\n" +
                "Dụng cụ\n" +
                "\n" +
                "Cốc/ly thủy tinh\n" +
                "Thìa, dao, thớt, rây lưới, nồi\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Đầu tiên, dâu rửa sạch và cắt đôi sau đó cho vào nồi cùng 50 gram đường, 90 ml nước lọc, bắc lên bếp và đun sôi cho đến khi cô thành siro. Khi đã đun xong, bạn hãy lọc bỏ bớt phần bã qua rây và giữ lấy phần nước cốt siro.\n" +
                "\n" +
                "Bước 2: Tiếp theo đổ phần siro dâu vừa rồi xuống đáy ly, thêm đá viên đầy cốc rồi từ từ rót nước soda vào cốc. Cuối cùng đừng quên trang trí bằng lát dâu tươi và bạc hà trước khi thưởng thức nhé.");
        stringArrayList18.add("Soda bạc hà");
        chebien18.add("Nguyên liệu\n" +
                "\n" +
                "Nước soda: 250 ml\n" +
                "Lá bạc hà: 100 g\n" +
                "Đường: 50g\n" +
                "Đá viên\n" +
                "Lát chanh để trang trí\n" +
                "Dụng cụ\n" +
                "\n" +
                "Bình, cốc/ly thủy tinh\n" +
                "Thìa, dao, cối\n" +
                "Cách làm\n" +
                "\n" +
                "Bước 1: Cho bạc hà vào cối (giữ lại vài nhánh bạc hà để trang trí), dùng chày hoặc đồ vật có đầu tù và giã nát để bạc hà cho ra chất thơm.\n" +
                "\n" +
                "Bước 2: Cho nước soda vào cốc, thêm đường khuấy cho đến khi tan hết đường. Sau đó cho hỗn hợp bạc hà đã dã nát vào khuấy đều. Cuối cùng thêm đá và lát chanh cùng vài nhánh bạc hà còn nguyên rồi thưởng thức.\n" +
                "\n" );
        stringArrayList18.add("Trà vải dưa hấu");
        chebien18.add("Nguyên liệu chuẩn bị\n" +
                "Vải tươi: 3 quả\n" +
                "Dưa hấu: cắt 1 lát mỏng để trang trí, còn lại cắt nhỏ thành các miếng hình vuông vừa ăn.\n" +
                "Sirup vải: 10ml\n" +
                "Sirup dưa hấu: 15ml\n" +
                "Trà đen: tép hoặc 3gr\n" +
                "Nước sôi: 150ml\n" +
                "Đá viên\n" +
                "Công thức làm trà vải dưa hấu từ Jarvis:\n" +
                "Bước 1: Ngâm tép trà (hoặc 3gr trà) với 150 ml nước sôi. Hoặc nếu bạn có máy đảo trà thì hãy dùng máy nhé.\n" +
                "Bước 2: Cho cả hai loại Sirup vải và dưa hấu vào ly\n" +
                "Bước 3: Cho đá và hoa quả đã cắt nhỏ vào ly. Lưu ý bạn có thể cho theo thứ tự đá, sau đó đến hoa quả cuối cùng là một lớp đá nhỏ trên cùng để khi uống thêm mát lạnh.\n" +
                "Bước 4: Đổ trà đã lọc bã vào ly\n" +
                "Bước 5: Trang trí lỳ trà, bạn có thể trang trí bằng chính quả vải tươi và lát dưa hấu, có thể thêm một nhánh bạc hà xanh");
        stringArrayList18.add("Sinh tố rau má");
        chebien18.add("Nguyên liệu cần chuẩn bị\n" +
                "Đầu tiên hãy chuẩn bị một mớ rau má, đá nhỏ và một chiếc máy sinh tố.\n" +
                "Các bước làm\n" +
                "Rau má rửa sạch, nhặt hết lá úa, lá hư. Hãy nhớ rằng làm sinh tố rau má bạn hoàn toàn có thể giữ lại phần rễ để xay nhé, thậm chí đây mới là phần chứa nhiều chất dinh dưỡng hơn cả phần lá đấy.\n" +
                "Rau má sau khi đã ráo nước thì hãy cắt nhỏ cho vào máy xay sinh tố xay nhuyễn, trong quá trình xay hãy cho thêm một chút nước sôi để nguội nếu bạn không uống được quá đặc.\n" +
                "Lọc nước rau má xay qua rây, đổ vào cốc, thêm đá và thưởng thức ngay thôi. Tùy vào khẩu vị mà bạn có thể thêm đường hoặc sữa tươi để dễ uống hơn nhé.");
        stringArrayList18.add("Trà đào chanh sả");
        chebien18.add("Chuẩn bị nguyên liệu\n" +
                "1 nửa cam tươi\n" +
                "1 nửa quả chanh\n" +
                "2 miếng đào tươi\n" +
                "2 củ sả\n" +
                "15 ml sirup đào\n" +
                "3 gram trà thảo mộc\n" +
                "Cách làm làm trà đào chanh sả\n" +
                "Bước 1: Ngâm 1 củ sả đã cắt lát nhỏ cùng với 3g trà thảo mộc trong 150 ml nước sôi.\n" +
                "Bước 2: Ngâm trong vòng 50 – 60 giây rồi lọc trà vừa ngâm lấy nước, đổ vào cốc.\n" +
                "Thêm sirup đào, đá, vắt thêm cam và chanh tươi rồi đậy nắp lắc thật đều. Nếu không có đồ chuyên dụng bạn có thể khuấy đều bằng thìa.\n" +
                "Cuối cùng trang trí cốc bằng 1 lát cam, 1 nhánh bạc hà và nhánh sả là bạn có thể thưởng thức rồi");
        stringArrayList18.add("Sinh tố dâu tây cốt dừa");
        chebien18.add("Chuẩn bị nguyên liệu\n" +
                "Dâu tây: 5 quả\n" +
                "Nước cốt dừa: 30 ml\n" +
                "Nước dừa: 150 ml\n" +
                "Mật ong: 1 thìa cafe\n" +
                "Cách làm sinh tố dâu tây nước cốt dừa\n" +
                "Dâu tây xay nhuyễn, sau đó đổ vào bình (chú ý là không cần lọc bã), thêm nước cốt dừa và mật ong vào bình, đậy nắp và lắc thật đều.\n" +
                "Cuối cùng đổ nước từ bình ra cốc, thêm nước dừa tươi và đá rồi khuấy nhé nhàng. Bạn có thể trang trí thêm bằng 1, 2 lát dâu tây cắt mỏng và 1 nhánh bạc hà cho thêm phần hấp dẫn.");
        stringArrayList18.add("Cà phê cốt dừa");
        chebien18.add("Nguyên liệu cần chuẩn bị\n" +
                "Cafe phin: 35 – 40 ml\n" +
                "Nước cốt dừa: 80 ml\n" +
                "Sữa đặc: 60ml\n" +
                "1 chút đá viên\n" +
                "Cách làm cà phê cốt dừa\n" +
                "Đầu tiên bạn hãy pha cà phê phin, có thể dùng loại cà phê mà bạn đang có và hãy nhớ là pha cà phê bằng phin bạn nên dùng nước vừa sôi xong (tức là nước gần 100 độ C) để cà phê thêm dậy mùi\n" +
                "Trong lúc chờ pha cà phê, hãy cho hỗn hợp gồm sữa đặc, nước cốt dừa và đá vào máy xay sinh tố, say ở mức cao nhất để thành được hỗn hợp tuyết mịn đẹp mắt.\n" +
                "Sau đó đổ 35 – 40 ml cà phê phin vào bình lắc và lắc thật đều tay. Nếu không có đồ chuyên dụng bạn có thể dùng thay thế bằng 1 chai bất kỳ, vì mục đích của việc lắc đều là tạo bọt cho cà phê.\n" +
                "Sau khi lắc, đổ cà phê ra cốc, rồi múc từng muỗng hỗn hợp đá tuyết cốt dừa mới xay vào cốc là bạn đã có thể thưởng thức rồi.");
        stringArrayList18.add("Trà nhãn");
        chebien18.add("Chuẩn bị nguyên liệu\n" +
                "Nhãn tươi: 200 g\n" +
                "Trà túi lọc: 1 gói\n" +
                "Muối: 1/4 thìa cafe\n" +
                "Đường: 40g\n" +
                "Cách làm trà nhãn\n" +
                "Đầu tiên nhãn bóc vỏ bỏ hột cho vào nồi, đổ 40g đường, 1 chút muối và 300 ml nước vào nồi đun sôi. Khuấy đều cho đến khi nhãn hơi đổi màu và nổi dần lên trên mặt nước. Lúc này bạn hãy đổ cả nước đường nhãn và thịt nhãn vào lọ sạch, có thể để tủ lạnh để dùng nhiều lần.\n" +
                "Tiếp theo ngâm trà túi lọc trong 200 ml nước sôi rồi chờ trà ngấm.\n" +
                "Cuối cùng khi trà ngấm để nguội bớt rồi đổ thêm 200ml nước đường nhãn, 4, 5 thịt quả nhãn và một chút đá. Khuấy đều và thưởng thức ngay nhé.");
        stringArrayList18.add("Trà sữa");
        chebien18.add("Nguyên liệu làm trà sữa\n" +
                "\n" +
                "Trà túi lọc: 2 gói (bạn có thể dùng các loại trà có mùi vị mình thích, như trà bạc hà, trà dâu tây…)\n" +
                "Sữa đặc: 3 thìa cafe\n" +
                "Sữa tươi: 30 ml\n" +
                "Cách pha chế trà sữa\n" +
                " Đầu tiên bạn hãy pha trà túi lọc vào 120 ml nước sôi, nhúng túi trà nhiều lần và để trong 5 phút cho trà ngấm. Sau đó nhấc bỏ túi bã trà, đổ sữa tươi, sữa đặc vào khuấy đều cho đến khi tan hết. Thêm đá hoặc bỏ tủ lạnh trước khi uống để có hương vị ngon nhất.");
        stringArrayList18.add("Trà kem sữa phô mai");
        chebien18.add("Nguyên liệu làm trà kem sữa phô mai\n" +
                "\n" +
                "Trà ô long: 3 gram\n" +
                "Trân châu trắng\n" +
                "Bột tạo màng kem sữa: 2 thìa\n" +
                "Sữa tươi: 100ml\n" +
                "Kem whipping: 100 ml\n" +
                "Cách làm trà kem sữa phô mai\n" +
                "Ngâm 3 gram trà ô long bằng 150 ml nước sôi trong 15 phút.\n" +
                "Đánh kem sữa thật bông bằng bột tạo màng kem sữa, sữa tươi và kem whipping\n" +
                "Cuối cùng cho trân châu trắng vào ly, đổ trà ô long đã lọc lá và thêm một lớp kem sữa lên trên, và cuối cùng bạn có thể trang trí thêm bằng một chút bột matcha hoặc bột cà phê trước khi thưởng thức");
        stringArrayList18.add("Trà chanh dây");
        chebien18.add("Nguyên liệu làm trà chanh dây\n" +
                "2 túi trà lọc\n" +
                "2 quả chanh dây\n" +
                "30 gr đường\n" +
                "Cách làm trà chanh dây\n" +
                "Pha trà túi lọc với 300 ml nước\n" +
                "Cắt đôi quả chanh dây, khoét lấy ruột bên trong và lọc qua rây để bỏ hạt chỉ lấy phẩn nước.\n" +
                "Đổ nước chanh dây vào nước trà, thêm đường và khuấy cho đến khi tan đường mới thêm đá để thưởng thức.");
        stringArrayList18.add("Nước ép xoài");
        chebien18.add("Nguyên liệu nước ép xoài\n" +
                "Xoài chín: 1 quả\n" +
                "Muối\n" +
                "Đường\n" +
                "Nước cốt chanh\n" +
                "Cách làm nước ép xoài\n" +
                "Xoài chín gọt vỏ, cắt nhỏ và cho vào máy xay xay nhuyễn cùng với đường, muối và nước cốt chanh.\n" +
                "Lọc hỗn hợp xoài qua rây để bỏ bã, sau đó thêm 200 ml nước sôi để nguội (hoặc tùy khẩu vị muốn uống đặc hay vừa của bạn) và khuấy đều\n" +
                "Thêm đá và thưởng thức ngay nào");


        anh18.add(R.drawable.douong);
        anh18.add(R.drawable.ab_trasuachanchau);
        anh18.add(R.drawable.douong);
        anh18.add(R.drawable.ab_trasuachanchau);
        anh18.add(R.drawable.douong);
        anh18.add(R.drawable.ab_trasuachanchau);
        anh18.add(R.drawable.douong);
        anh18.add(R.drawable.ab_trasuachanchau);
        anh18.add(R.drawable.douong);
        anh18.add(R.drawable.ab_trasuachanchau);
        anh18.add(R.drawable.douong);
        anh18.add(R.drawable.ab_trasuachanchau);
        anh18.add(R.drawable.douong);
        anh18.add(R.drawable.ab_trasuachanchau);
        anh18.add(R.drawable.douong);
        anh18.add(R.drawable.cacbohydrate);
        anh18.add(R.drawable.douong);
        anh18.add(R.drawable.ab_trasuachanchau);
        anh18.add(R.drawable.ab_trasuachanchau);
    }
    public void kem(){
        stringArrayList19.add("Kem que Milo");
        chebien19.add("Nguyên liệu: \n" +
                "5 gói bột sữa Milo 3-in-1 loại 22g\n" +
                "300ml sữa tươi (có thể thay bằng nước lọc) \n" +
                "100ml sữa đặc\n" +
                "Que kem gỗ\n" +
                "Cách làm kem que Milo:\n" +
                "Pha bột sữa Milo với sữa tươi, thêm sữa đặc vào và khuấy đều tay. \n" +
                "Cho hỗn hợp vào khay hoặc túi bột Milo rỗng rồi đặt vào trong một que kem gỗ.\n" +
                "Cho vào tủ đông lạnh trong 5 tiếng. \n" +
                "Chẳng có cách “quay ngược thời gian trở về với tuổi thơ” nào nhanh hơn một que kem Milo ngọt lịm. Món ăn vặt này chắc chắn sẽ rất được lòng cách #teamKlook nhỏ tuổi lắm. \n");
        stringArrayList19.add("Kem chuối");
        chebien19.add("Nguyên liệu: \n" +
                "4 quả chuối chín \n" +
                "Cách làm kem chuối: \n" +
                "Chuối lột bỏ vỏ rồi cắt thành khoanh dày khoảng 1 - 2cm; sau đó, cho vào túi bóng rồi đông lạnh khoảng 6 giờ. \n" +
                "Cho chuối đã đông lạnh vào máy quay sinh tố rồi xay đến khi nhuyễn mịn. \n" +
                "Bạn có thể ăn ngay theo kiểu kem đá bào slurpee hay tiếp tục đông lạnh thêm hai giờ nữa cho kem dẻo hơn. ");
        stringArrayList19.add("Kem caramel mặn");
        chebien19.add("Nguyên liệu: \n" +
                "30ml sữa đặc có đường hoặc 320ml dulce de leche (kẹo sữa)\n" +
                "1/2 muỗng café muối \n" +
                "500ml kem béo (heavy cream)\n" +
                "Cách làm kem caramel mặn: \n" +
                "Nếu không mua được dulce de leche ngoài cửa tiệm thì bạn cần phải làm món này từ sữa đặc. Đặt hộp sữa đặc chưa mở nắp vào nồi rồi đổ nước xăm xắp miệng hộp - đun ở lửa nhỏ trong 2 giờ. \n" +
                "Mở nắp hộp và để nguội rồi cho dulce de leche vào một tô lớn. Cho nửa muỗng café muối vào, khuấy đều rồi để nguội thêm 10 phút nữa. \n" +
                "Cho kem béo vào tô lớn rồi dùng máy đánh khoảng 3 phút để kem sánh và có độ cứng vừa phải. \n" +
                "Cho 1/3 phần kem béo đã đánh xong vào dulce de leche đã chuẩn bị trước đó và khuấy đều tay.\n" +
                "Cho phần kem béo còn lại vào hỗn hợp rồi đổ vào khuôn, bọc lại bằng màn bọc thực phẩm.\n" +
                "Đông lạnh trong 6 giờ là có thể dùng được. Với kem caramel mặn, bạn có thể cho thêm toppings như chocolate chảy, cốm, kẹo dẻo… tuỳ sở thích. ");
        stringArrayList19.add("Kem café");
        chebien19.add("Nguyên liệu: \n" +
                "60ml nước nóng \n" +
                "2 muỗng café hoà tan\n" +
                "400ml sữa đặc có đường \n" +
                "1 muỗng café vani \n" +
                "500ml kem béo (heavy cream)\n" +
                "Một ít muối\n" +
                "Cách làm kem café: \n" +
                "Pha café hoà tan cùng nước nóng trong một tô vừa. Thêm sữa đặc, vani và muối vào, khuấy đều tay đến khi hỗn hợp hoà quyện. Cho vào tủ lạnh để nguội bớt. \n" +
                "Dùng máy đánh kem béo trong tô lớn để kem sánh và có độ cứng vừa phải. Từ từ đổ hỗn hợp café đã chuẩn bị trước vào. \n" +
                "Cho tất cả vào khuôn hoặc chảo lớn, bọc lại bằng màn bọc thực phẩm rồi đông lạnh qua đêm hoặc ít nhất là 6 giờ. ");
        stringArrayList19.add("Kem que đào ");
        chebien19.add("Nguyên liệu: \n" +
                "40ml kem tươi (whipping cream)\n" +
                "30ml sữa đặc có đường\n" +
                "100ml sữa tươi \n" +
                "3-4 đào chín\n" +
                "Que kem gỗ\n" +
                "Cách làm kem que đào: \n" +
                "Gọt vỏ, tách bỏ hạt đào rồi cắt phần thịt thành miếng lớn. Giữ lại một phần nhỏ đào và cắt hạt lựu. \n" +
                "Cho đào (loại lớn), sữa tươi, sữa đặc, kem tươi vào máy xay sinh tố. Xay đến khi hỗn hợp hoà quyện. \n" +
                "Cho hỗn hợp vào khuôn kem rồi thêm đào đã cắt hạt lựu vào. \n" +
                "Đặt que gỗ vào khuôn rồi cho tất cả vào tủ đông ít nhất 6 tiếng. ");
        stringArrayList19.add("Kem S’mores");
        chebien19.add("Nguyên liệu: \n" +
                "40ml sữa đặc không đường\n" +
                "500ml kem tươi ướp lạnh (whipping cream) \n" +
                "2 muỗng café vani \n" +
                "10 bánh quy giòn giã vụn \n" +
                "1 thanh chocolate cắt nhỏ \n" +
                "Cách làm kem S’mores:\n" +
                "Cho sữa đặc, vani, vụn bánh quy giòn và chocolate vào thố. \n" +
                "Dùng máy đánh kem tươi trong khoảng 2-3 phút đến khi kem cứng lại (nếu không có máy thì bạn đáng bằng tay cũng được nhé). \n" +
                "Nhẹ nhàng phủ kem tươi đã đánh lên hỗn hợp sữa đã chuẩn bị lúc đầu. \n" +
                "Cho tất cả vào chảo hoặc khuôn kem, bọc lại bằng màng bọc thực phẩm rồi đem đi đông lạnh ít nhất 8 giờ.");
        stringArrayList19.add("Kem xoài chanh dây");
        chebien19.add("Nguyên liệu: \n" +
                "1 quả chanh dây (hay chanh leo) \n" +
                "60ml sữa chua\n" +
                "40g đường\n" +
                "150g thịt xoài đã nghiền nát hoặc xay nhuyễn\n" +
                "160ml whipping cream (kem tươi)\n" +
                "Cách làm kem xoài chanh dây: \n" +
                "Trộn đều xoài, sữa chua và chanh dây trong một thố lớn. \n" +
                "Cho thêm đường và kem tươi vào. \n" +
                "Dùng máy đánh bông hỗn hợp đường và kem tươi  đến khi có độ cứng vừa đủ. \n" +
                "Cho hỗn hợp vào khuôn rồi đông lạnh qua đêm hoặc ít nhất sáu tiếng là có thể ăn được. ");
        stringArrayList19.add("Kem sữa tươi\n");
        chebien19.add("Nguyên liệu: \n" +
                "Khuôn làm kem\n" +
                "250ml sữa tươi\n" +
                "45ml nước lọc\n" +
                "2 muỗng café bột bắp\n" +
                "3 muỗng cafe sữa bột\n" +
                "20g đường \n" +
                "Cách làm kem sữa tươi:\n" +
                "Hoà tan bột bắp, sữa bột cùng với nước. \n" +
                "Đun sữa tươi trong nồi đến khi sôi lăn lăn rồi cho hỗn hợp bột bắp, sữa bột đã chuẩn bị sẵn vào. Khuấy đều đến khi sôi thì tắt bếp. \n" +
                "Chờ sữa nguội bớt, bạn đổ sữa vào khuôn làm kem rồi đem đi đông lạnh trong khoảng 6 tiếng rồi thưởng thức thôi. \n" +
                "Với nguyên liệu rẻ, dễ tìm và cách thực hiện đơn giản, kem sữa tươi là món ăn vặt lý tưởng để chiêu đãi cả gia đình. Với các bé lười uống sữa thì công thức này lại càng thêm hữu dụng.");
        stringArrayList19.add("Kem chuối chocolate\n");
        chebien19.add("Nguyên liệu: \n" +
                "100ml whipping cream (kem tươi) hoặc 50ml sữa tươi\n" +
                "60ml dầu hướng dương\n" +
                "60ml quả hạch giã nhuyễn (bạn có thể chọn hạnh nhân, óc chó, đậu phộng... tuỳ sở thích) \n" +
                "3 quả chuối chín\n" +
                "200g chocolate\n" +
                "Que kem gỗ\n" +
                "Cách làm kem chuối chocolate:\n" +
                "Chuối lột vỏ, cắt thành khoanh nhỏ rồi cho vào máy xay sinh tố. \n" +
                "Xay cùng với kem tươi đến khi hỗn hợp nhẵn mịn. \n" +
                "Đổ hỗn hợp vào khuôn kem que, đặt que gỗ vào giữa và đông lạnh trong 6 tiếng. \n" +
                "Nấu chảy chocolate cùng một ít nước rồi cho dầu hướng dương và quả hạch giã nhuyễn, trộn đều tay. \n" +
                "Cho hỗn hợp chocolate và quả hạch vào ly cao rồi lần lượt nhúng từng que keo vào, sao cho chocolate phủ thật đều lên kem. \n" +
                "Cuối cùng, bạn cho kem vào ngăn đá khoảng 6 - 8 tiếng đến khi đông lại là xong. ");
        stringArrayList19.add("Kem dừa");
        chebien19.add("Cách làm kem dừa:\n" +
                "Cho kem béo vào thố rồi dùng máy đánh đến khi kem cứng lại. \n" +
                "Thêm nước cốt dữa và sữa đặc vào rồi khuấy đều. \n" +
                "Cho hỗn hợp vào hũ nhỏ rồi đông lạnh qua đêm.\n" +
                "Khi ăn, bạn hãy cho thêm cơm dừa bào vụn lên trên để làm nổi bật mùi dừa nhé. ");
        stringArrayList19.add("Kem mít");
        chebien19.add("Nguyên liệu:\n" +
                "\n" +
                "-Whipping cream: 250 ml\n" +
                "\n" +
                "-Sữa tươi: 300 ml (chia làm 2 phần: 100 ml để xay mít và 200 ml để trộn với trứng)\n" +
                "\n" +
                "Mít tươi tách hột: 200 g\n" +
                "–\n" +
                "-Trứng gà: 3 quả (với trứng gà ta bé, trứng to hơn có thể chỉ 2 quả)\n" +
                "\n" +
                "-Đường: 80g (đường xay càng tốt)\n" +
                "\n" +
                "Nếu có máy làm kem thì để bowl làm lạnh trong ngăn đá nấc cao nhất tối thiểu 8 tiếng.\n" +
                "\n" +
                "Thực hiện:\n" +
                "\n" +
                "-Xay mít với 100 ml sữa, cho từ từ sữa đến khi đủ để xay mít. Vì sữa này chỉ có tác dụng để xay mít nên cho càng ít càng tốt, kem thành phẩm sẽ khó bị đá dăm hơn\n" +
                "\n" +
                "-Đun sữa nóng già vừa chạm sôi thì tắt bếp (không để sôi bùng lên)\n" +
                "-Trong lúc đặt nồi sữa thì đánh tan trứng với đường cho nổi màu ngà (có thể đánh bằng máy đánh trứng hay đánh tay đều được).\n" +
                "\n" +
                "-Cho từ từ sữa nóng vào và khuấy đều tay cho tan trứng (nếu có máy đánh trứng thì để tốc độ 1 và trộn từ từ sữa vào). Có thể lọc qua rây để loại bỏ những cợn trắng trứng chưa tan được (thường thì không lọc vì thấy hoà tan dễ dàng).\n" +
                "\n" +
                "-Cho hỗn hợp lên bếp đun sôi nhẹ, hỗn hợp sẽ chuyển dần thành màu ngà,khuấy nặng tay hơn. Cho mít xay vào trộn đều rồi tắt bếp. Để hỗn hợp nguội (muốn nhanh thì cho vào ngăn đá – không tốt cho tủ lạnh :D)\n" +
                "\n" +
                "-Đánh whipping cream đến bông nhẹ rồi trộn vào hỗn hợp đã để nguội ở trên, và để lại vào ngăn mát tủ lạnh khoảng 1 tiếng (muốn nhanh thì bỏ ngăn đá 20 phút).\n" +
                "\n" +
                "-Cho hỗn hợp làm kem vào túi bắt bông kem, bơm hỗn hợp kem vào máy đã vận hành (để tránh kem bị đông ngay khi gặp bow làm lạnh) khoảng 30 phút là đc (kem sẽ tăng thể tích lên). Máy làm kem chỉ có tác dụng làm lạnh kem trong lúc trộn (với tốc độ rất từ từ). Nên nếu không có máy làm kem có thể bỏ hỗn hợp vào ngăn đá khoảng 1 tiếng rồi bỏ ra trộn tay (làm khoảng 3,4 lần), hoặc dùng bowl inox cho vào ngăn đá 8 tiếng rồi bỏ vào chậu đá, cho hỗn hợp làm kem vào trộn bằng tay/máy đánh trứng cầm tay.");
        stringArrayList19.add("Kem chuối bọc chocolate");
        chebien19.add("Nguyên liệu:\n" +
                "+ Chuối chín (mua được chuối ngự quả nhỏ là ngon nhất )\n" +
                "+ Sô cô la thỏi\n" +
                "+ Hạt điều vụn hoặc lạc rang chín rồi giã vụn (cũng có thể dùng các loại hạt khác như hạt óc chó, hạt hồ đào…)\n" +
                "+ Que xiên\n" +
                "Cách làm:\n" +
                "– Chuối bóc vỏ từng quả\n" +
                "– Dùng que xiên theo chiều dọc quả chuối\n" +
                "– Cho chuối vào ngăn đá tủ lạnh để quả chuối cứng lại như kem\n" +
                "– Đun chảy sô cô la rồi bỏ chuối từ tủ lạnh ra, nhúng từng que một vào sô cô la sao cho sô cô la bám đều xung quanh, sau đó lăn que kem vào đĩa đựng hạt điều vụn.\n" +
                "– Sô cô la nóng gặp kem chuối lạnh sẽ nhanh chóng bị đông lại tạo thành một lớp phủ cứng bên ngoài.\n" +
                "– Cho kem của bạn trở lại ngăn đá tủ lạnh một lát là có thể bỏ ra măm măm được rồi. Hãy làm nhiều một chút vì món này có thể bảo quản được lâu, mỗi lúc thèm chỉ cần mở tủ ra là có kem ngon thưởng thức. Cái vị ngọt của chuối, vị đắng của sô cô la và vị bùi bùi của hạt điều kết hợp với nhau rất là hợp đấy nhé!");
        stringArrayList19.add("Kem chuối que");
        chebien19.add("Nguyên liệu làm kem chuối que:\n" +
                "\n" +
                "– Chuẩn bị khoảng 8-10 quả chuối sứ lớn chín rục\n" +
                "– 50 gr đường cát trắng\n" +
                "– 1/2 kg dừa nạo\n" +
                "– 150 gr đậu phộng rang giã hơi nát\n" +
                "– Que tre hoặc que kem đã qua sử dụng\n" +
                "– Bột năng hoặc bột sắn\n" +
                "– Bao nilon\n" +
                "\n" +
                "Cách làm kem chuối que:\n" +
                "\n" +
                "Chuối bóc sạch vỏ, xiên que tre hoặc que kem vào giữa, sau đó đặt vào bên trong bao nilon.\n" +
                "– Dùng thớt hoặc 2 bề mặt phẳng ép dẹp chuối trong bao nilon.\n" +
                "3 cách làm kem chuối ngon tại nhà\n" +
                "\n" +
                "– Đun nhỏ lửa phần nước cốt dừa, sau đó hòa phần bột năng/ bột sắn với nước và đường cho vào nồi. Dùng đũa cái khuấy đều cho đến khi hỗn hợp sánh lại.\n" +
                "– Lấy phần dừa nạo và đậu phộng rang giã nhỏ đã chuẩn bị rắc lên bế mặt chuối, sau đó phết nước cốt hỗn hợp nước cốt dừa lên trên.\n" +
                "\n" +
                "– Cho tất cả các bịch chuối đã làm xong vào trong 1 hộp nhỏ và đậy nắp lại, đặt vào ngăn đá tủ lạnh.\n" +
                "– Chờ 5h và thưởng thức thành phẩm do chính tay mình làm.\n" +
                "Trên đây là cách làm kem chuối thơm ngon cho gia đình ngay chính ngôi nhà thân yêu của bạn. Làm tại nhà sẽ giúp bạn an tâm hơn trong vấn đề an toàn vệ sinh thực phẩm.");
        stringArrayList19.add("Kem que trái cây");
        chebien19.add("Nguyên liệu:\n" +
                "\n" +
                "– Phần kem dưa hấu: 1 bát lớn dưa hấu cắt nhỏ, bỏ hạt, 100ml sữa chua, 1-2 thìa canh sữa đặc\n" +
                "– Phần kem xoài: 1-2 quả xoài lớn, 50ml sữa chua, 30ml sữa tươi, 1-2 thìa canh sữa đặc\n" +
                "– Phần kem dâu tây: 1 bát lớn dâu tây cắt nhỏ, 50ml sữa chua, 30ml sữa tươi, 1-2 thìa canh sữa đặc\n" +
                "– Khuôn làm kem\n" +
                "– Bạn có thể điều chỉnh lượng liều lượng trái cây và nguyên liệu tùy theo độ chua, ngọt của trái cây.\n" +
                "\n" +
                "Cách làm:\n" +
                "\n" +
                "Bước 1:\n" +
                "– Dưa hấu bỏ lớp vỏ cứng, xoài gọt vỏ, dâu tây dưa sạch, cắt miếng nhỏ.\n" +
                "\n" +
                "Bước 2:\n" +
                "– Cho dưa hấu, sữa chua, sữa đặc vào máy sinh tố, xay nhuyễn. Vì dưa hấu khi xay sẽ ra nhiều nước nên bạn không cần phải thêm sữa tươi.\n" +
                "\n" +
                "Bước 3:\n" +
                "– Rửa sạch khuôn làm kem, đổ hỗn hợp phần dưa hấu đã xay ở bước 2 vào 1/3 khuôn.\n" +
                "\n" +
                "Bước 4:\n" +
                "– Bạn cho hỗn hợp xoài vào máy sinh tố, xay nhuyễn, đổ hỗn hợp xoài lên phía bên trên hỗn hợp dưa hấu.\n" +
                "\n" +
                "Bước 5:\n" +
                "– Bạn tiếp tục xay nhuyễn phần dâu tây và đổ đầy lên bề mặt khuôn.\n" +
                "\n" +
                "Bước 6:\n" +
                "– Đậy kín nắp khuôn, cho que kem vào tủ đông đá, để khoảng 8-10 tiếng đến khi phần kem đông cứng hẳn.\n" +
                "\n" +
                "Bước 7:\n" +
                "– Khi kem đã đông cứng hẳn, bạn nhúng que kem vào âu nước ấm rồi nhẹ nhàng tách lấy que kem ra, dùng lạnh.\n" +
                "\n");
        stringArrayList19.add("Kem dừa đậu hủ");
        chebien19.add("Nguyên liệu:\n" +
                "– 1 gói đậu hũ non (hoặc tào phớ)\n" +
                "– 625ml nước cốt dừa\n" +
                "– 300g đường cát\n" +
                "– Một nhúm muối\n" +
                "– 3ml vanilla\n" +
                "– 235g dừa nạo sấy\n" +
                "– Hoa quả tùy ý\n" +
                "– 1 quả chanh\n" +
                "– 60g đường nâu\n" +
                "\n" +
                "Cách làm:\n" +
                "Bước 1:\n" +
                "– Đầu tiên, bạn cho đậu hũ, nước cốt dừa, đường, muối, vanilla vào máy xay sinh tố rồi xay mịn.\n" +
                "\n" +
                "Bước 2:\n" +
                "– Thêm dừa nạo vào và xay thêm một lần nữa cho thật mịn.\n" +
                "\n" +
                "Bước 3:\n" +
                "– Cho kem ra khay đựng, rắc thêm một ít dừa nạo lên trên.\n" +
                "\n" +
                "Bước 4:\n" +
                "– Rửa sẵn hoa quả để ăn kèm. Bạn có thể ăn kem cùng với dâu tây, xoài, dứa hay bất kỳ loại nào bạn thích nhé!\n" +
                "\n" +
                "Bước 5:\n" +
                "– Cắt hoa quả thành từng khối nhỏ rồi trộn với đường nâu.\n" +
                "\n" +
                "Bước 6:\n" +
                "– Thêm nước cốt chanh và một ít vỏ chanh cho thơm.");

        anh19.add(R.drawable.monkem);
        anh19.add(R.drawable.monkem);
        anh19.add(R.drawable.monkem);
        anh19.add(R.drawable.monkem);
        anh19.add(R.drawable.monkem);
        anh19.add(R.drawable.monkem);
        anh19.add(R.drawable.monkem);
        anh19.add(R.drawable.monkem);
        anh19.add(R.drawable.monkem);
        anh19.add(R.drawable.monkem);
        anh19.add(R.drawable.monkem);
        anh19.add(R.drawable.monkem);
        anh19.add(R.drawable.monkem);
        anh19.add(R.drawable.monkem);
        anh19.add(R.drawable.monkem);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tieude:
                onBackPressed();
                break;
            case R.id.anvat:
                Intent intent = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent.putExtra("intarray",anh);
                intent.putExtra("stringarray",stringArrayList);
                intent.putExtra("chebien",chebien);
                intent.putExtra("string",av);
                startActivity(intent);
                break;
            case R.id.lau:
                Intent intent1 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent1.putExtra("intarray",anh1);
                intent1.putExtra("stringarray",stringArrayList1);
                intent1.putExtra("string",lau);
                intent1.putExtra("chebien",chebien1);
                startActivity(intent1);
                break;
            case R.id.hap:
                Intent intent2 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent2.putExtra("intarray",anh2);
                intent2.putExtra("stringarray",stringArrayList2);
                intent2.putExtra("chebien",chebien2);
                intent2.putExtra("string",hap);
                startActivity(intent2);
                break;
            case R.id.nuong:
                Intent intent3 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent3.putExtra("intarray",anh3);
                intent3.putExtra("chebien",chebien3);
                intent3.putExtra("stringarray",stringArrayList3);
                intent3.putExtra("string",nuong);
                startActivity(intent3);
                break;
            case R.id.nhau:
                Intent intent4 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent4.putExtra("intarray",anh4);
                intent4.putExtra("chebien",chebien4);
                intent4.putExtra("stringarray",stringArrayList4);
                intent4.putExtra("string",nhau);
                startActivity(intent4);
                break;
            case R.id.thit:
                Intent intent5 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent5.putExtra("intarray",anh5);
                intent5.putExtra("chebien",chebien5);
                intent5.putExtra("stringarray",stringArrayList5);
                intent5.putExtra("string",thit);
                startActivity(intent5);
                break;
            case R.id.chien:
                Intent intent6 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent6.putExtra("intarray",anh6);
                 intent6.putExtra("chebien",chebien6);
                intent6.putExtra("stringarray",stringArrayList6);
                intent6.putExtra("string",chien);
                startActivity(intent6);
                break;
            case R.id.luot:
                Intent intent7 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent7.putExtra("intarray",anh7);
                 intent7.putExtra("chebien",chebien7);
                intent7.putExtra("stringarray",stringArrayList7);
                intent7.putExtra("string",luot);
                startActivity(intent7);
                break;
            case R.id.chay:
               Intent intent8 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent8.putExtra("intarray",anh8);
                intent8.putExtra("chebien",chebien8);
                intent8.putExtra("stringarray",stringArrayList8);
                intent8.putExtra("string",chay);
                startActivity(intent8);
                break;
            case R.id.kho:
                Intent intent9 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent9.putExtra("intarray",anh9);
                intent9.putExtra("chebien",chebien9);
                intent9.putExtra("stringarray",stringArrayList9);
                intent9.putExtra("string",kho);
                startActivity(intent9);
                break;
            case R.id.xao:

                Intent intent10 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent10.putExtra("intarray",anh10);
                intent10.putExtra("chebien",chebien10);
                intent10.putExtra("stringarray",stringArrayList10);
                intent10.putExtra("string",xao);
                startActivity(intent10);
                break;
            case R.id.asang:
                Intent intent11 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent11.putExtra("intarray",anh11);
                intent11.putExtra("chebien",chebien11);
                intent11.putExtra("stringarray",stringArrayList11);
                intent11.putExtra("string",asang);
                startActivity(intent11);
                break;
            case R.id.canh:
                Intent intent12 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent12.putExtra("intarray",anh12);
                intent12.putExtra("chebien",chebien12);
                intent12.putExtra("stringarray",stringArrayList12);
                intent12.putExtra("string",canh);
                startActivity(intent12);
                break;
            case R.id.xoi:
                Intent intent13 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent13.putExtra("intarray",anh13);
                intent13.putExtra("chebien",chebien13);
                intent13.putExtra("stringarray",stringArrayList13);
                intent13.putExtra("string",xoi);
                startActivity(intent13);
                break;
            case R.id.ham:
                Intent intent14 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent14.putExtra("intarray",anh14);
                intent14.putExtra("chebien",chebien14);
                intent14.putExtra("stringarray",stringArrayList14);
                intent14.putExtra("string",ham);
                startActivity(intent14);
                break;
            case R.id.hsan:
                Intent intent15 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent15.putExtra("intarray",anh15);
                intent15.putExtra("chebien",chebien15);
                intent15.putExtra("stringarray",stringArrayList15);
                intent15.putExtra("string",hsan);
                startActivity(intent15);
                break;
            case R.id.ncham:
                Intent intent16 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent16.putExtra("intarray",anh16);
                intent16.putExtra("chebien",chebien16);
                intent16.putExtra("stringarray",stringArrayList16);
                intent16.putExtra("string",ncham);
                startActivity(intent16);
                break;
            case R.id.cung:
                Intent intent17 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent17.putExtra("intarray",anh17);
                intent17.putExtra("chebien",chebien17);
                intent17.putExtra("stringarray",stringArrayList17);
                intent17.putExtra("string",cung);
                startActivity(intent17);
                break;
            case R.id.uong :
                Intent intent18 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent18.putExtra("intarray",anh18);
                intent18.putExtra("chebien",chebien18);
                intent18.putExtra("stringarray",stringArrayList18);
                intent18.putExtra("string",uong);
                startActivity(intent18);
                break;
            case R.id.kem:
                Intent intent19 = new Intent(mon_an_ba_mien.this,mon_an.class);
                intent19.putExtra("intarray",anh19);
                intent19.putExtra("chebien",chebien19);
                intent19.putExtra("stringarray",stringArrayList19);
                intent19.putExtra("string",kem);
                startActivity(intent19);
                break;
        }
    }
    public void searching() {
        ArrayList<tong> tong = new ArrayList<tong>();
        ArrayList<Integer> anh20 = new ArrayList<Integer>();
        ArrayList<String> ten20 = new ArrayList<String>();
        ArrayList<String> chebien20 = new ArrayList<String>();
        String input = tim.getText().toString().toUpperCase();
        input = Normalizer.normalize(input,Normalizer.Form.NFD);
        input = input.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        for(int i = 0;i< stringArrayList.size();i++ ){
            String tam = stringArrayList.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList.get(i).toString(),chebien.get(i).toString(),anh.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList1.size();i++ ){
            String tam = stringArrayList1.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList1.get(i).toString(),chebien1.get(i).toString(),anh1.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList2.size();i++ ){
            String tam = stringArrayList2.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList2.get(i).toString(),chebien2.get(i).toString(),anh2.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList3.size();i++ ){
            String tam = stringArrayList3.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList3.get(i).toString(),chebien3.get(i).toString(),anh3.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList4.size();i++ ){
            String tam = stringArrayList4.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList4.get(i).toString(),chebien4.get(i).toString(),anh4.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList5.size();i++ ){
            String tam = stringArrayList5.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList5.get(i).toString(),chebien5.get(i).toString(),anh5.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList6.size();i++ ){
            String tam = stringArrayList6.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList6.get(i).toString(),chebien6.get(i).toString(),anh6.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList7.size();i++ ){
            String tam = stringArrayList7.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList7.get(i).toString(),chebien7.get(i).toString(),anh7.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList8.size();i++ ){
            String tam = stringArrayList8.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList8.get(i).toString(),chebien8.get(i).toString(),anh8.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList9.size();i++ ){
            String tam = stringArrayList9.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList9.get(i).toString(),chebien9.get(i).toString(),anh9.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList10.size();i++ ){
            String tam = stringArrayList10.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList10.get(i).toString(),chebien10.get(i).toString(),anh10.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList11.size();i++ ){
            String tam = stringArrayList11.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList11.get(i).toString(),chebien11.get(i).toString(),anh11.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList12.size();i++ ){
            String tam = stringArrayList12.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList12.get(i).toString(),chebien12.get(i).toString(),anh12.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList13.size();i++ ){
            String tam = stringArrayList13.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList13.get(i).toString(),chebien13.get(i).toString(),anh13.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList14.size();i++ ){
            String tam = stringArrayList14.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList14.get(i).toString(),chebien14.get(i).toString(),anh14.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList15.size();i++ ){
            String tam = stringArrayList15.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList15.get(i).toString(),chebien15.get(i).toString(),anh15.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList16.size();i++ ){
            String tam = stringArrayList16.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList16.get(i).toString(),chebien16.get(i).toString(),anh16.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList17.size();i++ ){
            String tam = stringArrayList17.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList17.get(i).toString(),chebien17.get(i).toString(),anh17.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList18.size();i++ ){
            String tam = stringArrayList18.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList18.get(i).toString(),chebien18.get(i).toString(),anh18.get(i)));
            }
        }
        for(int i = 0;i< stringArrayList19.size();i++ ){
            String tam = stringArrayList19.get(i).toString().toUpperCase();
            tam = Normalizer.normalize(tam,Normalizer.Form.NFD);
            tam = tam.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
            if(tam.contains(input)){
                tong.add(new tong(stringArrayList19.get(i).toString(),chebien19.get(i).toString(),anh19.get(i)));
            }
        }
        for(int j = 0;j<tong.size();j++){
            ten20.add(tong.get(j).getTen());
        }
        for(int j = 0;j<tong.size();j++){
            chebien20.add(tong.get(j).getChebien());
        }
        for(int j = 0;j<tong.size();j++){
            anh20.add(tong.get(j).getAnh());
        }
        if(tong.size()==0){
            Intent intent20 = new Intent(mon_an_ba_mien.this,mon_an.class);
            intent20.putExtra("intarray",anh20);
            intent20.putExtra("chebien",chebien20);
            intent20.putExtra("stringarray",ten20);
            intent20.putExtra("string","Không tìm thấy");
            startActivity(intent20);
        }
        else{
            Intent intent20 = new Intent(mon_an_ba_mien.this,mon_an.class);
            intent20.putExtra("intarray",anh20);
            intent20.putExtra("chebien",chebien20);
            intent20.putExtra("stringarray",ten20);
            intent20.putExtra("string","Kết quả tìm được");
            startActivity(intent20);
        }
    }
    public void btn_seacharray(View view){
        searching();
        tim.setText("");
    }
}