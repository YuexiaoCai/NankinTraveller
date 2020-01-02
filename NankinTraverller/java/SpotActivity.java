package com.example.test3;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SpotActivity extends AppCompatActivity implements View.OnClickListener {


    private DBOpenHelper mDBOpenHelper;
    private ImageView imageViewLike;
    private TextView textViewLike;
    private ImageView imageViewFavorite;
    private TextView textViewFavorite;
    private ImageView imageViewComment;
    private TextView textViewComment;
    private ImageView  mIvArticleBack;
    private ImageView  mIvArticleEdit;
    private ImageView  mIvArticleDelete;
    public int ifLiked = 0;
    public int ifFavorited = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spot);

        initView();

        mIvArticleEdit.setVisibility(View.GONE);
        mIvArticleDelete.setVisibility(View.GONE);

        mDBOpenHelper = new DBOpenHelper(this);
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");

        TextView textView0 = findViewById(R.id.spot_toolbar_text_right);
        TextView textView1 = findViewById(R.id.spot_text_1);

        switch (data)
        {

            case "甘熙故居":
                textView0.setText("甘熙故居");
                textView1.setText("        去之前做了一下了解，感觉这是一个很好玩的地方，但是，不去不知道，一去吓一跳，网络上都是骗人的。什么这里比较清净，还不是因为去的人少；什么这里步步是景，不如说步步是杂物；什么这里有手艺人现场做工，人是有了，都闲着呢。\n" +
                        "        网上的九十九间半，听上去挺壮观的，其实里面挺小的，一会就走完了。但是吧，里面的服务人员挺热情的，服务还不错。\n" +
                        "        总的来说，这个地方不适合单独去，顺路就瞅一眼，不顺路就算了，不是很值得去的地方。\n");
                break;
            case "明故宫":
                textView0.setText("明故宫");
                textView1.setText("        “泱泱大明三百年，无汉唐之和亲，无两宋之岁币，不割地，不赔款，不和亲，不纳贡。" +
                        "天子守国门，君王死社稷。”\n" +
                        "        明朝一直是我最喜欢的一个朝代，不仅仅是因为它是我大汉民族的最后一个朝代，更因" +
                        "为这是一个光辉与骨气并存的朝代，“文死谏”、“武死战”，民族的脊骨从来都是坚挺而笔直" +
                        "的。自南向北走过午朝门公园和明故宫大殿遗址，就仿佛能听到这些沉睡了几百年的石刻，" +
                        "在一句一字地诉说着肝胆赤诚的故事。\n"+"        沿着御道路走到午门，映入眼帘的是五座券门。\n" +
                        "        这五座门成凹字形，中间三座城门墙体内倾，上有青砖横砌，下有须弥底座，中间是雕" +
                        "刻精细的束腰。摸着午门的青砖和卷草纹，看着脚下依稀可辨的车辙痕铺就的青石地，仿佛" +
                        "能想象到几百年前，宫车过境，文武百官日日穿梭于宫门的景象。而今，绿植在宫门夹缝中" +
                        "野蛮生长，没了当初的威武肃穆，反倒是青砖绿叶和温暖的阳光，点缀了和谐静谧的午门。" +
                        "走上午门两边的石阶，早已看不到曾经恢弘富丽的“五凤楼”，岁月只留下了一方方经纬相间" +
                        "的石柱础，它们无声地躺在这里，陪伴着同样静默的断井颓垣。");

                break;
            case "明孝陵":
                textView0.setText("明孝陵");
                textView1.setText("        “二十四年兴大业，龙盘虎踞在江东。”古有东吴大帝孙仲谋，善骑射，有雄略，可谓是" +
                        "一代枭雄。孙仲谋的陵寝最终选址在了紫金山，然而有一个人也把自己的坟墓建在了紫金山，" +
                        "并且说让孙武替我看门吧！\n" +
                        "        这位来头大，口气也大的人，就是明朝的开国皇帝――明太祖朱元璋。作为一个没有背" +
                        "景，没有后台，没有依靠，甚至是只能沿街乞讨的乞丐，朱元璋从死人堆里爬了出来，赤手" +
                        "空拳建立起了庞大的帝国。\n" +
                        "        然而每个成功男人的背后都有一个默默支持他的女子，而对于朱元璋来说，这个女子就" +
                        "是谁都无法替代的马皇后。作为一个封建时代的女子，马皇后可以算得上是一股清流了。且" +
                        "不说他在朱元璋最困难，最贫穷的时候嫁给了他，用自己的行动，默默支持着朱元璋的开国" +
                        "大业，光是马皇后那一分仁慈之心就值得我们景仰。朱元璋是一个有野心的人，而作为他的" +
                        "妻子，马皇后则是温柔贤良的。在朱元璋行军打仗之时，马皇后不仅捐赠了自己的首饰、财" +
                        "物填补军费，还亲自为士兵们缝洗衣服。而这种体恤之心在她大富大贵成为皇后之后也并未" +
                        "动摇。\n" +
                        "        她时刻奉劝朱元璋要关心民间疾苦，在后来的蓝田惨案中，她一次一次地劝阻，从朱元" +
                        "璋的屠刀下救出了许多人。作为一个猜忌心非常重的人，朱元璋谁的话也听不进去，唯独马" +
                        "皇后例外。我想这不仅是因为他们夫妻伉俪情深，更因为马皇后陪他度过了最艰难的岁月，" +
                        "他知道这个女子永远站在他的身后支持着他，这就是他最值得信任、永远不会背叛的人。就" +
                        "连马皇后临死前，也不愿意太医为她治疗，因为她担心一旦没有成效，陛下会降罪于太医。" +
                        "这样一个仁慈的女子，时时刻刻在关心着别人，这一份心值得任何一个人的尊重。因此，马" +
                        "皇后被追封为仁孝慈太后，葬于明孝陵。朱元璋驾崩之后，也选择了陪伴在他妻子的身边，" +
                        "一起躺在了紫金山。\n" +
                        "        大风起兮云飞扬，昔日帝王，横扫六合，挥鞭天下。当初那个乞丐朱重八成为了万众仰" +
                        "望的帝王，温柔善良的马姑娘却永远离开了他。然而，俱往矣，激荡风云的岁月已经过去，" +
                        "如今留下的也只有钟山孝陵地底下的地宫以及现在我们还能够参观的明楼、文武方门和石像" +
                        "路神道。\n" +
                        "        朱元璋是个了不起的人物，如今走在明孝陵里，我们仍能感觉得到那一份帝王霸气。七" +
                        "种动物和文臣武将镇守的明孝陵，有七星镇座，北斗指阵，依山傍势，体现了巍巍皇家寝冢" +
                        "的气度。");

                break;
            case "南京博物院":
                textView0.setText("南京博物院");
                textView1.setText("        也许是一种缘分，来南京一年的时间里，我竟然三次走入南京博物院，三次与南博相遇，" +
                        "给了我深深的记忆。\n" +
                        "        天很蓝，云很淡，雄伟的殿宇在阳光下挺拔壮观。走进南京博物院，率先映入眼中的便" +
                        "是那座大殿。在我看来，这座大殿算得上我踏进南博后所见的第一件文物了吧。虽然他的年" +
                        "代不长，但他却历经了不少的沧桑。南京博物院产生于那个动荡的年代，于 1933 年始，在" +
                        "蔡元培先生的倡议下，开启了南博的孕育之路，时局的动荡，经费的不足，致使最初的修建" +
                        "计划被改变，仅仅修建了现在的大殿。后来，他又逢抗日年代的战火侵扰，被日军大肆修改" +
                        "破坏，损失严重。就这样，南京博物院一期工程断断续续的进行到 1948 年，才算完工。现" +
                        "在，呈现在我们眼前的南京博物院是经过后续的扩建，才达到现在的规模与模样。");

                break;
            case "江宁织造府":
                textView0.setText("江宁织造府");
                textView1.setText("        来南京的这一年里，大大小小的景点去了很多个。而江宁织造博物馆，并没有非常大吸" +
                        "引力的名字，一直没有列入我的参观清单内。然而一圈参观下来，这里给了我很多惊喜，觉" +
                        "得把它列为我最喜欢的南京景点也不为过。\n" +
                        "        江宁织造博物馆主要三个的展馆分别是以红楼梦、云锦、江南织造馆为主题的。整个博" +
                        "物馆给人的感觉就是现代和古代完美的融合，尤其是在红楼梦展馆内。红楼梦作为我最喜欢" +
                        "的书，上上下下翻阅了很多遍，所以这个展馆是我最喜欢的。\n" +
                        "        红楼梦影院屏幕上放映着最经典的八七版红楼梦，贾老爷责问着宝玉的情节，另说了袭" +
                        "人名字的由来。这样的作品是百看不腻的，不仅仅是因为每一个动作，每一句话都值得推敲，" +
                        "更是因为这些经典是一点点打磨出来的，和快餐式的速成品截然不同。");

                break;
            case "总统府":
                textView0.setText("总统府");
                textView1.setText("        初见总统府，还是在初中的历史课本上，那张解放军解放南京后，于总统府门楼上的欢呼。当时并没有太多关注到总统府。但是还好，我来到了这座城市，这座处处都有故事的城市；我来到了这座总统府，这座承载了南京历史变迁的建筑。去之前，并没有做什么准备，只是随便玩玩，买了票之后就进去随性的走，随性的看，看着看着，我渐渐喜欢上了这里。\n" +
                        "        于是一边走一边查询着史料。我发现这个地方，集中体现了南京历史上具有很大意义的时期，明朝，清朝，太平天国，乃至近代，每一个时期都在这里有着缩影。首先是煦园，这座有着600年历史的王府花园，同时也记录了600年来此地的风云变换：从明王府到清两江总督署，再到见证了太平天国的兴衰与中华民国临时政府的成立。接着是中线上的行政建筑，这些楼宇记录着在国民党统治时期的风云际会，从抗日战争到国共合作再到解放南京，桩桩件件都关系着中华民族的存亡。最后是西侧的太平天国展馆与清两江总督署史料展，时间真是冷漠，曾经争锋相对的两个政权，如今却共同呈现给世人。");

                break;
            case "中山陵":
                textView0.setText("中山陵");
                textView1.setText("        钟山，南京四大名山之一，此处可以说是城中之景，闹市之中近乎自然的地方了。来钟山风景区游玩，一是赏历史之迹，一是拂自然之风，如何侧重，全看心境。\n" +
                        "        一游钟山，游的是历史沧桑。\n" +
                        "        古都南京，一座游故事的城，而从古至今南京城的重大变化与发展，几乎都在钟山一带留存着丰富的积淀，刻下清晰的印记。自六朝始，钟山之阴，多少帝王功臣安睡于此；自六朝始，钟山之南，又成为江东佛教胜地；自六朝始，钟山之地，均为军事要冲，兵家必争之地；古往今来，多少文人雅士遨游钟山，留下脍炙人口的诗文篇章；特别是农民起义领袖洪秀全领导的太平天国和中国伟大的民主革命先行者孙中山先生领导的辛亥革命期间，多少悲壮惨烈的战斗在钟山展开，多少英雄志士在钟山浴血奋斗。");

                break;
            case "鸡鸣寺":
                textView0.setText("鸡鸣寺");
                textView1.setText("        早就听说鸡鸣寺的樱花很是漂亮，但我还无缘目睹，只能在朋友的空间里一览其风采。虽没见到鸡鸣寺的樱花，但还好在暑假去了鸡鸣寺一游、一拜。");

                break;
            case "静海寺":
                textView0.setText("静海寺");
                textView1.setText("        天妃宫坐落在阅江楼脚下，传说妈祖作为我们的海神，常常在海上解救遇到风险的船队，" +
                        "让许多人化险为夷，因此这里是郑和出海前必来参拜的地方。而船队凯旋归来后，为达明成" +
                        "祖四海升平的愿望，又在天妃宫边上修建了静海寺。\n" +
                        "        静海寺的大门上是一副对联，上联“古寺历沧桑奇耻殊荣关国运”，下联“大江流日夜雄" +
                        "风豪气铸民魂”。这副对联说明了静海寺作为南京八大寺之一，见证了我国明朝时候的辉煌" +
                        "航海史，也目睹了丧权辱国不平等条约的签订。同样的，寺庙的观赏展区也是以这两方面为" +
                        "主题的。\n" +
                        "        郑和，原名马三宝，没有显赫的家世，没有强大的后台，并非含着金汤匙出生的王侯将" +
                        "相，却把自己的名字永恒的刻在了中国历史上。\n" +
                        "        28 年昼夜星驰，30 多个陌生国度，9 万里波澜壮阔的远航，一袭汉裳的少年意气风发，" +
                        "开创了我们的航海时代。葡萄牙人航行到一个国度，首先举起的是他们的枪炮和贪婪的欲望，" +
                        "但郑和的船队，永远是献上丰厚的礼物和中华民族渴望海清的心愿。欧洲的航海建立在殖民" +
                        "的基础上，而我们的航海才是大国的征服，一来展示富强，二来止戈为武。");

                break;
            case "玄武湖":
                textView0.setText("玄武湖");
                textView1.setText("        覆舟山上龙光寺，玄武湖上五龙堂。\n" +
                        "        想见旧时游历处，烟云渺渺水茫茫。\n" +
                        "        南京最美的两大湖，一个被埋在了明故宫之下，还有一个就是玄武湖。");

                break;
            case "阅江楼":
                textView0.setText("阅江楼");
                textView1.setText("        “一江奔海万千里，两记呼楼六百年。”洪武七年，政通人和，百废俱兴，朱元璋想起" +
                        "了自己只手打江山之时，曾于郊外龙湾的狮子山以少胜多，大败陈友谅。于是他决定在这个" +
                        "意义非凡的地方修建阅江楼。\n" +
                        "        山不在高，有仙则灵，阅江楼就坐落在了不高的狮子山顶。这里以阅江揽胜而得名，还" +
                        "没走到狮子山脚下，就能看到山顶的红柱黄瓦。");

                break;
            case "南航明故宫校区":
                textView0.setText("南航明故宫校区");
                textView1.setText("        南京航空航天大学坐落在明故宫遗址附近，600 多年前，这里还是巍峨的太庙与社稷" +
                        "坛。1950 年，空军 21 工厂迁至南京明故宫机场，专门从事飞机综合修理。后来，空军 21" +
                        "工厂更名为国营 511 厂，并筹办 “南京航空工业专科学校”。从此以后，古朴的明故宫和新" +
                        "时代的航空事业，这两个貌似八竿子也打不着的名词，就这样被紧密地联系在了一起。");
                break;

        }

        String title;
        String type;
        String content;
        String author;


        ArrayList<Article> data1 = mDBOpenHelper.getAllArticle();
        for (int i = 0; i < data1.size(); i++) {
            if(data1.size()!=0){
                Article article = data1.get(i);
                title = article.getTitle();
                type = article.getType();
                content = article.getContent();
                author = article.getAuthor();
                if(data.equals(title)){//传入的data为标题
                    textView0.setText(title);
                    textView1.setText(content);
                    if(author.equals(MainActivity.userName)){
                        mIvArticleEdit.setVisibility(View.VISIBLE);
                        mIvArticleDelete.setVisibility(View.VISIBLE);
                    }

                }

            }
        }

        String articleTitle;
        String likeAuthor;
        String favoriteAuthor;

        ArrayList<Like> data2 = mDBOpenHelper.getAllLike();
        for (int i = 0; i < data2.size(); i++) {
                Like like = data2.get(i);
                articleTitle = like.getArticleTitle();
                likeAuthor = like.getAuthor();
                if(data.equals(articleTitle)&&(MainActivity.userName.equals(likeAuthor))){
                    ifLiked = 1;
                    textViewLike.setTextColor(Color.parseColor("#008577"));
                    imageViewLike.setImageDrawable(getResources().getDrawable(R.drawable.like_filled));
                }
        }

        ArrayList<Favorite> data3 = mDBOpenHelper.getAllFavorite();
        for (int i = 0; i < data3.size(); i++) {
            Favorite favorite = data3.get(i);
            articleTitle = favorite.getArticleTitle();
            favoriteAuthor = favorite.getAuthor();
            if(data.equals(articleTitle)&&(MainActivity.userName.equals(favoriteAuthor))){
                ifFavorited = 1;
                textViewFavorite.setTextColor(Color.parseColor("#008577"));
                imageViewFavorite.setImageDrawable(getResources().getDrawable(R.drawable.star_filled));
            }
        }

    }


    private void initView(){

        imageViewLike = findViewById(R.id.spot_toolbar_like);
        textViewLike = findViewById(R.id.spot_toolbar_like_word);
        mIvArticleBack = findViewById(R.id.spot_toolbar_image_left);
        imageViewFavorite = findViewById(R.id.spot_toolbar_star);
        textViewFavorite = findViewById(R.id.spot_toolbar_star_word);
        imageViewComment = findViewById(R.id.spot_toolbar_comment);
        textViewComment = findViewById(R.id.spot_toolbar_comment_word);
        mIvArticleEdit = findViewById(R.id.spot_toolbar_image_edit);
        mIvArticleDelete = findViewById(R.id.spot_toolbar_image_delete);

        imageViewLike.setOnClickListener(this);
        textViewLike.setOnClickListener(this);
        imageViewFavorite.setOnClickListener(this);
        textViewFavorite.setOnClickListener(this);
        imageViewComment.setOnClickListener(this);
        textViewComment.setOnClickListener(this);
        mIvArticleBack.setOnClickListener(this);
        mIvArticleEdit.setOnClickListener(this);
        mIvArticleDelete.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");

        if(MainActivity.userName.equals("Visitor")){
            Toast.makeText(this,  "请登录后使用进行点赞、评论、收藏", Toast.LENGTH_SHORT).show();
        }
        else{
            switch (view.getId()) {
                case R.id.spot_toolbar_image_left: //返回文章列表界面
                    finish();
                    break;
                case R.id.spot_toolbar_like:
                case R.id.spot_toolbar_like_word:
                    if(ifLiked == 0)
                    {
                        mDBOpenHelper.addLike(data,MainActivity.userName);
                        textViewLike.setTextColor(Color.parseColor("#008577"));
                        imageViewLike.setImageDrawable(getResources().getDrawable(R.drawable.like_filled));
                        ifLiked = 1;
                    }
                    else if(ifLiked == 1)
                    {
                        mDBOpenHelper.deleteLike(data,MainActivity.userName);
                        textViewLike.setTextColor(Color.parseColor("#000000"));
                        imageViewLike.setImageDrawable(getResources().getDrawable(R.drawable.like));
                        ifLiked = 0;
                    }
                    break;

                case R.id.spot_toolbar_star:
                case R.id.spot_toolbar_star_word:
                    if(ifFavorited == 0)
                    {
                        mDBOpenHelper.addFavorite(data,MainActivity.userName);
                        textViewFavorite.setTextColor(Color.parseColor("#008577"));
                        imageViewFavorite.setImageDrawable(getResources().getDrawable(R.drawable.star_filled));
                        ifFavorited = 1;
                    }
                    else if(ifFavorited == 1)
                    {
                        mDBOpenHelper.deleteFavorite(data,MainActivity.userName);
                        textViewFavorite.setTextColor(Color.parseColor("#000000"));
                        imageViewFavorite.setImageDrawable(getResources().getDrawable(R.drawable.star));
                        ifFavorited = 0;
                    }
                    break;
                case R.id.spot_toolbar_comment:
                case R.id.spot_toolbar_comment_word:
                    Intent intent4 = new Intent(this, ActivityComment.class);
                    intent4.putExtra("articleTitle",data);
                    startActivity(intent4);


                    break;
                case R.id.spot_toolbar_image_delete:
                    finish();
                    mDBOpenHelper.deleteArticle(data);
                    Toast.makeText(this, "删除成功，请刷新", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.spot_toolbar_image_edit:
                    String title;
                    String type;
                    String content;
                    String author;

                    ArrayList<Article> data1 = mDBOpenHelper.getAllArticle();
                    for (int i = 0; i < data1.size(); i++) {
                        if(data1.size()!=0){
                            Article article = data1.get(i);
                            title = article.getTitle();
                            type = article.getType();
                            content = article.getContent();
                            author = article.getAuthor();
                            if(data.equals(title)){//传入的data为标题
                                Intent intent1 = new Intent(this, AddArticle.class);
                                intent1.putExtra("article",new Article(title,type,content,author));
                                startActivity(intent1);
                                finish();//销毁此Activity
                            }
                        }
                    }
                    break;


            }
        }

    }


}
