package barqsoft.footballscores.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;

import barqsoft.footballscores.service.WidgetUpdateService;

/**
 * Created by hasan on 9/19/2015.
 * Added App Widget Functionality
 */
public class ScoresWidget extends AppWidgetProvider {
    private static final String ACTION_UPDATE_WIDGET = "barqsoft.footballscores.service.action.UPDATE_WIDGET";


    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        WidgetUpdateService.startActionUpdatedScores(context);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if (ACTION_UPDATE_WIDGET.equals(intent.getAction())){
            WidgetUpdateService.startActionUpdatedScores(context);
        }
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}

