package com.tinh.ailtriuph;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tvQuestion;
    private TextView tvContentQuestion;
    private TextView tvAnswer1,tvAnswer2,tvAnswer3,tvAnswer4;
    private List<Question> mListQuestion;
    private Question mQuestion;
    private int currentQuestion =0;
    TextToSpeech tts;
    CountDownTimer count;
    int diem=1 ;
    boolean click = true;
    List<cauhoi> list;
    List<Question> list1;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVi();
        mListQuestion = getListQuestion();
        if(mListQuestion.isEmpty()){
            return;
        }
        setDataQuestion(mListQuestion.get(currentQuestion));
    }

    private void setDataQuestion(Question question) {
        if(question== null){
            return;
        }
        mQuestion = question;
        tvAnswer1.setBackgroundResource(R.drawable.custum_blule_coner30);
        tvAnswer2.setBackgroundResource(R.drawable.custum_blule_coner30);
        tvAnswer3.setBackgroundResource(R.drawable.custum_blule_coner30);
        tvAnswer4.setBackgroundResource(R.drawable.custum_blule_coner30);

        String titleQuestion = "Câu hỏi " + question.getNumber();
        tvQuestion.setText(titleQuestion);
        tvContentQuestion.setText(question.getContent());

       speech(question.getContent());


        tvAnswer1.setText(question.getListAnswer().get(0).getContent());
        tvAnswer2.setText(question.getListAnswer().get(1).getContent());
        tvAnswer3.setText(question.getListAnswer().get(2).getContent());
        tvAnswer4.setText(question.getListAnswer().get(3).getContent());

        tvAnswer1.setOnClickListener(this);
        tvAnswer2.setOnClickListener(this);
        tvAnswer3.setOnClickListener(this);
        tvAnswer4.setOnClickListener(this);

    }

    private void initVi(){
        tvQuestion = findViewById(R.id.tv_question);
        tvContentQuestion = findViewById(R.id.tv_content_question);
        tvAnswer1 = findViewById(R.id.tv_answer1);
        tvAnswer2 = findViewById(R.id.tv_answer2);
        tvAnswer3 = findViewById(R.id.tv_answer3);
        tvAnswer4 = findViewById(R.id.tv_answer4);
    }
    private List<Question> getListQuestion(){
         list = new ArrayList<>();
         list1 = new ArrayList<>();
        List<Answer> answerList1 = new ArrayList<>();
        answerList1.add(new Answer("Gà",true));
        answerList1.add(new Answer("Cá",false));
        answerList1.add(new Answer("Lợn",false));
        answerList1.add(new Answer("Bò",false));

        List<Answer> answerList2 = new ArrayList<>();
        answerList2.add(new Answer("Hàn Quốc",true));
        answerList2.add(new Answer("Trung Quốc",false));
        answerList2.add(new Answer("Nhật Bản",false));
        answerList2.add(new Answer("Ấn Độ",false));

        List<Answer> answerList3 = new ArrayList<>();
        answerList3.add(new Answer("Nguyễn Thị Minh Khai",false));
        answerList3.add(new Answer("Võ Thị Sáu",false));
        answerList3.add(new Answer("Nguyễn Thị Chiên",true));
        answerList3.add(new Answer("Hoàng Thị Loan",false));

        List<Answer> answerList4 = new ArrayList<>();
        answerList4.add(new Answer("Cầu Thanh Trì",false));
        answerList4.add(new Answer("Cầu Rồng",false));
        answerList4.add(new Answer("Cầu Sông Hàn",true));
        answerList4.add(new Answer("Cầu Cần Thơ",false));

        List<Answer> answerList5 = new ArrayList<>();
        answerList5.add(new Answer("Italia",false));
        answerList5.add(new Answer("Thụy sĩ",false));
        answerList5.add(new Answer("Pháp",false));
        answerList5.add(new Answer("Bỉ",true));
        List<Answer> answerList6 = new ArrayList<>();
        answerList6.add(new Answer("Nước",false));
        answerList6.add(new Answer("Cát trắng",true));
        answerList6.add(new Answer("Sắt",false));
        answerList6.add(new Answer("Đá",false));
        List<Answer> answerList7 = new ArrayList<>();
        answerList7.add(new Answer("X",false));
        answerList7.add(new Answer("L",false));
        answerList7.add(new Answer("M",true));
        answerList7.add(new Answer("C",false));
        List<Answer> answerList8 = new ArrayList<>();
        answerList8.add(new Answer("Mùng 9/3",false));
        answerList8.add(new Answer("Mùng 8/3",false));
        answerList8.add(new Answer("Mùng 10/3",true));
        answerList8.add(new Answer("Mùng 10/2",false));
        List<Answer> answerList9 = new ArrayList<>();
        answerList9.add(new Answer("Hình vuông",false));
        answerList9.add(new Answer("Hình tam giác",false));
        answerList9.add(new Answer("Hình thoi",false ));
        answerList9.add(new Answer("Hình thang",true ));
        List<Answer> answerList10 = new ArrayList<>();
        answerList10.add(new Answer("Đồng và sắt",false));
        answerList10.add(new Answer("Đồng và kẽm",true ));
        answerList10.add(new Answer("Đồng và vàng",false));
        answerList10.add(new Answer("Đồng và nhôm",false));
        List<Answer> answerList11 = new ArrayList<>();
        answerList11.add(new Answer("1912",true ));
        answerList11.add(new Answer("1911",false));
        answerList11.add(new Answer("1910",false));
        answerList11.add(new Answer("1913",false));
        List<Answer> answerList12 = new ArrayList<>();
        answerList12.add(new Answer("Chùa Quán Sứ ",true ));
        answerList12.add(new Answer("Chùa Thiên Mụ ",false));
        answerList12.add(new Answer("Chùa Bái Đính ",false));
        answerList12.add(new Answer("Chùa Keo ",false));
        List<Answer> answerList13 = new ArrayList<>();
        answerList13.add(new Answer("Hoa cúc ",false));
        answerList13.add(new Answer("Hoa sen ",true ));
        answerList13.add(new Answer("Hoa đào ",false));
        answerList13.add(new Answer("Hoa mai ",false));
        List<Answer> answerList14 = new ArrayList<>();
        answerList14.add(new Answer("Trần Quốc Toản ",false));
        answerList14.add(new Answer("Trần Quang Khải ",false));
        answerList14.add(new Answer("Phạm Ngũ Lão ",false));
        answerList14.add(new Answer("Trần Khánh Dư ",true ));
        List<Answer> answerList15 = new ArrayList<>();
        answerList15.add(new Answer("Bồ Đào Nha ",false));
        answerList15.add(new Answer("Anh ",false));
        answerList15.add(new Answer("Pháp ",true ));
        answerList15.add(new Answer("Đức ",false));
        List<Answer> answerList16 = new ArrayList<>();
        answerList16.add(new Answer("Đông-ti-mo ",false));
        answerList16.add(new Answer("Lào",true ));
        answerList16.add(new Answer("Bru-nây ",false));
        answerList16.add(new Answer("Singapo ",false));
        List<Answer> answerList17 = new ArrayList<>();
        answerList17.add(new Answer("Vị ngọt ",false));
        answerList17.add(new Answer("Vị mặn ",false));
        answerList17.add(new Answer("Vị chua ",false));
        answerList17.add(new Answer("Vị đắng ",true ));
        List<Answer> answerList18 = new ArrayList<>();
        answerList18.add(new Answer("Trương Phi",false));
        answerList18.add(new Answer("Lí Bạch ",false));
        answerList18.add(new Answer("Bá Kiến ",false));
        answerList18.add(new Answer("Chí Phèo ",true ));
        List<Answer> answerList19 = new ArrayList<>();
        answerList19.add(new Answer("30 ",false));
        answerList19.add(new Answer("28 ",false));
        answerList19.add(new Answer("32 ",true ));
        answerList19.add(new Answer("26 ",false));
        List<Answer> answerList20 = new ArrayList<>();
        answerList20.add(new Answer("Hokkaido",false  ));
        answerList20.add(new Answer("Shikoku",false));
        answerList20.add(new Answer("Honshu",true ));
        answerList20.add(new Answer("Kyushu",false));
        List<Answer> answerList21 = new ArrayList<>();
        answerList21.add(new Answer("Bệnh sốt rét ",true ));
        answerList21.add(new Answer("HIV/AIDS ",false));
        answerList21.add(new Answer("Bệnh lao ",false));
        answerList21.add(new Answer("Bệnh ung thư ",false));
        List<Answer> answerList22 = new ArrayList<>();
        answerList22.add(new Answer("Quốc tế thiếu nhi ",false));
        answerList22.add(new Answer("Đại dương thế giới ",true ));
        answerList22.add(new Answer("Môi trường thế giới ",false));
        answerList22.add(new Answer("Ngày vi chất dinh dưỡng ",false));
        List<Answer> answerList23 = new ArrayList<>();
        answerList23.add(new Answer("VTV1 ",false));
        answerList23.add(new Answer("VTV3 ",false));
        answerList23.add(new Answer("VTV5 ",false));
        answerList23.add(new Answer("VTV6 ",true ));
        List<Answer> answerList24 = new ArrayList<>();
        answerList24.add(new Answer("Lê Thần Tông ",false));
        answerList24.add(new Answer("Lê Thái Tông ",false));
        answerList24.add(new Answer("Lê Thánh Tông ",true ));
        answerList24.add(new Answer("Lí Thái Tổ ",false));
        List<Answer> answerList25 = new ArrayList<>();
        answerList25.add(new Answer("Sao Thổ ",false));
        answerList25.add(new Answer("Sao Mộc ",true ));
        answerList25.add(new Answer("Sao Kim ",false));
        answerList25.add(new Answer("Sao Hỏa ",false));
        List<Answer> answerList26 = new ArrayList<>();
        answerList26.add(new Answer("Châu Phi ",false));
        answerList26.add(new Answer("Châu Đại Dương ",false));
        answerList26.add(new Answer("Châu Âu ",false));
        answerList26.add(new Answer("Châu Mĩ ",true ));
        List<Answer> answerList27 = new ArrayList<>();
        answerList27.add(new Answer("20 ",true ));
        answerList27.add(new Answer("18 ",false));
        answerList27.add(new Answer("16 ",false));
        answerList27.add(new Answer("22 ",false));
        List<Answer> answerList28 = new ArrayList<>();
        answerList28.add(new Answer("Hòa Bình ",false));
        answerList28.add(new Answer("Hải Phòng ",true ));
        answerList28.add(new Answer("Yên Bái ",false));
        answerList28.add(new Answer("Thái Nguyên ",false));
        List<Answer> answerList29 = new ArrayList<>();
        answerList29.add(new Answer("18 ",false));
        answerList29.add(new Answer("19 ",false));
        answerList29.add(new Answer("20 ",false));
        answerList29.add(new Answer("21 ",true ));
        List<Answer> answerList30 = new ArrayList<>();
        answerList30.add(new Answer("Lao ",true ));
        answerList30.add(new Answer("Ung thư ",false));
        answerList30.add(new Answer("Bướu cổ ",false));
        answerList30.add(new Answer("HIV/AIDS ",false));
        List<Answer> answerList31 = new ArrayList<>();
        answerList31.add(new Answer("Khởi nhĩa Ba Tơ ",false));
        answerList31.add(new Answer("Khởi nghĩa Nam Kì ",true ));
        answerList31.add(new Answer("Khởi nghĩa Bắc Sơn ",false));
        answerList31.add(new Answer("Khởi nghĩa Hai Bà Trưng ",false));
        List<Answer> answerList32 = new ArrayList<>();
        answerList32.add(new Answer("NPK ",false));
        answerList32.add(new Answer("Lân ",false));
        answerList32.add(new Answer("Đạm ",true ));
        answerList32.add(new Answer("Phân Kali ",false));
        List<Answer> answerList33 = new ArrayList<>();
        answerList33.add(new Answer("H Mông ",false));
        answerList33.add(new Answer("Tày",true ));
        answerList33.add(new Answer("Khơ ",false ));
        answerList33.add(new Answer("Mường ",false));
        List<Answer> answerList34 = new ArrayList<>();
        answerList34.add(new Answer("Cần Thơ ",false));
        answerList34.add(new Answer("An Giang ",false));
        answerList34.add(new Answer("Tiền Giang ",false ));
        answerList34.add(new Answer("Long An ",true));
        List<Answer> answerList35 = new ArrayList<>();
        answerList35.add(new Answer("Indonesia ",true));
        answerList35.add(new Answer("Singapo ",false));
        answerList35.add(new Answer("Thái Lan ",false ));
        answerList35.add(new Answer("Mianma ",false));
        List<Answer> answerList36 = new ArrayList<>();
        answerList36.add(new Answer("Măng cụt ",false));
        answerList36.add(new Answer("Mãng cầu ",false));
        answerList36.add(new Answer("Sầu Riêng ",true ));
        answerList36.add(new Answer("Mít ",false));
        List<Answer> answerList37 = new ArrayList<>();
        answerList37.add(new Answer("Paris",false));
        answerList37.add(new Answer("Brussel ",false));
        answerList37.add(new Answer("Frankurt ",true ));
        answerList37.add(new Answer("Geneva ",false));
        List<Answer> answerList38 = new ArrayList<>();
        answerList38.add(new Answer("Điện ảnh ",false));
        answerList38.add(new Answer("Truyền hình ",true));
        answerList38.add(new Answer("Âm nhạc ",false ));
        answerList38.add(new Answer("Thể thao ",false));
        List<Answer> answerList39 = new ArrayList<>();
        answerList39.add(new Answer("Verona ",true));
        answerList39.add(new Answer("Milan ",false));
        answerList39.add(new Answer("Venice ",false ));
        answerList39.add(new Answer("Rome ",false));
        List<Answer> answerList40 = new ArrayList<>();
        answerList40.add(new Answer("Ruột khoang ",false));
        answerList40.add(new Answer("Thân mềm ",false));
        answerList40.add(new Answer("Động vật nguyên sinh ",false ));
        answerList40.add(new Answer("Chân khớp ",true));


        list.add(new cauhoi(1,"Con nào sau đây là gia cầm?",answerList1));
        list.add(new cauhoi(2,"ASIAD 2014 được tổ chức tại nước nào?",answerList2));
        list.add(new cauhoi(3,"Ai là người nữ anh hùng đầu tiên của Quân đội nhân dân Việt Nam?",answerList3));
        list.add(new cauhoi(4," Trong các cây cầu sau, cầu nào là cầu xoay?",answerList4));
        list.add(new cauhoi(5,"Trụ sở của liên minh châu Âu EU đặt tại quốc gia nào?",answerList5));
        list.add(new cauhoi(6,"Loại vật liệu dùng trong sản xuất thủy tinh",answerList6));
        list.add(new cauhoi(7,"Số La Mã nào sau đây có giá trị lớn nhất?",answerList7));
        list.add(new cauhoi(8,"Ngày giỗ tổ Hùng Vương?",answerList8));
        list.add(new cauhoi(8,"Các mặt bên của hình chóp cụt là hình gì?",answerList9));
        list.add(new cauhoi(8,"Đồng thau là hợp kim của hai kim loại nào?",answerList10));
        list.add(new cauhoi(8,"Tàu Titanic bị đắm vào năm nào?",answerList11));
        list.add(new cauhoi(8,"Ngôi chùa nào là trụ sở của Giáo hội Phật giáo Việt Nam?",answerList12));
        list.add(new cauhoi(8,"Loài hoa nào được bình chọn là quốc hoa của Việt Nam?",answerList13));
        list.add(new cauhoi(8,"Ai chỉ huy trận Vân Đồn đánh tan đoàn thuyền lương của quân xâm lược\n" +
                "nhà Nguyên?",answerList14));
        list.add(new cauhoi(8,"Quốc gia nào đăng cai EURO 2016?",answerList15));
        list.add(new cauhoi(8,"Quốc gia duy nhất Đông Nam Á không giáp biển?",answerList16));
        list.add(new cauhoi(8,"Đầu lưỡi nhạy cảm nhất với vị nào?",answerList17));
        list.add(new cauhoi(8,"Những người hay xay xỉn thì được gọi là đệ tử của ai?",answerList18));
        list.add(new cauhoi(8,"Một người bình thường có tối đa bao nhiêu răng?",answerList19));
        list.add(new cauhoi(8,"Núi Phú Sĩ nằm trên hòn đảo nào của quần đảo Nhật Bản?",answerList20));
        list.add(new cauhoi(8,"Quinin là thuốc:",answerList21));
        list.add(new cauhoi(8,"Ngày 8/6 là ngày gì?",answerList22));
        list.add(new cauhoi(8,"Kênh truyền hình nào của Đài truyền hình Việt Nam là \"Không gian gặp\n" +
                "gỡ của giới trẻ\"?",answerList23));
        list.add(new cauhoi(8,"Tập thơ “Thiên Nam dư hạ tập” được biên soạn dưới triều vua nào?",answerList24));
        list.add(new cauhoi(8,"Trong Hệ Mặt Trời, hành tinh nào phản chiếu ánh sáng màu đỏ?",answerList25));
        list.add(new cauhoi(8,"Châu lục nào nằm hoàn toàn ở bán cầu Tây?",answerList26));
        list.add(new cauhoi(8,"Trẻ em có bao nhiêu chiếc răng sữa?",answerList27));
        list.add(new cauhoi(8,"Thành phố nào sau đây là thành phố trực thuộc TW?",answerList28));
        list.add(new cauhoi(8,"Đột biến ở NST bao nhiêu gây ra bệnh Down?",answerList29));
        list.add(new cauhoi(8,"Ngày 24/3 là ngày thế giới phòng chống ...?",answerList30));
        list.add(new cauhoi(8,"Cờ đỏ sao vàng lần đầu tiên xuất hiện tại cuộc khởi nghĩa nào?",answerList31));
        list.add(new cauhoi(8,"Ure là loại phân nào?",answerList32));
        list.add(new cauhoi(8,"Trong các dân tộc sau, dân tộc nào có số người đông nhất?",answerList33));
        list.add(new cauhoi(8,"Địa danh \"Cần Giuộc\" trong bài \"Văn Tế nghĩa Sĩ Cần Giuộc\" hiện nay\n" +
                "nằm ở tỉnh nào ?",answerList34));
        list.add(new cauhoi(8,"Đương kim Tổng thống Mỹ Barack Obama đã trải qua tuổi thơ ở đất\n" +
                "nước Đông Nam Á nào?",answerList35));
        list.add(new cauhoi(8,"Bánh Pía có hương vị đặc trưng của loại quả nào sau đây?",answerList36));
        list.add(new cauhoi(8,"Ngân hàng trung ương châu Âu (ECB) có trụ sở đặt tại thành phố nào?",answerList37));
        list.add(new cauhoi(8,"Giải thưởng Emmy là giải thưởng cao quý của thể loại giải trí nào?",answerList38));
        list.add(new cauhoi(8,"Bối cảnh của câu chuyện tỉnh Romeo và Juliet là thành phố nào của nước\n" +
                "Ý?",answerList39));
        list.add(new cauhoi(8,"Côn trùng (sâu bọ) là lớp động vật thuộc ngành động vật nào?",answerList40));

        for(int i=1;i<=list.size();i++){

            Random random = new Random();
            int so =random.nextInt(list.size());

            list1.add(new Question(i,list.get(so).getContent(),list.get(so).getListAnswer()));
            list.remove(list.get(so));
        }


        return list1;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.tv_answer1:
                if (click) {
                    click=false;
                    tvAnswer1.setBackgroundResource(R.drawable.custum_orange_coner30);

                    checkAnswer(tvAnswer1, mQuestion, mQuestion.getListAnswer().get(0));

                }
                break;
            case R.id.tv_answer2:
                if (click){
                    click=false;
                    tvAnswer2.setBackgroundResource(R.drawable.custum_orange_coner30);
                    checkAnswer(tvAnswer2, mQuestion,mQuestion.getListAnswer().get(1));

                }

                break;
            case R.id.tv_answer3:
                if (click){
                    click = false;
                    tvAnswer3.setBackgroundResource(R.drawable.custum_orange_coner30);
                    checkAnswer(tvAnswer3, mQuestion,mQuestion.getListAnswer().get(2));

                }

                break;
            case R.id.tv_answer4:
                if (click){
                    click=false;
                    tvAnswer4.setBackgroundResource(R.drawable.custum_orange_coner30);
                    checkAnswer(tvAnswer4, mQuestion,mQuestion.getListAnswer().get(3));

                }

                break;
        }
    }
    private void checkAnswer(TextView textView, Question question,Answer answer){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(answer.isCorrect()){
                    textView.setBackgroundResource(R.drawable.custum_green_coner30);
                    nextQuestion();

                }
                else{
                    textView.setBackgroundResource(R.drawable.custum_red_coner30);
                    showAnswerCorrect(question);
                    gameOver();

                }
                click = true;
            }
        }, 1000);
    }

    private void gameOver() {
        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
//                if (diem < currentQuestion||diem== currentQuestion){
//                    diemcao();
//                }
                String content = "Tôi năm nay 70 tuổi rồi mà tôi chưa gặp đứa nào ngốc như cậu. Phải tôi thì tôi đã trả lời đúng câu này rồi";
                showDialog("GameOver",content);
            }
        },1000);
    }

    private void showAnswerCorrect(Question question) {
        if(question==null|| question.getListAnswer()==null|| question.getListAnswer().isEmpty()){
            return;
        }
        if(question.getListAnswer().get(0).isCorrect()){
            tvAnswer1.setBackgroundResource(R.drawable.custum_green_coner30);
        }else if(question.getListAnswer().get(1).isCorrect()){
            tvAnswer2.setBackgroundResource(R.drawable.custum_green_coner30);
        }else if(question.getListAnswer().get(2).isCorrect()){
            tvAnswer3.setBackgroundResource(R.drawable.custum_green_coner30);
        }else if(question.getListAnswer().get(3).isCorrect()){
            tvAnswer4.setBackgroundResource(R.drawable.custum_green_coner30);
        }
    }

    private void nextQuestion() {
//        if(currentQuestion== mListQuestion.size()-1){
        if(currentQuestion== 14){
//            diemcao();
            String content = "Ối dồi ôi. Con cái nhà ai mà đã vừa xinh rồi còn vừa giỏi. Thế này ai chịu nổi";
            showDialog("You win",content);
        }else{
            currentQuestion++;
            new Handler().postDelayed( new Runnable() {
                @Override
                public void run() {
                    setDataQuestion(mListQuestion.get(currentQuestion));
                }
            },1000);
        }
    }
    private void showDialog(String massage,String noi){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(massage);
        builder.setCancelable(false);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                currentQuestion =0;
//                setDataQuestion(mListQuestion.get(currentQuestion));
                dialog.dismiss();
                finish();
                speech(noi);
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void speech( String input){
        tts = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                // Neu ko co loi
                if (status != TextToSpeech.ERROR){
                    tts.setLanguage(Locale.UK);
                }else {
                    Toast.makeText(MainActivity.this, "Loi", Toast.LENGTH_SHORT).show();
                }
            }
        });
        count = new CountDownTimer(500,500) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                String toSpeech = input.toString();
                tts.speak(toSpeech,TextToSpeech.QUEUE_FLUSH,null);
            }
        }.start();
    }
//    public void diemcao(){
//        diem=currentQuestion;
//        SharedPreferences.Editor editor = sp.edit();
//        editor.putInt("diemcao",diem);
//        editor.commit();
//    }
//    public void loadDiemCao(){
//        sp = getSharedPreferences("myShare", Context.MODE_PRIVATE);
//        int dc = sp.getInt("diemcao",0);
//        Toast.makeText(MainActivity.this, String.valueOf(dc), Toast.LENGTH_SHORT).show();
//    }
}