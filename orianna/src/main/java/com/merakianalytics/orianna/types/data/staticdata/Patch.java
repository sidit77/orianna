package com.merakianalytics.orianna.types.data.staticdata;

import org.joda.time.DateTime;

import com.merakianalytics.orianna.types.data.CoreData;

public class Patch extends CoreData {
    private static final long serialVersionUID = -7009192986793480792L;
    private String platform, name;
    private int season = -1;
    private DateTime start, end;

    @Override
    public boolean equals(final Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        final Patch other = (Patch)obj;
        if(end == null) {
            if(other.end != null) {
                return false;
            }
        } else if(!end.equals(other.end)) {
            return false;
        }
        if(name == null) {
            if(other.name != null) {
                return false;
            }
        } else if(!name.equals(other.name)) {
            return false;
        }
        if(platform == null) {
            if(other.platform != null) {
                return false;
            }
        } else if(!platform.equals(other.platform)) {
            return false;
        }
        if(season != other.season) {
            return false;
        }
        if(start == null) {
            if(other.start != null) {
                return false;
            }
        } else if(!start.equals(other.start)) {
            return false;
        }
        return true;
    }

    /**
     * @return the end
     */
    public DateTime getEnd() {
        return end;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @return the season
     */
    public int getSeason() {
        return season;
    }

    /**
     * @return the start
     */
    public DateTime getStart() {
        return start;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (end == null ? 0 : end.hashCode());
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (platform == null ? 0 : platform.hashCode());
        result = prime * result + season;
        result = prime * result + (start == null ? 0 : start.hashCode());
        return result;
    }

    /**
     * @param end
     *        the end to set
     */
    public void setEnd(final DateTime end) {
        this.end = end;
    }

    /**
     * @param name
     *        the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @param platform
     *        the platform to set
     */
    public void setPlatform(final String platform) {
        this.platform = platform;
    }

    /**
     * @param season
     *        the season to set
     */
    public void setSeason(final int season) {
        this.season = season;
    }

    /**
     * @param start
     *        the start to set
     */
    public void setStart(final DateTime start) {
        this.start = start;
    }
}
