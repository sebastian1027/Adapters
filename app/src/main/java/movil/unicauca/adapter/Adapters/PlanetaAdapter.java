package movil.unicauca.adapter.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import movil.unicauca.adapter.Models.Planeta;
import movil.unicauca.adapter.R;

/**
 * Created by Sebastianl on 05/04/2017.
 */

public class PlanetaAdapter extends BaseAdapter{

    private Context context;
    private List<Planeta>data;

    //region Constructor
    public PlanetaAdapter(Context context, List<Planeta> data) {
        this.context = context;
        this.data = data;
    }
    //endregion

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
        View v = convertView;

        if (convertView == null){
            v  = View.inflate(context, R.layout.template_planeta, null);
        }

        Planeta p = data.get(position);
        TextView nombre = (TextView) v.findViewById(R.id.nombre);
        TextView gravedad = (TextView) v.findViewById(R.id.gravedad);

        nombre.setText(p.getNombre());
        gravedad.setText(""+p.getGravedad());
        return v;
    }
}
