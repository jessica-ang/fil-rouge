package com.jang.assistales;

import com.jang.assistales.model.CharacterBean;
import com.jang.assistales.model.DeitiesBean;
import com.jang.assistales.model.FaunaBean;
import com.jang.assistales.model.FloraBean;
import com.jang.assistales.model.ItemBean;
import com.jang.assistales.model.PlaceBean;
import com.jang.assistales.model.ProjectBean;
import com.jang.assistales.model.UniversBean;

import java.util.ArrayList;

public class Common {
    public static final ArrayList<ProjectBean> projectBeans = new ArrayList<>();
    public static final ArrayList<UniversBean> universBeans = new ArrayList<>();
    public static final ArrayList<CharacterBean> characterBeans = new ArrayList<>();
    public static final ArrayList<DeitiesBean> deitiesBeans = new ArrayList<>();
    public static final ArrayList<FaunaBean> faunaBeans = new ArrayList<>();
    public static final ArrayList<FloraBean> floraBeans = new ArrayList<>();
    public static final ArrayList<ItemBean> itemBeans = new ArrayList<>();
    public static final ArrayList<PlaceBean> placeBeans = new ArrayList<>();

    public static ProjectBean projectbean;
    public static UniversBean universBean;
    public static CharacterBean characterBean;
    public static DeitiesBean deitiesBean;
    public static FaunaBean faunaBean;
    public static FloraBean floraBean;
    public static ItemBean itemBean;
    public static PlaceBean placeBean;


    public static final int TYPE_PROJECT = 1;
    public static final int TYPE_UNIVERS = 2;
    public static final int TYPE_CHARACTER = 3;
    public static final int TYPE_DEITIES = 4;
    public static final int TYPE_PLACE = 5;
    public static final int TYPE_FAUNA = 6;
    public static final int TYPE_FLORA = 7;
    public static final int TYPE_ITEM = 8;

    public static int size_main;


}
