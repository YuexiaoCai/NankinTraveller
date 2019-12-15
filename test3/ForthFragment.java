package com.example.test3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;

/**
 * Created by 虾仁锅巴 on 2018/7/16.
 */
public class ForthFragment extends Fragment
{

    private Spot[]spots={new Spot("西藏","很多人看见理科生写文章居然会觉得不可理喻，这才是中学教育的荒谬之处。","蔡月啸","数码",R.drawable.tibet,R.drawable.aplus),
            new Spot("纽约","写文章的兴致可以说是极其脆弱的了，放空时脑袋里一股一股的文字流进来，打着旋，恍惚之间又聚集起来走远，恨的是没有那种能把思维直接化作文字的工具","王长欣","动漫",R.drawable.newyork,R.drawable.b),
            new Spot("北京","而好不容易截断了一点心流，翻开笔记本盖，面对着电脑屏幕时，又磕磕巴巴写不出几个完整句子","李浩然","编程",R.drawable.beijing,R.drawable.c),
            new Spot("上海","试图用一两句话，或是寥寥数语，甚至是一篇文章想要别人了解自己内心的做法永远是徒劳。","段仕伟","数学",R.drawable.shanghai,R.drawable.d),
            new Spot("南京","我们看电视剧或小说时，往往一开始对主人公指指点点，置身事外，怎么看主人公矫情的言辞和拖沓的性格都不顺眼。","杨锦乾","游戏",R.drawable.nanjing,R.drawable.e),
            new Spot("苏州","但随着故事的进行，其实也便是我们随着故事中的人物一起经历了大大小小的风雨事件，十几集、几十集，数十页、几百页的铺垫与熟悉，我们才能与之共喜怒、同哀乐，为之感慨流泪、不舍伤怀，发展出和个中人物共情的能力。","卢远","文学",R.drawable.suzhou,R.drawable.f),
            new Spot("洛阳","但是随着剧情的结束，故事终结，我们慢慢的又淡忘了。","叶竹静","生活",R.drawable.luoyang,R.drawable.g),
            new Spot("成都","试想，这世界上曾有多少影片故事触动过你，让你忘身其中？你又多少次最终忘却，重又关山阻隔？","马淳勖","足球",R.drawable.chengdu,R.drawable.h),
            new Spot("柬埔寨","占据你几千分钟的连续剧、几百分钟的电影尚且如此如烟易忘，又奢望这寥寥千言的文章作甚呢？","曹智豪","教学",R.drawable.cambodia,R.drawable.i),
            new Spot("伯克利","我渴望被人理解，同时也希望能同自己和解。","聂宏","政治",R.drawable.berkeley,R.drawable.j)};

    private SpotAdapter adapter;
    @Override
    public View onCreateView (LayoutInflater inflater,ViewGroup container,
                              Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_forth,container,
                false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter=new SpotAdapter(Arrays.asList(spots));
        recyclerView.setAdapter(adapter);
        return view;
    }
}
