@import ch.elmundi.playground.jte.Page
@import gg.jte.Content

@param Page page
@param Content content

<head>
    @if(page.getDescription() != null)
        <meta name="description" content="${page.getDescription()}">
    @endif
    <title>${page.getTitle()}</title>
</head>
<body>
<h1>${page.getTitle()}</h1>
${content}
</body>
