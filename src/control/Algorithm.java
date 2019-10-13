package control;

import java.util.Map;

import model.Graph;
import model.Station;

public interface Algorithm {
    /**
     * ִ���㷨
     */
    void perform(Graph g, Station firstVertax);

    /**
     * �õ�·��
     */
    Map<Station, Station> getPath();
}

