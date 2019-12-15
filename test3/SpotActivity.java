package com.example.test3;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SpotActivity extends AppCompatActivity implements View.OnClickListener
{
    public static final String SPOT_NAME ="fruit_name";

    public static final String SPOT_IMAGE_ID ="fruit_image_id";

    private MyDatabaseHelper dbHelper;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        dbHelper = new MyDatabaseHelper(this, "BookStore.db", null, 1);
        Button createDatabase = findViewById(R.id.create_database);
        createDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                dbHelper.getWritableDatabase();
            }
        });
        Intent intent=getIntent();
        String spotName =intent.getStringExtra(SPOT_NAME);
        int spotImageId=intent.getIntExtra(SPOT_IMAGE_ID,0);
        Toolbar toolbar=findViewById(R.id.toolbar);
        CollapsingToolbarLayout collapsingToolbar=findViewById(R.id.collapsing_toolbar);
        ImageView spotImageView = findViewById(R.id.fruit_image_view);
        TextView ContentText1 = findViewById(R.id.fruit_content_text1);
        TextView ContentText2 = findViewById(R.id.fruit_content_text2);
        TextView briefIntroduction= findViewById(R.id.brief_intro);
        TextView guidance= findViewById(R.id.guidance);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null)
        {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        collapsingToolbar.setTitle(spotName);
        Glide.with(this).load(spotImageId).into(spotImageView);
        String fruitContent=generateFruitContent(spotName);
        ContentText1.setText(fruitContent);
        ContentText2.setText("        南京有关历史的博物馆很多，似乎都是大同小异，但是 江宁织造博物馆绝对是一个独特的存在，从一干博物馆中脱 颖而出。\n" +
                "        作为一个喜欢红楼梦的妹子，这里的红楼展馆太符合心 意了!不论是 3D 的影像呈现还是音乐体验，让人眼前一亮 的同时，也消解了一味参观的单调。不仅如此，还有猜灯谜、 南京话版红楼这样有意思的展示。喜欢红楼梦的同学一定要 来一趟，这里是不会让你失望的!博物馆内还有真人演示操 作织布机，美丽的配色、流畅的动作，可以让人目不转睛。\n" +
                "        除此之外，还可以到旗袍展馆臭美一把。看着橱窗里的 月份牌女郎，以及那一件件印花、刺绣、蕾丝的旗袍，是不 是会有一点心动呢?展馆里还有可以看到真人试穿效果的 机器,(同行的小哥哥们居然玩的不亦乐乎......)，是不是很有 意思呢?\n" +
                "        到了楼上，还可以看到一个小型的空中花园。这个设计 绝对是别出心裁了，竹亭、戏台、流水、还有很多的锦鲤... 转发江宁织造博物馆的锦鲤，拥有杨超越的运气不是问题!\n" +
                "        总之，江宁织造，强推，一生推，非常值得一去!适合 一个人，也适合两三个人一起去，并且网上购票还会有优惠 的哦!");

        TextView textView1 = findViewById(R.id.brief_intro);
        TextView textView2 = findViewById(R.id.guidance);
        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
        ContentText2.setVisibility(ContentText2.GONE);
        ContentText1.setVisibility(ContentText1.VISIBLE);
        //briefIntroduction.getPaint().setFakeBoldText(true);
        briefIntroduction.setTextColor(Color.parseColor("#32a3fd"));
    }


    private String generateFruitContent(String fruitName){
        StringBuilder spotContent = new StringBuilder();
        for(int i=0;i<1;i++){
            spotContent.append("        江宁织造博物馆位于南京大行宫地区，是在江宁织 造旧址上建造的一座现代博物馆，也是著名建筑家吴良镛先生的收山之作。建筑整体风格是取中国山水画中深远、高远、平远之意境，将北高南低的建筑群尽可能用园林手法加以覆盖。建筑内复建了织造署中原有的西池、楝亭、萱 瑞堂、西堂等建筑，从南望北叠叠高起，如同一幅江南山水画，是现代建筑的语言和传统园林建筑结合的经典之作。\n" +
                    "\n\n参观须知:\n" +
                    "1. 开放时间:8:30~17:30，17:00 以后停止售票\n" +
                    "2. 门票:30 元，凭学生证半价，未满 18 周岁免费\n" +
                    "3. 交通:地铁至大行宫站\n" +
                    "4. 注意事项:馆内部分展品不得触摸，部分场馆拍照\n" +
                    "不能开闪光灯\n" +
                    "5. 参观时间:2~3 小时");
        }
        return spotContent.toString();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view)
    {
        TextView spotContentText1=  findViewById(R.id.fruit_content_text1);
        TextView spotContentText2 = findViewById(R.id.fruit_content_text2);
        TextView briefIntroduction= findViewById(R.id.brief_intro);
        TextView guidance= findViewById(R.id.guidance);
        switch (view.getId())
        {
            case R.id.brief_intro:
                spotContentText2.setVisibility(spotContentText2.GONE);
                spotContentText1.setVisibility(spotContentText1.VISIBLE);
                briefIntroduction.setTextColor(Color.parseColor("#32a3fd"));
                guidance.setTextColor(Color.parseColor("#999999"));
                //guidance.getPaint().setFakeBoldText(false);
                //briefIntroduction.getPaint().setFakeBoldText(true);
                break;
            case R.id.guidance:
                spotContentText1.setVisibility(spotContentText1.GONE);
                spotContentText2.setVisibility(spotContentText2.VISIBLE);
                guidance.setTextColor(Color.parseColor("#32a3fd"));
                briefIntroduction.setTextColor(Color.parseColor("#999999"));
                //briefIntroduction.getPaint().setFakeBoldText(false);
                //guidance.getPaint().setFakeBoldText(true);
                break;
            default:
                break;
        }

    }
}

