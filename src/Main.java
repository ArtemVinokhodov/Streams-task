import entity.DataProvider;
import entity.User;
import model.DataProcessingModel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DataProvider dataProvider = new DataProvider();
        ArrayList<User> usersList = dataProvider.getDate();
        DataProcessingModel dataProcessingModel = new DataProcessingModel();
        dataProcessingModel.processingData(usersList);
    }
}