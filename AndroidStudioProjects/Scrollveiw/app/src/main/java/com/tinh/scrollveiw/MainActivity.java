package com.tinh.scrollveiw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout btn_cdd,btn_3mien,btn_sk,btn_at,meovat,btn_mbac,btn_mtrung,btn_mnam;
    ArrayList<String> stringArrayList5 = new ArrayList<>();
    ArrayList<Integer> anh5 = new ArrayList<Integer>();
    ArrayList<String> chebien5 = new ArrayList<>();

    ArrayList<String> stringArrayList6 = new ArrayList<>();
    ArrayList<Integer> anh6 = new ArrayList<Integer>();
    ArrayList<String> chebien6 = new ArrayList<>();

    ArrayList<String> stringArrayList7 = new ArrayList<>();
    ArrayList<Integer> anh7 = new ArrayList<Integer>();
    ArrayList<String> chebien7 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inView();
        Onclick();
        dsmbac();
        dsmtrung();
        dsmnam();

    }
    public void inView(){
        btn_cdd = findViewById(R.id.cdd);
        btn_3mien = findViewById(R.id.bamien);
        btn_sk = findViewById(R.id.amthuc_sukhoe);
        btn_at = findViewById(R.id.antoan);
        meovat = findViewById(R.id.meovat);
        btn_mbac = findViewById(R.id.mbac);
        btn_mtrung = findViewById(R.id.mtrung);
        btn_mnam = findViewById(R.id.mnam);
    }
    public void Onclick(){
        btn_cdd.setOnClickListener(this);
        btn_3mien.setOnClickListener(this);
        btn_sk.setOnClickListener(this);
        btn_at.setOnClickListener(this);
        meovat.setOnClickListener(this);
        btn_mbac.setOnClickListener(this);
        btn_mtrung.setOnClickListener(this);
        btn_mnam.setOnClickListener(this);
    }
    public void dsmbac(){
        chebien5.add("* Nguyên liệu:\n" +
                "Thịt lợn mán (Chọn phần thịt vai hoặc thịt đùi) - 500gr\n" +
                "Gừng - 1 nhánh\n" +
                "Sả - 2 cây\n" +
                "Vừng trắng rang vàng - 3 thìa\n" +
                "Dầu vừng - 1 thìa\n" +
                "Chanh - 1/2 quả\n" +
                "Đường - 1 thìa\n" +
                "Bột canh - 1 thìa\n" +
                "Chuối xanh - 1 quả\n" +
                "Khế chua - 1 quả\n" +
                "Ớt - Tuỳ thích\n" +
                "Giấm - 2 thìa\n" +
                "Muối - 1 thìa\n" +
                "Hướng dẫn:\n" +
                "Các bước làm món thịt lợn mán tái chanh:\n" +
                "Gừng và 2 củ sả đập dập chia thành 2 phần, 1 củ sả còn lại băm nhỏ.\n" +
                "Chuối xanh lột vỏ, cắt lát mỏng, ngâm vào nước pha muối và giấm cho đỡ bị thâm rồi để ráo. Khế chua rửa sạch, cắt lát. Vừng rang vàng.\n" +
                "Thịt lợn rửa sạch, dùng dao cao sạch phần bì. Đun sôi nước, thả một phần gừng, sả vào rồi cho thịt vào trần trong khoảng 2-3 phút để loại bỏ các chất bẩn và mùi hôi của thịt, sau đó rửa sạch lại với nước.\n" +
                "Hấp thịt với chỗ gừng và sả còn lại cho tới khi chín (mất khoảng 10-15 phút sau khi nước sôi, các bạn dùng đũa châm không thấy nước đỏ chảy ra là thịt chín). Gắp thịt ra thả vào bát nước đá ngay cho thịt trắng và mềm.\n" +
                "Dùng dao sắc thái thịt lợn mán đã luộc thật mỏng, cho vào tô.\n" +
                "Vắt nửa quả chanh vào tô, thêm đường, muối, dầu vừng, 1/2 chỗ vừng rang, ớt thái nhỏ vào, dùng găng tay trộn đều. Sau khi trộn xong các bạn có thể nêm nếm lại gia vị cho vừa miệng rồi xếp thịt ra đĩa, rắc chỗ vừng còn lại lên trên là ta đã làm xong món thịt lợn mán tái chanh. Các bạn ăn thịt lợn mán tái chanh cùng với khế chua và chuối xanh không thôi cũng ngon, nếu thích, các bạn có thể chấm tương gừng ăn cũng siêu hợp vị nhé.");
        chebien5.add("* Nguyên liệu:\n" +
                "Thịt vịt: ½ con -\n" +
                "Khoai sọ: 500gr -\n" +
                "Nước dừa: 1 quả -\n" +
                "Rau rút: 1 mớ -\n" +
                "Hành, sả, gừng, mùi, hành hoa, hạt tiêu. \n" +
                "Hướng dẫn:\n" +
                "Bước 1: Dùng rượu và muối rửa vịt để bớt hôi sau đó rửa lại cho sạch, chặt miếng vừa ăn. Ướp thịt vịt với ½ hành, gừng băm nhỏ, một ít hạt tiêu, sả đập dập cắt khúc cùng 1 thìa bột nêm, 1 thìa bột canh.\n" +
                "Bước 2: Phi thơm hành băm với chút xíu dầu ăn, cho thịt vịt vào xào qua. Đổ nước dừa vào nồi thịt vịt, đậy vung hầm lửa vừa cho đến khi thịt chín mềm.\n" +
                "Bước 3: Khoai sọ gọt bỏ vỏ, bổ miếng vừa ăn, ngâm vào bát nước cho khỏi thâm sau đó chiên sơ.\n" +
                "Bước 4: Rồi cho khoai sọ vào nồi canh vịt hầm thêm 3-4 phút hay khi thấy khoai mềm là được.\n" +
                "Bước 5: Rau rút nhặt rửa sạch thái vát.\n" +
                "Bước 6: Thịt vịt hầm khoai sọ chín bạn thả rau rút cùng hành hoa cắt khúc, đợi sôi lại rồi cho ra bát.");
        chebien5.add("* Nguyên liệu làm thịt lợn muối chua:\n" +
                "Thịt ba chỉ: 500gr\n" +
                "Thính gạo: 150gr\n" +
                "Lá ổi: 100gr\n" +
                "Gia vị : Muối, mì chính, tiêu, đường, tỏi, ớt\n" +
                "Lá sung, lá mơ, lá lốt, lá đinh lăng, rau mùi\n" +
                "Cách làm thịt lợn muối chua:\n" +
                "\n" +
                "Bước 1: Làm thính gạo\n" +
                " Nếu các bạn không muốn mua thính gạo mà muốn tự làm để đảm bảo thì có thể làm theo công thức: rang gạo; đậu xanh và ngô thật vàng sau đó nghiền nhỏ, mịn.\n" +
                "Lưu ý: Để món thịt lợn muối chua thành công thì thính gạo phải đảm bảo chín kĩ, thơm, vàng và không bị cháy.\n" +
                "\n" +
                "Bước 2: Sơ chế nguyên liệu làm thịt chua\n" +
                "Các loại rau thơm, lá ổi đem ngâm nước muối loãng rồi rửa sạch bằng nước lạnh và để ráo.\n" +
                "Thịt lợn rửa thật sạch, đem nướng tái vừa phải sau đó thái mỏng; to hay nhỏ tùy vào sở thích nhưng để dễ ăn và đẹp mắt thì bạn nên thái sợi mỏng.\n" +
                "\n" +
                "Bước 3: Tẩm ướp gia vị và trộn thính, đóng hộp \n" +
                "Tẩm ướp thịt với một chút muối (Tùy vào khẩu vị); rắc thính gạo lên trên rồi trộn thật đều sao cho thính bám đều, phủ kín bề mặt miếng thịt.\n" +
                "Chọn dụng cụ để đựng và ủ thịt, tránh sử dụng túi nilon vì thịt có thể bị mốc khi lên men. Nếu bạn có ống tre, ống nữa để đựng thịt là tốt nhất; nếu không có thể sử dụng một cái lọ nhựa sạch.\n" +
                "Đặt lá ổi xuống dưới dụng cụ chứa đựng thành hai lớp; cho thịt vào trong, ấn thật chặt và phủ tiếp một lớp lá ổi lên trên.\n" +
                "thịt chua phú thọ\n" +
                "\n" +
                "Bước 4: Ủ cho thịt lên men tự nhiên\n" +
                " Sau khi hoàn thành để sản phẩm ở nơi khô ráo. Nếu vào mùa hè, thời tiết oi bức chỉ cần để 3 đến 4 ngày là đảm bảo thịt đã lên men và sử dụng được. Bạn không nên để quá lâu vì khi đó thịt sẽ chua và mất đi vị thơm ngon, đậm đà. Với thời tiết se lạnh mùa đông; thời gian ủ thịt sẽ là từ 5 đến 7 ngày để đảm bảo cho thịt đủ độ chín.");
        chebien5.add("* Nguyên liệu\n" +
                "500gr đuôi bò\n" +
                "500gr sườn bò\n" +
                "500gr bắp bò\n" +
                "Thịt bò tái\n" +
                "1/4 củ hành tây to\n" +
                "1 củ gừng\n" +
                "5 – 6 củ hành khô\n" +
                "1 thìa café hạt mùi già\n" +
                "5-6 rễ cây mùi\n" +
                "1 quả thảo quả\n" +
                "2 quả hoa hồi\n" +
                "1 thanh quế nhỏ\n" +
                "Mía: 2 lóng\n" +
                "Bánh phở\n" +
                "Một số nguyên liệu khác: mùi thái nhó, hành, chanh, tương ớt.\n" +
                "Cách làm phở Hà Nội\n" +
                "Sơ chế nguyên liệu\n" +
                "Sườn và đuôi bò mang đi rửa sạch, chặt miếng nhỏ vừa ăn. Tiếp theo, pha nước muối loãng rồi ngâm đuôi, sườn cùng thịt bò vào khoảng 2 tiếng để thịt sạch và mềm hơn.\n" +
                "\n" +
                "Nướng hành khô, gừng, mía cùng hành tây trên lửa vừa cho chín thơm. Sau đó, cạo vỏ hành và gừng, rửa các nguyên liệu cho thật sạch rồi đập dập gừng, bổ hành tây làm đôi hoặc làm tư.\n" +
                "\n" +
                "Rang thảo quả, hoa hồi, quế và hạt mùi đến khi dậy mùi thơm, cho vào một túi vải sạch, buột chặt miệng túi.\n" +
                "\n" +
                "Mùi, rễ mùi và hành cũng rửa sạch, thái khúc nhỏ đối với hành xanh, thái nhỏ mùi.\n" +
                "\n" +
                "Cách nấu phở bò Hà Nội ngon\n" +
                "Đổ hết nước ngâm thịt bò đi rồi cho sườn, đuôi và thịt vào nồi. Đổ nước ngập thịt, bật lửa lớn để đun sôi.\n" +
                "\n" +
                "Hạ lửa nhỏ xuống khi nước sôi, đun khoảng 2 phút, bỏ bớt nước luộc và rửa sạch bọt bẩn cũng như vụn thịt.\n" +
                "\n" +
                "Tiếp tục cho sườn, đuôi và thịt bò vào nồi cùng với 5 bát nước to, đun sôi và hớt bọt. Cho thêm túi đựng các loại hương liệu đã chuẩn bị, hành hương, gừng, mía và rễ mùi vào nồi nước hầm, nêm một chút muối hoặc hạt nêm vào.\n" +
                "\n" +
                "Hầm trong khoảng 2 giờ đồng hồ trên lửa nhỏ. Khi bắp bò chín, vớt ra ngâm trong nước đun sôi để nguội rồi thái thành lát mỏng.\n" +
                "\n" +
                "Đợi sườn và đuôi bò mềm, nêm nếm gia vị cho vừa với khẩu vị của bạn. Lưu ý: Nên nêm nhạt một chút để khi ăn cho thêm nước mắm thì sẽ ngon hơn.");
        chebien5.add("* Nguyên Liệu Làm Chả Cá Lã Vọng\n" +
                "1kg phi lê cá lăng\n" +
                "1 củ riềng non\n" +
                "1 củ nghệ\n" +
                "100gr đậu phộng\n" +
                "Rau thì là, hành lá, hành tím, sả, gừng, húng láng\n" +
                "Gia vị: bột ngọt, mắm tôm, đường, nước cốt chanh, mẻ, rượu trắng, dầu tỏi, dầu ăn (hoặc mỡ nước).\n" +
                "Cách Làm Chả Cá Lã Vọng\n" +
                "Sơ Chế Nguyên Liệu\n" +
                "Cá mua về làm sạch ruột, rửa sơ qua rồi tiến hành phi lê cá. Cá sau khi phi lê, rửa qua với nước rồi thấm khô, cắt cá thành từng miếng hình chữ nhật, dày khoảng 1,5cm. Sau đó khử mùi tanh của cá bằng cách ngâm trong rượu trắng hòa với vài lát gừng thái mỏng.\n" +
                "Húng láng, hành lá, sả và rau thì là nhặt rửa sạch, để ráo nước. Hành tím bóc vỏ, rửa sạch. Thái nhỏ hành tím, sả và rau thì là.\n" +
                "Rang đậu phộng chín, xát bỏ vỏ, để nguyên hạt. Củ riềng rửa sạch, băm nhuyễn. Nghệ rửa sạch, xay nhuyễn và vắt bỏ phần xác để lấy nước cốt.\n" +
                "\n" +
                "Ướp Cá\n" +
                "Ướp cá với hỗn hợp gồm 1/3 muỗng muối, 1/3 muỗng tiêu, 2 muỗng bột ngọt, 3 muỗng riềng băm, 3 muỗng mắm tôm, 2 muỗng thì là băm, 2 muỗng hành tím băm, 1 muỗng sả băm, 2 muỗng mẻ, sau cùng cho 3 muỗng nước cốt nghệ vào rồi trộn đều.\n" +
                "Lượng mắm tôm dùng để ướp cá bạn có thể điều chỉnh cho nhạt đi một chút vì chỉ cần một lượng đủ để món ăn dậy mùi thơm. Đặt cá đã ướp trong ngăn mát tủ lạnh khoảng 60 phút để nguyên liệu ngấm đều gia vị.\n" +
                "\n" +
                "Nướng Chả Cá\n" +
                "Kẹp cá vào vỉ, nướng cá trên bếp than là thơm ngon nhất. Trong quá trình nướng, các bạn nhớ phết dầu ăn hoặc mỡ nước lên cho miếng cá bóng đẹp và không bị khô. Nếu không có điều kiện nướng chả cá bằng bếp than thì bạn có thể dùng lò nướng thay thế. Nướng cá ở nhiệt độ 250 độ trong 15 phút, đến khi mặt cá hơi sém vàng là được.\n" +
                "\n" +
                "Chiên Chả Cá\n" +
                "Đặt chảo lên bếp, cho vào 2 muỗng dầu ăn hoặc mỡ nước, thả chả cá đã nướng vào và chiên vàng đều 2 mặt. Tiếp đến rắc hành, thì là, đảo nhẹ trong khoảng 30 giây cho rau chín, chả cá nóng lên rồi tắt bếp.\n" +
                "Làm Mắm Tôm Chấm Chả Cá Lã Vọng\n" +
                "Bạn pha 1 muỗng mắm tôm với ¼ muỗng bột ngọt, ½ muỗng đường, ½ muỗng tỏi băm, 1 muỗng nước cốt chanh, ½ muỗng dầu tỏi, khuấy đều cho sủi bọt lên.\n" +
                "Để có mắm tôm ngon mà không tanh, trước khi ăn bạn hòa vào bát mắm ½ muỗng rượu trắng rồi đem hấp cách thủy trong 5 phút.\n" +
                "\n" +
                "Trình Bày Và Thưởng Thức\n" +
                "Bày chả cá và rau ra đĩa, rắc thêm đậu phộng rang. Món chả cá Lã Vọng thường được ăn kèm với bún và mắm tôm, tạo nên sự kết hợp rất hài hòa và ngon miệng.");
        chebien5.add("* Nguyên Liệu Làm Cá Kho Làng Vũ Đại\n" +
                "1kg cá trắm đen\n" +
                "300g sườn non (chọn sườn có thêm một ít mỡ để món cá béo hơn)\n" +
                "100g riềng\n" +
                "4 củ hành khô\n" +
                "1 củ gừng\n" +
                "2 quả dừa xiêm\n" +
                "3 quả chanh\n" +
                "Gia vị bao gồm: nước mắm, hạt tiêu, ớt tươi\n" +
                "1 chiếc nồi đất\n" +
                "Cách Làm Cá Kho Làng Vũ Đại\n" +
                "Bước 1: Giã nát hành khô, gừng với 50g riềng. Lưu ý, bạn nên giữ lại lớp vỏ khô trong cùng của củ hành, chúng sẽ giúp cho món cá kho lên màu đẹp hơn.\n" +
                "\n" +
                "Bước 2: 50g riềng còn lại, bạn thái thành lát rồi xếp xuống đáy nồi đất.\n" +
                "\n" +
                "Bước 3: Tiếp theo, bạn là xếp sườn lên trên lớp riềng trong nồi.\n" +
                "\n" +
                "Bước 4: Về phần cá, bạn sơ chế kỹ, rửa thật sạch, lau khô rồi xếp vào nồi, trên lớp sườn và riềng. Lưu ý, bạn nên xếp phần đầu và đuôi cá vào trước rồi mới đến các khúc giữa.\n" +
                "\n" +
                "Bước 5: Rắc đều phần hành, riềng, gừng đã giã nát và nêm thêm nước mắm, hạt tiêu, ớt lên trên phần cá trong nồi.\n" +
                "\n" +
                "Bước 6: Đổ nước dừa vào nồi sao cho nhập cá là được.\n" +
                "\n" +
                "Bước 7: Kho cá ở lửa thật nhỏ trong khoảng 8 – 12 tiếng. Khi nước trong nồi cá sôi thì bạn đổ đều nước cốt chanh lên trên rồi đậy nắp và kho tiếp. Chú ý đổ thêm nước dừa vào nồi cá trong suốt quá trình kho cho đến khi còn 1 tiếng cuối cùng thì dừng.");
        chebien5.add("* 400gr giò sống\n" +
                "200gr nấm mèo ngâm với nước\n" +
                "500gr bún\n" +
                "500gr sườn heo\n" +
                "250gr chả chiên\n" +
                "80gr hành tím đã lột vỏ\n" +
                "1 củ cải đỏ, 1 củ cải trắng\n" +
                "Hành lá, ngò rí, rau muống bào, giá rửa sạch, để ráo\n" +
                "Các gia vị thông dụng: đường, hạt nêm, tiêu xay, muối\n" +
                "Cách làm bún mọc sườn heo\n" +
                "\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "Sườn heo ngâm nước muối, rửa sạch, chặt thành miếng vừa ăn.\n" +
                "Củ cải đỏ, củ cải trắng gọt vỏ, rửa sạch và cắt thành từng khúc ngắn dày khoảng 1cm.\n" +
                "Hành, ngò cắt nhỏ.\n" +
                "Chả chiên cắt khoanh tròn hoặc cắt lát xéo tùy thích.\n" +
                "\n" +
                "Bước 2: Hầm sườn heo\n" +
                "Cho 2 lít nước vào nồi và đặt lên bếp, hầm sườn heo với một ít muối và vài củ hành tím. Hầm ít nhất 1 giờ cho sườn tiết nước ngọt. Chú ý hớt bọt thường xuyên để nước lèo không bị đục, nhìn trong ngon.\n" +
                "\n" +
                "Bước 3: Viên giò sống\n" +
                "Nấm mèo cắt nhuyễn cho vào tô giò sống, thêm vào một ít hạt nêm, tiêu, đường và trộn đều. Sau đó lấy muỗng múc và vo thành viên, cho vào nồi nước lèo đang nấu.\n" +
                "\n" +
                "Bước 4: Thêm các nguyên liệu khác\n" +
                "Cho củ cải đỏ, củ cải trắng đã sơ chế ở bước 1 vào nồi nước lèo.\n" +
                "Nêm thêm các gia vị cho phù hợp với khẩu vị. Sau đó tắt bếp.\n" +
                "\n" +
                "Bước 5: Trình bày và thưởng thức\n" +
                "Cho bún vào tô, sau đó múc sườn heo, giò mọc, cà rốt cho lên trên, chan thêm nước lèo, rắc một ít hành, ngò cắt nhỏ và hạt tiêu xay. Cho thêm vào vài lát chả chiên, nặn tí chanh, ăn kèm với mắm tôm, đĩa rau sống đã chuẩn bị.");
        chebien5.add("* Nguyên liệu làm Bún đậu mắm tômCho 4 người\n" +
                " Đậu hũ chiên 10 miếng\n" +
                " Thịt ba chỉ 500 gr\n" +
                " Chả cốm 300 gr\n" +
                " Bún tươi 1 kg\n" +
                " Mắm tôm 1/2 chén\n" +
                " Ớt băm 1 muỗng cà phê\n" +
                " Nước cốt chanh 1 muỗng canh\n" +
                " Đường trắng 1 muỗng canh\n" +
                " Bột ngọt 1 muỗng cà phê\n" +
                " Dầu ăn 6 muỗng canh\n" +
                " Tía tô 100 gr\n" +
                " Rau thơm các loại 50 gr\n" +
                " Dưa leo 200 gr\n" +
                "Cách chế biến Bún đậu mắm tôm\n" +
                "1 Sơ chế nguyên liệu\n" +
                "Đậu hũ cắt thành từng miếng vuông chiên giòn.\n" +
                "Thịt ba chỉ rửa sạch, để ráo nước sau đó cho vào nồi cùng 1 lít nước, luộc chín. Tiếp theo, cắt mỏng thịt ba chỉ và xếp ra đĩa.\n" +
                "Thả từng miếng chả cốm vào chảo dầu chiên lên, lật đều 2 mặt cho đến khi chả cốm giòn.\n" +
                "2 Sơ chế rau\n" +
                "Dưa leo rửa sạch, gọt vỏ, thái miếng.\n" +
                "Tía tô, rau thơm các loại nhặt bỏ cành, lá già, giập úa sau đó rửa sạch, ngâm nước muối loãng khoảng 30 phút rồi vớt ra rổ, vẩy sạch nước. Bún lá cắt miếng vừa ăn.\n" +
                "3 Pha mắm tôm\n" +
                "Trộn 1 muỗng canh đường, 1 muỗng canh nước cốt chanh, 1 muỗng cà phê bột ngọt, 1 muỗng cà phê ớt băm vào mắm tôm, khuấy đều.\n" +
                "4 Thành phẩm\n" +
                "Dọn các nguyên liệu đậu hũ, thịt ba chỉ cắt lát, dưa leo, rau thơm lên đĩa hoặc mẹt, trang trí một chút cho món ăn thêm đẹp, hấp dẫn hơn.");
        chebien5.add("* Nguyên liệu nấu bún ốc Hà Nội\n" +
                "– Ôc nhồi (con vừa): 2 kg\n" +
                "\n" +
                "– Xương heo: 1 kg\n" +
                "\n" +
                "– Bún tươi (sợi nhỏ); 1 kg\n" +
                "\n" +
                "– Đậu hủ (đậu phụ): 3 miếng (bìa)\n" +
                "\n" +
                "– Cà chua chín: 300 gr\n" +
                "\n" +
                "– Bột nghệ, chanh, ớt. hành tím băm, hành lá, ngò, rau tía tô\n" +
                "\n" +
                "– Giấm bỗng: ½ lit\n" +
                "\n" +
                "– Dầu ăn\n" +
                "\n" +
                "– Gia vị: tiêu, muối, đường, nước mắm\n" +
                "\n" +
                "– Rau ăn kèm: xà lách, rau muống chẻ, bắp chuối, hoa chuối xắt mỏng\n" +
                "\n" +
                "Cách nấu bún ốc ngon\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "– Ốc sau khi mua về thì bạn ngâm nước gạo qua đêm cho sạch hết chất bẩn. Nếu không có thời gian thì bạn có thể cho vào nước ngâm ốc vài lát ớt. Sau đó, bắc nồi nước luộc ốc với chút muối. Lưu ý: không luộc quá kỹ để tránh thịt ốc bị dai và bạn nhớ giữ lại phần nước lộc ốc.\n" +
                "\n" +
                "– Sau khi luộc thì vớt ốc ra, để cho hơi nguội, lễ ốc lấy phần thịt ra bỏ phần đuôi đen đi. Tiếp theo bạn ướp ốc với khoảng 1,5 muỗng café nước mắm chút tiêu xay và ½ muỗng café bột nghệ, để yên khoảng 30 phút cho thịt ốc thấm gia vị.\n" +
                "\n" +
                "– Cà chua: rửa sạch, bỏ phần cuống và bổ múi cau.\n" +
                "\n" +
                "– Ớt bỏ hạt, băm nhuyễn. Hành lá, tía tô rửa sạch xắt nhỏ. Các loại rau sống nhặt bỏ phần hư, rửa sạch, có thể cắt nhỏ cho vừa ăn.\n" +
                "\n" +
                "– Đậu hũ rửa sạch, cắt miếng vuông nhỏ vừa ăn, chiên cho vàng, vớt ra để ráo dầu\n" +
                "\n" +
                "– Phần xương heo: bạn rửa sạch với nước muối để khử mùi tanh, rồi cho vào nồi với 2 lít nước hầm trong trong khoảng 30 phút với lửa vừa. Lưu ý: trong khi hầm xương thì ban nhớ liên tục vớt bọt để nước dùng được trong.\n" +
                "\n" +
                "– Bạn trụng bún tươi qua nước sôi, để ráo.\n" +
                "\n" +
                "Bước 2: Nấu bún ốc\n" +
                "– Bắc nồi lên bếp và cho chút xíu dầu ăn vào đun đến khi sôi thì cho hành tím băm vào phi cho thơm. Sau đó, bạn cho phần thịt ốc và cà chua vào xào với lửa lớn khoảng 3 phút cho săn. Lưu ý: nếu ban nãy bạn luộc ốc hơi quá tay thì có thể cho ốc vào xào sau cà chua, miễn canh sao cho thịt ốc vừa chín tới, đừng quá dai.\n" +
                "\n" +
                "– Cho tiếp nước luộc ốc, nước hầm xương và nước giấm bỗng vào nồi và nấu sôi, nêm nếm lại cho vừa ăn rồi thả luôn phần đậu hũ vào nồi, đợi đến khi sôi thì bạn hạ lửa để liu riu giữ nóng cho đến khi dùng.\n" +
                "\n" +
                "Bước 3: Trình bày món ăn\n" +
                "– Bạn cho bún ra tô, chan nước và múc ốc, đậu hũ, cà chua mỗi loại một ít rồi rắc hành lá. Bún ốc ăn kèm với các loại rau sống, ăn đến đâu thì cho rau vào đến đấy.");
        chebien5.add("* Nguyên liệu:\n" +
                "Mực mai con lớn, dày cơm, thật là tươi 1 kg, mực làm sạch, bỏ túi mực và nội tạng chỉ lấy phần thịt mực, rửa sạch sẽ và để ráo nước nhé\n" +
                "Hành khô, muối, tiêu\n" +
                "Nước mắm ngon, tỏi\n" +
                "Lưu ý, quá nhiều hương vị sẽ làm mất mùi và vị ngon đặc trưng của chả mực.\n" +
                "Cách chế biến:\n" +
                "Bước 1: Ướp qua thịt mực với hành, muối mắm, tỏi chừng 30 phút\n" +
                "Bước 2: Chuẩn bị một chiếc cối để giã, nếu có cối đá thì tuyệt nhất vì lực đủ mạnh cho mực được nhuyễn hơn, nếu trường hợp không có cối bạn phải ra hàng làm thì xay nhẹ thôi nhé\n" +
                "Bước 3: Cho mực vào cối và bạn tiến hành giã, giã đều tay cho đến khi mực rối lại và kết dính với nhau là được, một số người thích cho thêm thịt, cá, tôm cua thì có thể thêm nếu thích\n" +
                "Bước 4: Trong lúc giã bạn có thể cho thêm ít tiêu vào cùng.\n" +
                "Bước 5: Sau khi giã nhuyễn bạn dùng găng tay nilon, xoa thêm một ít dầu ăn và vắt các viên mực tròn dẹt nhé.\n" +
                "Bước 6: Rán chả mực : chuẩn bị bếp chảo ngập dầu ăn, thả những miếng chả mực đã vắt vào trong chảo\n" +
                "Bước 7: Nếu bạn ăn sau khi nầu bạn hãy để lửa cho dầu sôi, chả mực sẽ chín đều và ngon hơn, nhớ là ăn nóng thì ngon hơn nữa nhé");
        chebien5.add("* Nguyên Liệu:\n" +
                "2 củ hành tím\n" +
                "1 củ tỏi\n" +
                "3 – 5 củ xả\n" +
                "1 trái ớt\n" +
                "1 muỗng mật ong\n" +
                "1 muỗng màu điều\n" +
                "2 cành lá móc mật\n" +
                "Gia vị: Bột ngọt, hạt nêm, dầu hào, tiêu đường, mật ong, muối, một ít bột sắn dây để pha nước chấm.\n" +
                "( giá vị trên sử dụng để ướp cho 1 còn vịt )\n" +
                "Cách chế biến:\n" +
                "Ướp vịt\n" +
                "Dùng 1 tô lớn, cho vào bột ngọt, hạt nêm, dầu hào, tiêu, đường, mật ong, muối, màu điều sau đó trộn đều lên\n" +
                "Hành tím, tỏi băm nhỏ, sả rửa sạch, bỏ lớp áo ở ngoài, cho vào máy xay sinh tố và xay nhỏ. Nếu không có máy xay bạn có thể đập dập rồi thái nhỏ.\n" +
                "Ớt, móc mật xay nhuyễn hoặc băm nhỏ.\n" +
                "Cho tất cả vào bát gia vị ở trên rồi trộn đều tạo thành nước sốt ướp thịt vịt. ( (Chú ý nên nếm gia vị theo khẩu vị, có thể thêm, bớt hoặc thay thế bằng các gia vị khác )\n" +
                "Dùng các que nhọn để săm vịt. Săm nhẹ tay đều cả ở trong lẫn ngoài vịt ( chú ý không xuyên thủng thịt vịt ) \n" +
                "Phết đều gia vị lên cả thân vịt, cả trong lẫn ngoài, tẩm ướp trong khoảng 20 phút. Giữ lại một ít gia vị để lát nữa ta sử dụng để chế biến nước chấm vịt.\n" +
                "Nướng vịt:\n" +
                "Bước 1: Cho than vào bếp khoảng 3 cân và mồi lên\n" +
                "Bước 2: Đợi cho than cháy hồng hết khói ta Kẹp vịt vào vỉ nướng sau đó treo vào trong lò\n" +
                "Bước 3: Chỉnh nhiệt độ lên khoảng 180°C trong 10 phút.\n" +
                "Bước 4: Sau đó nhấc vịt ra nhanh tay quét thêm một lớp gia vị nữa sau đó bỏ vịt lại vào trong lò. 10 phút sau tiếp tục làm 2 lẫn nữa.\n" +
                "Bước 5: Sau đó ta chỉnh nhiệt lên 230°C trong 10 phút cho vịt chín vàng đều.\n" +
                "Sau khi chín bạn cho vịt ra và chặt vịt thành những miếng dài vừa ăn\n" +
                "Pha nước chấm\n" +
                "Nước chấm cũng là một gia vị quan trọng góp phần làm tăng thêm vị đậm đà cho món thịt vịt nướng. Thông thường bạn có thể sử dụng xì dầu, pha thêm chút mì chính, và đập dập tỏi ớt, băm nhuyễn vào là được.\n" +
                "Tuy nhiên nếu là một người cầu kì hơn bạn có thể sử dụng chính gia vị đã ướp vịt lúc nãy, cho thêm một chút xì dầu và nước lọc vào đun lên, nêm nếm lại gia vị sao cho đầy đủ các vị chua, cay, mặn, ngọt và mùi thơm của quả móc mật thì cho nhỏ lửa. Hòa tan 1 ít bột sắn sau đó đun hỗn hợp lên. Sôi cái ta nhấc ra ngay và thế đã hoàn thành làm xong nước chấm");
        chebien5.add("* Nguyên liệu:\n" +
                "Cá rô đồng: 4 lạng.\n" +
                "Rau muống:1 bó.\n" +
                "Rau gia vị: Hành lá, thì là, rau mùi, hành tím, gừng, cà chua.\n" +
                "Gia vị: Hạt tiêu, mắm, muối, tương, mì chính, hạt nêm.\n" +
                "\n" +
                "Cách chọn và sơ chế các loại rau:\n" +
                "Với các loại rau, mình chỉ nói sơ qua vì đây là công việc hàng ngày, ai cũng có thể làm tốt, mình sẽ đi kỹ phần chọn và chế biến cá.\n" +
                "Các loại rau các bạn chọn rau tươi, non, nhặt bỏ những lá già ,úa rửa sạch, để ráo.\n" +
                "Cà chua các bạn bổ múi cau. Hành lá, thì là, mùi thái nhỏ.\n" +
                "Gừng, hành tím đập dập, thái nhỏ, để riêng.\n" +
                "\n" +
                "Cách sơ chế cá chuẩn, không tanh.\n" +
                "Đánh vảy và lấy ruột cá bạn có thể nhờ người bán hàng làm giúp, về nhà chỉ việc khử tanh và nấu cho khỏi mất công.\n" +
                "Cá sau khi đánh vảy, mổ ruột, bạn rửa lại với nước sạch rồi bóp lại với một chút muối cho hết nhớt và rửa lại lần nữa.\n" +
                "\n" +
                "Cách chế biến:\n" +
                "Cho cá vào nồi luộc tầm 10 phút cho thịt cá chín mềm,dễ dàng tách ra khỏi xương thì tắt bếp, để nguội, vớt cá ra.\n" +
                "Chờ cá nguôi, khéo léo tách thịt cá ra khỏi xương, để riêng.\n" +
                "Xương cá cho vào cối giã nát, cho nước vào lọc lấy nước cốt.\n" +
                "Thịt cá ướp với nước mắm, hạt nêm, gừng, nghệ, 1/2 số thì là.\n" +
                "Cho cá vào chảo rán vàng 2 mặt.\n" +
                "Xương cho vào nồi ninh nhừ.\n" +
                "Phi thơm hành tím, rồi cho 1/2 số cà chua vào xào cho màu đẹp sau đó đổ vào nồi nước dùng.\n" +
                "Nước luộc cá lúc trước cùng với nước xương cá đổ vào nồi nước dùng, đun sôi, thêm số cà chua còn lạ rồi nêm cho vừa miệng.\n" +
                "Lúc ăn, đun sôi nồi nước trần qua bún, rau muống bạn có thể trần vào nồi nước dùng. Cho rau lên trên bún rồi bày thịt cá, rau thơm lên trên, chan nước dùng và thưởng thức.");
        chebien5.add("* Nguyên liệu làm Bún thangCho 4 người\n" +
                " Giò lụa 100 gr\n" +
                "(chả lụa)\n" +
                " Xương ống heo 500 gr\n" +
                " Gà ta 1 con\n" +
                " Trứng vịt 2 quả\n" +
                " Bún sợi nhỏ 1.5 kg\n" +
                " Tôm sú 200 gr\n" +
                " Tôm khô 100 gr\n" +
                " Râu mực 3 cái\n" +
                "(hoặc sá sùng)\n" +
                "Hành lá, rau răm, hành khô và gừng nướng, nấm hương, củ cải khô\n" +
                "Gia vị: Mắm tôm, nước mắm, 1 chút đường phèn, giấm, đường cát trắng\n" +
                "Cách chế biến Bún thang\n" +
                "1 Sơ chế nguyên liệu\n" +
                "Giò lụa thái thành sợi thật nhỏ, để riêng.\n" +
                "\n" +
                "Hành lá, rau răm đem nhặt rồi rửa sạch với nước và để ráo rồi đem thái nhỏ, để riêng.\n" +
                "\n" +
                "Gừng rửa sạch, để ráo nước.\n" +
                "\n" +
                "Hành tím bóc sạch vỏ, rửa sạch rồi đem đập dập, băm nhỏ, để riêng.\n" +
                "\n" +
                "Củ cải khô ngâm nước ấm 30 phút cho nở ra rồi đem rửa lại với nước sạch. Tiếp theo, bạn thái sợi thật nhỏ và trộn với 2 thìa giấm, 1 thìa đường trắng, trộn đều và để 30 phút cho củ cải thấm gia vị.\n" +
                "\n" +
                "Nấm hương nhặt sạch cắt bỏ phần chân đen, rửa sạch, thái nhỏ.\n" +
                "\n" +
                "Tôm khô nhặt bỏ bụi bẩn, để riêng.\n" +
                "\n" +
                "Tôm sú cắt bỏ đầu, bỏ đuôi, bóc bỏ vỏ, tách bỏ sợi chỉ đen trên lưng tôm rồi đem rửa sạch. Cho tôm vào cối giã sơ qua rồi để riêng.\n" +
                "\n" +
                "Đánh trứng vào bát, thêm chút hạt nêm vào, khuấy đều và để riêng.\n" +
                "\n" +
                "Gà rửa kỹ với nước muối pha loãng, rửa lại với nước sạch và để ráo.\n" +
                "\n" +
                "Xương heo rửa sạch với nước muối pha loãng, rửa lại với nước sạch và để ráo.\n" +
                "\n" +
                "2 Sơ chế các nguyên liệu khác\n" +
                "Gừng đã rửa sạch đem nướng cho đến khi nào chín và có mùi thơm.\n" +
                "\n" +
                "Tiếp đó, cho râu mực lên bếp nướng chín, đợi đến khi râu nguội, xé thành sợi nhỏ là được.\n" +
                "\n" +
                "3 Nấu nước dùng\n" +
                "Cho gà vào nồi luộc, đến khi sôi thì cho một chút gia vị 1 muỗng hạt nêm, 1/2 muỗng đường, 1 muỗng cafe muối và hành khô, gừng đã nướng thơm vào, hạ nhỏ lửa để gà chín bên trong. Sau khi vớt ra để nguội, bạn dùng tay xé sợi vừa ăn và để riêng.\n" +
                "\n" +
                "Xương lợn cho vào nồi đun sôi với nước, sau đó đổ hết nước đó đi, cho ra vào nước lạnh rửa sạch vụn xương. Sau đó đổ xương vào nồi nước luộc gà ninh nhừ (khoảng 2 – 3 tiếng) để làm nước dùng.\n" +
                "\n" +
                "Khi nồi nước ninh xương đun được khoảng 50 phút đến 1 tiếng, thì cho râu mực nướng chín, tôm khô đã rang, nấm hương, 1 viên đường phèn, 1 thìa hạt nêm, 1 thìa muối và chút nước mắm vào, khuấy đều.\n" +
                "\n" +
                "Tiếp tục ninh thêm 1 hoặc 2 tiếng nữa thì nêm nếm lại gia vị cho vừa miệng, cho hành lá và rau răm xắt nhỏ vào, rồi tắt bếp.\n" +
                "\n" +
                "4 Làm tôm ruốc và trứng\n" +
                "Cho tôm khô vào rang thơm rồi cho ra đĩa. Tiếp đó, cho chút dầu ăn vào tráng đều mặt chảo, đến khi dầu nóng già thì cho tôm sú đã giã vào, thêm chút nước mắm rồi sao cho tôm chín, hơi khô lại thành ruốc tôm thì cho ra đĩa.\n" +
                "\n" +
                "Cho bát trứng đã đánh vào rán sao cho thật mỏng. Đến khi chín cho trứng ra đĩa, đợi trứng nguội thì thái thành sợi nhỏ.\n" +
                "\n" +
                "5 Hoàn thành\n" +
                "Bún đem chần qua với nước, xếp các loại nhân lên trên rồi chan nước dùng vào là xong. Nếu ai có thể ăn được mắm tôm thì bạn cho ½ thìa cafe mắm tôm lên trên.");

        stringArrayList5.add("Thịt lợn mán tái chanh");
        stringArrayList5.add("Thịt vịt hầm khoai sọ rau rút");
        stringArrayList5.add("Thịt lợn muối chua");
        stringArrayList5.add("Phở Hà Nội");
        stringArrayList5.add("Chả cá Lã Vọng");
        stringArrayList5.add("Cá Kho làng Vũ Đại");
        stringArrayList5.add("Bún Mọc");
        stringArrayList5.add("Bún đậu mắm tôm");
        stringArrayList5.add("Bún ốc");
        stringArrayList5.add("Chả Mực Hạ Long");
        stringArrayList5.add("Vịt Cỏ Vân Đình");
        stringArrayList5.add("Canh cá rô Hải Dương");
        stringArrayList5.add("Bún Thang");

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

    }
    public void dsmtrung(){
        chebien6.add("Nguyên liệu:\n" +
                "- Bắp bò: 600gr\n" +
                "\n" +
                "- Chân giò lợn: 800gr\n" +
                "\n" +
                "- Xương ống: 1kg\n" +
                "\n" +
                "- Tiết (bò hoặc lợn): 100gr\n" +
                "\n" +
                "- Mắm ruốc: 3 thìa canh\n" +
                "\n" +
                "- Sả: 6 cây\n" +
                "\n" +
                "- Gừng: 50gr\n" +
                "\n" +
                "- Hành tím, tỏi\n" +
                "\n" +
                "- Rau sống: giá đỗ, hành lá, mùi tàu, hoa chuối\n" +
                "\n" +
                "- Chả Huế: 200gr\n" +
                "\n" +
                "- Bún sợi to\n" +
                "\n" +
                "- Gia vị: muối, đường, bột ngọt\n" +
                "\n" +
                "- Chỉ sợi to để buộc bắp bò và chân giò lợn.\n" +
                "\n" +
                "Phần ớt sa tế:\n" +
                "\n" +
                "- Ớt bột: 1 thìa canh\n" +
                "\n" +
                "- 1 quả ớt tươi băm nhỏ\n" +
                "\n" +
                "- 1 củ tỏi băm nhuyễn\n" +
                "\n" +
                "- ¼ quả dứa băm nhỏ\n" +
                "\n" +
                "- 1 cây sả băm nhuyễn\n" +
                "\n" +
                "- Muối, đường, dầu ăn\n" +
                "\n" +
                "Lưu ý nhỏ:\n" +
                "\n" +
                "- Chân giò lợn nên chọn chân trước sẽ ngon hơn.\n" +
                "\n" +
                "- Nếu không tìm mua được chả Huế có thể thay bằng chả lụa.\n" +
                "\n" +
                "- Có thể dùng bún sợi thường thay thế bún sợi to.\n" +
                "\n" +
                "Cách nấu bún bò Huế:\n" +
                "Bước 1: Sơ chế các nguyên liệu\n" +
                "\n" +
                "- Gừng cạo vỏ, rửa sạch đập dập\n" +
                "\n" +
                "- Sả bóc vỏ, rửa sạch. Một nửa băm nhuyễn, còn lại cắt khúc rồi đập dập.\n" +
                "\n" +
                "- Hành tím, tỏi bóc vỏ rồi băm nhỏ.\n" +
                "\n" +
                "- Rau sống nhặt, rửa sạch để ráo nước.\n" +
                "\n" +
                "Chân giò lợn lọc bỏ xương, rửa sạch rồi lấy chỉ buộc cuộn lại.\n" +
                "\n" +
                "- Bắp bò mua về cũng rửa sạch rồi dùng chỉ buộc chặt.\n" +
                "\n" +
                "- Xương ống rửa sạch, chặt làm 2 hoặc 3 khúc\n" +
                "\n" +
                "Bước 2: Ướp thịt\n" +
                "- Đặt nồi nước lên bếp, chần sơ qua xương, bắp bò và chân giò lợn.\n" +
                "\n" +
                "- Lấy ½ bát con nước pha với mắm ruốc, dùng đũa khuấy đều.\n" +
                "\n" +
                "- Ướp các loại thịt cùng gia vị: 1 thìa canh muối, 1 thìa canh mắm ruốc vừa pha loãng, ½ thìa canh bột ngọt, 2 thìa canh đường, 1 thìa canh hành tím băm, 1 thìa canh tỏi băm và 1 thìa canh sả băm.\n" +
                "\n" +
                "- Trong khi đợi ướp thịt thì bắc nồi, đun sôi nước rồi cho tiết vào luộc. Sau khi nguội thì thái miếng vuông.\n" +
                "\n" +
                "Bước 3: Hầm thịt và xương\n" +
                "\n" +
                "- Cho sả và gừng lót ở đáy nồi, đổ nước rồi cho xương ống và chân giò lợn vào luộc chín. Sau đó vớt chân giò lợn ra một bát nước lạnh để thịt không bị bở.\n" +
                "\n" +
                "- Tiếp tục cho sả và gừng vào một nồi khác, đổ nước và cho bắp bò vào luộc chín. Sau khi chín cũng vớt ra bát nước lạnh cho thịt săn chắc.\n" +
                "\n" +
                "Bước 4: Nấu nước dùng\n" +
                "\n" +
                "- Đổ chung nước hầm chân giò lợn, bắp bò và phần xương ống vào một nồi lớn, có thể cho thêm nước nếu thấy ít.\n" +
                "\n" +
                "- Đun sôi nước thì thả sả cắt khúc vào nồi, nêm gia vị: 2 thìa canh muối, 2 thìa canh đường, 2 thìa café bột ngọt và phần mắm ruốc còn lại. Đun thêm khoảng 30 phút rồi tắt bếp\n" +
                "\n" +
                "Bước 5: Làm ớt sa tế\n" +
                "\n" +
                "- Bắc chảo dầu lên bếp sau đó cho tỏi và sả phi thơm, tiếp tục cho dứa vào đảo đều tay.\n" +
                "\n" +
                "- Đun khoảng 5 phút thì nêm 1 thìa café đường, 1 thìa café muối. Cuối cùng cho ớt bột và ớt tươi vào. Đảo đến khi hỗn hợp sánh lại là được.\n" +
                "\n" +
                "Bước 6: Hoàn thành\n" +
                "\n" +
                "- Thịt cắt miếng, chả thái miếng nhỏ và mỏng.\n" +
                "\n" +
                "- Bún chần qua nước sôi rồi cho vào bát, cho thịt, tiết và chả lên trên rồi chan nước dùng.\n");
        chebien6.add("Nguyên liệu:\n" +
                "Mì Quảng: khoảng 1kg\n" +
                "\n" +
                "Tôm (loại vừa): 300g\n" +
                "\n" +
                "Trứng vịt (có thể thay bằng trứng cút tùy vào sở thích)\n" +
                "\n" +
                "Thit lợn nạc: 300g\n" +
                "\n" +
                "Đậu phộng rang: 50g\n" +
                "\n" +
                "Ớt tươi, dầu phộng (dầu lạc), ớt màu (ớt bột khô xay nhuyễn)\n" +
                "\n" +
                "Bánh tráng nướng (bánh đa)\n" +
                " \n" +
                "Hành ngò, rau ăn kèm gồm xà lách, rau húng lủi, hoa chuối bào, giá, cải non\n" +
                "\n" +
                "Gia vị: hạt tiêu, muối, nước mắm ngon, bột ngọt, đường, một trái chanh.\n" +
                "\n" +
                "1 chén nước dùng, 1 thìa súp hành tím băm, 1 thìa súp dầu ăn, 1 thìa súp hạt nêm.\n" +
                "\n" +
                "Thực hiện\n" +
                " \n" +
                "Bước 1: Đun nóng dầu, phi thơm hành tím. Cho tôm và thịt nạc vào xào vừa chín tới, cho nước dùng vào. Nêm hạt nêm và nước ăn sao cho vừa ăn.\n" +
                "\n" +
                "Bước 2: Cho trứng vịt vào nấu khoảng 5 phút cho thấm. Tắt bếp.\n" +
                "\n" +
                "Bước 3: Với mì, bạn có thể dùng ngay. Hoặc có thể chần mì bằng cách nấu một nồi nước sôi, cho mì quảng vào chần trong 2 phút rồi vớt ra để ráo.\n" +
                "\n" +
                "Bước 4: Trình bày\n" +
                "\n" +
                "Chuẩn bị ớt cắt lát, nước mắm ớt nguyên chất, chanh cắt lát và các loại rau sống, bày ra đĩa. Cho rau sống vào tô, thêm mì lên trên rồi chan hỗn hợp nước nấu tôm thịt lên trên (vừa nước, không nên chan quá nhiều).\n" +
                "\n" +
                "Rắc đậu phộng và hành lá cắt nhỏ lên trên. Kèm với miệng bánh tráng.\n" +
                "\n" +
                "Khi thưởng thức, bạn vắt chanh, bẻ nhỏ bánh tráng nướng vào, trộn đều và thưởng thức. Nếu có thể bạn nên thêm một ít ớt rim kiểu miền Trung để giúp giúp tạo hương vị đậm đà nhất.\n" +
                "\n" +
                "Mách nhỏ:\n" +
                "\n" +
                "Để trứng vịt luộc không bị nát, các bạn không nến cắt trứng ra trước khi nấu mà nên để nguyên quả, khi dùng mới cắt ra thì sẽ ngon hơn.");
        chebien6.add("Nguyên liệu cần chuẩn bị\n" +
                "\n" +
                "500 gram thịt đùi heo\n" +
                "\n" +
                "500 gram xương ống heo\n" +
                "\n" +
                "1kg mì Cao lầu tươi\n" +
                "\n" +
                "Hành lá, tỏi, ngò ri\n" +
                "\n" +
                "Gia vị: Muối, nước mắm, hạt nêm, hạt tiêu, nước tương, tương ớt, dầu ăn…\n" +
                "\n" +
                "Rau sống ăn kèm: Bắp chuối, rau thơm, giá đỗ, rau húng…\n" +
                "\n" +
                "Các bước thực hiện\n" +
                "*Sơ chế nguyên liệu\n" +
                "\n" +
                "Bước 1: Thịt heo sau khi mua về, bạn đem rửa sạch rồi chia thành 2 khổ lớn.\n" +
                "\n" +
                "Bước 2: Xương heo rửa sạch, chần sơ qua với nước sôi để loại bỏ bớt chất bẩn và mùi hôi.\n" +
                "\n" +
                "Bước 3: Tỏi bỏ vỏ khô, dùng dao băm nhỏ. Hành lá, ngò bỏ rễ, rửa sạch rồi thái nhỏ.\n" +
                "\n" +
                "Bước 4: Các loại rau sống ăn kèm bạn trộn đều với nhau, đem ngâm với nước muối loãng trong chừng 10 – 15 rồi rồi rửa sạch lại nước lạnh và vớt ra rổ để ráo.\n" +
                "\n" +
                "*Chế biến món Cao lầu Hội An\n" +
                "\n" +
                "Bước 1: Cho 500 gram xương heo đã được sơ chế vào nồi rồi đổ một lượng nước vừa phải vào ninh với lửa nhỏ trong khoảng 30 phút. Sau đó, lấy khoảng 500ml nước dùng trong nồi để dùng.\n" +
                "\n" +
                "Bước 2: Đem 2 khổ thịt heo lớn ướp với lượng gia vị như sau: 1/2 thìa cà phê ngũ vị hương, 4 thìa súp nước tương, 1 thìa cà phê tỏi băm, 1 thìa cà phê hạt tiêu, + 4 thìa súp đường và 2 thìa cà phê hạt nêm. Để trong khoảng 30 phút cho thịt heo thấm đều được gia vị.\n" +
                "\n" +
                "Bước 3: Cho 2 muỗng canh dầu ăn vào một chiếc chảo rộng rồi bắc lên bếp đun sôi. Sau đó, cho 2 khổ thịt heo lớn đã được ướp đủ thời gian vào chiên vàng đều.\n" +
                "Lưu ý: Khi chiên, vì thớ thịt lớn nên bạn hãy để ở mức lửa nhỏ để thịt có thể chín đều từ trong ra ngoài nhé.\n" +
                "\n" +
                "Bước 4: Tiếp tục đổ phần nước ướp thịt heo lúc trước vào chảo và rim cho đến khi phần nước này cạn. Sau đó, cho thêm 500ml nước dùng vào đun với mức lửa nhỏ trong khoảng 40 phút.\n" +
                "\n" +
                "Bước 5: Nêm nếm nước dùng vừa miệng rồi tắt bếp, vớt thịt ra để ráo và đợi nguội. Sau đó, dùng dao sắc thái thịt thành những miếng vừa ăn.\n");
        chebien6.add("Nguyên Liệu Nấu Bánh Canh Cá Lóc:\n" +
                "1 con cá lóc\n" +
                "\n" +
                "150g bột năng\n" +
                "\n" +
                "250 g bột gạo\n" +
                "\n" +
                "1 muỗng canh dầu ăn\n" +
                "\n" +
                "600 ml nước\n" +
                "\n" +
                "1 muỗng cà phê muối\n" +
                "\n" +
                "3 củ hành tím, một nửa thái lát, và một nửa băm nhỏ\n" +
                "\n" +
                "1 củ hành tây\n" +
                "\n" +
                "1 muỗng cà phê bột điều\n" +
                "\n" +
                "Hành lá thái nhỏ, nước mắm, ớt thái lát, bột nêm, tiêu, ngò gai thái nhỏ, chanh\n" +
                "\n" +
                "Cách Nấu Bánh Canh Cá Lóc:\n" +
                "\n" +
                "Làm Bánh Canh\n" +
                "\n" +
                "Những sợi bánh canh trắng muốt làm từ bột gạo\n" +
                "\n" +
                "– Cho vào tô 250g bột gạo, 150g bột năng, 1/4 muỗng cà phê muối, 200ml nước rồi trộn đều.\n" +
                "\n" +
                "– Cho hỗn hợp bột đã trộn vào nồi, đun và khuấy đều với lửa nhỏ cho đến khi bột sánh thì tắt bếp. Tiếp tục khuấy cho đến khi bột thành khối đặc là được.\n" +
                "\n" +
                "– Dùng khuôn ép bột hoặc dùng gậy cán bột, cán ra một mặt phẳng rồi dùng dao sắc cắt thành từng sợi với độ dày mỏng tùy ý muốn. Sau đó bóp thật chặt tay cho bột thành sợi bánh canh dài, thả rơi xuống nồi nước sôi đang đun trên bếp.\n" +
                "\n" +
                "– Nấu cho đến khi bột nổi hết lên trên mặt nước, bánh canh có màu trong và không còn trắng đục nữa thì đổ ra rổ lớn và dội qua nước lạnh, để ráo.\n" +
                "\n" +
                "Nấu Nước Lèo\n" +
                "– Cá lóc đem làm sạch rồi khứa theo từng khúc, ướp qua với muối để khử mùi tanh sau đó dội nước lạnh cho thật sạch.\n" +
                "\n" +
                "– Bắc nồi nước lên bếp (cho khoảng 3 bát nước) thêm hành tây và muối, nấu sôi thì thả cá lóc vào nấu tiếp khoảng 5 phút, sau đó vớt cá ra.\n" +
                "\n" +
                "– Lọc phần nước dùng trong sang một nồi khác cùng với củ hành tây đã luộc.\n" +
                "\n" +
                "– Cá lóc đem gỡ hết phần thịt cá cho vào tô, nêm với hỗn hợp gồm: ½ muỗng cà phê hạt tiêu, 1 muỗng canh đường, một muỗng canh nước mắm, 1 muỗng cà phê bột nêm, hành tím và ớt đã thái lát vào, trộn đều và chờ khoảng 10 phút để gia vị ngấm vào cá.\n" +
                "\n" +
                "Lọc lấy phần thịt cá lóc và ướp cho ngấm đều gia vị\n" +
                "\n" +
                "– Cho phần thịt cá đã ướp vào nồi nước lèo đun sôi trên bếp, nấu trong vòng 7-20 phút, để lửa vừa phải rồi nêm gia vị cho vừa miệng.\n" +
                "\n" +
                "– Phi thơm hành băm, cho bột điều vào chảo khuấy đều tay rồi nhấc khỏi bếp.\n" +
                "\n" +
                "– Đổ hỗn hợp vừa làm vào nồi nước lèo.\n");
        chebien6.add("Nguyên liệu làm Cơm gà Tam Kỳ\n" +
                " Gạo 500 gr\n" +
                "\n" +
                " Gà 1 con\n" +
                "\n" +
                " Hành tây 1 củ\n" +
                "\n" +
                " Chanh 1 quả\n" +
                "\n" +
                " Ớt 2 quả\n" +
                "\n" +
                " Tỏi 10 gr\n" +
                "\n" +
                " Rau răm 10 gr\n" +
                "\n" +
                " Gừng 1 củ\n" +
                "\n" +
                "Cách chế biến Cơm gà Tam Kỳ\n" +
                "1 Sơ chế nguyên liệu\n" +
                "Gà sau khi mua về bạn mang sơ chế sạch sẽ bằng cách dùng gừng tươi và muối trắng sát toàn bộ bên ngoài da. Sau đó, rửa lại với 3 – 4 lần nước.\n" +
                "\n" +
                "Rau răm bạn ngắt chọn ngọn và những lá tươi rồi mang rửa sạch, vớt ra rổ để ráo nước. Hành tây bạn bóc lớp vỏ khô bên ngoài, rửa sạch và thái mỏng theo chiều ngang.\n" +
                "\n" +
                "2 Luộc gà\n" +
                "Chuẩn bị một nồi nước lớn và cho gà sau khi đã sơ chế sạch sẽ vào luộc chín. Khi nước luộc gà sôi, bạn vặn lửa nhỏ và tiếp tục đun cho đến khi chín gà.\n" +
                "\n" +
                "Tùy thuộc vào từng loại và kích thước của gà bạn dùng mà thời gian chín sẽ khác nhau (khoảng 30 – 45 phút).\n" +
                "\n" +
                "Sau khi gà chín, bạn tắt bếp rồi vớt gà ra rổ để ráo nước và đợi nguội.\n" +
                "\n" +
                "3 Nấu cơm\n" +
                "Lấy 500gr gạo tám thơm mang vo sạch rồi đem ngâm trong nước lạnh khoảng từ 20 – 30 phút.\n" +
                "\n" +
                "Sau đó, cho gạo vào nồi cơm điện, đổ một lượng nước luộc gà vừa phải, cho 1 muỗng dầu ăn cùng hành tỏi băm đã phi thơm rồi cắm điện nấu cơm chín.\n" +
                "\n" +
                "4 Xé và ướp gà với gia vị\n" +
                "Sau khi gà nguội, bạn dùng tay xé gà thành những miếng nhỏ rồi đem trộn đều với các gia vị: muối, hạt tiêu, nước cốt chanh, bột nêm, rau răm, hành tây đã được sơ chế\n" +
                "\n" +
                "5 Pha nước mắm ăn kèm\n" +
                "Bạn pha nước mắm ăn kèm theo cách sau: Cho lượng đường, nước mắm, nước lọc, tỏi, ớt băm phù hợp vào chung một bát chén nhỏ và trộn đều.\n");
        chebien6.add("Nguyên liệu cần chuẩn bị\n" +
                "2 kg hến tươi\n" +
                "400 gram gạo tẻ dẻo ngon\n" +
                "50 gram da heo\n" +
                "150 gram đậu phụng\n" +
                "2 quả khế chua\n" +
                "200 gram dọc mùng\n" +
                "Rau sống ăn kèm: hoa chuối, lõi cây chuối non, rau muống, rau xà lách, rau thơm…\n" +
                "Gia vị: muối, nước mắm, dầu ăn, hạt nêm, mắm ruốc\n" +
                "Hành khô, chanh, ớt, gừng\n" +
                "Các bước thực hiện\n" +
                "Bước 1: 400 gram gạo tẻ bạn mang vo sạch rồi đổ nước vào và nấu chín.\n" +
                "\n" +
                "Bước 2: Đậu phụng đem rang vàng thơm với chút dầu ăn.\n" +
                "\n" +
                "Bước 3: 2 quả khế chua rửa sạch, cắt bỏ riềm và thái thành từng lát mỏng.\n" +
                "\n" +
                "Bước 4: 50 gram da heo rửa sạch, cho vào rổ để ráo rồi mang chiên phồng.\n" +
                "\n" +
                "Bước 5: Các loại rau ăn kèm trộn đều với nhau, mang ngâm với nước muối loãng trong chừng 15 – 20 phút rồi vớt ra rổ để ráo nước.\n" +
                "\n" +
                "Bước 6: Dọc mùng tước bỏ vỏ xơ, cắt thành lát, trộn với muối hạt rồi vắt bỏ bớt nước và đem chần qua nước sôi, vắt lại cho bớt nước.\n" +
                "\n" +
                "Bước 7: Gừng và hành khô lột hết vỏ, rửa sạch rồi thái thành những lát mỏng.\n" +
                "\n" +
                "Bước 8: Hến sau khi mua về bạn đem ngâm và rửa sạch với nước cho nhả hết cát. Sau đó, cho vào nồi luộc chín cùng chút muối.\n" +
                "\n" +
                "Bước 9: Vớt hến và chắt nước luộc ra 2 âu khác nhau và nhớ không lấy phần nước cặn ở dưới đáy xoong nhé.\n" +
                "\n" +
                "Bước 10: Ướp hến với 1 muỗng canh nước mắm cho đậm đà. Sau đó, cho chảo dầu cùng chút hành khô phi thơm và đổ hến vào xào săn.\n" +
                "\n" +
                "Bước 11: Nước luộc hến bạn cho vào nồi đun nóng lại. Cho 1 muỗng canh mắm ruốc và 1 chút bột nêm vào khuấy đều rồi nêm nếm cho vừa ăn.\n" +
                "\n" +
                "Bước 12: Thả những lát gừng vào nồi nước dùng, đun sôi rồi tắt bếp.\n" +
                "\n" +
                "Như vậy, chúng ta đã sơ chế và chế biến xong các nguyên liệu để làm món cơm hến rồi. Bây giờ, bạn hãy chuẩn bị một đĩa rộng, múc cơm ra, cho hến xào, da heo chiên phồng, rau sống cùng lạc rang lên rồi chan sâm sấp nước dùng vào và mời mọi người thưởng thức khi còn nóng nhé.\n");
        chebien6.add("Nguyên liệu làm Bánh canh hẹ\n" +
                " 500 gr xương heo\n" +
                " 0,5 kg chả cá\n" +
                " 1 củ cải trắng\n" +
                " 1 kg bánh canh\n" +
                " 1 bó hẹ\n" +
                " 10 quả trứng cút lạc\n" +
                " Ớt, chanh\n" +
                " Gia vị: Đường, nước mắm, muối, bột nêm, bột ngọt,..\n" +
                " Dụng cụ: Nồi, thớt, dao, bếp, vá, muỗng,…\n" +
                "Các bước nấu\n" +
                "Bước 1: Sơ chế nguyên vật liệu:  Xương heo rửa sạch qua nước muối để ráo nước. \n" +
                "\tSau đó gọt vỏ củ cải trắng rửa sạch. Lặt bỏ rau hẹ và rửa sạch.\n" +
                "Bước 2: Bắt nước sôi, cho trứng cút vào luộc từ 5 – 7 phút trứng chín.\n" +
                "\tSau đó vớt trứng ra tô nước đá rồi bóc vỏ trứng.\n" +
                "Bước 3: Thái củ cải trắng ra thành từng khúc nhỏ. \n" +
                "\tBắt 2 lít nước đợi sôi rồi cho phần củ cải trắng đã thái khúc vào rồi cho xương heo vào nấu để lửa nhỏ để xương mềm.\n" +
                "Bước 4: Nêm nếm gia vị: Cho vào 1 muỗng café hạt nêm, 1 muỗng muối, 1 muỗng đường và nửa vá nhỏ nước mắm.\n" +
                "Bước 5: Thái chả cá ra thành các miếng mỏng\n" +
                "Bước 6: Thái nhỏ hẹ (càng nhỏ càng tốt)\n" +
                "Bước 7: Cho bánh canh ra tô rồi cho lần lượt chả cá, trứng cút, hẹ vào rồi cho nước dùng vào\n" +
                "Sau đó cho 1 miếng chanh nhỏ và vài lát ớt.\n");
        chebien6.add("Nguyên liệu: \n" +
                "\n" +
                "- Cá mai tươi: 200 gr\n" +
                "\n" +
                "- Hành tây: 1 củ\n" +
                "\n" +
                "- Gừng: 1 nhánh\n" +
                "\n" +
                "- Ớt xiêm tươi: vài trái\n" +
                "\n" +
                "- Tỏi: nửa củ\n" +
                "\n" +
                "- Đậu phộng rang: 50 gr\n" +
                "\n" +
                "- Hành phi: 1 thìa canh\n" +
                "\n" +
                "- Bánh tráng gạo cuốn: 1 xấp\n" +
                "\n" +
                "- Chanh tươi: 2 trái để tái cá.\n" +
                "\n" +
                "- Xà lách, ngò rí, diếp cá, tía tô, thơm, dưa leo, xoài xanh bào mỏng dùng kèm. \n" +
                "\n" +
                "Thực hiện: \n" +
                "\n" +
                "- Cá mai đánh vảy, bỏ đầu và đuôi, lật bụng cá lên để rút bỏ xương sống chính giữa. Chanh vắt lấy nước cốt, rưới lên cá để tái sơ. Vì cá không tanh, thịt tươi nên không cần tái quá kỹ, cá dễ bị bủn\n" +
                "\n" +
                "- Gừng cạo vỏ, rửa sạch, xắt sợi mỏng, hành tây cắt khoanh mỏng.\n" +
                "\n" +
                "- Xếp cá tái lên đĩa, gừng, hành tây để một bên, rắc đậu phộng, hành phi lên.\n" +
                "\n" +
                "- Làm nước chấm: Lấy một ít me chín, giầm nước nóng cho ra cốt. Tỏi, ớt băm nhuyễn, đậu phộng rang giã mịn. Tất cả hòa với nước mắm ngon, thêm ít đường tạo vị chua ngọt vừa miệng. \n" +
                "\n" +
                "- Khi ăn, cuốn cá với bánh tráng cùng hỗn hợp rau, ăn kèm tỏi, ớt, hành tây để món ăn có vị cay nồng đúng chất món miền Trung. Chấm kèm với nước chấm đã chuẩn bị sẵn. \n");
        chebien6.add("Nguyên Liệu Cần Chuẩn Bị Nấu Bún Cá\n" +
                "\n" +
                "1 kg cá thu (hoặc cá thác lác, cá rựa, cá mối) để làm chả\n" +
                "0.5kg cá ngừ để làm phần cá dầm\n" +
                "0.5kg bún\n" +
                "Hành tím, hành lá, tỏi, ớt, chanh, gừng\n" +
                "Rau muống bào, bông chuối bào, rau húng quế, xà lách… để dùng làm rau ăn kèm\n" +
                "3 trái cà chua\n" +
                "½ trái thơm\n" +
                "Gia vị: nước mắm, muối, bột ngọt, bột nêm, tiêu, dầu ăn…\n" +
                "\n" +
                "Cách Nấu Bún Cá Nha Trang\n" +
                "Sơ Chế Nguyên Liệu\n" +
                "Cá thu và cá ngừ làm kĩ, rửa sạch, để ráo nước. Lóc lấy phần thịt nạc, những phần còn lại để nấu nước dùng.\n" +
                "\n" +
                "Các loại rau quả ngâm nước muối loãng, rửa sạch, để ráo nước. Cà chua bổ múi cau. Thơm gọt vỏ, bỏ mắt, cắt đôi hoặc cắt ba để nấu nước dùng.\n" +
                "\n" +
                "Hành tím nướng 3 – 4 củ để bỏ vào nước dùng cho thơm, còn lại băm nhuyễn. Tỏi băm nhuyễn. Hành lá cắt nhuyễn.\n" +
                "\n" +
                "Nấu Nước Dùng\n" +
                "Bạn dùng phần xương và đầu cá để nấu nước dùng cùng hành nướng. Để nước dùng trong, thơm, không có mùi tanh của cá, bạn nên chần sơ qua xương và đầu với nước sôi trước khi cho vào nấu nước dùng. Sử dụng hành nướng sẽ giúp làm tăng mùi vị của nước dùng, át mùi tanh của cá. Khi nấu bất cứ loại nước dùng nào cũng nên cho thêm hành nướng, tỏi nướng vào.\n" +
                "\n" +
                "Khi nồi nước dùng sôi lên bạn bắt đầu nhỏ lửa và đun liu riu. Khi thấy đầu cá, xương cá rục thì lọc nước bỏ phần xác ra ngoài. Châm thêm một lượng nước vừa ăn vào nước dùng, bỏ thơm vào đun sôi lại và nêm nếm cho vừa ăn\n" +
                "\n" +
                "Làm Chả Cá\n" +
                "Giã hoặc xay cá thu cho mịn vừa phải. Sau đó, nêm 1 muỗng cà phê muối, 1/3 muỗng cà phê bột ngọt, 1/3 muỗng cà phê tiêu, dầu ăn, hành lá, một ít nước mắm và quết cho nhuyễn và dai. Khi bóp chả cá thấy chả dính chặc vào nhau là được.\n" +
                "\n" +
                "Bạn chia làm 2 phần. 1 phần cho vào khay và hấp trong 30 phút. Phần còn lại bạn chia thành từng miếng nhỏ và chiên trong chảo dầu. Nếu bạn không thích chả cá hấp thì có thể viên chả thành những cục tròn nhỏ và cho trực tiếp vào nồi nước dùng.\n" +
                "\n" +
                "Làm Cá Dầm\n" +
                "Bạn ướp cá ngừ cùng tiêu, mắm, bột ngọt, gừng, một ít rượu và đem hấp trong 30 phút. Để khử được chất độc trong cá ngừ bạn nên cho nhiều gừng. Đối với các loại cá sống ở tầng sâu mà đặc biệt là cá ngừ, bạn nên chế biến cùng gừng để khử đi lượng kẽm trong cá đảm bảo sức khỏe cho người dùng.\n" +
                "\n" +
                "Làm Nước Chấm\n" +
                "Cho tỏi băm, ớt cắt lát và nước mắm ngon vào chén, trộn đều. Chén nước mắm không pha thêm đường để bảo toàn hương thơm tự nhiên của nước mắm và giúp món ăn đậm đà hơn.\n" +
                "\n" +
                " Làm Rau Sống Ăn Kèm\n" +
                "Các loại rau bạn cắt nhỏ và bày ra đĩa. Chuẩn bị thêm ớt xanh và chanh để thêm vị cho món bún.");
        chebien6.add("Nguyên Liệu\n" +
                "Bánh tráng gạo loại mỏng\n" +
                "Bánh ướt\n" +
                "Thơm\n" +
                "Hành tím\n" +
                "Tỏi\n" +
                "Ớt đỏ\n" +
                "Tương ớt\n" +
                "Mắm nêm\n" +
                "Gia vị: Dầu ăn, đường\n" +
                "\n" +
                "Các bước\n" +
                "Bánh tráng cho vào lò vi sóng nướng trong 1 phút.\n" +
                "\n" +
                "Hành tím lột vỏ, xắt, tao với dầu, chú ý để hành giòn nhưng không bị cháy.\n" +
                "\n" +
                "Cho bánh ướt vào giữa, quét dầu hành phi vào, gập lại.\n" +
                "\n" +
                "Pha mắm: Thơm gọt vỏ, bỏ mắt, băm, vắt nước cho vào chén, phần xác thơm thì đem tao với tí dầu, thêm đường, cho ra chén, giã ớt tỏi cho vào, pha mắm nêm vào với lượng vừa đủ, khuấy đều, pha thêm dầu, hành tao và tương ớt cay.\n" +
                "\n" +
                "Bánh đập trước khi ăn thì đập và chấm với mắm nêm.\n");
        chebien6.add("Nguyên liệu chuẩn bị làm mực rim me :\n" +
                "– Mực khô : 200gr\n" +
                "– Me khô hoặc me tươi : 50gr\n" +
                "– Gia vị thường dùng : dầu ăn, nước mắm, đường,..\n" +
                "– Tỏi\n" +
                "– Ớt hiểm\n" +
                "– Sả\n" +
                "– Gừng.\n" +
                "\n" +
                "Sơ chế nguyên liệu :\n" +
                "– Nếu bạn chọn me khô thì đun sôi một ít nước nóng rồi cho me khô vào ngâm khoảng 2 phút. Dùng rây lọc lấy phần nước cốt rồi cho vào chén để riêng. Bỏ phần hạt đi.\n" +
                "– Mực cho vào lò vi sóng, nướng sơ qua sao cho chín đều các mặt là được.\n" +
                "– Sau khí mực đã nướng xong, bạn để nguội rồi xé thành miếng nhỏ vừa ăn. Có thể để nguyên con nếu bạn mua mực nhỏ.\n" +
                "– Tỏi lột vỏ, băm nhỏ.\n" +
                "– Ớt, sả, gừng làm sạch, thái mỏng.\n" +
                "\n" +
                "Cách làm mực rim me :\n" +
                "– Bắc chảo lên bếp, cho dầu ăn vào đun nóng, phi thơm tỏi rồi cho tiếp vào chảo gừng, sả đảo đều cho hỗn hợp dậy mùi. Tiếp theo bạn trút phần mực vừa sơ chế vào, đảo đều tay.\n" +
                "– Sau đó, cho vào chảo nước cốt me, 1 muỗng nước mắm, 2 muỗng đường, 1 thìa ớt bột , nêm nếm sao cho vừa ăn.\n" +
                "– Để lửa vừa, rim cho đến khi nước me sánh lại, đặc sệt bám đầy trên bề mặt miếng mực là được.\n" +
                "Để giữ mực rim me sử dụng được lâu ngày bạn nên bảo quản ở nơi khô ráo, thoáng mát. Để nguội rồi cho vào hộp kín hoặc túi nilon giúp món ăn không bị oxi hóa nhanh hơn.\n");
        chebien6.add("Nguyên liệu cần chuẩn bị\n" +
                "300g đường\n" +
                "115g đường mạch nha\n" +
                "90g siro ngô\n" +
                "200g đậu phộng rang\n" +
                "200g mè vàng rang\n" +
                "450ml nước\n" +
                "60g bột năng\n" +
                "1 muỗng canh nước cốt chanh\n" +
                "23g dầu phộng\n" +
                "1 muỗng cafe vani\n" +
                "\n" +
                "Cách làm kẹo mè xửng\n" +
                "Bước 1: Đầu tiên, bạn thoa 1 lớp dầu ăn đều quanh khuôn, rồi áo 1 lớp mè rang đều lên trên.\n" +
                "Bước 2: Bạn lấy 2 muỗng canh nước cho vào chén, rồi cho bột năng vào khuấy tan bột. Tiếp theo, cho mạch nha và siro ngô vào hỗn hợp bột năng rồi khuấy đều. Sau đó, bạn cho đường và lượng nước còn lại vào nồi. Đặt lên bếp, vặn lửa vừa, nấu cho đến khi đường tan thì thêm dầu phộng vào.\n" +
                "Bước 3: Khi bạn thấy nước đường sôi, vặn nhỏ lửa, rồi cho tiếp chén bột năng vào nồi và khuấy đều tay.\n" +
                "Bước 4: Nấu đến khi bạn thấy hỗn hợp đường bắt đầu sền sệt, thì cho phần nước cốt chanh vào. Tiếp tục đảo đều tay và khuấy liên tục, cho đến khi đường đặc lại thành một khối có độ dẻo sánh.\n" +
                "Lưu ý: Kẹo mè xửng có thể cứng hoặc mềm tuỳ vào thời gian nấu đường, để tạo cho đường độ đặc sánh khác nhau. Vì thế, nếu bạn thích kẹo cứng thì có thể nấu đường lâu hơn nhé!\n" +
                "Bước 5: Đến đây, bạn cho đậu phộng rang và vani vào đảo mạnh tay cho đậu dàn đều hỗn hợp đường nhưng lưu ý không làm cho đậu phộng bị bể nát.\n" +
                "Bước 6: Bạn tắt bếp và cho phần đường ra khuôn đã có áo mè ở bước 1. Tiếp theo, bạn rải đều một lớp mè rang lên trên mặt kẹo.\n" +
                "Bước 7: Để cho kẹo thật nguội và se lại, khô hơn lúc còn nóng. Khi kẹo nguội, bạn lấy kẹo ra khỏi khuôn và dùng dao cắt theo kích thước và hình dáng tuỳ ý.\n" +
                "Bước 8: Bạn dùng màng bọc thực phẩm gói kẹo mè xửng lại để bảo quản kẹo được lâu.");

        stringArrayList6.add("Bún Bò Huế");
        stringArrayList6.add("Mỳ Quảng");
        stringArrayList6.add("Cao Lầu");
        stringArrayList6.add("Bánh canh cá lóc");
        stringArrayList6.add("Cơm gà Tam Kỳ");
        stringArrayList6.add("Cơm Hến (Huế)");
        stringArrayList6.add("Bánh canh hẹ (Phú Yên)");
        stringArrayList6.add("Gỏi cá mai ( Ninh Thuận)");
        stringArrayList6.add("Bún cá dầm (Nha Trang)");
        stringArrayList6.add("Bánh đập");
        stringArrayList6.add("Mực rim me");
        stringArrayList6.add("Kẹo Mè Xửng (Huế)");

        anh6.add(R.drawable.jf_laumam);
        anh6.add(R.drawable.jf_laugalagiang);
        anh6.add(R.drawable.phanthiet);
        anh6.add(R.drawable.namchay);
        anh6.add(R.drawable.ghemangchua);
        anh6.add(R.drawable.namthapcam);
        anh6.add(R.drawable.laude);
        anh6.add(R.drawable.laucakeo);
        anh6.add(R.drawable.misonhat);
        anh6.add(R.drawable.ab_khoai_tay);
        anh6.add(R.drawable.ab_banhranman);
        anh6.add(R.drawable.ab_tokbokki);

    }
    public void dsmnam(){
        chebien7.add("Nguyên liệu\n" +
                "300g thịt xương\n" +
                "300g hủ tiếu\n" +
                "1 củ cà rốt\n" +
                "1 củ cải trắng\n" +
                "1 củ hành tây\n" +
                "1 nắm hành lá, hẹ\n" +
                "1 ít giá đỗ\n" +
                "Gia vị: Muối, hạt nêm, bột ngọt, tiêu xay, sa tế, ớt, chanh, nước mắm, đường, hành phi\n" +
                "\n" +
                "Cách nấu hủ tiếu xương heo nhanh chóng, thơm ngon\n" +
                "Bước 1: Sơ chế xương\n" +
                "Đầu tiên, bạn rửa sạch xương với nước muối pha loãng để khử sạch mùi tanh rồi chặt thành miếng nhỏ vừa ăn.\n" +
                "Lúc này, bạn bắc nồi nước lên bếp, đun nóng rồi cho xương vào chần sơ qua để đảm bảo sạch mùi tanh và chất bẩn. Đây là cách nấu hủ tiếu xương đơn giản giúp phần nước dùng đạt hương vị đậm đà.\n" +
                "\n" +
                "Bước 2: Sơ chế các loại nguyên liệu còn lại\n" +
                "Tiếp theo, bạn gọt vỏ cà rốt, củ cải trắng, cắt thành khúc vừa ăn, rửa sạch với nước muối pha loãng để trên rổ cho ráo nước. Kế đó, bạn bóc vỏ hành tây, bổ múi cau, rửa sạch, để trên rổ cho ráo nước.\n" +
                "Sau đó, bạn nhặt bỏ gốc rễ, lá úa vàng của hành lá, hẹ, giá đỗ, rửa sạch với nước muối pha loãng. Tiếp đó, bạn cắt hành lá, hẹ thành khúc ngắn vừa ăn, để riêng là có thể tiến hành nấu hủ tiếu xương.\n" +
                "\n" +
                "Bước 3: Nấu nước dùng\n" +
                "Kế đó, bạn cho xương vào trong nồi, đổ thêm 2 lít nước, bắc lên bếp, ninh để nấu nước dùng hủ tiếu.\n" +
                "Sau đó, bạn cho thêm cà rốt, củ cải trắng, hành tây trong nồi nước ninh xương, ninh khoảng 2 tiếng để tạo vị ngọt tự nhiên cho món ăn. Tiếp đến, bạn tiến hành nêm nếm muối, hạt nêm, bột ngọt, đường, nước mắm sao cho vừa ăn.\n" +
                "\n" +
                "Bước 4: Hoàn thành và trình bày\n" +
                "Tiếp theo, bạn trụng hủ tiếu sơ qua với nước nóng, cho vào bát. Bạn cho thêm giá đỗ, hẹ, hành lá vào cùng.\n" +
                "Cuối cùng, bạn chan nước dùng vừa ninh vào bát, có thêm củ cải trắng, cà rốt, xương lên trên. Rắc thêm ít tiêu xay, sa tế, vắt ít nước cốt chanh là bạn đã có thể thưởng thức hủ tiếu xương nóng hổi, thơm ngon.\n");
        chebien7.add("Nguyên liệu:\n" +
                "- 1 cái lu to dùng để quay chuột\n" +
                "- Chuột đồng khoảng 10 - 15 con nặng khoảng 3 - 4 lạng\n" +
                "- 4 - 5 cây sắt dùng để buột chuột khi quay\n" +
                "- Gia vị: ngũ vị hương, mắm, muối, đường, chanh, tỏi...\n" +
                "\n" +
                "Cách chế biến:\n" +
                "\n" +
                "- Chuột quay lu: Để chế biến món chuột quay lu ta phải chọn lựa những chú chuột đồng béo múp.\n" +
                "\n" +
                "- Làm sạch ruột chuột, cắt móng, bỏ đầu, moi gan ra rồi tẩm ướp gia vị bao gồm tỏi, đường, nước mắm, chanh, ngũ vị hương và bỏ chuột vào trong khoảng chừng 15 phút để gia vị thấm vào bên trong thịt chuột đồng\n" +
                "\n" +
                "- Tiếp theo đó móc từng con chuột đồng bỏ vào lu, vừa quay chuột vừa trở tay đều.\n" +
                "\n" +
                "- Trong lúc quay, liên tục bỏ thêm mỡ, thêm nước gia vị phết lên thịt chuột để chuột ngon hơn, khoảng một tiếng thì chuột chín. Mở nắp lu ra, những chú chuột đồng chín vàng, mùi thơm hấp dẫn sẽ bốc ra thơm nứ.\n" +
                "\n" +
                "- Bày chuột đồng quay lu ra đĩa, dùng kèm với muối tiêu chanh, rau răm, chuối chát, cà chua, dưa leo.");
        chebien7.add("Nguyên liệu làm Bánh canh Trảng Bàng Tây Ninh\n" +
                " Thịt giò heo 1.5 kg\n" +
                "(đã lóc xương)\n" +
                " Xương ống 3 kg\n" +
                " Giò heo 1 kg\n" +
                " Bánh canh 500 gr\n" +
                " Gừng 100 gr\n" +
                "(cắt lát)\n" +
                " Củ cải trắng 2 củ\n" +
                " Hành tây 4 củ\n" +
                " Hành tím 2 củ\n" +
                " Tôm khô 28 gr\n" +
                " Hành lá 3 bó\n" +
                "(cắt nhỏ)\n" +
                " Ngò gai 100 gr\n" +
                "(cắt khúc)\n" +
                " Ớt 4 quả\n" +
                " Giá 100 gr\n" +
                " Giấm 125 ml\n" +
                " Đường phèn 30 gr\n" +
                "(khoảng 2 muỗng canh)\n" +
                " Nước mắm 2 muỗng canh\n" +
                " Muối 8 muỗng canh\n" +
                "\n" +
                "Cách chế biến Bánh canh Trảng Bàng Tây Ninh\n" +
                "1 Sơ chế các nguyên liệu\n" +
                "Củ cải trắng khi mua về bạn rửa sạch với nước rồi để ráo, sau đó bào đi phần vỏ đồng thời cắt đi những phần bị thâm hoặc hư (nếu có). Tiếp đó dùng dao cắt củ cải trắng thành khoanh với độ dày khoảng 2 lóng tay.\n" +
                "Hành tây và hành tím bạn bóc vỏ rồi rửa sạch với nước, sau đó dùng dao cắt thành hành tây làm tư.\n" +
                "\n" +
                "2 Sơ chế thịt heo\n" +
                "Bắc nồi nước sôi lên bếp, cho vào nồi phần giò heo, thịt giò heo, xương ống vào nồi cùng với 125ml giấm và 4 muỗng canh muối. Chần sơ phần thịt heo trong khoảng 5 phút để loại bỏ mùi hôi của thịt và giúp cho nước dùng sau khi nấu xong sẽ trong hơn.\n" +
                "Sau khi chần thì vớt thịt heo ra và rửa sạch với nước rồi để ráo.\n" +
                "\n" +
                "3 Nấu nước dùng\n" +
                "Bắc nồi lên bếp và cho vào nồi 4 lít nước và 40gr gừng, đun đến khi nước sôi thì cho phần thịt giò vào và chỉnh sang lửa vừa. Nấu cho đến khi thịt mềm và vừa chín tới thì với ra cho ngâm với nước lạnh rồi cho phần giò heo ngâm nước lạnh vào tủ lạnh ngăn mát.\n" +
                "\n" +
                "Tiếp đó, bắc nồi lên bếp cùng 8 lít nước rồi đun sôi. Tiếp đó cho vào 60gr gừng, xương ống, thịt giò heo, 2 muỗng canh muối và nấu các nguyên liệu ở lửa vừa trong khoảng 4 tiếng.\n" +
                "\n" +
                "Sau khi đun các nguyên liệu thì vớt phần xương ống và thịt giò heo ra ngâm với nước lạnh. Cho phần nước lèo qua rây lọc để lược bỏ đi phần lợn cợn giúp nước lèo được trong hơn.\n" +
                "\n" +
                "Tiếp tục cho phần xương ống và thịt giò heo vào nồi và đun ở lửa vừa, sau đó cho vào nồi củ cải trắng, hành tây, hành tím đã sơ chế, 30gr đường phèn, 28gr tôm khô, 2 lít nước. Đun hỗn hợp trong khoảng 1 tiếng đồng hồ rồi nêm thêm 2 muỗng canh muối và 2 muỗng canh nước mắm. Khuấy đều hỗn hợp lên cho gia vị tan và bạn nên hớt bọt trên mặt nước dùng.\n" +
                "\n" +
                "Cho phần thịt giò heo ra ngâm với nước lạnh rồi dùng dao cắt thành lát mỏng khoảng 1 lóng tay.\n" +
                "\n" +
                "Nêm nếm gia vị nước dùng cho vừa miệng, sau đó xếp các nguyên liệu ra tô cùng với bánh canh và cho phần nước dùng vào.");
        chebien7.add("Nguyên liệu:\n" +
                "Cá linh khoảng 500g\n" +
                "Xương ống khoảng 1 kg\n" +
                "Chuẩn bị khoảng 100g mỡ lợn\n" +
                "Bông điên điển khoảng 300g\n" +
                "Bông súng  khoảng 200g\n" +
                "Rau ngò gai khoảng 20g\n" +
                "Lá me khoảng 20g, hoặc 1-2 quả me chín. \n" +
                "Tỏi băm: khoảng 2 thìa cà phê\n" +
                "Bún rối khoảng 2kg \n" +
                "\n" +
                "Cách thực hiện:\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "- Trước tiên, móc bỏ ruột cá linh rồi rửa sạch sau đó cho vào rổ để ráo nước.\n" +
                "\n" +
                "- Rửa sạch xương ống\n" +
                "\n" +
                "- Lột vỏ của cọng súng, bẻ thành từ khúc và ngâm với nước muối loãng, sau đó rửa lại với nước sạch rồi để ráo. \n" +
                "\n" +
                "- Nhặt cọng của bông điên điển rồi rửa với nước rồi để ráo.\n" +
                "\n" +
                "Bước 2: Nấu nước lẩu\n" +
                "- Sau khi xương ống đã được rửa sạch, bạn cho đun sôi để hớt hết bọt bẩn. Sau đó bạn cho khoảng 2 lít nước để đun sôi lấy nước dùng, chú ý khi nước đã sôi bạn nên để nhỏ lửa để không bị trào ra. \n" +
                "\n" +
                "Bước 3: Ướp cá linh\n" +
                "- Cá linh đã sơ chế cho ướp cùng với muỗng cà phê tỏi băm đã chuẩn bị trước, tiếp đến cho thêm bột ngọt, tiêu và đường. Dùng găng tay trộn đều để gia vị ngấm vào cá, rồi cho vào ngăn mát tủ lạnh. \n" +
                "\n" +
                "Bước 4: Hoàn thành\n" +
                "- Trong thời gian chờ đợi nước lẩu, bạn lấy mỡ rửa sạch rồi cắt xéo, sau đó cho lên chảo nóng đảo đều. Cho đến khi thấy mỡ tươm ra, bạn tách tóp mỡ để riêng. Sau đó cho phần tỏi băm đã chuẩn bị phi thơm, cho ngò gai, lá me non vào để phi thơm\n" +
                "\n" +
                "- Lúc này bạn cho nước dùng cho vào rồi đun sôi, nêm thêm gia vị để vừa ăn. Sau cùng cho thêm ớt sừng cắt lát, chú ý nên cho vừa phải tăng thêm hương vị. Nếu bạn thích ăn lẩu mắm cá linh cay thì có thể thêm cho nhiều hơn một chút.\n");
        chebien7.add("Nguyên liệu món cá lóc nướng  trui\n" +
                "2 con cá lóc đồng\n" +
                "Rơm khô\n" +
                "Bún tươi\n" +
                "Bánh tráng\n" +
                "Rau sống\n" +
                "50g đậu phộng\n" +
                "Hành lá\n" +
                "\n" +
                "Cách làm cá lóc nướng trui\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "– Hành lá bạn đem cắt gốc, rửa sạch, để ráo rồi thái nhỏ.\n" +
                "\n" +
                "– Các loại rau sống bạn đem rửa sạch, để ráo.\n" +
                "\n" +
                "– Đậu phộng bạn đem rang vàng rồi đãi sạch vỏ. Sau đó, giã nhỏ.\n" +
                "\n" +
                "Bước 2: Làm mỡ hành\n" +
                "– Bạn cho chảo lên bếp, cho dầu ăn vào rồi đun cho dầu ăn sôi lên. Tiếp đến, bạn cho hành lá vào rồi dùng đũa đảo đều lên, bạn cho vào hành lá ít bột ngọt, muối rồi đảo đều lần nữa rồi tắt bếp. Bạn cho hành lá ra chén riêng.\n" +
                "\n" +
                "Bước 3: Nướng cá lóc\n" +
                "– Cá lóc bạn mua về, đem rửa sạch để nguyên con không cần đánh vảy hay làm sạch ruột. Bạn dùng que dài xiên dọc thân cá từ miệng đến đuôi rồi cắm xuống đất. Tiếp đến, bạn dùng rơm khô phủ kín cá rồi đốt lửa. Liên tục nướng cá và cho rơm vào, nướng đến khi cá chín là được.\n" +
                "\n" +
                "Bước 4: Trình bày\n" +
                "– Sau khi chín, bạn cạo sạch lớp vảy cháy đen rồi đặt cá vào đĩa. Dùng dao rọc đường dài từ trên xuống theo sống lưng của cá, rồi rẽ thịt cá sang 2 bên. Tiếp đến, bạn rưới mỡ hành và đậu phộng rang lên và trình bày cùng với các loại rau là hoàn thành rồi đấy!\n" +
                "\n" +
                "Nước chấm cá lóc nướng trui\n" +
                "\n" +
                "Nước mắm me\n" +
                "Nguyên liệu nước mắm me\n" +
                "1 vắt me\n" +
                "Nước mắm\n" +
                "Đường\n" +
                "Tiêu\n" +
                "Ớt\n" +
                "\n" +
                "Cách làm nước mắm me\n" +
                "Bước 1: Bạn cho me vào chén, cho nước ấm vào ngâm me. Dùng muỗng dầm me rồi lọc lấy nước cốt me sền sệt.\n" +
                "\n" +
                "Bước 2: Tiếp đến, bạn cho đường, nước mắm vào cho vừa ăn.\n" +
                "\n" +
                "Bước 3: Cuối cùng, cho ớt cắt lát và đậu phộng giã nhỏ vao là được.");
        chebien7.add("Chuẩn bị nguyên liệu làm nước mắm:\n" +
                "\n" +
                "Nước mắm truyền thống Hoàng Gia\n" +
                "Đường phèn hoặc đường cát trắng\n" +
                "Tỏi lột vỏ, ớt cắt cuống, bỏ bớt hạt, gừng cạo vỏ cắt lát, tất cả cho vào cối giã nhuyễn\n" +
                "Chanh vắt lấy nước cốt\n" +
                "Tương ớt, tương xí muội\n" +
                "Cách thực hiện:\n" +
                "\n" +
                "Bạn cho đường vào một cái tô, cho nước mắm vào khuấy cho tan đường. Tiếp tục cho nước cốt chanh vào và khuấy đều.\n" +
                "Tiếp theo bạn cho ớt, tỏi, gừng đã giã nhuyễn vào và khuấy lên.\n" +
                "Cuối cùng bạn cho thêm tương ớt và tương xí muội vào khuấy đều vừa để tăng hương vị vừa giúp món ăn thêm màu đẹp mắt.\n" +
                "Bạn có thể cho vài cọng ngò rí vào để trang trí cho chén nước mắm thêm đẹp và có thêm mùi thơm.\n" +
                "Vì để chấm đuông dừa nên bạn cần làm nước mắm thiên về vị cay nhiều hơn để góp phần tăng thêm hương vị cho món ăn.\n");
        chebien7.add("Nguyên liệu làm Bánh pía (Cho 12 cái)\n" +
                " Bột mì đa dụng 400 gram\n" +
                " Đậu xanh 250 gram\n" +
                " Đường cát trắng 300 gram\n" +
                " Thịt sầu riêng 200 gram\n" +
                " Nước lọc 220 ml\n" +
                " Bột năng 100 gram\n" +
                " Mỡ lợn 300 gram\n" +
                " Dầu thực vật 145 ml\n" +
                " Mạch nha 15 gram\n" +
                " Trứng 12 quả\n" +
                "(lòng đỏ trứng muối)\n" +
                " Baking power 4 gram\n" +
                "(bột nở)\n" +
                " Màu đỏ thực phẩm 1/4 muỗng cà phê\n" +
                "\n" +
                "Cách chế biến Bánh pía\n" +
                "1 Làm phần bột nước (bột vỏ)\n" +
                "Trộn đều 300 gram bột mì và 2 gram bột nở vào trong một chiếc chậu nhỏ.\n" +
                "\n" +
                "Cắt nhỏ 200 gram mỡ lợn và cho vào chảo thắng với lửa vừa để lấy nước mỡ. Thắng đến khi mỡ teo lại thành tốp nhỏ vàng ươm thì tắt bếp, vớt bỏ tốp mỡ.\n" +
                "\n" +
                "Sau đó vun bột thành một cái núi nhỏ, khoét một lỗ ở giữa núi bột và cho 40 gram đường cát trắng, 120 ml nước sạch, 50 ml dầu thực vật và 50 ml mỡ nước vào (tỉ lệ 1:1 giữa dầu thực vật và mỡ).\n" +
                "\n" +
                "Dùng tay nhào trộn nguyên liệu quyện vào nhau để tạo thành một hỗn hợp bột dẻo. Để bột nghỉ khoảng 30 phút, sau đó cân và chia bột thành 12 phần bằng nhau.\n" +
                "\n" +
                "2 Làm phần bột dầu (bột ruột)\n" +
                "Cho 100 gram bột mì, 100 gram bột năng và 2 gram bột nở vào bát sau đó dùng tay trộn bột đều lên.\n" +
                "\n" +
                "Tiếp tục cho 20 gram đường cát trắng, 35 ml mỡ nước, 100 ml nước và 45 ml dầu thực vật vào hỗn hợp bột khô và trộn đều trong khoảng 5 phút đến khi cảm thấy hỗn hợp bột quyện đều vào nhau, dẻo và mịn.\n" +
                "\n" +
                "Để bột nghỉ 30 phút. Sau đó cân và chia bột đều ra làm 12 phần bằng nhau. Lưu ý, phần bột này khá ẩm và hơi nhão.\n" +
                "\n" +
                "3 Làm phần nhân bánh Pía\n" +
                "Chế biến mỡ lợn:\n" +
                "\n" +
                "Đem 100 gram mỡ lợn rửa sạch, cắt hạt lựu rồi đem luộc chín.\n" +
                "Vớt phần mỡ sau khi luộc ra để ráo rồi trộn với 60 gram đường cát trắng. Để hỗn hợp mỡ đường ra chỗ nắng cho mỡ trong lại.\n" +
                "Chế biến trứng muối: Lòng đỏ trứng muối xả sạch dưới vòi nước rồi đem ngâm với rượu trắng trong 15 phút. Sau đó lấy ra hấp chín.\n" +
                "\n" +
                "Chế biến đậu xanh:\n" +
                "\n" +
                "Cho 250 gram đậu xanh bỏ vỏ, ngâm nước cho mềm (tốt nhất là bạn nên ngâm từ 7 đến 8 tiếng) vào nồi, đổ nước ngập trên mặt đậu 1 đốt ngón tay.\n" +
                "Đun đến khi đậu chín mềm. Trong quá trình đun hớt bọt cho sạch.\n" +
                "Cho đậu chín vào máy xay sinh tố và xay (xay khô không thêm nước) cho đậu nhuyễn mịn.\n" +
                "Sên đậu xanh:\n" +
                "\n" +
                "Cho chảo chống dính lên bếp, để lửa to để chảo nóng đều. Sau đó chuyển sang lửa vừa, cho đậu xay nhuyễn vào chảo và xào với 180 gram đường.\n" +
                "Trong quá trình sên đậu, cho dầu ăn vào hỗn hợp nhiều lần. Sên đến khi đậu trở nên trong, dẻo thì cho 200 gram sầu riêng say nhuyễn và 100 gram mỡ đường vào xào cùng.\n" +
                "Sên với lửa thật nhỏ để tránh tình trạng tách dầu.\n" +
                "Khi hỗn hợp đã trong, dẻo và không còn dính chảo nữa thì cho 15 gram mạch nha vào và trộn đều.\n" +
                "Để hỗn hợp nhân thật nguội rồi chia thành 12 phần bằng nhau.\n" +
                "Lấy mỗi phần nhân bọc lấy 1 lòng đỏ trứng muối rồi vo tròn lại.\n" +
                "\n" +
                "4 Cách cán và gói bánh Pía\n" +
                "Đặt 1 viên bột nước ra một mặt phẳng sạch rồi cán mỏng. Đặt 1 viên bột dầu vào trong rồi bọc kín và vo tròn lại.\n" +
                "\n" +
                "Sau đó, cán tiếp tục bột thành một hình thoi dài, độ dày khoảng 0,3 cm rồi cuộn chặt lại theo chiều dọc.\n" +
                "\n" +
                "Tiếp tục cán cuộn bột trên thành một hình tròn mỏng, độ lớn đủ để bọc lấy viên nhân bánh và thừa được ra một chút.\n" +
                "\n" +
                "Bạn phải cán sao cho phần giữa miếng bột thì dày, mép ngoài mỏng dần để dễ gói.\n" +
                "\n" +
                "Đặt viên nhân bánh vào giữa miếng bột vỏ, gói lại cho kín nhân và dùng tay nắn nhẹ để được khối cầu đều.\n" +
                "\n" +
                "Bạn cần gói cho lớp vỏ bám sát viên nhân bánh, dính mép bột chặt tay để nhân không bị hở ra ngoài khi nướng bánh.\n" +
                "\n" +
                "Phần bột thừa ra bạn dùng tay túm chặt lại giống như túi gói quà. Quay phần túm bột xuống dưới thành đế bánh.\n" +
                "\n" +
                "Đặt bánh đã nặn xong lên khay nướng có lót giấy nến chống dính. Dùng tay đè cho bánh hơi dẹt xuống, bề mặt bánh bằng phẳng.\n" +
                "\n" +
                "5 Trang trí bánh Pía\n" +
                "Dùng ngón tay ấn nhẹ lên mặt bánh để mặt bánh phẳng ra.\n" +
                "\n" +
                "Lấy 2 – 3 miếng bông tẩy trang đặt lên đĩa sạch.\n" +
                "\n" +
                "Hòa tan 3 – 4 giọt màu thực phẩm màu đỏ với một chút nước rồi đổ lên miếng bông.\n" +
                "\n" +
                "Ấn nhẹ miếng in hình lên mặt bông rồi in lên bánh.\n" +
                "\n" +
                "6 Nướng bánh Pía\n" +
                "Trước khi nướng chúng ta lật bánh úp lại để bánh không bị phồng lên khi nướng.\n" +
                "\n" +
                "Bật lò nướng ở 200 độ. Cho khay bánh vào nướng trong vòng 15 – 20 phút đến khi vỏ bánh hơi đục và bắt đầu nở xốp.\n" +
                "\n" +
                "Lấy bánh ra, dùng tăm xăm vài lỗ trên mặt bánh để thoát khí. Đánh tan 1 lòng đỏ trứng gà với 1 chút nước rồi dùng chổi quét đều lên bánh. Cho khay bánh vào lò ở 180 độ và nướng thêm 15 phút nữa đến khi bánh vàng đều là được. Khi nướng lần 2 không cần lật úp bánh lại nhé.\n" +
                "\n" +
                "7 Thành phẩm\n" +
                "Bánh đạt yêu cầu là bánh tròn, đều, vỏ bánh không bị tróc da. Bánh chín đều, xốp, không nhão. Nhân bánh thơm mùi đặt trưng sầu riêng, nhân trứng muối không quá khô, vị vừa ăn.\n");
        chebien7.add("Nguyên liệu :\n" +
                "\n" +
                "- 1 con cá bống mú cỡ nhỏ\n" +
                "\n" +
                "- 300g mỡ heo tươi\n" +
                "\n" +
                "- 1 trái dừa tươi lấy nước\n" +
                "\n" +
                "- Hành lá ,hành tím tỏi băm, ớt hiểm tươi\n" +
                "\n" +
                "- Gia vị : nước mắm, đường, tiêu.\n" +
                "\n" +
                "Cách thực hiện :\n" +
                "- Mỡ heo tươi cắt hạt lựu đều tay, cho lên chảo thắng với lửa vừa đều đến cho khi tóp mỡ khô thì vớt ra, để ráo, rắc ít muối để giữ độ dòn.\n" +
                "- Hành lá cắt phần đầu đập dập, ớt hiểm thái nhỏ hoặc để nguyên trái tùy thích\n" +
                "- Cá làm sạch, lấy muối chà sát cho bớt nhớt tanh, cắt khúc vừa ăn.\n" +
                "- Ướp cá với hành tím tỏi băm + đầu hành lá + 2 muỗng canh nước mắm ngon + 1 muỗng đường + 1 muỗng tiêu khoảng 25- 30 phút cho thấm gia vị.\n" +
                "- Làm nóng nồi đất, cho mỡ nước vào phi thơm hành tỏi, trút cá vào nồi nấu với lửa lớn cho cá săn lại thì đổ nước dừa tươi vào kho, hạ lửa nhỏ cho nước dừa thấm vào cá.\n" +
                "- Nước rút bớt thì nêm nếm lại cho vừa, cho ớt tươi nguyên trái vào kho chung, hoặc cho thêm tiêu nếu thích cay. Tiếp tục cho tóp mỡ vào kho, muốn cá béo thì cho thêm ít mỡ nước.\n" +
                "- Nước kho sánh lại là được, cho vào hành lá cắt nhuyễn , tắt bếp.\n");
        chebien7.add("Nguyên liệu :\n" +
                "\n" +
                "- 1 gói bột bánh khọt.\n" +
                "\n" +
                "- 300g dừa nạo.\n" +
                "\n" +
                "- 2 trứng gà.\n" +
                "\n" +
                "- 300g tôm bạc đất\n" +
                "\n" +
                "- 200g thịt heo xay\n" +
                "\n" +
                "- 300g đậu xanh cà vỏ\n" +
                "\n" +
                "- Rau sống các loại, xà lách, cải bẹ xanh (nếu thích), hành lá, chanh, ớt tươi xay, hành tím băm.\n" +
                "\n" +
                "- Gia vị : muối, bột ngọt, đường, nước mắm.\n" +
                "\n" +
                "\n" +
                "Cách thực hiện :\n" +
                "\n" +
                "1.Chuẩn bị nguyên liệu :\n" +
                "\n" +
                "- Dừa nạo cho nước ấm vào vắt lấy nước cốt . Bạn để riêng khoảng 1 chén nhỏ nước cốt dừa dành đổ lên mặt bánh khi gần chín.\n" +
                "\n" +
                "- Tôm rửa sạch, bỏ đầu đuôi, lột vò hay không tùy thích. Có thể để nguyên con hay che đôi tùy thích, luộc chín.\n" +
                "\n" +
                "- Đậu xanh cà vỏ ngâm nước trước, sau đó đem nấu chín.\n" +
                "\n" +
                "- Phi thơm hành tím, cho thịt heo xay vào xào với ít nước mắm + bột ngọt + tiêu cho đậm đà.\n" +
                "\n" +
                "- Rau sống các loại rửa sạch để ráo. Hành lá rửa sạch, cắt nhỏ.\n" +
                "\n" +
                "2.Pha bột :\n" +
                "\n" +
                "- Bột cho ra tô lớn, nêm vào ít muối. Sau đó cho nước cốt dừa + 350ml nước lọc vào khuấy tan. Lược lại qua rây cho bột được mịn.\n" +
                "\n" +
                "- Trong gói bột thường có đi kèm bột nghệ, tùy thích mà cho lượng bột nghệ vừa tô bột.\n" +
                "\n" +
                "- Đánh tan trứng gà và cho vào tô bột để bánh được xốp. Cuối cùng cho hành lá cắt nhuyễn vào là hoàn thành phần bột\n" +
                "\n" +
                "3.Đổ bánh\n" +
                "\n" +
                "- Làm nóng khuôn. Cho ít dầu vào khuôn, đổ bột vào trước, sau đó cho thịt heo, đâu xanh vào.\n" +
                "\n" +
                "- Khi bánh gần chín, đổ ít nước cốt dừa lên mặt rồi đặt tôm lên bánh và đây nắp cho đến khi bánh chín.\n" +
                "\n" +
                "- Bánh chín dùng muỗng tách bánh ra khỏi khuôn và tiếp tục đổ đến hết bột.\n" +
                "\n" +
                "4.Làm nước chấm :\n" +
                "\n" +
                "- Hòa tan theo tỉ lệ : 1 nước mắm + 2 đường + 1 chén nước ấm + chanh.\n" +
                "\n" +
                "- Nếm thấy nước mắm chau ngọt theo khẩu vị gia đình bạn là được. Cho ớt xay và đồ chua vào chén nước mắm khi ăn.");
        chebien7.add("Nguyên liệu :\n" +
                "- 300gr thịt ba rọi\n" +
                "- 100 gr cơm dừa (nếu thích bạn có thể mua trái dừa để dùng nước và cơm dừa để kho thịt)\n" +
                "- Gia vị : Hành tím, tỏi băm,đường, nước mắm, tiêu.\n" +
                "Cách làm :\n" +
                "- Thịt ba rọi rửa sạch thái miếng mỏng vừa ăn, ướp với hành tím, tỏi băm, nước mắm, đường và tiêu. Để 15 phút cho thấm đều\n" +
                "- Miếng cơm dừa gọt lớp vỏ, rửa sạch thái lát mỏng vừa ăn.\n" +
                "- Bắc chảo dầu nóng, cho tỏi băm vào phi thơm, cho thịt đã ướp vào đảo nhanh tay. Rang cho thịt săn lại lại, nước còn sền sện thì nêm vào 1/2 muỗng nước mắm và 1/2 chén nước lạnh (hoặc nước dừa) vào nấu với lửa nhỏ.\n" +
                "- Khi nước kho gần cạn thì cho cơm dừa vào đảo đều, để kho thêm 5 phút cho thấm thì tắt bếp. Rắc tiêu lên bề mặt hoặc có thể cho vào ớt hiểm thái miếng nếu bạn thích ăn cay.\n");
        chebien7.add("Nguyên liệu :\n" +
                "\n" +
                "- 1 nải chuối sứ chín mùi\n" +
                "\n" +
                "- 100g bột khoai\n" +
                "\n" +
                "- 100g bột bán loại nhỏ.\n" +
                "\n" +
                "- 300g dừa nạo.\n" +
                "\n" +
                "- 1 ống vani.\n" +
                "\n" +
                "- 100g đậu phộng sống.\n" +
                "\n" +
                "- 200g đường cát trắng.\n" +
                "\n" +
                "\n" +
                "Cách thực hiện :\n" +
                "\n" +
                "- Chuối để nguyên vỏ đem luộc chín (dằn ít muối), vớt chuối ra mới lột vỏ như vậy thì chuối bớt chát, khi chưng mới trắng và giữ nguyên được hương vị cảu chuối.\n" +
                "\n" +
                "- Bột báng ngâm nước độ 10 phút, bột khoai bẻ khúc ngâm mềm.\n" +
                "\n" +
                "- Dừa nạo cho nước ấm vào vắt lấy 1 chén nước cốt + 3 chén nước dão.\n" +
                "\n" +
                "- Đậu phộng rang vàng, giã nát.\n" +
                "\n" +
                "- Cho chuối vào nồi nấu với nước dừa dão + 200g đường cát (có thể gia giảm theo ý thích của bạn) + ít muối, nấu với lửa vừa từ 25 – 30 phút.\n" +
                "\n" +
                "- Chuối thấm dừa thì cho bột khoai vào nấu cùng, vì bột báng nhanh mềm nên khi bột khoai mềm thì hãy cho bột báng nấu khoảng 15 phút đến khi bột cho trong là được.\n" +
                "\n" +
                "- Sau đó cho chén nước cốt dừa vào , quậy đều khoảng 3 phút để không bị đóng ván. Nhắc nồi chè xuống, cho ống vani vào.\n");
        chebien7.add("Nguyên liệu :\n" +
                "\n" +
                "- 300g cá kèo\n" +
                "\n" +
                "- Nước dừa tươi\n" +
                "\n" +
                "- Hành tím băm, ớt hiểm tươi, ớt sừng trâu, rau răm.\n" +
                "\n" +
                "- Gia vị : nước mắm, đường, bột ngọt, tiêu.\n" +
                "\n" +
                "\n" +
                "Cách thực hiện :\n" +
                "\n" +
                "- Cá kèo làm sạch, để ráo. Ướp vào hành tím băm + 1 muỗng nước mắm + ½ muỗng đường + ½ muỗng bột ngọt + tiêu (vị cay tùy ý thích) + 1 trái ớt hiểm bằm khoảng 15 – 20 phút cho cá thấm.\n" +
                "\n" +
                "- Bắc nồi đất lên cho nóng dầu, cho 1 muỗng đường vào nấu nước màu, khi đường ngả màu đẹp thì cho cá vào kho với lửa lớn.\n" +
                "\n" +
                "- Thịt cá săn lại thì cho nước dừa tươi vào sấp mặt cá và kho với lửa vừa.\n" +
                "\n" +
                "- Khi nước kho còn sâp sấp thì cho ớt hiểm hoặc ớt sừng trâu thái miếng mỏng vào kho chung cho thấm, có thể cho mỡ heo hoặc dầu ăn vào để cá được béo và màu sắc mượt mà.\n" +
                "\n" +
                "- Nước kho rút nêm vào ít nước mắm cho thơm, tắt lửa.");

        stringArrayList7.add("Hủ tiếu");
        stringArrayList7.add("Chuột đồng nướng lu");
        stringArrayList7.add("Bánh canh Trảng Bàng");
        stringArrayList7.add("Lẩu cá linh bông điên điển");
        stringArrayList7.add("Cá lóc nướng trui");
        stringArrayList7.add("Đuông dừa tắm mắm");
        stringArrayList7.add("Bánh pía");
        stringArrayList7.add("Cá Bống Mú Kho Tiêu");
        stringArrayList7.add("Bánh Khọt");
        stringArrayList7.add("Thịt Kho Cơm Dừa");
        stringArrayList7.add("Chè chuối chưng");
        stringArrayList7.add("Cá kèo kho tiêu");

        anh7.add(R.drawable.sachanh);
        anh7.add(R.drawable.hapgung);
        anh7.add(R.drawable.caibexanh);
        anh7.add(R.drawable.tuongbot);
        anh7.add(R.drawable.giavi);
        anh7.add(R.drawable.muoixa);
        anh7.add(R.drawable.luot);
        anh7.add(R.drawable.tomhapnam);
        anh7.add(R.drawable.ab_suachua);
        anh7.add(R.drawable.ab_banhplan);
        anh7.add(R.drawable.ab_phomaique);
        anh7.add(R.drawable.caibexanh);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cdd:
                Intent intent = new Intent(MainActivity.this,chat_dinh_duong.class);
                startActivity(intent);
                break;
            case R.id.bamien:
                Intent intent1 = new Intent(MainActivity.this,mon_an_ba_mien.class);
                startActivity(intent1);
                break;
            case R.id.amthuc_sukhoe:
                Intent intent2 = new Intent(MainActivity.this,amthuc_suckhoe.class);
                startActivity(intent2);
                break;
            case R.id.antoan:
                Intent intent3 = new Intent(MainActivity.this, antoantp.class);
                startActivity(intent3);
                break;
            case R.id.meovat:
                Intent intent4 = new Intent(MainActivity.this, meovat.class);
                startActivity(intent4);
                break;
            case R.id.mbac:
                Intent intent5 = new Intent(MainActivity.this,mon_an.class);
                intent5.putExtra("intarray",anh5);
                intent5.putExtra("chebien",chebien5);
                intent5.putExtra("stringarray",stringArrayList5);
                intent5.putExtra("string","Đặc Sản Miền Bắc");
                startActivity(intent5);
                break;
            case R.id.mtrung:
                Intent intent6 = new Intent(MainActivity.this,mon_an.class);
                intent6.putExtra("intarray",anh6);
                intent6.putExtra("chebien",chebien6);
                intent6.putExtra("stringarray",stringArrayList6);
                intent6.putExtra("string","Đặc Sản Miền Trung");
                startActivity(intent6);
                break;
            case R.id.mnam:
                Intent intent7 = new Intent(MainActivity.this,mon_an.class);
                intent7.putExtra("intarray",anh7);
                intent7.putExtra("chebien",chebien7);
                intent7.putExtra("stringarray",stringArrayList7);
                intent7.putExtra("string","Đặc Sản Miền Trung");
                startActivity(intent7);
                break;
            default:
                break;

        }
    }
}