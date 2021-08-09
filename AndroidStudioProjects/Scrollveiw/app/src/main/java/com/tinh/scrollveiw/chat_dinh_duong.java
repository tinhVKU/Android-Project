package com.tinh.scrollveiw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class chat_dinh_duong extends AppCompatActivity implements View.OnClickListener {
    private TextView back,vitaminA,textB,textC,textD,textE,textPro,textCacbo,textbeo,textfe,textZn,textCa,textK,textXo;
    private LinearLayout btn_vitaminA,btn_vitaminB,btn_vitaminC,btn_vitaminD,btn_vitaminE,btn_protein,btn_cacbo;
    private LinearLayout btn_beo,btn_fe,btn_zn,btn_ca,btn_k,btn_xo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_dinh_duong);
        inview();
        Onclick();

    }
    public void inview(){
        back = findViewById(R.id.tieude);
        vitaminA = findViewById(R.id.vtmA);
        btn_vitaminA = findViewById(R.id.btn_vitaminA);
        textB = findViewById(R.id.textB);
        btn_vitaminB = findViewById(R.id.btn_vitaminB);
        textC = findViewById(R.id.textC);
        btn_vitaminC = findViewById(R.id.btn_vitaminC);
        textD = findViewById(R.id.textD);
        btn_vitaminD = findViewById(R.id.btn_vitaminD);
        textE = findViewById(R.id.textE);
        btn_vitaminE = findViewById(R.id.btn_vitaminE);
        textPro = findViewById(R.id.textPro);
        btn_protein = findViewById(R.id.btn_protein);
        textCacbo = findViewById(R.id.textCacbo);
        btn_cacbo = findViewById(R.id.btn_cacbo);
        textbeo = findViewById(R.id.textbeo);
        btn_beo = findViewById(R.id.btn_beo);
        textfe = findViewById(R.id.textfe);
        btn_fe = findViewById(R.id.btn_fe);
        textZn = findViewById(R.id.textzn);
        btn_zn = findViewById(R.id.btn_zn);
        textCa = findViewById(R.id.textca);
        btn_ca = findViewById(R.id.btn_ca);
        textK = findViewById(R.id.textk);
        btn_k  = findViewById(R.id.btn_k);
        textXo = findViewById(R.id.textxo);
        btn_xo = findViewById(R.id.btn_xo);
    }
    public void Onclick(){
        back.setOnClickListener(this);
        btn_vitaminA.setOnClickListener(this);
        btn_vitaminB.setOnClickListener(this);
        btn_vitaminC.setOnClickListener(this);
        btn_vitaminD.setOnClickListener(this);
        btn_vitaminE.setOnClickListener(this);
        btn_cacbo.setOnClickListener(this);
        btn_protein.setOnClickListener(this);
        btn_fe.setOnClickListener(this);
        btn_beo.setOnClickListener(this);
        btn_zn.setOnClickListener(this);
        btn_ca.setOnClickListener(this);
        btn_k.setOnClickListener(this);
        btn_xo.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tieude:
                onBackPressed();
                break;
            case R.id.btn_vitaminA:
                String a = vitaminA.getText().toString();
                String content = "- Các nguồn: \n" +
                        "\tVitamin A có nhiều ở gan, lòng đỏ trứng, bơ,dầu cá, sữa, pho mát, rau muống, rau ngót, rau cải xanh, bí đỏ, cà rốt, xoài.\n" +
                        "Liều lượng:\n" +
                        "\tNam: 900 microgam/ngay.\n" +
                        "\tNữ: 700 microgam/ngay.\n" +
                        "Lợi ích:\n" +
                        "\tVitamin A rất cần thiết cho sức khỏe, chúng có tác dụng hỗ trợ tăng trưởng tế bào, chức năng miễn dịch, sự phát triển thể chất và thị lực của thai nhi...\n";
                Intent intent = new Intent(chat_dinh_duong.this,vitamin.class);
                intent.putExtra("string",a);
                intent.putExtra("noidung",content);
                startActivity(intent);
                break;
            case R.id.btn_vitaminB:
                String b = textB.getText().toString();
                String content1 = "-Các nguồn:\n" +
                        "Cá ngừ, cá hồi, ngũ cốc nguyên hạt, gan bò, thịt bò xay, ức gà, dưa hấu, khoai tây, rau   bina.\n" +
                        "-Liều lượng:\n" +
                        "+Đối với phụ nữ, lượng khuyến cáo hàng ngày là:\n" +
                        "•\tB-1: 1,1 miligam (mg)\n" +
                        "•\tB-2: 1,1 mg\n" +
                        "•\tB-3: 14 mg\n" +
                        "•\tB-5: 5 mg\n" +
                        "•\tB-6: 1,3 mg\n" +
                        "•\tB-7: 30 microgam (mcg)\n" +
                        "•\tB-9: 400 mcg\n" +
                        "•\tB-12: 2,4 mcg\n" +
                        "+Đối với nam giới, lượng khuyến cáo hàng ngày là:\n" +
                        "•\tB-1: 1,2 mg\n" +
                        "•\tB-2: 1,3 mg\n" +
                        "•\tB-3: 16 mg\n" +
                        "•\tB-5: 5 mg\n" +
                        "•\tB-6: 1,3 mg\n" +
                        "•\tB-7: 30 mcg\n" +
                        "•\tB-9c: 400 mcg\n" +
                        "•\tB-12: 2,4 mcg\n" +
                        "\n" +
                        "-Lợi ích:\n" +
                        "Vitamin B đóng một vai trò quan trọng trong việc duy trì sức khỏe và tinh thần. Có tác động trực tiếp đến mức năng lượng, chức năng não và chuyển hóa tế bào...\n" +
                        "   +Đối với phụ nữ\n" +
                        "Vitamin B đặc biệt quan trọng đối với phụ nữ đang mang thai và cho con bú. Những vitamin này hỗ trợ sự phát triển não bộ của thai nhi cũng như giảm nguy cơ dị tật bẩm sinh.\n" +
                        "    +Đối với nam giới\n" +
                        "Vitamin B được cho là làm tăng nồng độ testosterone ở nam giới tự nhiên giảm theo tuổi tác. Ngoài ra, cũng có thể giúp đàn ông xây dựng khối cơ bắp và tăng sức mạnh.\n";
                Intent intent1 = new Intent(chat_dinh_duong.this,vitamin.class);
                intent1.putExtra("string",b);
                intent1.putExtra("noidung",content1);
                startActivity(intent1);
                break;
            case R.id.btn_vitaminC:
                String c = textC.getText().toString();
                String content2 = "Các nguồn:\n" +
                        "Có nhiều trong các loại rau quả tươi cùi trắng như cam, chanh, quýt và có hàm lượng cao trong rau xanh, đặc biệt là bông cải xanh, tiêu, khoai tây, cải brussel,rau cải, cà chua, xoong cam, quýt, chanh, bưởi…\n" +
                        "Lợi ích:\n" +
                        "Tác dụng cho có lợi cho xương, răng, da, sắt. Phòng và chữa bệnh scorbut, các chứng chảy máu do thiếu vitamin C, tăng sức đề kháng trong nhiễm khuẩn, nhiễm độc, mệt mỏi, thai nghén, thiếu máu, dị ứng, người nghiện thuốc nghiện rượu…\n" +
                        "Liều dùng:\n" +
                        "•\tTrẻ từ 1 – 3 tuổi: 15mg\n" +
                        "•\tTrẻ từ 4 – 8 tuổi: 25mg\n" +
                        "•\tTrẻ từ 9 – 13 tuổi: 45mg\n" +
                        "•\tTrẻ vị thành niên 14 – 18 tuổi: 75mg (với nam) và 65mg (với nữ)\n" +
                        "•\tNgười lớn trên 19 tuổi: 90mg (với nam) và 75mg (với nữ)\n";
                Intent intent2 = new Intent(chat_dinh_duong.this,vitamin.class);
                intent2.putExtra("string",c);
                intent2.putExtra("noidung",content2);
                startActivity(intent2);
                break;
            case R.id.btn_vitaminD:
                String d = textD.getText().toString();
                String content3 = "Các nguồn:\n" +
                        "Ngũ cốc bổ sung và các loại cá béo như cá hồi, cá thu và cá mòi.\n" +
                        "Lợi ích:\n" +
                        "\tXây dựng và duy trì chắc khỏe xương, và phát triễn hệ miễn dịch.\n" +
                        "Liều lượng:\n" +
                        "\tNam: 15 mcg/ngày\n" +
                        "\tNữ: 15mcg/ngày\n";
                Intent intent3 = new Intent(chat_dinh_duong.this,vitamin.class);
                intent3.putExtra("string",d);
                intent3.putExtra("noidung",content3);
                startActivity(intent3);
                break;
            case R.id.btn_vitaminE:
                String e = textE.getText().toString();
                String content4 = "Các nguồn:\n" +
                        "Các loại dầu thực vật như cọ dầu, hướng dương, ngô, đậu tương, ô liu. Các loại quả kiên, hạt hướng dương, quả nhót gai (Hippophae spp.), dương đào (Actinidia spp.) và mầm lúa mì cũng là các nguồn cung cấp vitamin E.\n" +
                        "Lợi ích:\n" +
                        "Vitamin E là chất dinh dưỡng quan trọng đối với thị lực, sinh sản và sức khỏe của máu, não, làn da và vitamin E cũng có đặc tính chống oxy hóa nên có thể bảo vệ các tế bào của bạn chống lại tác động của các gốc tự do.\n" +
                        "\n" +
                        "Liều lượng:\n" +
                        "\tNgười trưởng thành: 15mg/ngày\n";
                Intent intent4 = new Intent(chat_dinh_duong.this,vitamin.class);
                intent4.putExtra("string",e);
                intent4.putExtra("noidung",content4);
                startActivity(intent4);
                break;
            case R.id.btn_protein:
                String f1 = textPro.getText().toString();
                String content5 = "Các nguồn:\n" +
                        ", cá, sữa và các sản phẩm từ sữa, quả bơ, các loại hạt, ngũ cốc, đậu nành...\n" +
                        "Lợi ích:\n" +
                        " cơ bắp khỏe mạnh và cân bằng với các thành phần dinh dưỡng khác.\n" +
                        "Liều lượng:\n" +
                        "\t0.75 gram cho phụ nữ trưởng thành\n" +
                        "\t0.84 gram cho nam giới trưởng thành\n" +
                        "\tXấp xỉ 1 gram cho phụ nữ mang thai và cho con bú hoặc người già trên 70 tuổi.\n";
                Intent intent5 = new Intent(chat_dinh_duong.this,vitamin.class);
                intent5.putExtra("string",f1);
                intent5.putExtra("noidung",content5);
                startActivity(intent5);
                break;
            case R.id.btn_cacbo:
                String f2 = textCacbo.getText().toString();
                String content6 = "Các nguồn:\n" +
                        "Carbohydrate bao gồm hàm lượng đường, tinh bột, chất xơ có trong trái cây, ngũ cốc, rau và các sản phẩm, chế phẩm từ sữa.\n" +
                        "Lợi ích:\n" +
                        "Carbohydrate cung cấp nhiên liệu cho hệ thần kinh trung ương, năng lượng cho cơ bắp làm việc. Bên cạnh đó, chúng cũng ngăn chặn protein được sử dụng tạo nên năng lượng, đồng thời carb còn cho phép các chất béo được chuyển hóa.\n" +
                        "Ngoài ra, carb đóng vai trò rất quan trọng đối với các chức năng của não. Do đó việc thiếu hụt hay dư thừa carb có khả năng ảnh hưởng đến trí nhớ, tâm trạng, cảm xúc.\n" +
                        "Liều lượng:\n" +
                        "\tDuy trì cân nặng: 100 -> 150 gam carbs mỗi ngày\n" +
                        "\tCho người giảm cân: 50 -> 100 gam carbs mỗi ngày\n" +
                        "\tCho người giảm cân nhanh 20 -> 50 carbs mỗi ngày\n";
                Intent intent6 = new Intent(chat_dinh_duong.this,vitamin.class);
                intent6.putExtra("string",f2);
                intent6.putExtra("noidung",content6);
                startActivity(intent6);
                break;
            case R.id.btn_beo:
                String f3 = textbeo.getText().toString();
                String content7 = "Nguồn cung cấp: \n" +
                        "Các loại dầu, mỡ, bơ, trong thành phần của thịt, sữa, trứng, các loại hạt có dầu. Phòng và điều trị cholesterol máu cao nên có một chế độ ăn giảm chất béo động vật (bơ, mỡ), tăng dầu thực vật, bớt ăn thịt, tăng ăn cá và các chế phẩm đậu nành.\n" +
                        "Lợi ích:\n" +
                        "•\tCung cấp năng lượng, giúp hấp thu các vitamin tan trong dầu mỡ như vitamin A, D, E, K.\n" +
                        "•\tThành phần chính của màng tế bào và nhất là các tế bào thần kinh giúp sự phát triển các tế bào não và hệ thần kinh, là thành phần cấu tạo một số loại hormon ví dụ như testosterone, cortisol...\n" +
                        "•\tCó tác dụng cung cấp năng lượng.\n" +
                        "•\tChất béo cũng làm cho việc chế biến thực phẩm ngon và hấp dẫn hơn.\n" +
                        "Liều lượng:\n" +
                        "Lượng chất béo dung nạp vào cơ thể mỗi ngày phụ thuộc vào cơ địa và mục tiêu cân nặng của bạn.\n" +
                        "Việc tính lượng calo hằng ngày cũng có thể giúp bạn kiểm soát lượng chất béo cần thiết để cơ thể hoạt động tốt.\n" +
                        "Một chế độ ăn tiêu chuẩn thông thường, cơ thể cần khoảng tối đa 30% lượng calo từ chất chất béo.\n" +
                        "Dưới đây là cách tính mẫu lượng chất béo phù hợp với từng mục tiêu calo.\n" +
                        "•\t1500 calo/ngày: cần khoảng 50 gram chất béo.\n" +
                        "•\t2000 calo/ngày: cần khoảng 67 gram chất béo.\n" +
                        "•\t2500 calo/ngày: cần khoảng 82 gram chất béo.\n";
                Intent intent7 = new Intent(chat_dinh_duong.this,vitamin.class);
                intent7.putExtra("string",f3);
                intent7.putExtra("noidung",content7);
                startActivity(intent7);
                break;
            case R.id.btn_fe:
                String f4 = textfe.getText().toString();
                String content8 = "Các nguồn:\n" +
                        "\tThịt bò, đậu, trứng, ngũ cốc, thịt gia cầm....\n" +
                        "Lợi ích:\n" +
                        "•\tSắt có vai trò quan trọng để tạo hồng cầu\n" +
                        "•\tVận chuyển oxy và CO2 trong quá trình hô hấp (Hb)\n" +
                        "•\tDự trữ oxy cho cơ (myoglobin)\n" +
                        "•\tVận chuyển electron (cytochrom, mitochondrial dehydrogenase)\n" +
                        "•\tHô hấp tế bào (catalase, peroxydase)\n" +
                        "•\tTham gia vào thành phần của một  enzym trong hệ miễn dịch.\n" +
                        "•\tSắt còn là thành phần của một số men quan trọng\n" +
                        "•\tSắt có  vai trò quan trọng trong sự phát triển trí não ở trẻ.\n" +
                        "\n" +
                        "Liều lượng:\n" +
                        "\tNam: 12mg/ngày\n" +
                        "\tNữ: 18mg/ngày\n";
                Intent intent8 = new Intent(chat_dinh_duong.this,vitamin.class);
                intent8.putExtra("string",f4);
                intent8.putExtra("noidung",content8);
                startActivity(intent8);
                break;
            case R.id.btn_zn:
                String f5 = textZn.getText().toString();
                String content9 = "Các nguồn:\n" +
                        "Kẽm được tìm thấy tự nhiên trong nhiều loại thực phẩm và thực vật.\n" +
                        "Những sản phẩm thường không có chứa loại khoáng chất này, bao gồm ngũ cốc ăn sáng và thanh đồ ăn nhẹ, thường được bổ sung các dạng kẽm tổng hợp.\n" +
                        "Lợi ích:\n" +
                        "\tTăng cường hệ miễn dịch\n" +
                        "\tTăng tốc độ hồi phục vết thương\n" +
                        "\tGiảm tình trạng của các triệu chứng trong quá trình lão hóa\n" +
                        "\tCải thiện mụn trứng cá\n" +
                        "\tKháng viêm\n" +
                        "Liều lượng:\n" +
                        "\tNam: 11mg/ngày\n" +
                        "\tNữ: 8mg/ngày\n";
                Intent intent9 = new Intent(chat_dinh_duong.this,vitamin.class);
                intent9.putExtra("string",f5);
                intent9.putExtra("noidung",content9);
                startActivity(intent9);
                break;
            case R.id.btn_k:
                String f6 = textK.getText().toString();
                String content10 = "Các nguồn:\n" +
                        "\tTrái cây và rau củ quả,  sản phẩm từ sữa,  một số loại cá, các loại đậu hạt....\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Lợi ích:\n" +
                        "Giúp tinh thần luôn khỏe mạnh, sảng khoái và có thể ngăn ngừa một số bệnh mạn tính. Trong đó nổi bật là chức năng hỗ trợ điều hòa huyết áp ổn định\n" +
                        "\t\n" +
                        "Liều lượng:\n" +
                        "\tNgười bình thường là 4.700 miligam (mg) kali\n";
                Intent intent10 = new Intent(chat_dinh_duong.this,vitamin.class);
                intent10.putExtra("string",f6);
                intent10.putExtra("noidung",content10);
                startActivity(intent10);
                break;
            case R.id.btn_ca:
                String f7 = textCa.getText().toString();
                String content11 = "Các nguồn:\n" +
                        "\tPhô mai, sữa, đậu nành, cam, củ cải xanh, hạnh nhân \n" +
                        "Liều lượng:\n" +
                        "Nam: 1000mg/ngay.\n" +
                        "Nữ: 1200mg/ngay.\n" +
                        "Lợi ích:\n" +
                        "Nhu cầu thiết yếu cho sự phát triễn của xương. Canxi còn cần cho quá trình hoạt động của thần kinh cơ, hoạt động của tim, chuyển hóa của tế bào và quá trình đông máu.\n";
                Intent intent11 = new Intent(chat_dinh_duong.this,vitamin.class);
                intent11.putExtra("string",f7);
                intent11.putExtra("noidung",content11);
                startActivity(intent11);
                break;
            case R.id.btn_xo:
                String f8 = textXo.getText().toString();
                String content12 = "Các nguồn:\n" +
                        "\tYến mạch, trái cây khô, đậu, hạt ngũ cốc, rau....\n" +
                        "Lợi ích:\n" +
                        "Giúp ngăn ngừa các bệnh mạn tính như tiểu đường, bệnh tim và một số loại ung thư. Nghiên cứu cũng cho thấy rằng tiêu thụ thực phẩm giàu chất xơ có thể thúc đẩy giảm cân vì nó giúp bạn cảm thấy no hơn sau khi ăn nên bạn không ăn vặt nhiều.\n" +
                        "Ăn nhiều chất xơ không chỉ tốt cho sức khỏe tim mạch, nghiên cứu cho thấy nó có thể làm giảm nguy cơ mắc bệnh tiểu đường týp 2. Khi bổ sung chất xơ vào chế độ ăn kiêng, cơ thể sẽ hấp thu nhanh vì đường bị phá vỡ nhanh hơn giúp kiểm soát tốt hơn lượng đường trong máu.\n" +
                        "Liều lượng:\n" +
                        "\tNam: 30gam/ngày\n" +
                        "\tNữ: 21 gam/ngày\n" +
                        "\n";
                Intent intent12 = new Intent(chat_dinh_duong.this,vitamin.class);
                intent12.putExtra("string",f8);
                intent12.putExtra("noidung",content12);
                startActivity(intent12);
                break;
        }
    }
}