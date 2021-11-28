package ch.elmundi.playground.jte;

public class Page {

    private String title;

    private String description;

    private Page() {
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final Page page = new Page();

        private Builder() {
        }

        public Builder withTitle(String title) {
            this.page.title = title;
            return this;
        }

        public Builder withDescription(String description) {
            this.page.description = description;
            return this;
        }

        public Page build() {
            return this.page;
        }
    }
}
