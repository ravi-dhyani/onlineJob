package com.main.interconnection.solr.response.comment.feed;

import java.util.ArrayList;
import java.util.List;

import com.main.interconnection.clientBo.FeedComment;




public class Response {

    public int numFound;
    public int start;
    private List<FeedComment> docs = new ArrayList<FeedComment>();

    public Response() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getNumFound() {
        return numFound;
    }

    public void setNumFound(int numFound) {
        this.numFound = numFound;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

	public List<FeedComment> getDocs() {
		return docs;
	}

	public void setDocs(List<FeedComment> docs) {
		this.docs = docs;
	}
}
