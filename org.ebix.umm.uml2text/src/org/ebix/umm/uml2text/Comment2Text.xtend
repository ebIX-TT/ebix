package org.ebix.umm.uml2text

class Comment2Text {
	def String strip(String comment) {
		if (comment.contains("<html>")) {  
			return comment.replaceAll("<html>", "").replaceAll("</html>", "")
		         .replaceAll("<head>", "").replaceAll("</head>", "")
		         .replaceAll("<body>", "").replaceAll("</body>", "")
		         .replaceAll("<p>", "").replaceAll("</p>", "")
		         .trim()
		} else {
		   	return comment
		} 
	}
}
