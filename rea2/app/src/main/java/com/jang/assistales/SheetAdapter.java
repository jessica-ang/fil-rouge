package com.jang.assistales;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jang.assistales.databinding.RowSheetBinding;
import com.jang.assistales.model.CharacterBean;
import com.jang.assistales.model.DeitiesBean;
import com.jang.assistales.model.FaunaBean;
import com.jang.assistales.model.FloraBean;
import com.jang.assistales.model.ItemBean;
import com.jang.assistales.model.PlaceBean;
import com.jang.assistales.model.ProjectBean;
import com.jang.assistales.model.UniversBean;

import java.util.ArrayList;

public class SheetAdapter extends RecyclerView.Adapter<SheetAdapter.ViewHolder> {

    private int mType;
    private ArrayList<ProjectBean> projectBeans = Common.projectBeans;
    private ArrayList<UniversBean> universBeans = Common.universBeans;
    private ArrayList<CharacterBean> characterBeans = Common.characterBeans;
    private ArrayList<DeitiesBean> deitiesBeans = Common.deitiesBeans;
    private ArrayList<PlaceBean> placeBeans = Common.placeBeans;
    private ArrayList<FaunaBean> faunaBeans = Common.faunaBeans;
    private ArrayList<FloraBean> floraBeans = Common.floraBeans;
    private ArrayList<ItemBean> itemBeans = Common.itemBeans;
    private LinearLayout root_sheet;

    public SheetAdapter(int pType) {
        mType = pType;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        return new ViewHolder(RowSheetBinding.inflate(layoutInflater));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        if (mType == 1) {
            ProjectBean projectdata = projectBeans.get(position);
            holder.binding.tvNameSheet.setText(projectdata.getName());
            holder.binding.rootSheet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (recepteur != null) {
                        recepteur.onProjectClic(projectdata);
                    }
                }
            });
        } else if (mType == 2) {
            UniversBean universdata = universBeans.get(position);
            holder.binding.tvNameSheet.setText(universdata.getName());
            holder.binding.rootSheet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (recepteur != null) {
                        recepteur.onUniversClic(universdata);
                    }
                }
            });
        } else if (mType == 3) {
            CharacterBean characterdata = characterBeans.get(position);
            holder.binding.tvNameSheet.setText(characterdata.getName() + " " + characterdata.getFirstname());
            holder.binding.rootSheet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (recepteur != null) {
                        recepteur.onCharacterClic(characterdata);
                    }
                }
            });
        } else if (mType == 4) {
            DeitiesBean deitiesdata = deitiesBeans.get(position);
            holder.binding.tvNameSheet.setText(deitiesdata.getName());
            holder.binding.rootSheet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (recepteur != null) {
                        recepteur.onDeitiesClic(deitiesdata);
                    }
                }
            });
        } else if (mType == 5) {
            PlaceBean placedata = placeBeans.get(position);
            holder.binding.tvNameSheet.setText(placedata.getName());
            holder.binding.rootSheet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (recepteur != null) {
                        recepteur.onPlaceClic(placedata);
                    }
                }
            });
        } else if (mType == 6) {
            FaunaBean faunadata = faunaBeans.get(position);
            holder.binding.tvNameSheet.setText(faunadata.getName());
            holder.binding.rootSheet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (recepteur != null) {
                        recepteur.onFaunaClic(faunadata);
                    }
                }
            });
        } else if (mType == 7) {
            FloraBean floradata = floraBeans.get(position);
            holder.binding.tvNameSheet.setText(floradata.getName());
            holder.binding.rootSheet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (recepteur != null) {
                        recepteur.onFloraClic(floradata);
                    }
                }
            });
        } else if (mType == 8) {
            ItemBean itemdata = itemBeans.get(position);
            holder.binding.tvNameSheet.setText(itemdata.getName());
            holder.binding.rootSheet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (recepteur != null) {
                        recepteur.onItemClic(itemdata);
                    }
                }
            });
        }


    }


    @Override
    public int getItemCount() {

        if (mType == 1) {
            Common.size_main = projectBeans.size();
        } else if (mType == 2) {
            Common.size_main = universBeans.size();
        } else if (mType == 3) {
            Common.size_main = characterBeans.size();
        } else if (mType == 4) {
            Common.size_main = deitiesBeans.size();
        } else if (mType == 5) {
            Common.size_main = placeBeans.size();
        } else if (mType == 6) {
            Common.size_main = faunaBeans.size();
        } else if (mType == 7) {
            Common.size_main = floraBeans.size();
        } else if (mType == 8) {
            Common.size_main = itemBeans.size();
        }
        return Common.size_main;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        RowSheetBinding binding;

        public ViewHolder(RowSheetBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


    //----------------------------Interface (emetteur)-------------------//

    public interface OnSheetAdapterListener {

        void onProjectClic(ProjectBean projectdata);

        void onUniversClic(UniversBean universdata);

        void onCharacterClic(CharacterBean characterdata);

        void onDeitiesClic(DeitiesBean deitiesdata);

        void onPlaceClic(PlaceBean placedata);

        void onFaunaClic(FaunaBean faunadata);

        void onFloraClic(FloraBean floradata);

        void onItemClic(ItemBean itemdata);
    }

    //stock reference
    private OnSheetAdapterListener recepteur;

    public void setRecepteur(OnSheetAdapterListener recepteur) {
        this.recepteur = recepteur;

    }


}
