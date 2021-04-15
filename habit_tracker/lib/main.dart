import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Habit Tracker',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: MyHomePage(title: 'Habit Tracker'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);
  final String title;
  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  List<bool> _checkbox = <bool>[];
  int _counter = 0;
  @override
  void initState() {
    super.initState();
    for (var i = 0; i <= 60; i++) {
      _checkbox.add(false);
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: SingleChildScrollView(
        child: Padding(
          padding: const EdgeInsets.all(20),
          child: Container(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.center,
              children: <Widget>[
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Text(
                      'Every Challenge Is An Opportunity',
                      style: TextStyle(
                        color: Colors.black,
                        fontSize: 25,
                        fontStyle: FontStyle.italic,
                      ),
                    ),
                  ],
                ),
                SizedBox(
                  height: 25,
                ),
                Text(
                  '$_counter days',
                  style: Theme.of(context).textTheme.headline4,
                ),
                Column(
                  children: List.generate(
                    60,
                    (i) => CheckboxListTile(
                      title: Text(
                        "Day $i",
                      ),
                      value: _checkbox[i],
                      onChanged: (bool value) => setState(
                        () {
                          _checkbox[i] = value;
                          if (_checkbox[i] == true) {
                            _counter++;
                          } else {
                            _counter--;
                          }
                        },
                      ),
                    ),
                  ).toList(),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
