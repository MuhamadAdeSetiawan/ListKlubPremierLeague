package id.ac.poliban.dts.ade.listklubpremierleague;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class KlubAdapter extends BaseAdapter {
    private List<Klub> data  = new ArrayList<>();

    public KlubAdapter (List<Klub> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_flag;
        TextView tvCountryName;
        TextView tvCountryDesc;
        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_premier_league, parent, false);
//deklarasikan View
        img_flag = convertView.findViewById(R.id.img_Logo);
        tvCountryName = convertView.findViewById(R.id.tv_Klub_name);
        tvCountryDesc = convertView.findViewById(R.id.tv_Klub_description);
//isi data
        Glide.with(parent.getContext())
                .load(data.get(position).getLogo())
                .apply(new RequestOptions().override(60, 60))
                .into(img_flag);
        tvCountryName.setText(data.get(position).getNamaKlub());
        tvCountryDesc.setText(data.get(position).getDetailKlub());
        return convertView;
    }
}
