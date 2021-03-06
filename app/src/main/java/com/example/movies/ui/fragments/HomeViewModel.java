package com.example.movies.ui.fragments;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.movies.R;
import com.example.movies.models.MoviesModels;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

    ArrayList<MoviesModels> list = new ArrayList<>();
    public MutableLiveData<ArrayList<MoviesModels>> mutableLiveData = new MutableLiveData<>();
    int position;

    public MoviesModels getModel() {
        return list.get(position);
    }

    public void addList() {
        list.add(new MoviesModels("Агнец", R.drawable.image, "Мария (Рапас) и Ингвар (Хильмир Снайр Гуднасон) живут и работают на отдалённой ферме в Исландии"));
        list.add(new MoviesModels("Корпорация Заговор", R.drawable.job, " Рейган — гениальная, но совершенно нелюдимая изобретательница, работающая в Cognito Inc., теневой правительственной организации, которая придумывает теории заговора"));
        list.add(new MoviesModels("Финч", R.drawable.finch, "Бородатый худощавый Финч (Том Хэнкс) — чуть ли не последний человек на выжженной Земле и по иронии судьбы гениальный инженер-робототехник, чьи изобретения уже вряд ли спасут цивилизацию."));
        list.add(new MoviesModels("Вечные", R.drawable.eternity, "До российского проката, превозмогая локдауны, вот-вот доберутся «Вечные» — фильм очень примечательный в контексте вселенной Marvel. Во-первых, это пока что самое большое «марвеловское» кино после «Мстителей: Финал» (и до, наверное, «Мультивселенной безумия»)"));
        list.add(new MoviesModels("По Соседству", R.drawable.nearby, "Успешный актёр Даниэль (Даниэль Брюль) перед поездкой в Лондон, где он должен пробоваться на роль в голливудском блокбастере, заходит в небольшой берлинский бар — чтобы скоротать время и заодно отрепетировать пафосный монолог в тишине"));
        list.add(new MoviesModels("Армия Воров", R.drawable.thieves, "Мужчина с невыговариваемым именем Себастьян Шленхт-Венерт (его играет актёр Маттиас с тоже, в общем-то, непростой фамилией Швайгхефер) работает банковским клерком, а в свободные часы ведёт YouTube-канал о взломе"));
        list.add(new MoviesModels("Тем Больнее Падать", R.drawable.fall, "Бандиту Нэйту Лаву (Джонатан Мэйджерс) пришлось повзрослеть слишком быстро. Когда он был еще ребенком, гроза Дикого Запада Руфус Бак (Идрис Эльба) расстрелял его родителей. Много лет Лав охотился за убийцей, но осуществить месть ему так и не удалось – Бака посадили в тюрьму пожизненно"));
        list.add(new MoviesModels("Неуловимый аромат любви", R.drawable.love, "У Натали (Нина Добрев) было множество неудачных свиданий. Раз за разом она общается с молодыми людьми в приложении для знакомств и терпит фиаско. Впрочем, каждый такой случай в конечном итоге превращается в рассказ в колонке, которую она ведет"));
        list.add(new MoviesModels("Декстер", R.drawable.dexter, "С финала последнего сезона прошло 10 лет. После смерти сестры Декстер (одновременно очаровательный и жуткий Майкл Си Холл) покинул солнечный Майами и уехал жить в мрачный и холодный Айрон Лейк — провинциальный городок, который может похвастаться разве что лесами да уютными улочками."));
        list.add(new MoviesModels("Вкус жизни", R.drawable.live, "Шеф-повар Карстен (Николай Костер-Вальдау) и его жена Мэгги (Катрин Розенталь) много лет шли к своей заветной мечте — открыть дорогой ресторан и получить звезду Мишлен. На пути к успеху их чувства друг к другу угасли, каждый погрузился в свои дела и хлопоты"));
        list.add(new MoviesModels("Аркейн", R.drawable.arkein, "На платформе Netflix начал выходить фэнтезийный сай-фай-сериал «Аркейн», основанный на онлайн-игре League Of Legends. Действие происходит в мире, где наука сосуществует с магией, однако волшебство находится под запретом"));
        mutableLiveData.setValue(list);
    }
}
