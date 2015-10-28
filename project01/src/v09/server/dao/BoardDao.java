package v09.server.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import v09.server.Exception.DaoException;
import v09.server.domain.Board;


public class BoardDao {
	ArrayList<Board> list = new ArrayList<Board>();

	public BoardDao() {

		String filename = "./data/board.dat";
		try (
				FileReader in = new FileReader(filename);
				BufferedReader in2 = new BufferedReader(in);
				)
		{
			String line = null;

			while ((line = in2.readLine()) != null)
				list.add(new Board(line));
		} 
		catch (Exception e) {
			throw new DaoException("게시판정보 로딩 실패");
		}
	}

	public void save() {
		try (
				FileWriter out = new FileWriter("./data/board.dat");
				BufferedWriter out2 = new BufferedWriter(out);
				PrintWriter out3 = new PrintWriter(out2);
				)
		{
			for (Board b : list)
				out3.println(b);
		}
		catch (Exception e) {
			throw new DaoException("게시판정보 저장 실패");
		}
	}

	public ArrayList<Board> selectList() {
		return list;
	}

	public void insert(Board board) {
		list.add(board);
	}

	public Board delete(int no) {
		/*if (no >= list.size())
			return null;*/
		return list.remove(no);
	}
}
