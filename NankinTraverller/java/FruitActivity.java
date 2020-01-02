package com.example.test3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FruitActivity extends AppCompatActivity implements View.OnClickListener
{

    public static final String FRUIT_IMAGE_ID="fruit_image_id";
    private Button onePointButton;
    private Button twoPointButton;
    private Button threePointButton;
    private Button fourPointButton;
    private Button fivePointButton;
    private SpotOpenHelper spotOpenHelper;



    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        Intent intent=getIntent();
        int fruitImageId = intent.getIntExtra(FRUIT_IMAGE_ID,0);
        Toolbar toolbar = findViewById(R.id.toolbar);
        CollapsingToolbarLayout collapsingToolbar =
                findViewById(R.id.collapsing_toolbar);
        ImageView fruitImageView = findViewById(R.id.fruit_image_view);
        TextView fruitContentText1 = findViewById(R.id.fruit_content_text1);
        TextView fruitContentText2 = findViewById(R.id.fruit_content_text2);
        TextView spotScore = findViewById(R.id.spot_score);
        TextView breifIntroduction= findViewById(R.id.breif_intro);
        TextView guidance= findViewById(R.id.guidance);
        initView();
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null)
        {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        Glide.with(this).load(fruitImageId).into(fruitImageView);

        switch (fruitImageId)
        {
            case R.drawable.gxgj:
                collapsingToolbar.setTitle("甘熙故居");
                fruitContentText1.setText("甘熙宅第位于南京市秦淮区，又称甘熙故居或甘家大院，始建于清嘉庆年间，俗称“九十九间半”，是中国最大的私人民宅，与明孝陵、明城墙并称为南京明清三大景观，具有极高的历史、科学和旅游价值，是南京现有面积最大，保存最完整的私人民宅。");
                fruitContentText2.setText("出了地铁站，走300多米就会到甘熙故居的南门入口，学生票10元一张，团体提前预约可免费参观。买票时可要一张景点地图，里面的房间很多，但是通道不是很宽，而且容易迷路，所以最好按地图顺序参观，整个院子不是很大，很快走完。而且景点内的房间里仅有几间内有空调，自然游客会集中在这些地方，但是不会拥挤，因为人真的少。各个房间可观赏的并没有多少，大致浏览就好。");
                break;
            case R.drawable.jnzzbwg_square:
                Glide.with(this).load(R.drawable.jnzzf).into(fruitImageView);
            case R.drawable.jnzzf:
                collapsingToolbar.setTitle("江宁织造府");
                fruitContentText1.setText("        江宁织造博物馆位于南京大行宫地区，是在江宁织 造旧址上建造的一座现代博物馆，也是著名建筑家吴良镛先生的收山之作。建筑整体风格是取中国山水画中深远、高远、平远之意境，将北高南低的建筑群尽可能用园林手法加以覆盖。建筑内复建了织造署中原有的西池、楝亭、萱 瑞堂、西堂等建筑，从南望北叠叠高起，如同一幅江南山水画，是现代建筑的语言和传统园林建筑结合的经典之作。\n" +
                        "\n\n参观须知:\n" +
                        "1. 开放时间:8:30~17:30，17:00 以后停止售票\n" +
                        "2. 门票:30 元，凭学生证半价，未满 18 周岁免费\n" +
                        "3. 交通:地铁至大行宫站\n" +
                        "4. 注意事项:馆内部分展品不得触摸，部分场馆拍照\n" +
                        "不能开闪光灯\n" +
                        "5. 参观时间:2~3 小时");

                fruitContentText2.setText("        南京有关历史的博物馆很多，似乎都是大同小异，但是 江宁织造博物馆绝对是一个独特的存在，从一干博物馆中脱 颖而出。\n" +
                        "        作为一个喜欢红楼梦的妹子，这里的红楼展馆太符合心 意了!不论是 3D 的影像呈现还是音乐体验，让人眼前一亮 的同时，也消解了一味参观的单调。不仅如此，还有猜灯谜、 南京话版红楼这样有意思的展示。喜欢红楼梦的同学一定要 来一趟，这里是不会让你失望的!博物馆内还有真人演示操 作织布机，美丽的配色、流畅的动作，可以让人目不转睛。\n" +
                        "        除此之外，还可以到旗袍展馆臭美一把。看着橱窗里的 月份牌女郎，以及那一件件印花、刺绣、蕾丝的旗袍，是不 是会有一点心动呢?展馆里还有可以看到真人试穿效果的 机器,(同行的小哥哥们居然玩的不亦乐乎......)，是不是很有 意思呢?\n" +
                        "        到了楼上，还可以看到一个小型的空中花园。这个设计 绝对是别出心裁了，竹亭、戏台、流水、还有很多的锦鲤... 转发江宁织造博物馆的锦鲤，拥有杨超越的运气不是问题!\n" +
                        "        总之，江宁织造，强推，一生推，非常值得一去!适合 一个人，也适合两三个人一起去，并且网上购票还会有优惠 的哦!");
                break;
            case R.drawable.mgg:
                collapsingToolbar.setTitle("明故宫");
                fruitContentText1.setText("        南京故宫，又称明故宫、南京紫禁城，是明朝首都" +
                        "应 天府的皇宫。建造前后历时二十余年，占地面积超" +
                        "过 101.25 万平方米，是中世纪世界上最大的宫殿建" +
                        "筑群，被 称为“世界第一宫殿”。以中山东路为界，明" +
                        "故宫遗址分成 南北两部分，以南为午朝门公园；以北" +
                        "是奉天殿、华盖殿、 谨身殿的遗址所在。 这里曾作为" +
                        "明初洪武、建文、永乐三代的皇宫，长达 54 年之久。" +
                        "然而经过了 600 多年的风吹雨打、雷劫火烧， 曾经富" +
                        "丽堂皇的宫殿不再，威武的城门也成为了覆盆的依" +
                        "靠，走过午朝门，恐怕就只有那一方方石柱础记得当年" +
                        "的气势恢宏。\n\n\n"+"参观须知:\n" +
                        "1. 公园免费开放，无需任何证件。\n" +
                        "2. 开放时间：6:00-21:00，随季节有调整。\n" +
                        "3. 公园不大，细致参观下来不会超过一个小时。\n" +
                        "4. 地铁 2 号线明故宫站下，步行一段路可达午门。\n" +
                        "5. 每年四月，绣球花开放，遗址公园就成了拍照圣地。");
                fruitContentText2.setText("        南航建于明故宫之上，所以作为南航的学生，有机会" +
                        "来本部的时候，不妨顺道参观一下曾经的“世界第一宫" +
                        "殿”。\n" +
                        "        不过，如果你没有挑好时间，见到的场景可能会让你" +
                        "怀疑人生。毕竟，放眼望去，推着婴儿车的母亲、在墙根" +
                        "边上晒太阳的大爷，当然，还有一大波伴随着“粉红色的记" +
                        "忆”音乐翩翩起舞的、热情如火的——阿姨们。这……这这，" +
                        "说好的庄严肃穆、富丽恢弘呢，莫不是来到了假的明故" +
                        "宫？\n" +
                        "        其实，明故宫建成的时候确实是震撼寰宇，只不过虎" +
                        "落平阳被犬欺，自从皇帝把明故宫复制到了北京之后，它" +
                        "就开始了一代皇城的悲惨命运。火烧两次，雷劈一次，就" +
                        "连南京的妖风都把太庙前的大树连根拔起。太平天国没钱" +
                        "盖房子的时候，连石料建材都被搬光了……没了金主爸爸" +
                        "的庇护，再好的风水宝地神气不起来了。" +
                        "        不过要是能了解几个明故宫遗址背后的故事，有朝一" +
                        "日向家人朋友介绍南航的时候，或许能够信手拈来，脱口" +
                        "而出，展示一下“优秀”的南航大学生丰富的历史素养和内" +
                        "涵。\n" +
                        "        记住，趁着清早阿姨们还没架起音响，请领着你的朋" +
                        "友从午朝门沿着御道走进皇城，严肃地告诉他，这不是普" +
                        "通的城墙，你看这雕刻精细的须弥座，充满年代感的青砖，" +
                        "妥妥的气度不凡；这怎么能是普通的石头呢，这可是被一" +
                        "代忠臣方孝孺鲜血染红的石头啊；还有这七星祥瑞浮雕，" +
                        "侧面体现了明代手工艺技术蓬勃发展和明朝的宗教信仰！");
                break;
            case R.drawable.mxl_square:
                Glide.with(this).load(R.drawable.mxl).into(fruitImageView);
            case R.drawable.mxl:
                collapsingToolbar.setTitle("明孝陵");
                fruitContentText1.setText("        明孝陵位于钟山风景名胜区内。东毗中山陵，南临" +
                        "梅花山，因明太祖朱元璋皇后马氏谥号“孝慈高皇后”,且" +
                        "明朝奉行孝治天下而得名“孝陵”。\n"+
                        "        孝陵现存明楼一座，后有十三层垒筑的宝顶，上刻" +
                        "“此山明太祖之墓”七个大字。明楼曾在咸丰三年遭战火" +
                        "蹂躏，现仅存砖墙四壁。作为明朝第一皇陵，孝陵曾受" +
                        "到过后来的清朝统治者康熙和乾隆、民国政府首脑蒋介" +
                        "石的拜谒。\n" +
                        "        孝陵脚下的梅花山，每逢初春季节，繁花似锦，暗" +
                        "香袭人，游人如织，是全国著名赏梅圣地之一。\n\n\n"+
                        "参观须知：\n" +
                        "1． 开放时间：6:30~18:30（3 至 10 月）\n" +
                        "6:30~18:00（11 月至次年 2 月）\n" +
                        "2. 取票时间：7:00~16:00\n" +
                        "3. 门票：70 元/人，凭学生证半价优惠\n" +
                        "4. 游玩时长：3~4 小时\n" +
                        "5. 适宜出行季节：春秋两季\n" +
                        "6. 出行方式推荐： 网约车");
                fruitContentText2.setText("        小编我一共去了两次明孝陵，第一次是在初春时候，" +
                        "慕梅花山之名而来，奈何梅花山在孝陵脚下，因此也顺道" +
                        "在孝陵溜了一圈。第二次是夏天，买了钟山风景区的联票" +
                        "专程参观的明孝陵。然而第二次的游玩体验真的是大打折" +
                        "扣……\n" +
                        "        每年三四月份梅花开放的时候，绝对是一年里来明孝" +
                        "陵的最佳时候。约上几个小伙伴一块拼个车，就能够直达" +
                        "梅花山门口，不仅省了换乘地铁的麻烦，也省了从山脚走" +
                        "上来的路程。放眼望去，红梅、绿萼、黄梅、宫粉…，还有" +
                        "许多珍贵的梅花品种与百年古梅树。除此之外，还能看到" +
                        "穿汉服的小姐姐、拍婚纱照的、拍写真的、取景的…可见梅" +
                        "花山的魅力有多大。所以姑娘们可以换上美美的裙子，在" +
                        "这个时候来明孝陵，和暗香浮动的梅花合几张影，不加滤" +
                        "镜都美到爆，和那些游客照完全不一样！男孩子们也可以" +
                        "约上女朋友或好基友，没有的话也别担心，说不定你就会" +
                        "在梅花树下邂逅漂亮的小哥哥小姐姐哦！而且梅花山边上" +
                        "还会开放“小吃一条街”，品种多样，让人看着就垂涎三尺，" +
                        "完全就是在撩拨吃货们的胃呀。\n" +
                        "        大饱眼口之福后，就可以穿过神像石道路和文武方门，" +
                        "上明楼看一看啦（还可以顺便消消食）。不过不要抱太大的" +
                        "希望，明楼上除了墙壁，真的什么也没有……虽说这里徒留" +
                        "四壁，但是从楼上远眺，视野还是不错的。可以远远看到" +
                        "落日的余晖里粉紫色的山顶，幸运的是，小编第一次去的" +
                        "时候刚好还出现了彩虹，真的是美到超纲啊！\n" +
                        "        偷偷告诉你，早上六点半之前来孝陵不收门票费哦，" +
                        "省下三十块钱也能美美地吃一顿了，不过前提是得早起……" +
                        "还有就是，一定要注意防晒，注意防晒，注意防晒！");
                break;
            case R.drawable.njbwy:
                collapsingToolbar.setTitle("南京博物院");
                fruitContentText1.setText("        南京博物院，简称南院或南博，是中国三大博物馆之一，其前身是 1933 年蔡元培等" +
                        "倡建的国立中央博物院，是中国创建最早的博物馆、中国第一座由国家投资兴建的大型综" +
                        "合类博物馆。南京博物院占地 13 万余平方米，为“一院六馆”格局，即历史馆、特展馆、数" +
                        "字馆、艺术馆、非遗馆、民国馆（以上摘自百度百科），六馆不同，各具特色。\n" +
                        "        时至今日，南京博物院馆藏数量居中国前三，藏品极丰，上至旧石器时代，下迄当" +
                        "代，静静讲述着江苏这片热土上所孕育的人类文明，走进南博，仿佛穿越了千年，沿着历" +
                        "史的印记，赏水乡风韵，仰英雄豪情，纵览这片土地的辉煌文明！\n\n\n"+
                        "参观须知：\n" +
                        "1. 开放时间：周一：9：00--12:00（11：00 停止入场）\n" +
                        "周二——周日：9：00—17：00（16：00 停止入场）\n" +
                        "周一逢国家法定节假日全天开放\n" +
                        "2. 参观方式\n" +
                        "观众持二代身份证于自动售票机领票，自觉接受安全检查后入馆。\n" +
                        "3. 馆内请勿吸烟\n" +
                        "4. 请勿触摸展品\n" +
                        "5. 展馆拍照请勿使用闪光灯和三角架等专业器材\n" +
                        "6. 请勿将各类管制刀具、打火机、危险品及宠物带入场馆\n" +
                        "7. 酗酒者、衣容不整者、无行为能力或限制行为能力且无监护人陪伴者谢绝入馆\n" +
                        "8. 其他有碍展品安全、影响观众参观者谢绝入馆");
                fruitContentText2.setText("                        历史馆\n" +
                        "        历史馆是真的大啊，走完历史馆的所" +
                        "有展厅后，有一些累。历史馆占两个楼" +
                        "层，共七个展厅，里面的物件那是真不" +
                        "少，件件都是珍品，件件都有故事。如果" +
                        "你是个历史爱好者，如果你对老物件感兴" +
                        "趣，那你真的得好好转转历史馆了。这里" +
                        "有高大的猛犸象化石，有精致的青铜器" +
                        "（有些青铜器的样子是真的萌），有精美" +
                        "的玉器（金缕玉衣了解一下），还有细腻" +
                        "的丝绸衣物（想不想近距离目睹一下龙" +
                        "袍？）……租一个讲解器，一边看，一边" +
                        "听着耳机里的讲解，那感觉时真的爽！览" +
                        "秦汉之风，观宋元明清，简直就是一次穿" +
                        "越啊。\n" +
                        "        但是，如果你是一枚典型的理科生，" +
                        "千万别想着细细游览历史馆，相信我，你" +
                        "忍受不了那份寂寥的，不如走马观花，过" +
                        "个眼瘾，省些时间多转转其他地方吧。\n" +
                        "                        数字馆\n" +
                        "        此馆不大，但绝对算是高大上的场馆" +
                        "了。想当时我匆匆走完历史馆，顺着路标" +
                        "走到数字馆，可谓是“从口入，初极狭，" +
                        "复行数十步，眼前刷的一亮”，好像踏进" +
                        "了时光隧道，脚下是蜿蜒的河流，眼前浮" +
                        "动着神秘的符号，看着那一幕幕古老的场" +
                        "景，这感觉真是妙啊！光影交错间，给你" +
                        "穿越的快感（主要靠想象，咳咳….）.\n" +
                        "                        特展馆\n" +
                        "        特展馆，这名字一听就很霸气。自然" +
                        "能在这展出的必是精品中的精品，那可都" +
                        "是国宝啊！不过此处的宝贝都是轮流展" +
                        "出，你能遇见哪个宝贝，全看缘分哦。小" +
                        "编我当时邂逅的是一只明永乐年间（就是" +
                        "约 600 年前）的青花瓷香炉。虽然没看出" +
                        "什么门道，但是眼前的无价之宝还是很让" +
                        "人激动的。\n" +
                        "                        艺术馆\n" +
                        "        说起来有点惨，小编我去了南博三" +
                        "次，竟然一次没能进到艺术馆内，每次都" +
                        "是各种原因不开放，但幸运的是看到了艺" +
                        "术馆内的藏品，小编我甚是欢喜。馆内藏" +
                        "品包括古代绘画、古代书法、古代雕塑等" +
                        "3 个专题，设国画大家傅抱石、工笔画大" +
                        "家陈之佛、油画大家苏天赐、雕塑大家吴" +
                        "为山等 4 个名人专馆。所以，对于喜欢书" +
                        "法的小编来说，很喜欢这个馆内的书法藏" +
                        "品的。看那些名家之作，笔笔有锋芒，道" +
                        "道显风骨，看着就是舒服，就是痛快。不" +
                        "信？不信自己去瞅瞅啊。书法，绘画，雕" +
                        "塑，总有一样留住你！\n" +
                        "                        民国馆\n" +
                        "这个馆，小编我真是太喜欢了，步入" +
                        "民国馆，走在民国的大街上，小编我的文" +
                        "艺情怀蹭蹭的飙升，都怪这个馆内的场景" +
                        "做的太逼真了，可谓是从整体到细节都呈" +
                        "现着民国的特性。他的天空、道路、街灯" +
                        "及附属设施都给人一种真实的历史气氛，" +
                        "带你回民国。小编我坐在民国大街的长椅" +
                        "上，亦不免有点小幻想：幻想着自己穿一" +
                        "身长袍，浪荡于民国街道，或坐或立，或" +
                        "倚或靠，或品一杯茶，或听一只曲，在街" +
                        "转角邂逅一位着旗袍的女子……(好害羞" +
                        ")。\n" +
                        "参观南博的时候千万不要错过这个" +
                        "馆！！！\n" +
                        "                        非遗馆\n" +
                        "这个馆是小编觉得最草率的馆，所处" +
                        "位置不起眼，展示的物品……没有艺术细" +
                        "胞的我真是欣赏不了，刺绣，昆曲什么的" +
                        "完全不懂啊 （没有贬低的意思啊）。但" +
                        "是感兴趣的话，那就随你自己喽。");
                break;
            case R.drawable.ztf:
                collapsingToolbar.setTitle("总统府");
                fruitContentText1.setText("        南京总统府是中国近代建筑遗存中规模最大、保存最完整的建筑群，也是南京民国建筑的主要代表之一，中国近代历史的重要遗址，现已辟为中国近代史遗址博物馆。\n" +
                        "        南京总统府既有中国古代传统的江南园林，也有近代西风东渐时期的建筑遗存，至今已有600多年的历史。其历史可追溯到明初的归德侯府和汉王府，清代被辟为江宁织造署、两江总督署等，清康熙乾隆南巡均以此为行宫。太平天国定都天京（今南京）后，在此基础上扩建为天王府。1912年1月1日，孙中山在此宣誓就职中华民国临时大总统，辟为大总统府，后来又为南京国民政府总统府。\n\n\n"+
                        "参观须知：\n" +
                        "1.总统府票价40元/人，凭学生证享半价优惠20元/人，闭馆前一个小时停止售票。\n" +
                        "2.开放时间：3~11月：07:30~18:00 12~2月：08:00~17:00。\n" +
                        "3.购票入园需持身份证。\n" +
                        "4.节假日时游玩人数偏多。搞不好要排很长一段时间的队。\n" +
                        "5.建议来在此地前了解一下相关历史，否则会错过很多细节。\n" +
                        "6.游览顺序以票背面的指示顺序最佳，建议时长2~3小时。\n" +
                        "7.乘坐地铁3号线至大行宫站，5号口出。\n");
                fruitContentText2.setText("        清明小长假时，与好友一起参观了总统府。乘地铁3号线与朋友在地铁站汇合后顺着路标指引，很快就看到了总统府的外墙，以及一道长长的回旋式的人墙。由于当时时间还早，总统府旁边的1912街人不是很多，所以我与好友先去1912街小逛了一圈，实话说初入这条街，感觉还不错，咖啡馆酒吧什么的给人精致之感，街边的小工艺品也十分吸引人，如果游玩累了，于此坐坐，还是很惬意的。这条街不长，但是可以用来拍一些美美的照片。我还要提醒一点，如果你在游玩总统府之前逛了这条街，走到头后建议原路返回，这样离售票口近，否则你得环绕总统府外围走一圈才能走到售票口。\n" +
                        "        买票入府前，你最先看到的是总统府门楼，在我看来这座门楼见证了南京的历史变迁，从明朝至近代，每一次政权的更替都在这里留下了印记。进入府内，里面的的建筑主要分三个区域，中线是当时的行政办公区，西侧是孙中山先生的办公生活区和煦园，东侧是太平天国的展馆以及一些其他的史料展馆。参观这些点最好按着票背面的指引顺序，这样便于最大化的参观，避免遗漏和迷路。而且最好在去之前先了解一下相关的历史，否则你会错过许多的细节（比如总统办公桌上的日历），但这些细节却是很给人震撼的。\n" +
                        "        总统府很大，但是如果你时间紧，小编建议一定要先游览中线和西线，因为这里会有许多你在日常历史课本中接触不到的东西。在总统府内，最好是有足够的时间，一边逛，一边看着文字解说，慢慢体会这座数百年的总统府所讲述的历史。\n" +
                        "        游完了，可以乘车去新街口觅食，十分方便。\n");
                break;
            case R.drawable.zsl:
                collapsingToolbar.setTitle("中山陵");
                fruitContentText1.setText("        钟山位于南京城东，自古被誉为“江南四大名山”之一，有“钟山龙蟠”之美誉。钟山于山、水、城、林浑然一体，自然景观丰富优美，文化底蕴博大深厚，中山陵景区、明孝陵景区、灵谷景区等三大核心景区分布着各类名胜古迹200多处，这里植被茂盛，空气清新，欣赏美景的同时，也能体验到爬山的酣畅淋漓。\n\n\n" +
                        "参观须知：\n" +
                        "1.如果打算游览很多景点，建议购买套票，凭学生证享受半价哦。\n" +
                        "2.记得准备好水，景点的水会很贵的。\n" +
                        "3.乘地铁2号线至苜蓿园站下。\n" +
                        "4.去之前了解一下相关史料，会让你体验感更佳。\n");
                fruitContentText2.setText("        小编准备了一天的时间按照明孝陵，中山陵，灵谷寺的顺序游玩的，真可谓是从早走到晚啊。从苜蓿园地铁站进入钟山风景区，沿着林荫路，按着路标的指引，最先到的就是明孝陵景区了，这里是明朝开国皇帝朱元璋与皇后马氏的陵寝，走在这里，主要时感受一下古代帝王陵园的肃穆与宏伟，值得细细欣赏的景点并不是很多。但是在明孝陵周围还有梅花山，紫霞湖等景点，根据时令不同，选择不同景点。3月初春时，梅花山是一个极美的地方，每当春季梅花盛开时，此地万株梅花竞相开放，繁华满山，香气弥漫。7月盛夏时，可以到紫霞湖玩玩，戏水玩乐，享一时清凉。\n" +
                        "        从明孝陵景区向东到中山陵，算得上一个爬山的过程了，会有点累，如果不想走，可以乘坐小火车直接到目的地。期间会经过美龄宫，海底世界等景点。小编觉得，美龄宫是一定要参观的，毕竟是曾经的国民政府主席官邸，该建筑富丽堂皇，内部装饰奢侈豪华，四周林木茂盛，终年百花飘香，还是挺让人震撼的。\n" +
                        "        中山陵，是中国近代伟大的民主革命先行者孙中山先生的陵寝，中山陵的建筑沿山而上，想要到达最上面的墓室，要爬上392级台阶。所以啊，尽量选在一个太阳不是很晒的时间段，否则顶着直晒的太阳，那是何等酸爽。爬到墓室处，以来可以瞻仰孙中山先生的雕像，二来可以登高望远，一览山下全貌。从陵园下来，顺着路标去音乐台走走，那里算的上一个很好玩的地方了，有音乐，有白鸽，坐在长椅上，听听音乐，喂喂白鸽，放松一下腿脚，很是舒服。\n" +
                        "        走完中山陵的这几个景点，其余景点小景点不必单去，顺路看一眼就好。大致游完中山陵差不多到了下午4点钟，休息一会，给自己降降温，继续向东，就是灵谷寺了，如果你愿意等，等到夜幕降临，你会被黑暗中星星点点的荧光所感动。那正是灵谷寺特有的魅力——萤火虫。\n" +
                        "        走完以上景点，一天的时间差不多就没了，剩下的就是准备准备找个临近的地铁站返航了。\n");
                break;
            case R.drawable.jms_square:
                Glide.with(this).load(R.drawable.jms).into(fruitImageView);
            case R.drawable.jms:
                collapsingToolbar.setTitle("鸡鸣寺");
                fruitContentText1.setText("        鸡鸣寺，又称古鸡鸣寺，始建于西晋，是南京最古老的梵刹（佛寺）之一，自古有“南朝第一寺”，“南朝四百八十寺”之首寺的美誉，是南朝时期中国的佛教中心。如今，去鸡鸣寺的游客大多是烧香赏樱的，每年四月份樱花盛开之际，游客沿路观赏樱花，近寺后烧香许愿，可以求取姻缘，可求学业工作，可为家人祷告。带着一份虔诚，留下一段心愿。  \n" +
                        "        而且，92版《新白娘子传奇》剧组因当时西湖的雷峰塔已倒而新的尚未修建好，来到南京古鸡鸣寺借用药师佛塔来拍雷峰塔相关剧目。\n\n\n" +
                        "参观须知：\n" +
                        "1.门票10元，登药师佛塔免费，春节期间每人20元，购买门票还赠送三炷香。\n" +
                        "2.一般每日白天开放。晚上仅在农历2月19日，6月19日、9月19日的前一天和除夕开放。\n" +
                        "3.路线：乘地铁3号线至鸡鸣寺站下车。\n" +
                        "4.樱花开放时间：每年四月份左右。\n");
                fruitContentText2.setText("        一定要从鸡鸣寺的正门进入，虽然出口出也售票，但最好不要从标着出口字样的地方进入，那样给你的体验感不是很好。\n" +
                        "        乘坐地铁三号线可直达鸡鸣寺站，从一号口出步行大约500米就可到达鸡鸣寺了。在这500米的路两旁，种的是樱花树，如果是在四月份的时候，你可以欣赏到两旁唯美的樱花。沿着路向前走很快就会到鸡鸣寺了。鸡鸣寺的门票是10元/人（没有学生票之说哦），还会赠送三柱香。检票后，拿着香进入，你会看看到庙宇楼阁，拾级而上你就会看到尊尊巍然的佛像。此时的你也许正为不知如何敬香而尴尬，别慌，注意留心身边的敬香指示牌，它会指引着你一路向上的，当你看到一个大香炉的时候，在你的右手边会有一个点燃香火的小屋，里面有多盏燃着的莲花灯，在此点燃手中的香，按照指示牌上的说明，依次参拜各个佛殿后，就可以将手中的香插入大香炉里了，插的时候一定要小心别被其他香火烫到。\n" +
                        "        寺中的佛塔是可以进入的，但是要注意地上的路标，进塔前的石阶是要靠左走的。而且在参拜佛塔时，要右绕三匝，很是讲究。\n" +
                        "        整个寺不是很大，所以很快就可以走完，从出口出，走一小段距离后就可到达玄武湖公园与台城（明城墙），可一并游览。\n");
                break;
            case R.drawable.jhs:
                collapsingToolbar.setTitle("静海寺");
                fruitContentText1.setText("        静海寺始建于明朝永乐九年（1411 年），系明成祖朱棣" +
                        "为纪念航海家郑和等人下西洋凯旋归来而敕建，并赐额" +
                        "“静海”，意为四海平静。\n" +
                        "        1842 年 8 月 29 日，在下关江面英军康华丽军舰上，签" +
                        "订我国近代史上的第一个不平等条约--中英《江宁条约》" +
                        "（即《南京条约》）。静海寺写下了我国古代的文明与辉" +
                        "煌，也记录了近代的落后与耻辱。\n\n\n" +
                        "参观须知：\n" +
                        "1.  开放时间：8:00~17:30（天妃宫）\n" +
                        "8:30~17:00（静海寺，开放时间随季节有调整，周\n" +
                        "一闭馆）\n" +
                        "2.  门票：免费，无需证件\n" +
                        "3.  交通：景点位于鼓楼区，无地铁直达，可乘坐公交\n" +
                        "100 路、39 路、16 路等\n" +
                        "4.  参观时长：1~2 小时");
                fruitContentText2.setText("        天妃宫和静海寺都坐落在阅江楼脚下，如果你参观完" +
                        "了阅江楼，这两个地方一定是不能错过的。和阅江楼一样，" +
                        "它们都只能算是南京比较小众的景点，虽然在热度排行榜" +
                        "上它们已然身居默默无闻的十八线，然而观游体验却丝毫" +
                        "不逊色于那些热门景区。\n" +
                        "        我们来到天妃宫和静海寺的时候，几乎看不到除了我" +
                        "们之外的游客，也许正是这个原因，这里基本没有受到商" +
                        "业化魔爪的侵袭，可以说是很清新自然的景点了。这里的" +
                        "展区主要以历史资料为主，你可以看到郑和出行的珍贵图" +
                        "画，也能看到近代不平等条约的签订和废除。除此之外，" +
                        "还有南京四十八景之一的“三宿岩景观”，这里的石头奇" +
                        "形怪状却错落有致，浑然天成，加之周围特别安静，尤其" +
                        "适合不喜热闹的朋友。天妃宫内还有极具特色的石狮子，" +
                        "每个形态不一、十分可爱，就连垃圾桶都做得非常独特。\n" +
                        "        即便对这些历史资料不感兴趣，挑个舒适的好天气，" +
                        "来这里听听蝉鸣，在三宿岩边歇歇脚，参拜一下庙里的天" +
                        "王菩萨也是不错的选择。");
                break;
            case R.drawable.xwh:
                collapsingToolbar.setTitle("玄武湖");
                fruitContentText1.setText("        “钱塘莫美于西湖；金陵莫美于后湖。”巍峨的明城" +
                        "墙，秀美的九华山，古色古香的鸡鸣寺环抱在右。玄" +
                        "武湖方圆近五里，分作五洲（环洲、樱洲、菱洲、梁" +
                        "洲、翠洲），洲洲堤桥相通，浑然一体，处处有山有" +
                        "水，山异，终年景色如画。湖内养鱼，并种植荷花，" +
                        "夏秋两季，水面一片碧绿，粉红色荷花掩映其中，满" +
                        "湖清香，景色迷人。\n" +
                        "        玄武湖为风景园林，亦为文化胜地，许多文人骚客都" +
                        "曾在此留下身影和诗篇。\n" +
                        "        玄武湖边上的明城墙，一砖一瓦，都是几百年前的样" +
                        "子。登楼看湖，更别有一番滋味。\n\n\n" +
                        "游玩须知：\n" +
                        "开放时间：夏季 5:00-22:00;冬季 5:00-21:00\n" +
                        "门票信息：免费，无需证件。\n" +
                        "游玩时长：2-3 小时\n" +
                        "最佳季节：四季皆宜。\n" +
                        "交通：地铁 1 号线至玄武门下或乘坐公交至玄武门公\n" +
                        "园站。");
                fruitContentText2.setText("        “南京人所能想到最浪漫的事，就是和你在玄武湖边上啃鸭" +
                        "四件！”玄武湖是南京的西湖，但它并不是像西湖一样作为一" +
                        "个观赏的景点，而是成为了南京人的乐园。玄武湖的春天，" +
                        "有人在这里散步，也有人在这里尬舞；有人在这里摄影，也" +
                        "有人在这里啃鸭子，尽管此刻湖上的网红大黄鸭还在注视着" +
                        "你……湖上有很多可爱的游船，很具有吸引力，不过 140 元/" +
                        "小时的价格是否可爱就取决于你的兜兜了……贫穷的学姐学" +
                        "长，只是远观没有亵玩……" +
                        "        七月到九月是玄武湖荷花盛开的季节，与此时造访玄武湖还" +
                        "有可能看到一年一度的荷花节。什么？单看荷花太没意思？" +
                        "那试试看乘坐游船，在玄武的柔波里夜游赏荷？以环洲莲花" +
                        "广场为中心的荷花片区，不仅可以泛舟、沿湖漫步，同时还" +
                        "可以参加莲花广场举办的各种活动哦！荷花节期间，玄武湖" +
                        "景区还会举办茶会、啤酒龙虾节、移动汽车美食音乐节、荷" +
                        "花文化绘画讲座、荷花摄影比赛、水上 party、k 歌等一系列" +
                        "活动哦！准备好和玄武湖的荷花进行一次亲密接触吧，不管" +
                        "你是爱吃、爱玩、还是爱文雅、爱劲爆，这里都能满足你的" +
                        "需求！\n" +
                        "        除此之外，碰上有风的好天气，带个风筝和湖边的大爷们一" +
                        "块放飞自我也是休闲娱乐的不二选择，不过前提是你不能输" +
                        "给大爷大妈们……当然，秋冬的时候，在这里铺上桌布，一" +
                        "边晒太阳一边野餐，可以说是很舒服了。如果你还是个摄影" +
                        "爱好者，不妨登上玄武湖旁边的明城墙，角度极佳，可以拍" +
                        "摄到玄武湖的绰约风姿！总的来说，玄武湖公园真的是值得" +
                        "一去的南京景点，风景美，不收费，休闲娱乐培养感情必来" +
                        "之地！");
                break;
            case R.drawable.yjl:
                collapsingToolbar.setTitle("阅江楼");
                fruitContentText1.setText("        阅江楼位于南京市鼓楼区狮子山巅，屹立在扬子江畔，饮" +
                        "霞吞雾，是中国十大文化名楼、江南四大名楼之一。1374" +
                        "年（洪武七年）春，朱元璋在狮子山建一楼阁，亲自命名" +
                        "为阅江楼，并以阅江楼为题，命令在朝的文臣职事们各写" +
                        "一篇《阅江楼记》。\n" +
                        "        阅江楼喻阅江揽胜，楼高五十二米，具有鲜明的皇家特" +
                        "色，然而此楼却没能在明朝顺利完工，只有所用的地基完" +
                        "工，成了奇怪的有记无楼。1997 年，南京政府重修阅江" +
                        "楼，2011 年阅江楼竣工。\n\n\n" +
                        "参观须知：\n" +
                        "1. 开放时间：7:30~17:30\n" +
                        "2. 门票：40 元，官网订票 35 元，凭学生证享半价优惠，\n" +
                        "17:00 停止售票\n" +
                        "3. 游玩时长：1~2 小时\n" +
                        "4. 特色景点：阅江楼主楼、古炮台、地藏寺\n" +
                        "5. 交通：无地铁直达，可换乘公交 100、39、16 路等");
                fruitContentText2.setText("        热门景区拥挤不堪？人头攒动毫无乐趣？不妨来 pick 一" +
                        "下南京的小众景点——阅江楼吧！\n" +
                        "        阅江楼高七层，楼内有中国最大的景德镇巨幅瓷画、明" +
                        "朝帝王画像、还有 24k 金制成的罕见盘龙一只。每一层都有" +
                        "各样的展品，还原了郑和下西洋时期的明朝盛况。\n" +
                        "        如果这都不够心动，不妨登上楼顶，你可以看到蜿蜒的" +
                        "护城河，多姿的秦淮河，还能看到不远处的长江、紫峰大厦…" +
                        "脚下还有天妃宫、静海寺，可以说视野极佳了！站在阅江楼" +
                        "顶俯视，还有一阵阵的凉风撩起你的发丝，在南京的烈日高" +
                        "温里，这绝对是妥妥的避暑胜地。\n" +
                        "        除此之外，阅江楼还有著名的《阅江楼记》，出自太祖朱" +
                        "元璋和才子宋濂之手。回廊两侧雕刻着有趣的字画，一边踱" +
                        "步一边欣赏，实是悠闲快哉。\n" +
                        "        下山的时候，还能看到古时的炮台、孙中山先生曾来过" +
                        "的阅江亭、地藏寺。且阅江楼被城墙围绕，还可以沿着明城" +
                        "墙下山。\n" +
                        "        在南京的景点里，阅江楼一定是独特的存在，如果你来，" +
                        "它会给你很多惊喜。");
                break;
            case R.drawable.nhmggxq:
                collapsingToolbar.setTitle("南航明故宫校区");
                fruitContentText1.setText("        南京航空航天大学明故宫校区，坐落于原明代宫城之" +
                        "内。宫女们浣洗胭脂的玉带河穿过校园，南航综合楼后方" +
                        "的御园曾是太庙所在。明太祖生前恐怕做梦也未曾料到，" +
                        "在他倾全国之力精心打造的深宫大内紫禁城里，竟会孕育" +
                        "出中国未来的航空航天事业，成为中国近现代航空航天事" +
                        "业发展的摇篮。" +
                        "        从《致青春》到《人民的名义》，南航美丽的校园环" +
                        "境不仅吸引了很多的剧组前往取景拍摄，明故宫的钟灵毓" +
                        "秀之气也让这所大学成为了不少游客参观的地点。\n\n\n" +
                        "参观须知：\n" +
                        "1. 乘坐校车可往返两校区，坐校车前可在事服圈存机处\n" +
                        "“车载管理系统”划款，单程 5 元\n" +
                        "2. 校车时刻表可在“微爷”公众号查询\n" +
                        "3. 可乘坐地铁 2 号线至明故宫站下，步行至西门\n" +
                        "4. 全程游览参考时间：2 小时\n" +
                        "5. 校园卡两校区通用");
                fruitContentText2.setText("        对于将军路校区的同学们来说，大学四年是一定有机" +
                        "会去明故宫校区的，明故宫作为我们的老校区，地方不大，" +
                        "美景却不少。坐上校车就能往返两个校区，花上两个小时" +
                        "逛一圈校园，再到食堂吃一顿饱饭，简直美滋滋。\n" +
                        "        前往明故宫校区的校车停靠在西门，下了校车沿东北" +
                        "西方向走一小段路就能到大名鼎鼎的御园。这充满皇家气" +
                        "息的名字，加上缭绕的藤蔓，木质的长椅，绝对是旅行、" +
                        "约会、拍照圣地。\n" +
                        "        还有网红“荟萃楼”，外表是个爬满绿植的小清新，其" +
                        "实内心是个满腹春秋的老干部（前身南航机密档案室）。\n" +
                        "        沿着种满梧桐树的“凤栖梧桐大道”走，妥妥的青春偶" +
                        "像剧既视感，作为某青春校园纯爱故事拍摄地，这条大道" +
                        "吸引了无数文艺青年。\n" +
                        "        再往东北方向行进，就是美丽的东华湖了，走过曲折" +
                        "的回廊，坐在湖中央的春秋亭上，你就是安安静静的美篮" +
                        "子、美驴子！\n" +
                        "        逛了趟校园如果觉得有点干，一定要到学生食堂接受" +
                        "一下美食的洗礼。南航食堂作为大学食堂界的扛把子，让" +
                        "你四年瘦不下来的威力绝不是盖的，只要带好你的饭卡，" +
                        "就可以大快朵颐了！\n" +
                        "        食堂边上就是大学生活动中心，平常晚上剧场会有很" +
                        "多的舞蹈、话剧、戏曲类节目的表演，约上三两好友，看" +
                        "场表演，吃顿夜宵，人生乐事无疑了。");
                break;
        }


        TextView textView1 = findViewById(R.id.breif_intro);
        TextView textView2 = findViewById(R.id.guidance);
        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
        fruitContentText2.setVisibility(fruitContentText2.GONE);
        fruitContentText1.setVisibility(fruitContentText1.VISIBLE);
        //breifIntroduction.getPaint().setFakeBoldText(true);
        breifIntroduction.setTextColor(Color.parseColor("#008577"));
        spotOpenHelper = new SpotOpenHelper(this);

        ArrayList<SpotData> data = spotOpenHelper.getAllData();
        Integer spotID = new Integer(fruitImageId);
        float sum=0;
        float average=0;
        int CommentNum=0;
        int ifCommented=0;//用户是否已经评分
        Float sumScore = new Float(sum);
        Float aveScore = new Float(average);
        Integer commentNum = new Integer(CommentNum);
        String scoreText;
        for (int i = 0; i < data.size(); i++) {
            SpotData spotData = data.get(i);
            if (spotID.equals(spotData.getSpotID())) {
                    sumScore = sumScore + spotData.getSpotScore();
                    commentNum = commentNum + 1;
                    if(MainActivity.userName.equals(spotData.getUserName())){
                    ifCommented = 1;
                }

            }
        }
        aveScore = sumScore/commentNum;
        scoreText = Float.toString(aveScore);
        spotScore.setText(scoreText);
        if(ifCommented == 1){
            onePointButton.setVisibility(View.GONE);
            twoPointButton.setVisibility(View.GONE);
            threePointButton.setVisibility(View.GONE);
            fourPointButton.setVisibility(View.GONE);
            fivePointButton.setVisibility(View.GONE);
        }
    }

    private void initView() {
        onePointButton = findViewById(R.id.one_point);
        twoPointButton = findViewById(R.id.two_point);
        threePointButton = findViewById(R.id.three_point);
        fourPointButton = findViewById(R.id.four_point);
        fivePointButton = findViewById(R.id.five_point);

        onePointButton.setOnClickListener(this);
        twoPointButton.setOnClickListener(this);
        threePointButton.setOnClickListener(this);
        fourPointButton.setOnClickListener(this);
        fivePointButton.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view)
    {
        TextView fruitContentText1 = findViewById(R.id.fruit_content_text1);
        TextView fruitContentText2 = findViewById(R.id.fruit_content_text2);
        TextView briefIntroduction= findViewById(R.id.breif_intro);
        TextView spotScore = findViewById(R.id.spot_score);
        TextView guidance= findViewById(R.id.guidance);
        Intent intent=getIntent();
        int fruitImageId = intent.getIntExtra(FRUIT_IMAGE_ID,0);
        Float one = new Float(1);
        Float two = new Float(2);
        Float three = new Float(3);
        Float four = new Float(4);
        Float five = new Float(5);
        Integer spotID = new Integer(fruitImageId);
        float sum=0;
        float average=0;
        int CommentNum=0;
        Float sumScore = new Float(sum);
        Float aveScore = new Float(average);
        Integer commentNum = new Integer(CommentNum);
        String scoreText;

        switch (view.getId())
        {
            case R.id.breif_intro:
                fruitContentText2.setVisibility(fruitContentText2.GONE);
                fruitContentText1.setVisibility(fruitContentText1.VISIBLE);
                briefIntroduction.setTextColor(Color.parseColor("#008577"));
                guidance.setTextColor(Color.parseColor("#999999"));
                //guidance.getPaint().setFakeBoldText(false);
                //briefIntroduction.getPaint().setFakeBoldText(true);
                break;
            case R.id.guidance:
                fruitContentText1.setVisibility(fruitContentText1.GONE);
                fruitContentText2.setVisibility(fruitContentText2.VISIBLE);
                guidance.setTextColor(Color.parseColor("#008577"));
                briefIntroduction.setTextColor(Color.parseColor("#999999"));
                //briefIntroduction.getPaint().setFakeBoldText(false);
                //guidance.getPaint().setFakeBoldText(true);
                break;
            case R.id.one_point:
                spotOpenHelper.add(fruitImageId,one,MainActivity.userName);
                ArrayList<SpotData> data1 = spotOpenHelper.getAllData();
                for (int i = 0; i < data1.size(); i++) {
                    SpotData spotData = data1.get(i);
                    if (spotID.equals(spotData.getSpotID())) {
                        sumScore = sumScore + spotData.getSpotScore();
                        commentNum = commentNum + 1;
                    }
                }
                aveScore = sumScore/commentNum;
                scoreText = Float.toString(aveScore);
                spotScore.setText(scoreText);
                onePointButton.setVisibility(View.GONE);
                twoPointButton.setVisibility(View.GONE);
                threePointButton.setVisibility(View.GONE);
                fourPointButton.setVisibility(View.GONE);
                fivePointButton.setVisibility(View.GONE);
                break;
            case R.id.two_point:
                spotOpenHelper.add(fruitImageId,two,MainActivity.userName);
                ArrayList<SpotData> data2 = spotOpenHelper.getAllData();
                for (int i = 0; i < data2.size(); i++) {
                    SpotData spotData = data2.get(i);
                    if (spotID.equals(spotData.getSpotID())) {
                        sumScore = sumScore + spotData.getSpotScore();
                        commentNum = commentNum + 1;
                    }
                }
                aveScore = sumScore/commentNum;
                scoreText = Float.toString(aveScore);
                spotScore.setText(scoreText);
                onePointButton.setVisibility(View.GONE);
                twoPointButton.setVisibility(View.GONE);
                threePointButton.setVisibility(View.GONE);
                fourPointButton.setVisibility(View.GONE);
                fivePointButton.setVisibility(View.GONE);
                break;
            case R.id.three_point:
                spotOpenHelper.add(fruitImageId,three,MainActivity.userName);
                ArrayList<SpotData> data3 = spotOpenHelper.getAllData();
                for (int i = 0; i < data3.size(); i++) {
                    SpotData spotData = data3.get(i);
                    if (spotID.equals(spotData.getSpotID())) {
                        sumScore = sumScore + spotData.getSpotScore();
                        commentNum = commentNum + 1;
                    }
                }
                aveScore = sumScore/commentNum;
                scoreText = Float.toString(aveScore);
                spotScore.setText(scoreText);
                onePointButton.setVisibility(View.GONE);
                twoPointButton.setVisibility(View.GONE);
                threePointButton.setVisibility(View.GONE);
                fourPointButton.setVisibility(View.GONE);
                fivePointButton.setVisibility(View.GONE);
                break;
            case R.id.four_point:
                spotOpenHelper.add(fruitImageId,four,MainActivity.userName);
                ArrayList<SpotData> data4 = spotOpenHelper.getAllData();

                for (int i = 0; i < data4.size(); i++) {
                    SpotData spotData = data4.get(i);
                    if (spotID.equals(spotData.getSpotID())) {
                        sumScore = sumScore + spotData.getSpotScore();
                        commentNum = commentNum + 1;
                    }
                }
                aveScore = sumScore/commentNum;
                scoreText = Float.toString(aveScore);
                spotScore.setText(scoreText);
                onePointButton.setVisibility(View.GONE);
                twoPointButton.setVisibility(View.GONE);
                threePointButton.setVisibility(View.GONE);
                fourPointButton.setVisibility(View.GONE);
                fivePointButton.setVisibility(View.GONE);
                break;
            case R.id.five_point:
                spotOpenHelper.add(fruitImageId,five,MainActivity.userName);
                ArrayList<SpotData> data5 = spotOpenHelper.getAllData();

                for (int i = 0; i < data5.size(); i++) {
                    SpotData spotData = data5.get(i);
                    if (spotID.equals(spotData.getSpotID())) {
                        sumScore = sumScore + spotData.getSpotScore();
                        commentNum = commentNum + 1;
                    }
                }
                aveScore = sumScore/commentNum;
                scoreText = Float.toString(aveScore);
                spotScore.setText(scoreText);
                onePointButton.setVisibility(View.GONE);
                twoPointButton.setVisibility(View.GONE);
                threePointButton.setVisibility(View.GONE);
                fourPointButton.setVisibility(View.GONE);
                fivePointButton.setVisibility(View.GONE);
                break;
            default:
                break;
        }

    }
}

