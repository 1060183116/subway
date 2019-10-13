package model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import control.Algorithm;
import model.Station;
 
public class Graph{
	
	private List<Station> StationList;   //ͼ�Ķ��㼯
	private Map<Station, List<Station>> ver_edgeList_map= new HashMap<>();  //ͼ��ÿ�������Ӧ�������
	private Station firstVertax;//��ʼ��
	private Algorithm algorithm;//��Ӧ���㷨
	
	public void setStart(Station s) {
		this.firstVertax=s;
	}
	public Graph(Algorithm algorithm) {
        this.algorithm = algorithm;
        
    }
	
	
	public void setStationList(List<Station> list) {
		this.StationList=list;
	}
	
	public List<Station> getStationList() {
		return this.StationList;
	}
	
	public void addEdge(Station fromVertex, Station toVertex) {
        if (firstVertax == null) {
            firstVertax = fromVertex;
        }
        if( ver_edgeList_map.get(fromVertex)==null)
        	System.out.println("zzzzz");
        ver_edgeList_map.get(fromVertex).add(toVertex);
        ver_edgeList_map.get(toVertex).add(fromVertex);
    }

    /**
     * ���һ������
     */
    public void addVertex(Station vertex) {
    	ver_edgeList_map.put(vertex, new LinkedList<>());
    }

 
	
	public Map<Station, List<Station>> getVer_edgeList_map() {
		return ver_edgeList_map;
	}
 
	public void setVer_edgeList_map(Map<Station, List<Station>> ver_edgeList_map) {
		this.ver_edgeList_map = ver_edgeList_map;
	}
 
	public void done() {
        algorithm.perform(this, firstVertax);
    }

  public Stack<Station> findPathTo(Station vertex) {
      Stack<Station> stack = new Stack<>();
      stack.add(vertex);

      Map<Station, Station> path = algorithm.getPath();
      for (Station location = path.get(vertex) ; false == location.equals(firstVertax) ; location = path.get(location)) {
          stack.push(location);
      }
      stack.push(firstVertax);

      return stack;
  }
	
}
 
