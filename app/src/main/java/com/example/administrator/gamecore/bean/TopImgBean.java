package com.example.administrator.gamecore.bean;

import java.util.List;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/2 20:50   
*/
public class TopImgBean {
    /**
     * status : 1
     * results : [{"image":"http://alioss.g-cores.com/uploads/mobile_app_focus_image/9be41204-e3f9-47a5-8050-3746064667e1.jpg","original_id":19979}]
     */

    private int status;
    /**
     * image : http://alioss.g-cores.com/uploads/mobile_app_focus_image/9be41204-e3f9-47a5-8050-3746064667e1.jpg
     * original_id : 19979
     */

    private List<ResultsBean> results;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "TopImgBean{" +
                "status=" + status +
                ", results=" + results +
                '}';
    }

    public static class ResultsBean {
        private String image;
        private int original_id;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getOriginal_id() {
            return original_id;
        }

        public void setOriginal_id(int original_id) {
            this.original_id = original_id;
        }

        @Override
        public String toString() {
            return "ResultsBean{" +
                    "image='" + image + '\'' +
                    ", original_id=" + original_id +
                    '}';
        }
    }
}
