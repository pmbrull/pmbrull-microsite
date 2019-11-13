organizationName := "pmbrull"
enablePlugins(MicrositesPlugin)

// Microsite settings
// Description
micrositeName := "pmbru\\\\"
micrositeAuthor := "pmbrull"
micrositeOrganizationHomepage := "https://www.pmbrull.com"
micrositeDescription := "Personal blog"
micrositeDocumentationLabelDescription := "Content"

micrositeUrl := "http://pmbrull.com"
// micrositeBaseUrl := "/"

// Social
micrositeGitterChannel := false
micrositeShareOnSocial := false

// Resource organization
micrositeDocumentationUrl := "/content/"
resourceDirectory in Compile := baseDirectory.value / "docs"
micrositeDataDirectory := (resourceDirectory in Compile).value / "resources" / "data"
micrositeImgDirectory := (resourceDirectory in Compile).value / "resources" / "img"

// Github
micrositeGithubOwner := "pmbrull"
micrositeGithubRepo := "pmbrull-microsite"
micrositeGithubToken := sys.env.get("orgGithubTokenSetting")
micrositePushSiteWith := GitHub4s

// Meta
includeFilter in makeSite := "*.html" | "*.css" | "*.png" | "*.jpg" | "*.gif" | "*.js" | "*.swf" | "*.md" | "*.svg"
micrositeCompilingDocsTool := WithMdoc
